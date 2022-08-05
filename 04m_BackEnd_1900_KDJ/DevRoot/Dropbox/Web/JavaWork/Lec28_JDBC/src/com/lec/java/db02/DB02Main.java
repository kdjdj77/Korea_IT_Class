package com.lec.java.db02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB02Main {

	// 1. Oracle 연동을 위한 정보들(상수들)을 정의(세팅)
	// JDBC 드라이버 클래스 정보
	public static final String DRIVER =
			"oracle.jdbc.driver.OracleDriver";
	// DB 서버 정보
	public static final String URL =
			"jdbc:oracle:thin:@localhost:1521:XE";
	// DB 사용자 계정 정보
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";

	public static final String TBL_NAME = "test_member";
	public static final String COL_LABEL_NO = "mb_no";
	public static final String COL_LABEL_NAME = "mb_name";
	public static final String COL_LABEL_BIRTHDATE = "mb_birthdate";

	public static void main(String[] args) {
		System.out.println("DB 2 - Statement");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// TODO
		
	} // end main()

} // end class DB02Main













