package day_07;
import java.util.Scanner;
import java.util.Random;

public class Problems 
{
	public static void main(String[] args) 
	{	
	/*ATM ���α׷�
	1. ���� �߱޹ޱ�
		��й�ȣ �����ϱ�(4�ڸ�)
		��й�ȣ Ȯ��(���°��� �Ϸ�)
		���� �߱�
	2. �Ա��ϱ�
		���¹�ȣ �Է�
		��й�ȣ �Է�(Ƚ������ 3ȸ)
		�Աݱݾ� �Է�
	3. ����ϱ�
		���¹�ȣ �Է�
		��й�ȣ �Է�(Ƚ������ 3ȸ)
		��ݱݾ� �Է�
		�ܾ�Ȯ�� �� ���
	*/
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String id;
		int pw;
		while(true)
		{
			System.out.println("===========================");
			System.out.println("1. ���� �߱�");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("0. ");
			System.out.print("��ȣ�� �����ϼ��� : ");
			int ch = sc.nextInt();
			if (ch == 1) 
			{
				id = "00-0000-0000";
				System.out.print("��й�ȣ�� �����ϼ��� : ");
				pw = sc.nextInt();
				System.out.print("��й�ȣ�� Ȯ�� : ");
				if (sc.nextInt() != pw) 
					System.out.println("�߸� �Է��Ͽ����ϴ�");
			}
			if (ch == 2) 
			{
				
			}
			if (ch == 3) 
			{
				
			}
			if (ch == 0) 
			{
				System.out.println("���α׷� ����");
				break;
			}
			
		}
		sc.close();
	}
}