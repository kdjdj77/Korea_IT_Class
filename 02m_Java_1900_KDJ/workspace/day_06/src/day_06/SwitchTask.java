package day_06;
import java.util.Scanner;

public class SwitchTask 
{
	public static void main(String[] args) 
	{
		//���� �Է¹޾� �ش� ���� ������ �� ���
		//2���� 28������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		int day = 0;
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31; break;
		case 4: case 6: case 9: case 11:
			day = 30; break;
		case 2:
			day = 28; break;
		}
		if (day != 0)
			System.out.println(month + "���� " + day + "���� �������Դϴ�");
		else
			System.out.println("�߸��� �Է�");
		
		//3. 90�̻� A, 80~90 B, 70~80 C, 70���� F
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		switch(score / 10)
		{
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
		sc.close();
	}
}