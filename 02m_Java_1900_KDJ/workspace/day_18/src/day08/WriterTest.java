package day08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) {
//		1. 파일객체만들기
		// File 클래스
		// 생성자의 매개변수로는 내가 사용할 파일의 경로를 써준다(해당 파일이 없는 경우에는 만들어줌)
		// 절대경로 D:\\1900_java2_bsy\\memo\\test.txt
		// 상대경로 항상 기준은 해당 프로젝트 폴더 D:\1900_java2_bsy\workspace\day08\test2.txt
		// ..은 상위 폴더를 의미한다
		File f = new File("..\\..\\memo\\test2.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//2. 스트림열기
			// FileWriter
			// 생성자의 매개변수로는 내가 사용할 파일 객체를 넘겨준다
			// 생성자 매개변수로 boolean 값을 true 로 넘겨주면 덧붙이기 모드(기존 내용은 유지 뒤에 덧붙임)
			// 기본은 false 덮어쓰기모드(기존 내용 전체 덮어쓰기)
			fw = new FileWriter(f, true);
			//2-1. 버퍼생성
			// BufferedWriter
			// 생성자의 매개변수로는 내가 만든 스트림을 넘겨준다
			bw = new BufferedWriter(fw);
			
			//3. 파일출력
			// write() : 괄호 안에 있는 문자열을 파일에 출력해주는 메소드
			bw.write("상대경로를 활용하여 출력해봄\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//4-0. 버퍼닫기
				if(bw != null) bw.close();	
				//4. 스트림닫기
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
}























