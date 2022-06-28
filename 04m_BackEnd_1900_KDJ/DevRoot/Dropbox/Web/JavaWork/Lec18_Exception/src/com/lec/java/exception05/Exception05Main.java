package com.lec.java.exception05;

import java.util.InputMismatchException;
import java.util.Scanner;

/*	multi-catch
		 Java 7부터 하나의 catch문에서 여러개의 예외를 처리할 수 있는 방법을 제공
		 절대로 같은 상속레벨의 exception 들만 multi-catch 하기.
	 
	finally
		 예외(exception) 발생 여부와 상관없이 항상 실행되어야 할
		 코드들은 finally 블록 안에서 작성.
		 즉, finally 블록 안에 있는 코드들은 항상 실행이 됨.
		 예외가 발생하지 않을 때에는 try 블록 안의 코드들이
		 모두 실행된 후에 finally 블록의 코드들이 실행
		 예외가 발생할 때는, 해당 catch 블록의 코드들이
		 실행된 후에 finally 블록의 코드들이 실행
		 
		 (주의) 
		 try 블록이나 catch 블록 안에 return이 있더라도,
		 finally 블록 안의 코드들이 다 실행된 이후에
		 return이 실행되게 됨.

		(주의)
		 try블럭, catch블럭, finally 블럭등에서 두루두루
		 사용할 변수는 try블럭 전에 선언하고, 초기화 까지 하자.

		 보통은 자원반납과 같은 것들을 할때 finally 활용
		 자원 : 키보드, 파일, 데이터베이스, 네트워크 ...

 */
public class Exception05Main {

	public static void main(String[] args) {
		System.out.println("multi-catch");
		// Java 7부터 하나의 catch문에서 여러개의 예외를 처리할 수 있는 방법을 제공
		// 절대로 같은 상속레벨의 exception 들만 multi-catch 하기.
		
		
		// TODO : multi-catch 사용하기
		
		String str = null;
		str.length();
		int n = 123 / 0;
		
		
		System.out.println();
		System.out.println("finally");
		// 예외(exception) 발생 여부와 상관없이 항상 실행되어야 할
		// 코드들은 finally 블록 안에서 작성.
		// 즉, finally 블록 안에 있는 코드들은 항상 실행이 됨.
		// 예외가 발생하지 않을 때에는 try 블록 안의 코드들이
		// 모두 실행된 후에 finally 블록의 코드들이 실행
		// 예외가 발생할 때는, 해당 catch 블록의 코드들이
		// 실행된 후에 finally 블록의 코드들이 실행
		// (주의) 
		// try 블록이나 catch 블록 안에 return이 있더라도,
		// finally 블록 안의 코드들이 다 실행된 이후에
		// return이 실행되게 됨.
		

		// TODO : finally
		
		
		
		
		
		
		// try블럭, catch블럭, finally 블럭등에서 두루두루
		// 사용할 변수는 try블럭 전에 선언하고, 초기화 까지 하자.

		// 보통은 자원반납과 같은 것들을 할때 finally 활용
		// 자원 : 키보드, 파일, 데이터베이스, 네트워크 ...

//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.println("정수 입력하세요");
//			sc.nextInt();
//			System.out.println("try블록 종료");
//		}catch(InputMismatchException ex) {
//			System.out.println("예외 메시지: " + ex.getMessage());
//			return;  // 설사 리턴하더라도
//		}finally {
//			System.out.println("finally 수행");
//			sc.close();  // 자원 반납하는 부분은 반드시 finally{} 에서 처리
//		}
		
		System.out.println();
		System.out.println("프로그램 종료...");

	} // end main

} // end class Exception05Main











