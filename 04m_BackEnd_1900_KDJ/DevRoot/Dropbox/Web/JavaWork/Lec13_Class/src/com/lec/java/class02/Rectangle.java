package com.lec.java.class02;

public class Rectangle {
	// 속성 : 가로, 세로
	private double width;
	private double height;
	
	// 생성자
	// 1) 디폴트 생성자: 가로, 세로 길이 출력
	public Rectangle() {
		width = 10;  // 생성자에서 기본값 줄수도 있다.
		height = 10;
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
	}
	// 2) 생성자(double w, double h): 멤버변수를 매개변수 값으로 초기화, 출력
	public Rectangle(double w, double h) {
		width = w;
		height = h;
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
	}
	
	
	// 메소드
	// 1) calcPerimeter: 사각형의 둘레
	public double calcPerimeter() {
		return (width + height) * 2;
	}
	
	// 2) calcArea: 사각형의 넓이
	public double calcArea() {
		return width * height;
	}
}
