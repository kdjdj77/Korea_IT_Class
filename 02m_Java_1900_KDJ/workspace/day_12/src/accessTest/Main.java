package accessTest;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.a = 10;
		t.b = 10;
		t.c = 10;
//		t.d = 10; private�� ���� Ŭ���� �ȿ����� ����� �����ϴ�
		
		t.f1();
		t.f2();
		t.f3();
//		t.f4(); private�� ���� Ŭ���� �ȿ����� ����� �����ϴ�
		
	}
}
