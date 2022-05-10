package day_10;

public class MethodTest 
{
	public static void printName(String name, int n)
	{
		for (int i = 0; i < n; i++)
			System.out.println(name);
		System.out.println("---------------");
	}
	public static int add(int a, int b)
	{
		return a + b;
	}
	public static void main(String[] args) 
	{
		MethodTest.printName("가나다", 2);
		MethodTest.printName("라마바", 3);
		MethodTest.printName("사아자", 4);
		
		//두 정수를 더해주는 메소드
		System.out.println(MethodTest.add(10, 20));
	}
}
