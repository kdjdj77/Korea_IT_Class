package interTest;

public class Main 
{
	public static void main(String[] args)
	{
		//인터페이스도 객체화를 하지 못한다
		//Soldier s = new Soldier();
		
		SecondMan sm = new SecondMan();
		
		sm.eat();
		sm.work();
	}
}
