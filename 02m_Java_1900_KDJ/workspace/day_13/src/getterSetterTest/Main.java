package getterSetterTest;

public class Main {
	public static void main(String[] args) {
//		Student kim = new Student();
//		Student park = new Student("�ڿ���", 100, 100, 100);
//		Student hong = new Student("ȫ�浿", 70, 70, 70);
//		
////		kim.name = "��ö��";
//		kim.setName("��ö��");
//		// ��ö���� ���� ������ 100 ��, �������� 70, �������� 50 ���̴�
//		// �ش� ������ kim �̶�� ��ü �� �ν��Ͻ� ������ �����ϰ�,
////		kim.kor = 100;
//		kim.setKor(100);
////		kim.kor = -500;
////		kim.eng = 70;
//		kim.setEng(70);
////		kim.math = 50;
//		kim.setMath(50);
//		
////		System.out.println(kim.name);
////		System.out.println(kim.getName());
//		// ---��ö�� ��������---
//		// ���� : 100��
//		// ���� : 70��
//		// ���� : 50��
//		// ������� : 00.00��
//		System.out.println("---" + kim.getName() + "��������---");
//		System.out.println("���� : " + kim.getKor());
//		System.out.println("���� : " + kim.getEng());
//		System.out.println("���� : " + kim.getMath());
//		System.out.println("������� : " + (kim.getKor() + kim.getEng()+ kim.getMath()) / 3.0);
//		
		//------------------------------------------------------
		//��üŸ�� �迭 kim, park, hong�� ��ҷ� ����ִ� �迭
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int[] ar = {100, 200, 300};
		
		Student[] students = {
				new Student("��ö��", 50,50,50), 
				new Student("�ڿ���", 100,100,100), 
				new Student("ȫ�浿",50,50,50)
				};
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
	}
}

























