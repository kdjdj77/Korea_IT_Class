package inheritanceTest;

public class Car {
	String name;
	int price;
	String color;
	
	public void go() {
		System.out.println("앞으로 갑니다");
	}
	
	public void engineOn() {
		System.out.println("열쇠로 시동을 켰습니다");
	}
	
	public void show() {
		System.out.println("---차량정보---");
		System.out.println("차주 : " + name);
		System.out.println("가격 : " + price + "원");
		System.out.println("색상 : " + color);
	}
	
}
















