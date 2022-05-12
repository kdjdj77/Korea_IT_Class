package day_11;

public class MethodTest 
{
	public static void add(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}
	public static void add(int num1, int num2, int num3)
	{
		System.out.println(num1 + num2 + num3);
	}
	public static void add(int num1, double num2)
	{
		System.out.println(num1 + num2);
	}
	public static void main(String[] args) 
	{
		MethodTest.add(15, 20);
		MethodTest.add(15, 20, 30);
		MethodTest.add(20, 3.1);
	}
}
