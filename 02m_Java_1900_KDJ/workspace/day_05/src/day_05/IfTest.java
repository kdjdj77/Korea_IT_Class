package day_05;
import java.util.Scanner;

public class IfTest 
{
	public static void main(String[] args) 
	{
		System.out.println("�ȳ�");
		System.out.println("�ݰ���");
		if (true)
		{
			System.out.println("if�� ���� ����1");
			System.out.println("if�� ���� ����2");
			System.out.println("if�� ���� ����3");
		}
		System.out.println("if�� �ٱ��� ����");
		
	//����ڿ��� ���� �Է� �޾� ¦���� ¦���Դϴ� Ȧ���̸� Ȧ���Դϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
	//if-else��
		if (num % 2 == 0) System.out.println("¦���Դϴ�");
		else System.out.println("Ȧ���Դϴ�");
	//���׿�����
		System.out.println( num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�");
		
	//upgrade. �� ���� �Է¹޾� ū �� ��� ( ������ ���ٰ� ��� )
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();

		if (num1 == num2) System.out.println("����");
		else if (num1 > num2) System.out.println("ū �� : " + num1);
		else System.out.println("ū �� : " + num2);
		sc.close();
	}
}