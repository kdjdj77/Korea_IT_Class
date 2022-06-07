package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
//		1. 파일객체만들기 없는 파일을 쓰면 FileNotFoundException 발생함
		File f = new File("..\\..\\memo\\day01.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 2. 스트림열기
			fr = new FileReader(f);
			// 2-1. 버퍼생성
			br = new BufferedReader(fr);
			// 3. 파일입력
			// readLine() : 한 줄 단위의 문자열을 입력받는 메소드
			// 더 이상 읽을 것이 없다면 null을 return 한다
			for(String line = br.readLine(); line != null; line = br.readLine()) {
				System.out.println(line);
			}
			
//			String line = "";
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//			String line = br.readLine();
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
			
			
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("오류발생");
		}finally {
		
			try {
				//4-0. 버퍼닫기
				if(br != null) br.close();
				//4. 스트림닫기
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}















