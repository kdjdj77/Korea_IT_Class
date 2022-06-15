package com.lec.java.operator02;

/* 복합 대입 연산자 compound assignment operators
 * 
 * 		+=, -=, *=, /=, %=, ...
 */
public class Operator02Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 2 - 복합 대입 연산자 compound assignment operators");
		System.out.println("+=, -=, *=, /=, %=, ...");

		int num1 = 10;
		System.out.println("num1 = " + num1);
		num1 = num1 + 1;   // 기존의 변수값 +1 증가
		System.out.println("num1 = " + num1);
		num1 += 1;
		System.out.println("num1 = " + num1);
		
		// TODO 나머지 산술연산들도 도전해보자.
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










