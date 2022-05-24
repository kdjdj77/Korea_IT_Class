package inheritanceTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		System.out.println("-----------------");
		SuperCar myCar = new SuperCar();
		
		momCar.name = "엄마";
		momCar.price = 100;
		momCar.color = "blue";
//		momCar.mode = "normal";
		
		myCar.name = "배상엽";
		myCar.price = 1000;
		myCar.color = "red";
		myCar.mode = "sports";
		
//		momCar.openRoof();
		momCar.go();
		momCar.engineOn();
		momCar.show();
		
		System.out.println("---------------------");
		
		myCar.go();
		myCar.engineOn();
		myCar.show();
		myCar.openRoof();
		
		
		
		// momCar : Car 타입(부모)
		// myCar : SuperCar 타입(자식)
		// 자식 --> 부모 : 업캐스팅
		System.out.println("----------------------------------");
//		Car up = (Car)myCar;
		Car up = myCar;
		up.name = "변경이름";
		up.price = 200;
		up.color = "수정된색상";
//		up.mode = "normal"; 업캐스팅이 되면 자식에서 새롭게 정의된 멤버는 사용이 불가능하다
		
		up.go();
		up.engineOn(); // 재정의된 메소드는 자식에서 재정의된 대로 동작한
		up.show(); // 재정의된 메소드는 자식에서 재정의된 대로 동작한
//		up.openRoof(); 업캐스팅이 되면 자식에서 새롭게 정의된 멤버는 사용이 불가능하다
		
		System.out.println("----------다운캐스팅---------");
		
		//부모 --> 자식 : 불가능
//		SuperCar down = (SuperCar)momCar; 오류 발생
		// 다운캐스팅 : 부모타입으로 업캐스팅 된 친구를 자식타입으로 다시 되돌리는 행위
		SuperCar down = (SuperCar)up;
		
		down.openRoof();
		down.show();
		

		
		
		
		
		
	}
}
















