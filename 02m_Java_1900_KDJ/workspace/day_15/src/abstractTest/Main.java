package abstractTest;

public class Main 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		//�߻�Ŭ������ ��üȭ�� �Ұ����ϴ�
		//Animal a = new Animal();
		
		//��ĳ����
		Animal a = new Dog();
		a.eat();
		a.play();
		
		d.eat();
		d.play();
	}
}
