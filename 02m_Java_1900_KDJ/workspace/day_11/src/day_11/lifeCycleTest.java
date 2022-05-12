package day_11;

public class lifeCycleTest 
{
	public static int changeA(int a)
	{
		a = 1000;
		return 1000;
	}
	public static void main(String[] args) 
	{
		int a = 100;
		a = lifeCycleTest.changeA(a);
		System.out.println(a);

		for (int i = 0; i < 5; i++) {}
		for (int i = 0; i < 4; i++) {}

	}
}
