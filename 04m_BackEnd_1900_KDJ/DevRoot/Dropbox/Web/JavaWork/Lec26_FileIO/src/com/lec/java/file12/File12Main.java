package com.lec.java.file12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
		
		// TODO
		
		System.out.println("\n프로그램 종료");		
		
	} // end main()
} // end class
