package day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ar = {10, 20, 30};
		
		// 사용자에게 인덱스번호와 정수를 입력 받아서
		// 배열 속 해당 요소를 정수로 나눈 결과를 출력하는 프로그램
		try {
			System.out.print("인덱스 >> ");
			int idx = sc.nextInt();
			System.out.print("나눌 값 >> ");
			int num = sc.nextInt();
			
			System.out.println("결과 : " + ar[idx] / num);		
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스번호를 확인하세요");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
		}catch(InputMismatchException e) {
			System.out.println("숫자만입력하세요");
		}catch(Exception e){
			// getMessage() : 오류 발생시 부연설명 부분을 문자열로 return하는 메소드
			System.out.println(e.getMessage());
			// printStackTrace() : 발생한 예외의 정보를 출력해주는 메소드
			e.printStackTrace();
			System.out.println("오류발생함");
		}finally {
			System.out.println("예외가 발생 하든 안하든 무조건 실행되는 영역");
		}
		
		System.out.println("프로그램 종료됨");
		
	}
}




















