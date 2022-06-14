package com.lec.java.input02;

import java.util.Scanner;

/*
 * 문자열(String), char 입력 
 *
 */
public class Input02Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);   // CTRL + SHIFT + O  <- 자동 import
		
		// line 단위 String 입력
		System.out.print("이름을 입렵하세요: ");
		String name = sc.nextLine();  // ENTER 를 입력할때까지의 모든 문자들이 문자열로 리턴
		
		System.out.print("별명을 입력하세요: ");
		String nick = sc.nextLine();
		
		System.out.println("이름은: " + name + "\n별명은:" + nick);
		
		// char 입력
		// nextChar() 라는 메소드는 없다!
		
		System.out.print("성별을 입력하세요 M/F: ");
		char gender = sc.next().charAt(0);  // next() 로 토큰단위 String 을 키보드로부터 읽어온뒤에 첫문자만 char 로 리턴 
		System.out.printf("이름은: %s\n별명은: %s\n성별은: %c\n", name, nick, gender);
		
//		next() 및 nextXXX() 공백 단위(토큰 단위)로 문자열을 읽기
//		nextLine()는 Enter 단위로 문자열 읽기
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		sc.nextLine();   // 버퍼에 남아있는 공백 제거
			// 숫자 입력받은뒤 문자열 line 입력시에는 반드시 사전에 nextLine() 함 해주자.
		
		System.out.print("주소를 입력하세요: ");
		String addr = sc.nextLine();
		
		System.out.printf("나이: %d\n주소: %s\n", age, addr);
		
		
		sc.close();
	} // end main
} // end class
