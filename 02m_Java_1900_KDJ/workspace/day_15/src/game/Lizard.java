package game;

public class Lizard extends Animal
{
	public Lizard(String name, int hp, int feed) 
	{
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
//먹이주기
	@Override
	public void eat()
	{
		this.hp += 4;
		super.eat();
	}
//산책하기
	@Override
	public void walk()
	{
		this.hp -= 1;
		this.feed += 1;
		super.walk();
	}
//놀아주기
	@Override
	public void play()
	{
		System.out.println(super.name + "이랑 노는 중");
		for (int i = 0; i < 10; i++)
		{
			System.out.print("낼름! ");
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
