package com.lec.java.db03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mysql.db.QueryMySql;

// 공통적으로 사용하는 상수들 인터페이스에 담아서 처리.
public class DB03Main implements QueryMySql {

	public static void main(String[] args) {
		System.out.println("DB 3 - PreparedStatement");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 클래스 로딩 성공");
			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB Connection 성공");
			
			//PreparedStatement 생성
			System.out.println("INSERT");
			pstmt = conn.prepareStatement(SQL_INSERT);	// <- (?, ?, ?) 세 개의 ?가 있다
			pstmt.setInt(1, 10);				// 첫 번때 ?에 10 전달
			pstmt.setString(2, "신성욱");			// 두 번때 ?에 "신성욱" 전달
			pstmt.setString(3, "2026-12-21");	// 세 번때 ?에 "2026-12-21" 전달
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) INSERT 성공");
			
			// UPDATE
			System.out.println("UPDATE");
			pstmt.close();	//기존 PrepareStatement는 자원해제
			pstmt = conn.prepareStatement(SQL_UPDATE_NO);
			pstmt.setInt(1, 77);
			pstmt.setString(2,  "신성욱");
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) UPDATE 성공");
			
			// SELECT
			System.out.println("SELECT");
			pstmt.close();
			pstmt = conn.prepareStatement(SQL_SELECT_BY_NAME);
			pstmt.setString(1, "신성욱");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String no = rs.getString("mb_no");
				String name = rs.getString("mb_name");
				String birthDate = rs.getString("mb_birthdate");
				System.out.printf("%s\t|%s\t|%s\n", no, name, birthDate);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	} // end main()

} // end class DB03Main






















