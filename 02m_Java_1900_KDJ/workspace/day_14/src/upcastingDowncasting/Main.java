package upcastingDowncasting;

public class Main {
	
	public static void test(Parent c) {

	}
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		Object[] ar = {"�ȳ�", p, c, c2};

		Main.test(c2);
		Main.test(c);
		
		// Ÿ��
		// p�� Ÿ���� �˰� �ʹ�
		// �ν��Ͻ� instanceof Ŭ���� : �ν��Ͻ��� Ŭ����Ÿ���̴�? ������ true, �ƴϸ� false
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		
		System.out.println("---------");
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Parent);
		System.out.println(c instanceof Child);
		
		System.out.println("---------");
		Parent up = c;
		System.out.println(up instanceof Object);
		System.out.println(up instanceof Parent);
		System.out.println(up instanceof Child);
		
	}
}



















