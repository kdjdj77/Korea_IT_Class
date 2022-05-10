package day_10;
import java.util.Scanner;

public class Review
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//1. ����ڿ��� �Է¹��� ������ ���� �Է¹���
		//�� ������ŭ ���� �Է¹ް� �迭 ���
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("���� " + (i + 1) + " �Է� >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("{");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i + 1 != arr.length)
				System.out.print(", ");
		}
		System.out.println("}");
		
		//2. �ش� �迭 �ӿ��� �ִ밪 ����ϱ�
		int max = arr[0];
		for (int n : arr) if (max < n) max = n;
		System.out.println("�ִ밪 : " + max);
		
		//3. �ش� �迭 �ӿ��� �ּҰ� ����ϱ�
		int min = arr[0];
		for (int n : arr) if (min > n) min = n;
		System.out.println("�ּҰ� : " + min);
		
		//4. �ش� �迭�� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ�, �� �ܴ� �״��
		char[] alphabets = {'a', 'D', '*', 'x'};
		for (char n : alphabets)
		{
			if (n >= 65 && n <= 90)
				System.out.print((char)(n + 32));
			else if (n >= 97 && n <= 122)
				System.out.print((char)(n - 32));
			else System.out.print(n);
		}
		sc.close();
	}
}
