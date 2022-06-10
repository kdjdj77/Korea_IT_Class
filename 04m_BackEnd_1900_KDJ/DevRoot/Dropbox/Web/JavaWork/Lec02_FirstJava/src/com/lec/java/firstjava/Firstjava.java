package com.lec.java.firstjava;
//comment(주석): 
//프로그램 실행과는 상관 없지만, 
//개발자가 프로그램을 작성할 때 설명을 달아주는 것

/*
모든 자바 프로그램은 main() 메소드로부터 '시작'한다
프로그램 실행순서는 '시작' 부터 한 문장(Statement) 씩 실행되는 것이 원칙
문장의 끝은 반드시 세미콜론 ';' 으로 마무리 해야 한다
*/

public class Firstjava 
{
	public static void main(String[] args) 
	{
		// System.out.println() <-- 안의 내용을 출력하고 줄바꿈 수행
		System.out.println("프로그램 시작");
		System.out.println("2022-06-10");
		
		System.out.println(123);
		System.out.println("123");
		
		System.out.println();  // 단순히 한줄 띄우기 (new line)
//		System.out.println();
		
		System.out.println(10 + 20);  // 산술연산 결과  10, 20 을 '숫자' 로 인식
		System.out.println("10 + 20"); // 큰따옴표("")안에 있는 10과 20은 모두 '문자열'로 인식
		
		// 여러가지 의미의 + 연산
		System.out.println(10 + 20);  // 산술연산 결과  10, 20 을 '숫자' 로 인식
		System.out.println("10 + 20"); // 큰따옴표("")안에 있는 10과 20은 모두 '문자열'로 인식
		
		System.out.println("안녕하세요" + "자바");  // "문자열" + "문자열" => "연결된 문자열"
		
		System.out.println("안녕하세요" + " " + "웹개발반입니다");
		
		// "문자열" + 숫자 => 문자열
		//           ↓ 문자열 변환
		// "문자열" + "숫자" => 문자열
		System.out.println("결과: " + 10);  // "문자열" + 숫자 => ???
		System.out.println("결과: " + 10 + 20); // "결과: 1020"
		System.out.println("결과: " + (10 + 20));
		
		// 사칙연산 (+, -, *, /)
		System.out.println("10 + 20 = " + (10 + 20));  // 정수 (소숫접이 없는 숫자).  정수와 정수의 연산 결과는 언제나 정수!~
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + (10 / 20));
		System.out.println("10 / 20 = " + ((double)10 / 20));  // 실수와의 연산 결과는 실수!
		
		// print() 내용을 출력하고 줄바꿈 안함
		System.out.print("안녕");
		System.out.print("하세요");
		
		// 이스케이프 문자 (escape character)
		// " ~ " 문자열 안에서 특수 문자 출력,  "\" 로 시작
		
		// 입문시 기억할만한 이스케이프 문자
		// \"  : 쌍따옴표
		// \n  : 줄바꿈
		// \t  : 탭문자
		// \\  : 문자열 안에서 역슬래시 출력
		
		// She says "Hi"  <-- 출력하려면?
		System.out.println("She says \"Hi\"");
		
		
		System.out.println("123\n4567\n89");
		System.out.println("123\t4567\t89");
		System.out.println("Avengers\\EndGame\\");

		
		System.out.println("프로그램 종료");
	}
}
