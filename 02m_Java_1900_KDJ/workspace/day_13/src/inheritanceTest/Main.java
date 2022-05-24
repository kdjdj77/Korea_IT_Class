package inheritanceTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		SuperCar myCar = new SuperCar();
		
		momCar.name = "¾ö¸¶";
		momCar.color = "blue";
		momCar.price = 100;
		
		myCar.name = "¹è»ó¿±";
		myCar.color = "red";
		myCar.price = 1000;
		
		momCar.go();
		momCar.engineOn();
		momCar.show();
		
		myCar.go();
		myCar.engineOn();
		myCar.show();
		
	}
}














