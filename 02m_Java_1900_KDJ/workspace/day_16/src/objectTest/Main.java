package objectTest;

public class Main {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.toString());
		
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2);// ��ü�� println �ȿ� ���̸� toString() �޼ҵ尡 ������
								// �����̴�. ���� toString()�� �������̵��ϸ�
								// ����Ҷ��� ����� ������ �� �ִ�
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}
}



















