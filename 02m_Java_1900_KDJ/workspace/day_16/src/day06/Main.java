package day06;

public class Main {
	public static void main(String[] args) {
//		InnerLocal il = new InnerLocal();
		
		Outer o = new Outer();
		
		o.outerFunction();
		
		// InnerInsatance ��üȭ
		// �ν��Ͻ� Ŭ������ �ܺ�Ŭ������ü. �ϰ� ����ϰ�
		Outer.InnerInstance ii = o.new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		// InnerStatic ��üȭ
		// ����ƽ Ŭ������ �ܺ�Ŭ������. �ϰ� ����� �Ѵ�
		Outer.InnerStatic is = new Outer.InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
	
	}
}


















