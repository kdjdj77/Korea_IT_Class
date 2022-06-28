package com.lec.java.oop02;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모(조상)타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용 (유용성)");

		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		
		// 다형성의 유용함 1
		// 부모타입으로 모든 자손 타입들을 담을수 있다.
		Vehicle [] car = new Vehicle[3];
		car[0] = new Vehicle();
		car[1] = new Car();
		car[2] = new HybridCar();
		
		for (int i = 0; i < car.length; i++) {
			car[i].displayInfo();
		}  // 오! 한가지 타입으로 한꺼번에 처리 가능!
		
		// 다형성이 없었다면?  각 타입별로 변수들을 만들고 따로따로 사용해야 하는 왕불편.
		//		Vehicle car1 = new Vehicle();
		//		Car car2 = new Car();
		//		HybridCar car3 = new HybridCar();
		//		car1.displayInfo();		
		//		car2.displayInfo();
		//		car3.displayInfo();
		
		
		// 다형성의 유용함 2
		// 다형성의 유용함은 매개변수, 혹은 리턴 타입에도 적용된다
		// println의 매개변수로 Object의 참조변수가 넘겨지면,
		// 내부적으로 해당 클래스의 toString() 메소드가 불리게 됨
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		driveCar(new Vehicle());
		driveCar(new Car());
		driveCar(new HybridCar());
		
		// instanceof 연산자
		// 용법: 변수/값 instanceof 클래스 
		// 결과: true / false
		
		System.out.println();
		System.out.println(car1 instanceof Vehicle);
		System.out.println(car2 instanceof Vehicle);
		System.out.println(car1 instanceof Car);

		
		
		System.out.println("\n 프로그램 종료");
	} // end main()
	
	public static void driveCar(Vehicle v) {
		v.setSpeed(100);
		v.displayInfo();
	}

} // end class

/* 코드만 보아도 알아요~
 * A a = new B()   ←  A 는 B 의 조상타입
 * R doSomethig(K p1){..}  ← K 는 Z 의 조상타입
 * Y y = doSomething(new Z()) ← Y 는 R 의 조상타입
 * 
 */
