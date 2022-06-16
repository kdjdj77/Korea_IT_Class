package com.lec.java.switch02;

public class Switch02Main {

	public static void main(String[] args) {
		System.out.println("switch 연습");

		// 도전
		// switch ~ case 조건문을 사용해서
		// 짝수 이면 --> "짝수입니다"  출력
		// 홀수 이면 --> "홀수입니다"  출력

		int num = 99;
		
		switch (num % 2) {
		case 0: // 짝수
			System.out.println("짝수");
			break;
			
		case 1: // 홀수
			System.out.println("홀수");
			break;
			
		default:
			System.out.println("몰라요...");
		} // end switch
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









