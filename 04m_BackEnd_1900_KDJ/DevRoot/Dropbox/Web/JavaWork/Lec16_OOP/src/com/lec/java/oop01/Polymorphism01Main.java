package com.lec.java.oop01;
/*
 	다형성  ( Polymorphism )
 	하나의 이름의 클래스나 메소드가 '여러 가지 형태의 동작을 하는 능력'
 	
 	클래스의 다형성:
	 	한 타입의 참조변수로 여러타입의 객체를 참조 가능.
	 	조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조가능한것
 	
 	메소드의 다형성:
 		메소드 오버로딩, 메소드 오버라이딩
 	
 */
public class Polymorphism01Main {

	public static void main(String[] args) {
		System.out.println("다형성(Polymorphism)");
		
		System.out.println();
		
		// v1, c1, h1 의 타입은 다르다
		// 각각의 타입에 맞는 인스턴스 생성한뒤 대입 (참조하게 했다)
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		HybridCar h1 = new HybridCar();
		
		// 각각의 타입에 오버라이딩 된 메소드가 동작함
		v1.displayInfo();
		c1.displayInfo();
		h1.displayInfo();
		
		System.out.println();
		
		Vehicle car1 = new Car();   // 조상 <- 자손 (가능)
		Vehicle car2 = new HybridCar(); // 조상 <- 자손 (가능)
		Car car3 = new HybridCar();  // 조상 <- 자손 (가능)
		
		
//		HybridCar car7 = new Vehicle();  // 자손 <- 조상 (불가)
		
		// car1~car3 변수 타입에 관계에 관게없이
		// 오버라이딩 된 메소드가 '알아서' 동작한다
		car1.displayInfo();  // Car 의 displayInfo
		car2.displayInfo(); // HybridCar 의 displayInfo
		car3.displayInfo();  // HybridCar 의 displayInfo
		
		
		
		System.out.println("\n 프로그램 종료");
	} // end main()
	
	// TODO

} // end class
