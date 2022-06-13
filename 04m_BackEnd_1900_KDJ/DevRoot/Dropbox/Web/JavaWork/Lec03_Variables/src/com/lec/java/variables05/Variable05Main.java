package com.lec.java.variables05;

public class Variable05Main {

	public static void main(String[] args) {
		System.out.println("변수 05 - char, boolean, String");
		
		// char: 문자 하나를 저장하기 위한 자료 타입(2바이트)
		// char 는 문자의 코드값(정수)가 담긴다 (2byte)
		
		// 문자열(String)은 큰따옴표("")로 묶어 줌.   (String literal)
		// 문자 하나(char)는 작은따옴표('')로 묶어 줌.   (char literal)
		char ch1 = 'A';   // char literal
//		char ch2 = "A";
		
		System.out.println("ch1: " + ch1);
		
		char ch2 = '한';
		char ch3 = '글';
		
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		
		char ch4 = 1234;
		System.out.println("ch4: " + ch4);  // 코드값 1234 => Ӓ
		
		
		char ch6 = '!';
		char ch7 = 33;
		
		System.out.println("ch6: " + ch6);
		System.out.println("ch7: " + ch7);
		
		
		// 1. "bible"
		// 2. "cable"
		// 3. "able"		
		// 오름차순 정렬하면?
		
		// 3 > 1 > 2
		
		
		// 1. "aaAA"
		// 2. "AaAa"
		// 3. "aAaA"
		// 4. "AAaa"
		// 4 > 2 > 3 > 1
		
		// 알파벳 대문자 코드값보다 소문자 코드값의 크기가 더 크다.
		
		char ch8 = 'A';
		char ch9 = 'a';
		
		System.out.println("'A': " + ch8);
		System.out.println("'a': " + ch9);
		System.out.println("'A': " + (int)ch8); // 65
		System.out.println("'a': " + (int)ch9); // 97
		
		
		// boolean(논리형) : 참(true), 거짓(false)
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		System.out.println(10 < 20);
		System.out.println(10 > 20);
		
		// String 타입
		// String (문자열) 은 primitive 타입이 아닙니다
		String name = "Thor";
		String nick = "Thunder";
		
		System.out.println("이름은: " + name + "\n별명은: " + nick);
		
		
	}

}
