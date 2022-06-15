package com.lec.java.operator07;

/* 게으른 계산(Lazy Evaluation)
 * SCE: Short-Circuit Evaluation
 *
 * A && B를 계산할 때
 *	A가 거짓이면, B의 결과에 상관 없이 결과가 항상 거짓이 되기 때문에
 *	B는 연산이 이루어지지 않는다.
 *
 * A || B를 계산할 때
 * 	A가 참이면, B의 결과에 상관 없이 결과가 항상 참이 되기 때문에
 * 	B는 연산이 이루어지지 않는다.
 */
public class Operator07Main {

	public static void main(String[] args) {
		System.out.println("게으른 계산(Lazy Evaluation)");
		System.out.println("SCE: Short-Circuit Evaluation");
		
		int num1 = 0, num2 = 0;
		boolean b;
		
		b = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		
		// num1 ?
		// num2 ?
		// b ?
		
		System.out.println("b = " + b);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		// 실수에서 위와 같은 코드작성은 바람직 하지 않다
		// 실무코드에서는 아래와 같이 작성하는 것이 바람직. 
		num1 += 10;
		num2 += 10;
		b = (num1 < 0) && (num2 > 0);
		
		
		// TODO :  || 연산자에 대한 SCE 예제도 작성해보자
		

		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class



