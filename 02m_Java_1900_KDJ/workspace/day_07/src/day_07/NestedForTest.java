package day_07;

public class NestedForTest 
{
	public static void main(String[] args) 
	{
	//별 출력 문제
		for (int i = 0; i < 3; i++)
		{
			System.out.println("out");
			for (int j = 0; j < 2; j++)
			{
				System.out.println("in");
			}
		}
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (j <= i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 4; j >= 0; j--)
			{
				if (j <= i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	//구구단 2단 ~ 9단 출력
		for (int i = 2; i < 10; i++)
		{
			System.out.println("---- " + i + " 단 ----");
			for (int j = 1; j < 10; j++)
				System.out.println(i + " x " + j + " = " + (i * j));
		}
	}
}
