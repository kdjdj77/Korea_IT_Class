package day_06;

public class ForTest 
{
	public static void main(String[] args) 
	{
		for (int i = 5; i < 10; i++)
		{
			System.out.print(i + "hi ");
		} 
		System.out.println();
		System.out.println("hello");
		
		//1, 2, 3, 4, ...10 ���
		for (int i = 0; i < 10; i++)
		{
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		
		//1~100 �� ¦���� ���η� ���
		for (int i = 0; i < 100; i++)
		{
			if ((i + 1) % 2 == 0)
				System.out.print((i + 1) + " ");
		}
		System.out.println();
		
		//10~1 ���
		for (int i = 10; i > 0; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1~10 �� ���
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			sum += i + 1;
		}
		System.out.println(sum);
		
		//������
		int dan = 5;
		for (int i = 0; i < 9; i++)
		{
			System.out.println(dan + " x " + (i + 1) + " = " + (dan * (i + 1)));
		}
	}
}