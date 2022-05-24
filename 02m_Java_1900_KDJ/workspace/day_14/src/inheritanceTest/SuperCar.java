package inheritanceTest;

public class SuperCar extends Car{
	// 만약 자식 클래스에서 새로운 멤버들(멤버 변수, 메소드)이 필요하다면
	// 써준다
	String mode;
	
	public SuperCar() {}
	
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);
//		this.name = name;
//		this.price = price;
//		this.color = color;
		this.mode = mode;
	}
	
//	public SuperCar() {
//		// 부모 생성자를 호출하고 있음 
//		super();
//		System.out.println("SuperCar 생성자 실행됨");
//	}
	
	
	public void openRoof() {
		System.out.println("지붕을 열었습니다");
	}
	
	// 오버 라이딩(overriding)
	@Override // 어노테이션 주석 : 컴퓨터에게 설명하기 위한 주석
	public void engineOn() {
		System.out.println("버튼으로 시동을 켰습니다");
	}
	
	// 차량정보 보여주는 메소드 만들기
	@Override
	public void show() {
		super.show();
//		System.out.println("---차량정보---");
//		System.out.println("차주 : " + name);
//		System.out.println("가격 : " + price + "만원");
//		System.out.println("색상 : " + color);
		System.out.println("모드 : " + mode);
	}
	
}













