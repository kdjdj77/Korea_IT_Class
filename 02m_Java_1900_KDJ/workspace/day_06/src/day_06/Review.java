package day_06;
import java.util.Scanner;
public class Review 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//1. target�� ����ִ� ������ �ҹ��ڶ�� �빮�ڷ�, �빮�ڶ�� �ҹ��ڷ�
	//�� ���̸� �״�� ���
		char target = 'A';
		if (target >= 'A' && target <= 'Z' ) target += 32;
		else if (target >= 'a' && target <= 'z' ) target -= 32;
		System.out.println(target);
		
	//2. �⵵ �Է¹޾� �������� �ƴ��� ���
		int year = sc.nextInt();
		if (year % 400 == 0) System.out.println("����");
		else if (year % 100 == 0) System.out.println("���");
		else if (year % 4 == 0) System.out.println("����");
		else System.out.println("���");
		
	//3. 90�̻� A, 80~90 B, 70~80 C, 70���� F
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