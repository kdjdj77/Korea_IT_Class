package day_11;
import java.util.Scanner;

public class Review 
{
//�̸��� �ݺ�Ƚ�� �Է¹޾� ����ϴ� �޼ҵ�
	public static void printName(String name, int n)
	{
		for (int i = 0; i < n; i++)
			System.out.println(name);
	}
//���� �Է¹ް� ����/�̼��� �Ǻ��ϴ� �޼ҵ�
	public static void printAdult(int age)
	{
		if (age < 19) System.out.println("�̼����Դϴ�");
		else System.out.println("�����Դϴ�");
	}
//�迭�� �迭 ������� ����ϴ� �޼ҵ�
	public static void printArr(int[] arr)
	{
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i + 1 < arr.length)
				System.out.print(", ");
		}
		System.out.print(" }");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//�̸��� �ݺ�Ƚ�� �Է¹޾� ����ϴ� �޼ҵ�
		System.out.print("�̸� >> ");
		String name = sc.nextLine();
		System.out.print("Ƚ�� >> ");
		int cnt = sc.nextInt();
		Review.printName(name, cnt);
	//���� �Է¹ް� ����/�̼��� �Ǻ��ϴ� �޼ҵ�
		System.out.print("���� >> ");
		int age = sc.nextInt();
		Review.printAdult(age);
	//�迭�� �迭 ������� ����ϴ� �޼ҵ�
		int[] arr = {1, 3, 5, 7};
		Review.printArr(arr);
		
		sc.close();
	}
}
