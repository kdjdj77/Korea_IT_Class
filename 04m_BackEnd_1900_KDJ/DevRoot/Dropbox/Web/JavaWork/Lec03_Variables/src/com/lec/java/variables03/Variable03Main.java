package com.lec.java.variables03;

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean(1바이트)
public class Variable03Main {

	public static void main(String[] args) {
		
		// byte: -128 ~ 127
		System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		
		byte num1 = -128;
		byte num2 = 0;
		byte num3 = 123;
//		byte num4 = 128;  // 에러: byte 에 저장할수 있는 크기를 넘어선 값 대입
		
		// short: -32768 ~ 32767
		System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num5 = -12345;
		short num6 = 12345;
		short num7 = 32767;
//		short num8 = 32768;
		
//		int: -2147483648 ~ 2147483647
//		long: -9223372036854775808 ~ 9223372036854775807
		System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
//		int num9 = 9876543210;   // 에러
//		long num10 = 98756543210;  // 에러???
		
		// 리터럴(literal) : 코드에 직접 입력하는 값.
		// 리터럴도 타입이 있다.
		// 정수타입리터럴은 int 타입으로 인식하려 한다.
		// 실수타입리터럴은 double 타입으로 인식하려 한다.
		
		long num11 = 9876543210L;  // 명식적으로 long 타입 리터럴 지정.
		
		long num12 = 12;   // long(8) <- int(4) 자동변환되어 대입
		long num13 = 12L;  // long(8) <- long(8)
		int num14 = 12;    // int(4) <- int(4)
//		int num15 = 12L;  // int(4) <- long(8) (X) 에러!
		
	}

}