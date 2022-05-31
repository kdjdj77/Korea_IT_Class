package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int i1 = 10;
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(10);
		int i4 = 10;
		
		System.out.println(i2);
		System.out.println(i3);
		// ���� ���� ��ü����(�޸𸮻� ����Ǿ��ִ� ������ ��ü�� ����Ű����)
		// Ȯ���ϰ� ���� ���� ==�� ���������
		System.out.println(i2 == i3);
		// ���� ������ ������ Ȯ���ϰ� ���� ��ư .equals()�� ����Ѵ�
		System.out.println(i2.equals(i3));
		System.out.println(i1 == i4);
		
		System.out.println("-----------");
		System.out.println(i1 == i2);// auto unboxing
		System.out.println(i2.equals(i1));// auto boxing --> upcasting
		
		System.out.println("-----------");
	
		
		
		String s1 = "�ȳ�";
		String s2 = "�ȳ�";
		String s3 = new String("�ȳ�");
		String s4 = new String("�ȳ�");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		
	}
}























