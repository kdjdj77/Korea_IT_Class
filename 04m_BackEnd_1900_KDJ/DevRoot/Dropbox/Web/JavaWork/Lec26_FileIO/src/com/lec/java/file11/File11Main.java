package com.lec.java.file11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/*
문자(character) 단위 입출력 스트림 클래스
 java.io.Reader: 프로그램이 '문자 단위' 데이터를 읽어들이는(read) 통로
  └─ java.io.InputStreamReader
      └─ java.io.FileReader

 java.io.Writer: 프로그램이 '문자 단위' 데이터를 쓰는(write) 통로
  └─ java.io.OutputStreamWriter
      └─ java.io.FileWriter

 FileReader / FileWriter 객체는 '텍스트파일, 즉 문자 단위' 데이터를 읽고/쓰기 할때
 사용하는 기반 스트립 입니다.   따라서 텍스트가 아닌 오디오, 비디오, 등의 파일을 다룰수 없습니다.
 주로 String 이나 char [] 내용을 입/출력 할때 사용합니다.

 텍스트 파일 (Text File) 이란
   사람이 읽을수 있는 글자들이 저장된 파일
   암호화 되지 않은 평범한 텍스트

 이진파일 (Binary File) 이란
   사람이 직접 읽을수는 없슴.

   ★ 문자기반 출력시 꼭 끝에 flush() 해주자 ★
*/


public class File11Main {
	public static void main(String[] args) {
		System.out.println("FileReader / FileWriter");
		
		// TODO
		
		
		System.out.println("\n프로그램 종료");
		
	} // end main()
} // end class
