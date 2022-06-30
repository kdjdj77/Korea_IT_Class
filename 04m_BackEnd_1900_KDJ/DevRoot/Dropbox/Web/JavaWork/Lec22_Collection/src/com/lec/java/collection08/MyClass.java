package com.lec.java.collection08;

public class MyClass {
	private int id;
	private String name;
	
	public MyClass() {}
	public MyClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
	}
	
	// TODO
	
	@Override
	public String toString() {
		return "학번: " + id + "\n" + "이름: " + name;
	}
	
} // end class MyClass
