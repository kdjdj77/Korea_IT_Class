package com.lec.java.inner03;

public class Inner03Main {

	public static void main(String[] args) {
		System.out.println("외부/내부 클래스의 this");
		
		TestOuter out = new TestOuter(100); // 1.
		TestOuter.TestInner in1 = out.new TestInner(111); // 2.
		in1.printValue(10); // 3.

	} // end main()

} // end class Inner03Main