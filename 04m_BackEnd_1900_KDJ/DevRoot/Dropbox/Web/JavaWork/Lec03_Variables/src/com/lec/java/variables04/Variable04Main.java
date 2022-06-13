package com.lec.java.variables04;

public class Variable04Main {

	public static void main(String[] args) {
		
		// 실수타입의 최소, 최대값
		System.out.println("float: " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("double: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
	
		double number1 = 3.141592;
//		float number2 = 3.14;   // 3.14 는 double 타입 리터럴
		float number3 = 3.14f;  // float 리터럴
	
		float number4 = 1.23456789f;
		double number5 = 1.23456789;
		
		System.out.println("number4 = " + number4);
		System.out.println("number5 = " + number5);
		
		// float과 double은 저장할 수 있는 값의 크기만이 아니라
		// 소수점 이하 정밀도(precision)에서도 차이가 있다.
		
		
		// 실수타입 데이터와 연산에는 언제나 오차 가 존재한다! <- 명심!
		
	}

}
