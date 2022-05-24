package abstractTest;

public class Dog extends Animal 
{
	@Override
	public void play() 
	{
		System.out.println("자식에서 재정의된 play()");
	}
}
