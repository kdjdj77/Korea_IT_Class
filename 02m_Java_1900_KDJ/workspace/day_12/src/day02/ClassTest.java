package day02;

public class ClassTest {
	
	public static void printStudent(Student s) {
		System.out.println("---�л�����---");
		System.out.println("�̸� : " + s.name);
		System.out.println("�������� : " + s.kor);
		System.out.println("�������� : " + s.eng);
		System.out.println("�������� : " + s.math);
	}
	
	public static void main(String[] args) {
//		String name = "��ö��";
//		int kor = 100;
//		int eng = 70;
//		int math = 50;
//		
//		String name1 = "ȫ�浿";
//		int kor1 = 50;
//		int eng1 = 30;
//		int math1 = 40;
		
		// kim : ��ü Ȥ�� �ν��Ͻ�
		// new : �޸𸮿� �Ҵ�����ִ� ������
		// Student() : ������
		Student kim = new Student("��ö��", 100, 70, 50); // ��üȭ
		Student hong = new Student("ȫ�浿", 50, 30, 40);

		
//		kim.setVariables("��ö��", 100, 70, 50);
//		kim.name = "��ö��";
//		kim.kor = 100;
//		kim.eng = 70;
//		kim.math = 50;
//		
//		hong.setVariables("ȫ�浿", 50, 30, 40);
//		hong.name = "ȫ�浿";
//		hong.kor = 50;
//		hong.eng = 30;
//		hong.math = 40;
	
		kim.show();
		hong.show();
		
		ClassTest.printStudent(kim);
//		System.out.println("---�л�����---");
//		System.out.println("�̸� : " + kim.name);
//		System.out.println("�������� : " + kim.kor);
//		System.out.println("�������� : " + kim.eng);
//		System.out.println("�������� : " + kim.math);
//		
		ClassTest.printStudent(hong);
//		System.out.println("---�л�����---");
//		System.out.println("�̸� : " + hong.name);
//		System.out.println("�������� : " + hong.kor);
//		System.out.println("�������� : " + hong.eng);
//		System.out.println("�������� : " + hong.math);
//		
		
		
		Student s1 = new Student("�ڿ���", 100, 100, 100);
		s1.show();
		
		Student s2 = new Student();
		
	}
}

class Student{ // �ʵ�
	
	String name; // ���, �������, �ν��Ͻ�����
	int kor;// ���, �������, �ν��Ͻ�����
	int eng;// ���, �������, �ν��Ͻ�����
	int math;// ���, �������, �ν��Ͻ�����
	
	public Student() { // �⺻������
		
	}
	
	// �ʱ�ȭ ������
	public Student(String name, int kor, int eng, int num3) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		math = num3;
	}
	
	// ���, ��� �Լ� == �޼ҵ�
	public void setVariables(String s, int num1, int num2, int num3) {
		name = s;
		kor = num1;
		eng = num2;
		math = num3;
	}
	
	// ���, ��� �Լ� == �޼ҵ�
	public void show() {
		System.out.println("show() �޼ҵ� �����");
		System.out.println("---�л�����---");
		System.out.println("�̸� : " + this.name);
		System.out.println("�������� : " + this.kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
	}
}

















