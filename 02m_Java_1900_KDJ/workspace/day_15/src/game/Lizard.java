package game;

public class Lizard extends Animal
{
	public Lizard(String name, int hp, int feed) 
	{
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
//�����ֱ�
	@Override
	public void eat()
	{
		this.hp += 4;
		super.eat();
	}
//��å�ϱ�
	@Override
	public void walk()
	{
		this.hp -= 1;
		this.feed += 1;
		super.walk();
	}
//����ֱ�
	@Override
	public void play()
	{
		System.out.println(super.name + "�̶� ��� ��");
		for (int i = 0; i < 10; i++)
		{
			System.out.print("����! ");
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
