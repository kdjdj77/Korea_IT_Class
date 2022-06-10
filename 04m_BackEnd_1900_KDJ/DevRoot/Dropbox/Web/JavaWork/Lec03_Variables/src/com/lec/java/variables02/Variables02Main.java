package com.lec.java.variables02;

public class Variables02Main 
{
	public static void main(String[] args) 
	{
		// 변수 선언과 동시에 초기화
		int num1 = 10;
		System.out.println("num1 = " + num1);
		
		num1 = 11111;   // 변수의 값은 언제든지 변경할수 있다 (그래서 변수!)
		System.out.println("num1 = " + num1);
		
		int korean = 50;
		int english = 60;
		int math = 33;
		System.out.println("총점 : " + (korean + english + math));
		
		int total = korean + english + math;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / 3.0);
		
	}

}
