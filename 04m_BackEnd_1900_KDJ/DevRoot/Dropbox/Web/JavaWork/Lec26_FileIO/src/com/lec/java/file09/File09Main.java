package com.lec.java.file09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// Object Filter Stream + Collection

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// ArrayList<> 와 같은 Collection 에서,
// 모든 데이터들이 Serializable 되어 있으면 ObjectInputStream / ObjectOutputStream 으로
// read/write 가능.

public class File09Main {
	
	public static final String FILEPATH  = "temp/member2.dat";

	public static void main(String[] args) {
		System.out.println("Object Filter Stream");

		try (
				OutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout =
						new ObjectOutputStream(out);
				InputStream in = new FileInputStream(FILEPATH);
				
				ObjectInputStream oin =
						new ObjectInputStream(in);
			){
			
			// 리스트 준비
			ArrayList<Member> list = new ArrayList<>();
			
			// 파일에 쓸 데이터 객체 생성
			Member m1 = new Member("root", "root1234");
			Member m2 = new Member("guest", "guest");
			Member m3 = new Member("admin", "admin123456");
			
			list.add(m1);
			list.add(m2);
			list.add(m3);
			
			oout.writeObject(list);   // List 를 한번에 저장
	
			// 제대로 읽어오는지 확인하기 위해 기존 리스트 삭제
			list = null;
			
			list = (ArrayList<Member>)oin.readObject();
			
			for(Member m : list) {
				m.displayInfo();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


		
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class File08Main