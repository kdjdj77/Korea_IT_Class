package day_05;
import java.util.Scanner;
public class IfTask 
{
	public static void main(String[] args) 
	{
	//���� �Է¹޾� 3�� ����̸� 3�� ��� 4�� ����̸� 4�� ��� ���
		Scanner sc = new Scanner(System.in);
/*		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if (num % 3 == 0) System.out.println("3�� ����Դϴ�");
		if (num % 4 == 0) System.out.println("4�� ����Դϴ�");
*/		
	//1. target�� ����ִ� ������ �ҹ��ڶ�� �빮�ڷ�, �ݴ뵵 ����, 
	//�� ���̸� �״�� ���
		char target = 'D';
		if (target >= 65 && target <= 90 )
			System.out.printf("%c\n", target + 32);
		else if (target >= 97 && target <= 122 )
			System.out.printf("%c\n", target - 32);
		else System.out.println(target);
	//�⵵ �Է¹޾� �������� �ƴ��� ���
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 400 == 0) System.out.println("����");
		else if (year % 4 == 0 && year % 100 == 0) System.out.println("���");
		else System.out.println("����");
	//2. 90�̻� A, 80~90 B, 70~80 C, 70���� F
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		System.out.print("����� ������ ");
		if (score >= 90) System.out.print('A');
		else if (score < 90 && score >= 80) System.out.print('B');
		else if (score < 80 && score >= 70) System.out.print('C');
		else System.out.print('F');
		System.out.println("�Դϴ�");
		sc.close();
	}
}
