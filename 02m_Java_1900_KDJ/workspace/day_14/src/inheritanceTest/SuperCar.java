package inheritanceTest;

public class SuperCar extends Car{
	// ���� �ڽ� Ŭ�������� ���ο� �����(��� ����, �޼ҵ�)�� �ʿ��ϴٸ�
	// ���ش�
	String mode;
	
	public SuperCar() {}
	
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);
//		this.name = name;
//		this.price = price;
//		this.color = color;
		this.mode = mode;
	}
	
//	public SuperCar() {
//		// �θ� �����ڸ� ȣ���ϰ� ���� 
//		super();
//		System.out.println("SuperCar ������ �����");
//	}
	
	
	public void openRoof() {
		System.out.println("������ �������ϴ�");
	}
	
	// ���� ���̵�(overriding)
	@Override // ������̼� �ּ� : ��ǻ�Ϳ��� �����ϱ� ���� �ּ�
	public void engineOn() {
		System.out.println("��ư���� �õ��� �׽��ϴ�");
	}
	
	// �������� �����ִ� �޼ҵ� �����
	@Override
	public void show() {
		super.show();
//		System.out.println("---��������---");
//		System.out.println("���� : " + name);
//		System.out.println("���� : " + price + "����");
//		System.out.println("���� : " + color);
		System.out.println("��� : " + mode);
	}
	
}













