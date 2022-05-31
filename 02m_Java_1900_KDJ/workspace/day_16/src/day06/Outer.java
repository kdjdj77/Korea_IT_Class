package day06;

public class Outer {
	int ov = 10;
//	InnerLocal il;
	static int osv = 100;
	
	// ���� �ν��Ͻ� Ŭ����
	class InnerInstance{
		int iiv = 20;
		
		public void innerInstanceFunction() {
			System.out.println("�ν��Ͻ�Ŭ���� �޼ҵ� ȣ���");
		}
	}
	
	// ���� ����ƽ Ŭ����
	static class InnerStatic{
		int isv = 30;
		
		public void innerStaticFunction() {
			System.out.println("����ƽŬ���� �޼ҵ� ȣ���");
		}
	}
	
	public void show() {
		InnerInstance ii = new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		InnerStatic is = new InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
		
	}
	
	public void outerFunction() {
		// �ٸ������� Ŭ������ ������ �ʰ�, ������ �޼ҵ� �ȿ�����
		// Ŭ������ ���� ��쿡�� ����Ŭ������ ���� ������ ����� �� �ִ�
		class InnerLocal{ // ���� Ŭ����
			int ilv = 40;
			
			public void innerLocalFunction() {
				System.out.println("����Ŭ���� �޼ҵ� ȣ���");
			}
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println(il.ilv);
		il.innerLocalFunction();
		
	}

}

















