package day_10;
import java.util.Scanner;

public class NestedArrayTask 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//����, ����, �������� �Է¹���
		//�л��� 1������ 4������
		System.out.println("�л� ���� ����� ���α׷�");
		String[] classes = {"����", "����", "����"};
		int stu_num = 4;
		int[][] arr = new int[stu_num][classes.length];
		while (true)
		{
			System.out.println("1. �л� ���� �Է��ϱ�");
			System.out.println("2. �л� ���� �������");
			System.out.println("3. ����");
			System.out.print("�Է� >> ");
			int input = sc.nextInt();
			if (input == 1)
			{
				for (int i = 0; i < arr.length; i++)
				{
					System.out.println("---" + (i + 1) + "�� �л�---");
					for (int j = 0; j < arr[i].length; j++)
					{
						System.out.print(classes[j] + "���� �Է� : ");
						arr[i][j] = sc.nextInt();
					}
				}
			}
			else if (input == 2)
			{
				sc.nextLine();
				int sum = 0;
				System.out.print("�л� ��ȣ �Է� >> ");
				int n = sc.nextInt() - 1;
				for (int j = 0; j < arr[n].length; j++)
					sum += arr[n][j];
				System.out.print(n + "�� �л��� ����� ");
				System.out.println((float)sum / classes.length);
			}
			else if (input == 3) break;				
			else System.out.println("�ٽ� �Է��� �ּ���");
		}
		sc.close();
	}
}
