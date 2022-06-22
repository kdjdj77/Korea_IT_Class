package com.lec.java.method06;

/* Method Overloading (메소드 중복 정의)
	 같은 이름으로 메소드를 매개변수 리스트를 달리하여 중복 정의, 
	 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	
  Method Signature 란
	   메소드 이름 + 매개변수 리스트 (parameter list)
	
	 1. 매개변수의 개수가 다르거나
	 2. 매개변수의 자료형이 다르거나
	 3. 매개변수의 순서가 다를 때
	 위 3개를 '매개변수 리스트' 라 한다
	
    메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

     메소드 오버로딩의 장점:
	동일한 동작을 하는 메소드에 대해 매개변수만 달리하여 중복정의 하면
	이 메소드를 사용하는 입장에선 여러타입의 이름을 익힐 필요가 없다. 

 */

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");
		
		sayHello();
		sayHello("임승현");
		sayHello(20);
		
		sayHello("이재후", 20);
//		sayHello("상배", "기석");
		
		// 매개변수가 자동형변환 될 수 있는 메소드가 있으면 그 메소드가 호출된다.
		sayHello('A');
		byte b = 10;
		sayHello(b);
		
		// 메소드 오버로딩의 장점
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("Hello");
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	// 1
	public static void sayHello() {
		System.out.println("sayHello() 호출");
		System.out.println("안녕하세요~");
	}
	
	// 리턴타입 다르다고 오버로딩 인정되지 않는다
//	public static int sayHello() {
//		return 0;
//	}
	
	// 2
	public static void sayHello(String name) {
		System.out.println("sayHello(String) 호출");
		System.out.println("Hi~");
		System.out.println("제 이름은 " + name + "이에요~");
	}
	
	// 3-1
	public static void sayHello(int age) {
		System.out.println("sayHello(int) 호출");
		System.out.println("My age is " + age);
	}

	// 3-2
	public static void sayHello(short age) {
		System.out.println("sayHello(short) 호출");
		System.out.println("My age is " + age);
	}
	
	// 4
	public static void sayHello(String name, int age) {
		System.out.println("sayHello(String, int) 호출");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

	// 5
	public static void sayHello(int age, String name) {
		System.out.println("sayHello(int, String) 호출");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
} // end class

