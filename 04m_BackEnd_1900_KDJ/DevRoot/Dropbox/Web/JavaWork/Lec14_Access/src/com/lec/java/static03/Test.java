package com.lec.java.static03;

public class Test {

	private int num;
	
	// singleton 디자인패턴
	// 생성자는 private로 작성
	private Test() {
		this.num = 100;
	}
	
	private static Test instance = null;  // 생성된 instance 를 reference
	public static Test getInstance() { // instance 리턴
		if(instance == null) {  // 기존에 생성된 인스턶스가 없었다면
			instance = new Test();   // 생성
		}
		return instance;
	}
	
	// getter & setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
