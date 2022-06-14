package com.lec.java.input03;

import java.util.Scanner;

public class Input03Main 
{
	public static void main(String[] args) 
	{
		System.out.println("nextLine() vs. next()");

		
		Scanner sc = new Scanner(System.in);
		
		// > aaa bbb ccc
		System.out.print("여러 단어의 문장을 입력하세요 >");
		String in = sc.nextLine();   // 한 라인 ('\n' 입력까지) 전체
		System.out.println("in : " + in);
		
		System.out.print("여러 단어의 문장을 입력하세요 >");
		String in1 = sc.next();  // 토큰 단위(공백단위)
		System.out.println("in1 : " + in1);
		
		// 다음 토큰 읽어오기
		String in2 = sc.next();  // 토큰 단위(공백단위)
		System.out.println("in2 : " + in2);
		String in3 = sc.next();  // 토큰 단위(공백단위)
		System.out.println("in3 : " + in3);
		
		
		//숫자 타입도 여러개를 '한줄'에 받을수 있다.
		// > 100 3.14 300
		System.out.print("숫자 3개 (int, double, int)를 입력받으세요 >");    
		System.out.print("숫자 3개 (int, double, int)를 입력받으세요 >");    

		int i1 = sc.nextInt();
		double d1 = sc.nextDouble();
		int i2 = sc.nextInt();
		
		System.out.println("i1, d1, i2: " + i1 + ", " + d1 + ", " + i2);
		
		sc.close();
		
	} // end main
}
