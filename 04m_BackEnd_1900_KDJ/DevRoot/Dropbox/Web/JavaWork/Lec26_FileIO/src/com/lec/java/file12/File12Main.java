package com.lec.java.file12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 버퍼사용 문자입출력 : BufferedReader, BufferedWriter
 * 
 * java.lang.Object
 *  └─ java.io.Reader
 *      └─ java.io.BufferedReader
 *       
 * java.lang.Object
 *  └─ java.io.Writer
 *      └─ java.io.BufferedWriter
 *      
 * ★ 문자기반 출력시 꼭 끝에 flush() 해주자 ★     
 *             
*/

/*
 * txt 는 utf-8 로 인코딩 , 영문 텍스트
 */
public class File12Main {
	
	private static final String BIG_TEXT = "temp/big_eng.txt"; 
	
	public static void main(String[] args) {
		System.out.println("FileReader / FileWriter");
		
		FileWriter fw = null;
		FileReader fr = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		int charRead = 0;  // 읽은 문자 (한개)
		int charsCopied = 0;  // 복사한 문자 개수
		long startTime, endTime, elapsedTime;
		
		try {
			System.out.println("FileReader/Writer 만 사용");
			fr = new FileReader(BIG_TEXT);
			fw = new FileWriter("temp/big_eng_copy1.txt");
			

			charRead = 0;
			charsCopied = 0;
			startTime = System.currentTimeMillis(); // 현재 시간 저장
			while((charRead = fr.read()) != -1) {   // read() 한 글자 읽어와서 int에 담아 리턴. 더이상 읽을 글자 없으면 -1 리턴 
				fw.write(charRead);   // write(ch)  한 글자 쓰기
				charsCopied++;
			}
			fw.flush(); // 문자 출력 시 마지막에 꼭 flush() 를 하자,  
					// flush 를 하지 않으면 정상적으로 복사가 끝나지 않는다.
			
			endTime = System.currentTimeMillis(); // 끝난 시간 저장
			elapsedTime = endTime - startTime; // 경과 시간
			
			System.out.println("읽고 쓴 문자수: " + charsCopied);
			System.out.println("경과 시간(ms): " + elapsedTime);
			
			fw.close();
			fr.close();
			
			//-------------------------------------------------------------
			System.out.println();
			System.out.println("BufferedReader/Writer + 버퍼 사용");
			
			fr = new FileReader(BIG_TEXT);
			fw = new FileWriter("temp/big_eng_copy2.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			char [] buf = new char[1024];  // 버퍼 제공
			
			int charsRead = 0;  // 버퍼에 읽어들인 문자의 개수 
			charsCopied = 0;
			startTime = System.currentTimeMillis(); // 현재 시간 저장
			
			while( (charsRead = br.read(buf)) != -1 ) {
				bw.write(buf, 0, charsRead);
				charsCopied += charsRead;
			}
			bw.flush();
			
			endTime = System.currentTimeMillis(); // 끝난 시간 저장
			elapsedTime = endTime - startTime; // 경과 시간
			
			System.out.println("읽고 쓴 문자수: " + charsCopied);
			System.out.println("경과 시간(ms): " + elapsedTime);



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				if(fr != null) fr.close();
//				if(fw != null) fw.close();
				if(br != null) br.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("\n프로그램 종료");		
		
	} // end main()
} // end class