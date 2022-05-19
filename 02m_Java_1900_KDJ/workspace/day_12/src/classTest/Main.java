package classTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		// 접근권한 테스트
		Test t = new Test();
		t.a = 10;
		t.f1();
		// public 만 사용이 가능하다
		
		
		
		Student kim = new Student("김철수", 100, 70, 50);
		Student park = new Student("박영희", 50, 60, 70);
		
		kim.school = "초등학교";
		
		System.out.println(kim.school);
		System.out.println(park.school);
		System.out.println(Student.school);
		
		kim.f();
		park.f();
		Student.f();
//		System.out.println(Student.name);
		
//		kim.name = "김철수";
//		kim.kor = 100;
//		kim.eng = 70;
//		kim.math = 50;
	}
}









