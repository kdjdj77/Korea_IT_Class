package classTest;

public class Student {
	// ����ƽ����(��������), ���, �������, Ŭ��������
	// ��� instance���� ���� �����Ѵ�. ���� ����Ҷ� �ν��Ͻ���.������ �� �ƴ϶�
	// Ŭ������.���������� ����ϴ°��� �ٶ����ϴ�
	static String school = "����б�";
	
	String name;
	int kor;
	int eng;
	int math;
	
	
	// alt + shift + s --> o --> enter
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	public static void f() {
		// ��� instance �� ���� ������ ���� �ȴ�
		System.out.println("����ƽ�޼ҵ� f() ȣ���");
//		System.out.println(name); �ν��Ͻ��� ���� �ٸ� ���� �����ϰ� �ִ�
		// �ν��Ͻ������� ����ƽ �������� ����� �� ����
		System.out.println(school);
	}


	public void show() {
		System.out.println("---�л�����---");
		System.out.println("�̸� : " + this.name);
		System.out.println("�������� : " + this.kor);
		System.out.println("�������� : " + this.eng);
		System.out.println("�������� : " + this.math);
	}
}










