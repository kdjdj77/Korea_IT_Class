package com.lec.java.operator04;

/* 증감 연산자(++, --) Increment / Decrement Operator
 *  	++변수: 변수의 값을 1 증가시켜서 저장
 *   	--변수: 변수의 값을 1 감소시켜서 저장
 *  
 *   증감연산자: prefix(접두사), postfix(접미사)
 *   	접두사(prefix)인 경우에는, 증감(++, --)이 먼저 된 후 다른 연산자가 동작
 *   	접미사(postfix)인 경우에는, 다른 연산자 먼저 실행된 후 증감(++, --)가 동작
 */
public class Operator04Main {

	public static void main(String[] args) {
		System.out.println("연산자 4 - 증감 연산자(++, --) Increment / Decrement Operator");
		
		int num1 = 100;
		
		// 기존의 num1 값에 +1 시키기
		num1 = num1 + 1;
		num1 += 1;
		num1++;   		

		System.out.println("num1 = " + num1);
		
		// 기존의 num1 값을 -1 시키기
		num1--; // postfix 방식
		--num1; // prefix 방식		
		System.out.println("num1 = " + num1);
		
		int num4 = 100;
		int num5 = ++num4;  // prefix
		
		// num4, num5 값은 어케될까?
		// num4 -> 101
		System.out.println("num4 = " + num4);  // 101
		System.out.println("num5 = " + num5);  // 101
		
		
		int num6 = 100;
		int num7 = num6++; // postfix
		System.out.println("num6 = " + num6);  // 101
		System.out.println("num7 = " + num7);  // 100
		
		// 가급적이면 실무에서는 위와 같은 코드 작성 금지!
		
		int num8 = 100;
		int num9 = num8;
		num8++;   // 굳이 증감연산 사용해야 한다면, 단독으로 사용하는걸 추천.

		System.out.println("\n\n======================");
		System.out.println("증감연산자: prefix(접두사), postfix(접미사)");
		
		// TODO
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class












