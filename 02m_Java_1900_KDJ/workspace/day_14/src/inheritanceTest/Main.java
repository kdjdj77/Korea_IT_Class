package inheritanceTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		System.out.println("-----------------");
		SuperCar myCar = new SuperCar();
		
		momCar.name = "����";
		momCar.price = 100;
		momCar.color = "blue";
//		momCar.mode = "normal";
		
		myCar.name = "���";
		myCar.price = 1000;
		myCar.color = "red";
		myCar.mode = "sports";
		
//		momCar.openRoof();
		momCar.go();
		momCar.engineOn();
		momCar.show();
		
		System.out.println("---------------------");
		
		myCar.go();
		myCar.engineOn();
		myCar.show();
		myCar.openRoof();
		
		
		
		// momCar : Car Ÿ��(�θ�)
		// myCar : SuperCar Ÿ��(�ڽ�)
		// �ڽ� --> �θ� : ��ĳ����
		System.out.println("----------------------------------");
//		Car up = (Car)myCar;
		Car up = myCar;
		up.name = "�����̸�";
		up.price = 200;
		up.color = "�����Ȼ���";
//		up.mode = "normal"; ��ĳ������ �Ǹ� �ڽĿ��� ���Ӱ� ���ǵ� ����� ����� �Ұ����ϴ�
		
		up.go();
		up.engineOn(); // �����ǵ� �޼ҵ�� �ڽĿ��� �����ǵ� ��� ������
		up.show(); // �����ǵ� �޼ҵ�� �ڽĿ��� �����ǵ� ��� ������
//		up.openRoof(); ��ĳ������ �Ǹ� �ڽĿ��� ���Ӱ� ���ǵ� ����� ����� �Ұ����ϴ�
		
		System.out.println("----------�ٿ�ĳ����---------");
		
		//�θ� --> �ڽ� : �Ұ���
//		SuperCar down = (SuperCar)momCar; ���� �߻�
		// �ٿ�ĳ���� : �θ�Ÿ������ ��ĳ���� �� ģ���� �ڽ�Ÿ������ �ٽ� �ǵ����� ����
		SuperCar down = (SuperCar)up;
		
		down.openRoof();
		down.show();
		

		
		
		
		
		
	}
}
















