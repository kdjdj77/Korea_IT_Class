package game;

public class Dog extends Animal
{
	public Dog(String name, int hp, int feed) 
	{
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
//�����ֱ�
//��å�ϱ�
	@Override
	public void walk()
	{
		this.hp -= 2;
		super.walk();
	}
//����ֱ�
	@Override
	public void play()
	{
		System.out.println(super.name + "�̶� ��� ��");
		for (int i = 0; i < 5; i++)
		{
			System.out.print("�۸�! ");
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		super.play();
	}
}
