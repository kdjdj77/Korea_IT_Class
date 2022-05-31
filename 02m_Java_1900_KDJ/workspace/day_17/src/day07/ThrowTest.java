package day07;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		// charAt(10)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			if(num == 1) {
				// 인덱스오류 발생시키기
				throw new ArrayIndexOutOfBoundsException("문자열 입력함");
			}else if(num == 2) {
				throw new ArithmeticException("문자열 입력");
			}			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("오류발생함");
		}
		
		System.out.println("프로그램 정상 종료됨");
		
		
	}
}























