package objectTest;

public class Main {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.toString());
		
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2);// 객체가 println 안에 쓰이면 toString() 메소드가 생략된
								// 상태이다. 따라서 toString()을 오버라이딩하면
								// 출력할때의 모양을 설정할 수 있다
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}
}



















