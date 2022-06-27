package com.lec.java.inherit04;
/* 상속에서 생성자 호출순서
 *   1. 자식 클래스의 생성자에서 명시적으로 부모 클래스의 생성자가
 *      호출되지 않으면, 자동으로 부모 클래스의 "디폴트 생성자"가 호출됨.
 *   
 *   2. 자식 클래스의 생성자에서 명시적으로 부모 클래스의 생성자를 호출하기도 함
 *   	1) super(...) 키워드 사용 -> 부모 클래스의 생성자를 호출
 *   	2) (주의) super는 항상 제일 처음에 호출되어야 함
 *   	3) 부모 클래스에 디폴트 생성자가 없는 경우도 있을 수 있다.
 *   그런 경우에는 다른 생성자를 "반드시 명시적으로 호출"해 줘야만 함.
*/

public class Inherit04Main {

	public static void main(String[] args) {
		System.out.println("상속과 생성자");
		
		System.out.println();
		// Vehicle 클래스의 인스턴스 생성
		// TODO
		
		System.out.println();
		// Car 클래스의 인스턴스 생성
		// TODO
		
		
		System.out.println();
		// HybridCar 클래스의 인스턴스 생성
		// TODO
		
		

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class











