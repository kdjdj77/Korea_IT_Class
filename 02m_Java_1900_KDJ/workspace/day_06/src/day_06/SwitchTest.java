package day_06;

public class SwitchTest 
{
	public static void main(String[] args) 
	{
		int num = 10;
		switch (num)
		{
			case 5:
				System.out.println("5입니다");
				break;
			case 100:
				System.out.println("100입니다");
				break;
			case 10:
				System.out.println("10입니다");
				break;
			default:
				System.out.println("그 외");
				break;
		}
	}
}