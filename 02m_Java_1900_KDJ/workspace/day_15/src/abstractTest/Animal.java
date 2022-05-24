package abstractTest;

public abstract class Animal {
	public void eat()
	{
		System.out.println("부모에서 정의된 eat()");
	}
	public abstract void play();
}