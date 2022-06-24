package com.lec.java.class03;

public class Numeric {
	
	private char ch;
	private byte operator;
	private int operand1;
	private int operand2;
	public Numeric() {
		super();
	}
	public Numeric(char ch, byte operator, int operand1, int operand2) {
		super();
		this.ch = ch;
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public byte getOperator() {
		return operator;
	}
	public void setOperator(byte operator) {
		this.operator = operator;
	}
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	// 이클립스의 source generator 를 사용하면 손쉽게 자동 코드 생성
	// 방법1. 우클릭후 Sources 메뉴
	// 방법2. ALT + SHIFT + S 누른후 팝업에서 선택

	
}
