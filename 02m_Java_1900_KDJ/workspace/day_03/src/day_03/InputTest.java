package day_03;
import java.util.Scanner;

public class InputTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//sc.next(); //�Է��� �޾Ƽ� ���� StringŸ������ �޾ƿ´�
		
		//000�� ȯ���մϴ�
		//000���� VIP�Դϴ�
/*
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.printf("%s�� ȯ���մϴ�\n", name);
		System.out.printf("%s���� VIP�Դϴ�\n", name);
*/
		
		//next() : �Է��� �޾Ƽ� ���� String Ÿ������ �޾ƿ´�(���⳪ ���� ����)
		//nextLine() : �Է��� ���� ���� String Ÿ������ �޾ƿ´�(�� ��)
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.printf("%s�� ȯ���մϴ�\n", name);
		System.out.printf("%s���� ����� VIP�Դϴ�\n", name);
		System.out.printf("%s���� ���̴� %s�� �Դϴ�\n", name, age);
		sc.close();
	}
}
