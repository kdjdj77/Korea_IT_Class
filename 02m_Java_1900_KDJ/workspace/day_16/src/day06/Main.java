package day06;

public class Main {
	public static void main(String[] args) {
//		InnerLocal il = new InnerLocal();
		
		Outer o = new Outer();
		
		o.outerFunction();
		
		// InnerInsatance 객체화
		// 인스턴스 클래스는 외부클래스객체. 하고 사용하고
		Outer.InnerInstance ii = o.new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		// InnerStatic 객체화
		// 스태틱 클래스는 외부클래스명. 하고 사용을 한다
		Outer.InnerStatic is = new Outer.InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
	
	}
}


















