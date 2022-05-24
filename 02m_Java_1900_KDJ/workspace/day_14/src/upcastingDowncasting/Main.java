package upcastingDowncasting;

public class Main {
	
	public static void test(Parent c) {

	}
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		Object[] ar = {"안녕", p, c, c2};

		Main.test(c2);
		Main.test(c);
		
		// 타입
		// p의 타입을 알고 싶다
		// 인스턴스 instanceof 클래스 : 인스턴스가 클래스타입이니? 맞으면 true, 아니면 false
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		
		System.out.println("---------");
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Parent);
		System.out.println(c instanceof Child);
		
		System.out.println("---------");
		Parent up = c;
		System.out.println(up instanceof Object);
		System.out.println(up instanceof Parent);
		System.out.println(up instanceof Child);
		
	}
}



















