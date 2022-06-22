package com.lec.java.method02;

/* return 의 믜미
 * 
 *   1. 메소드를 호출한 곳으로 값을 리턴한다.
 *   2. 메소드 종료
 *   3. 메소드 정의시 명시한 리턴타입의 값이 '반드시' 리턴되어야 한다
 *          (혹은 리턴타입으로 형변환 가능한 값이)
 */

public class Method02Main {

	public static void main(String[] args) {
		System.out.println("메소드의 리턴 타입");
		
		int sum = add(110, 220);
		System.out.println("sum = " + sum);
		
		int result = sub(100, 200);
		System.out.println("result = " + result);
		
		System.out.println();
		// 곱하기
		result = multiply(123, 321);
		System.out.println("result = " + result);
		
		System.out.println();
		
		// 나누기
		result = divide(25, 13);
		System.out.println("result = " + result);
		
		System.out.println();
		String str = divide2(123, 14);
		System.out.println(str);
		
		str = divide2(312, 0);
		System.out.println(str);
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// 메소드 이름: add
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입: int
	public static int add(int x, int y) {
		int result = x + y;
		
		return result;
	}

	
	// 메소드 이름: sub
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입: int
	public static int sub(int x, int y) {
		int result = x - y;
		
		return result;
	} // end sub()
	
	// 메소드 이름: multiply
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입: int
	public static int multiply(int x, int y) {
		return x * y;
	} // end multiply()
	
	// 메소드 이름: divide
	// 매개변수: 
	//   1) int x
	//   2) int y
	// 기능: x를 y로 나눈 몫을 리턴하는 메소드
	// 리턴타입: int
	public static int divide(int x, int y) {
		return x / y;
	} // end divide()
	
	
	// 메소드 이름: divide2
	// 매개변수:
	//   1) int x
	//   2) int y
	// 만약에 y 가 0 이면 -->  "0으로 나눌수 없습니다" 
	// y 가 0 이 아니면 -->  "몫은 ~~이고 , 나머지는 ~~ 입니다"
	// 리턴타입: String ★
	public static String divide2(int x, int y) {
		String result;
		
		if(y == 0) {
			result = "0으로 나눌 수 없어요!!";
		} else {
			result = "나눈 몫은 " + (x / y) + "\n"
					+ "나눈 나머지는 " + (x % y) + " 입니다.";
		}
		
		return result;
		
	}

	
} // end class

/*
 * Refactor - Inline   (ALT + SHIFT + I)
 * Refactor - Extract Local Variable  (ALT + SHIFT + L)
 * 	
 */










