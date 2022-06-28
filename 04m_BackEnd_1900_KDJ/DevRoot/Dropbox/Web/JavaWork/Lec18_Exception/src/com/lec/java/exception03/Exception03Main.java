package com.lec.java.exception03;

/*  예외 처리: try ~ catch
  	연습 01패키지에서 발생하던 예외들을 try~catch로 잡아보자 
  	
 	 주의! : try 블럭 안에서 선언된 변수는 try 블럭안에서만 사용되는 지역변수가 된다.
	     catch 블럭등 다른 블럭에서도 사용 가능하게 하려면 try 바깥에서 선언해야 한다
 */
public class Exception03Main {

	public static void main(String[] args) {
		System.out.println("예외 처리: try ~ catch");
		
		System.out.println();
		System.out.println("[1] ArithmeticException");
		int num1 = 0;
		int num2 = 0;
		
		// 주의! : try 블럭 안에서 선언된 변수는 try 블럭안에서만 사용되는 지역변수가 된다.
		//     catch 블럭등 다른 블럭에서도 사용 가능하게 하려면 try 바깥에서 선언해야 한다
		try {			
//			int a = 22;
			num1 = 123;
			num2 = 0;
			System.out.println("num1 / num2 = " + (num1 / num2));
		}catch(ArithmeticException ex) {
//			System.out.println(a);
			System.out.println(num1 + " 은 " + num2 + "로 나누면 안되요");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		} // end try
		
		
		System.out.println();
		System.out.println("[2] ArrayIndexOutOfBoundsException");
		try {
			int[] numbers = new int[10];
			numbers[100] = 111;
		
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("예외 메시지: " + ex.getMessage());
			ex.printStackTrace();
		} // end catch
		
		
		System.out.println();
		System.out.println("[4] NullPointerException");
		try {
			String str = null;
			System.out.println("스트링 길이: " + str.length());
			
		} catch (NullPointerException ex) {
			System.out.println("예외 메시지: " + ex.getMessage());
			
		} // end catch
		
		System.out.println();
		System.out.println("[5] ClassCastException");
		try {
			Object obj = new int[10];
			String str = (String)obj;
		} catch (ClassCastException ex) {
			System.out.println("예외 메시지: " + ex.getMessage());
			// 배열도 Object 클래스를 상속하므로 배열 인스턴스는 Object 의 참조변수로 참조가 가능하다
		} // end catch
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class Exception03Main
