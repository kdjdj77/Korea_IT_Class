package day_09;
import java.util.Scanner;

public class ArrayTask 
{
	public static void main(String[] args) 
	{
		int[] arr = {5, 4, 6, 9, 10};
		//�迭 ������� ���
		System.out.print("{");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i + 1 != arr.length)
				System.out.print(", ");
		}
		System.out.println("}");
		
		//���� 3�� �Է¹޾� ������ ��� ���
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] scores = {0, 0, 0};
		String[] list = {"����", "����", "����"};
		
		for (int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " �Է� : ");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (float)sum / scores.length);
		
		sc.close();
	}
}
