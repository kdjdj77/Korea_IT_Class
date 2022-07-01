package com.lec.java.inner05;

public class TestOuter {
	// TestOuter 클래스의 멤버 변수
	private int num1 = 111;
	
	// TestOuter 클래스의 멤버 메소드
	public void localMethod() {
		int num2 = 222;
		
		// 메소드 내부에서 정의된 Local inner class
		class TestLocal{
			
			private int num3 = 333;
			
			public void showNumbers() {
				System.out.println("num1 = " + num1);
				System.out.println("num2 = " + num2);
				System.out.println("num3 = " + num3);
			}
			
		} // end local inner
		
		// 지역 내부 클래스 인스턴스 생성은 클래스가 정의된 메소드 안에서만 가능
		TestLocal local = new TestLocal();
//		num2 = 400;  // num2 값을 변경하면.. 아래 showNumbers()에선
					// 200 이 찍혀야 하나? 400이 찍혀야 하나?
					// 그래서 로컬내부클래스에서 사용 가능한 지역의 변수는 
					// 반드시 effectively final 이어야 한다
					// 	  즉 한번 초기화 된후 값이 변경되지 않거나, final 이어야 한다.
		local.showNumbers();
		
	} // end localMethod()
	

} // end class TestOuter
