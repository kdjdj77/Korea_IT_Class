package day_04;
import java.util.Scanner;

public class review {
	public static void main(String[] args)
	{
	//1. ����ڿ��� �� �ڸ��� ������ �Է� �ް� ���� �ڸ��� ���� �ڸ��� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
/*		System.out.print("�� �ڸ� ������ �Է� : ");
		int num = sc.nextInt();
		System.out.println("���� �ڸ�\t: " + (num / 10));
		System.out.println("���� �ڸ�\t: " + (num % 10));
*/		
	//2. ���γ뷡�� ���α׷�, ����ڿ��� �ݾ��� �Է� �ް�, (�� ��� 300��)
	//�θ� �� �ִ� �뷡 ����� �ܵ��� ����ϱ�
/*		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		final int price = 300;	//final : ������ ���ó�� ���
		System.out.printf("�뷡 �� ��\t: %d\n", money / price);
		System.out.printf("�ܵ�\t: %d��\n", money % price);
*/		
	//3. ����ڿ��� ����, ����, ���������� �Է�(������)�޾Ƽ� ����� ���Ͽ���
		System.out.print("���� ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int b = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int c = sc.nextInt();
		
		//System.out.println("����� " + ((a + b + c)/3.) + "�Դϴ�");
		System.out.printf("����� %.2f �Դϴ�", (a + b + c)/3.);
		sc.close();
	}
}
