package anonyTest;

public class Main {
	public static void main(String[] args) {
		Soldier s = new Soldier() {
			@Override
			public void work() {
				System.out.println("�̵�� ���Ѵ�");
			}
			
			@Override
			public void eat() {
				System.out.println("�̵�� �Դ´�");
			}
			
			@Override
			public void sleep() {
				System.out.println("�̵�� ���ܴ�");
			}
			
		};
		s.eat();
		
		
		
		
		
		 Car c = new Car() {
			@Override
			public void show() {
				System.out.println("override�� show");
			}
			
			public void openRoof() {
				System.out.println("������ �������ϴ�");
			}
		};
		
		c.go();
		c.show();
//		c.openRoof(); �ڽĿ��� ���Ӱ� ���� �޼ҵ�� ��ĳ���õǸ� ����� �Ұ����ϴ�
		
		
	}
}























