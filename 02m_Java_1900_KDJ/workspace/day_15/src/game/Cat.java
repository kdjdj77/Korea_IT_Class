package game;

public class Cat extends Animal
{
	public Cat(String name, int hp, int feed) 
	{
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
//�����ֱ�
	@Override
	public void eat()
	{
		this.hp += 2;
		this.feed -= 2;
		super.eat();
	}
//��å�ϱ�
//����ֱ�
	@Override
	public void play()
	{
		System.out.println(super.name + "�̶� ��� ��");
		for (int i = 0; i < 3; i++)
		{
			System.out.print("�߿�! ");
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
	
	public void onlyCat()
	{
		System.out.println("�߿˾߿�~");
	}
}
