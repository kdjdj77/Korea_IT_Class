package day_03;
import java.util.Scanner;

public class OperatorTask 
{
	public static void main(String[] args) 
	{
		//1. ����ڿ��� �� �ڸ��� ������ �Է� �ް� ���� �ڸ��� ���� �ڸ��� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ڸ� ������ �Է� : ");
		int input01 = sc.nextInt();
		System.out.printf("���� �ڸ� : %d\n", input01 / 10);
		System.out.printf("���� �ڸ� : %d\n", input01 % 10);
		
		//2. ���γ뷡�� ���α׷�, ����ڿ��� �ݾ��� �Է� �ް�, (�� ��� 300��)
		//�θ� �� �ִ� �뷡 ����� �ܵ��� ����ϱ�
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.printf("�뷡 �� ��\t: %d\n", money / 300);
		System.out.printf("�ܵ�\t: %d\n", money % 300);
		
		sc.close();
	}

}
