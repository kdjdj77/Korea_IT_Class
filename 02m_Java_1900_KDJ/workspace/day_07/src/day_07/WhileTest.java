package day_07;
import java.util.Scanner;

public class WhileTest 
{
	public static void main(String[] args) 
	{
	//while��
		int i = 0;
		while(i < 3) 
		{
			System.out.print("hi ");
			i++;
		}
		System.out.println("hello");
		
	//for��
		for (i = 0; i < 3; i++) System.out.print("hi ");
		System.out.println("hello");
		
	//Ű����ũ
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("1. �۱��ϱ�");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("0. �����ϱ�");
			choice = sc.nextInt();
		}
		while (choice != 0);
		{
			if (choice == 1) System.out.println("�۱�");
			else if (choice == 2) System.out.println("�Ա�");
			else if (choice != 0) System.out.println("���Է����ּ���");
		}
		System.out.println("����");
		sc.close();
	}
}