package upcastingDowncasting;

public class Child extends Parent{
	
	
	@Override
	public void f2() {
		System.out.println("자식에서 재정의된 f2()메소드");
	}
	
	public void f3() {
		System.out.println("자식에만 새로운 메소드");
	}
}
