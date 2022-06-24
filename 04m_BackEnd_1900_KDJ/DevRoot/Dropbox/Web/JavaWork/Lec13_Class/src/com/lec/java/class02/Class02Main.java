package com.lec.java.class02;


public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");		
		
		Circle c1;
		c1 = new Circle();
		Circle c2 = new Circle(3);
		
		System.out.println();
		double perimeter = c1.calcPerimeter();
		System.out.println(perimeter);
		perimeter = c2.calcPerimeter();
		System.out.println(perimeter);
		
		c1.radius = 5;
		System.out.println(c1.calcArea());
		System.out.println(c1.calcPerimeter());
		
		// Rectangle 인스턴스 만들고 동작시켜보기
		System.out.println();
		System.out.println("==================");
		Rectangle r1 = new Rectangle();
		perimeter = r1.calcPerimeter();
		System.out.println("사각형1의 둘레: " + perimeter);
		double area = r1.calcArea();
		System.out.println("사각형1의 넓이: " + area);
		
		Rectangle r2 = new Rectangle(2, 3);
		perimeter = r2.calcPerimeter();
		System.out.println("사각형2의 둘레: " + perimeter);
		area = r2.calcArea();
		System.out.println("사각형2의 넓이: " + area);

		
		
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Class02Main










