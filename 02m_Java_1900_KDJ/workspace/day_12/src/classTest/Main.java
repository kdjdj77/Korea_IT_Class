package classTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		// ���ٱ��� �׽�Ʈ
		Test t = new Test();
		t.a = 10;
		t.f1();
		// public �� ����� �����ϴ�
		
		
		
		Student kim = new Student("��ö��", 100, 70, 50);
		Student park = new Student("�ڿ���", 50, 60, 70);
		
		kim.school = "�ʵ��б�";
		
		System.out.println(kim.school);
		System.out.println(park.school);
		System.out.println(Student.school);
		
		kim.f();
		park.f();
		Student.f();
//		System.out.println(Student.name);
		
//		kim.name = "��ö��";
//		kim.kor = 100;
//		kim.eng = 70;
//		kim.math = 50;
	}
}









