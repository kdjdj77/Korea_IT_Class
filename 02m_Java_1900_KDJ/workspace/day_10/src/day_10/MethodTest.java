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
		MethodTest.printName("������", 2);
		MethodTest.printName("�󸶹�", 3);
		MethodTest.printName("�����", 4);
		
		//�� ������ �����ִ� �޼ҵ�
		System.out.println(MethodTest.add(10, 20));
	}
}
