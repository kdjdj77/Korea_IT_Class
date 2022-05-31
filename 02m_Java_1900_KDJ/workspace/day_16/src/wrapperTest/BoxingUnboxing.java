package wrapperTest;

import anonyTest.Car;

public class BoxingUnboxing {
	public static void main(String[] args) {
		// Boxing �⺻�ڷ��� --> ����Ŭ����
		int i1 = 10;
		Integer wi = new Integer(i1);
		
		// Unboxing ����Ŭ���� --> �⺻�ڷ���
		System.out.println(wi.intValue());
		
		// auto 
		Integer wi2 = 10; // auto boxing
		
		// auto boxing �� upcasting
		Object[] ar = {10, 10.5, "�ȳ�"};
		
		Car myCar = new Car();
		
		System.out.println(wi2);
		System.out.println(myCar);
	}
}






















