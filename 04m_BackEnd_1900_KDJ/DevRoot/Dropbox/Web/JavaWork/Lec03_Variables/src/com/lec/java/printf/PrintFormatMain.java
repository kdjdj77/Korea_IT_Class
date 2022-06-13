package com.lec.java.printf;

/* 서식화된 문자열 (formatted string)
 *  ● 화면에 출력할때는 -> printf()
 *    
 *    printf("서식문자열", 값1, 값2....)
 *    
 *  ● 문자열(String)으로 만들때는 -> String.format()
 *       	
 *    String.format("서식문자열", 값1, 값2....)
 *    
 *  ● format specifier (서식 지정자)
 *  	%d  :  십진수 정수로 출력
 *  	%f  :  실수 출력 
 *  	%s  :  문자열 출력
 *  	%c  :  '문자하나' 출력
 *  	%x  :  16진수 정수로 출력
 *  	%%  :  % 출력
*/
public class PrintFormatMain {

	public static void main(String[] args) {
		
		double pi = Math.PI;  // 원주율값.
		System.out.println(pi);
		
		// printf : print with format
		// printf("서식문자열", 값1, 값2....)
		// 서식문자열 안에 %로 시작하는 서식문자들..
		
		System.out.printf("원주율 %f\n", pi);   // %f : 실수출력 포맷 (소숫점 6자리까지)
		System.out.printf("원주율 %.2f\n", pi);  // %.2f : 소숫점 2자리까지
		
		int age = 10;
		short grade = 3;
		
		System.out.printf("제 나이는 %d 살입니다. %d 학년입니다\n", age, grade);
		
		System.out.printf("%d, %x, %c\n", 65, 65, 65);

		// 출력폭, 정렬 지정
		System.out.printf("|%d|%d|%d|\n", 100, 200, 300);
		System.out.printf("|%5d|%5d|%5d|\n", 100, 200, 300); // 폭 5칸, 우측정렬(기본)
		System.out.printf("|%-5d|%-5d|%-5d|\n", 100, 200, 300);  // 좌측정렬
		System.out.printf("|%6.1f|\n", 182.37);  // 총 6자리폭, 소숫점이하 1자리
		
		// % 출력 
		double rate = 134423.0 / 345678.0;
		System.out.printf("합격률은 %.1f%%입니다\n", rate * 100);
		
		
		// 숫자에 패딩 가능
		System.out.printf("|%05d|%05d|%05d|\n", 100, 200, 300);
	
		
		// String.format()
		// 기본적으로 printf() 와 사용법은 동일함
		// 단, 화면에 출력하는게 아니라, 결과를 문자열(String) 으로 만들어서 리턴
		
		String.format("합격률은 %.1f%%입니다\n", rate * 100);  // 화면에 출력하는게 아니다!
		
		String result = String.format("합격률은 %.1f%%입니다\n", rate * 100);
		System.out.println(result);


	}

}