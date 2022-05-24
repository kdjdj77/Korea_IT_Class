package abstractTest;

public class Main 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		//추상클래스는 객체화가 불가능하다
		//Animal a = new Animal();
		
		//업캐스팅
		Animal a = new Dog();
		a.eat();
		a.play();
		
		d.eat();
		d.play();
	}
}
