package wrapperTest;

import anonyTest.Car;

public class BoxingUnboxing {
	public static void main(String[] args) {
		// Boxing 기본자료형 --> 래퍼클래스
		int i1 = 10;
		Integer wi = new Integer(i1);
		
		// Unboxing 래퍼클래스 --> 기본자료형
		System.out.println(wi.intValue());
		
		// auto 
		Integer wi2 = 10; // auto boxing
		
		// auto boxing 후 upcasting
		Object[] ar = {10, 10.5, "안녕"};
		
		Car myCar = new Car();
		
		System.out.println(wi2);
		System.out.println(myCar);
	}
}






















