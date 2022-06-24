package com.lec.java.class03;

public class Number {
	
	// 멤버변수
	private int num;
	
	// 생성자
	// 디폴트 생성자
	public Number() {}
	
	// 매개변수 있는 생성자
	public Number(int num) {
		this.num = num;  // this : 자기자신를 가리킴
	}
	
	// 메소드
	// getter: 멤버 변수의 값을 리턴해 주는 메소드
	// setter: 멤버 변수의 값을 변경해 줄 수 있는 메소드
	public int getNum() {  // getnum() ?
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
}
