package day_03;
import java.util.Scanner;

public class InputText2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();	//���ۿ� \n�� ���� ����
		
		System.out.print("�̸� : ");
		sc.nextLine();			//���� �ʱ�ȭ
		String name = sc.nextLine();
		
		System.out.printf("%s��, %d��\n", name, age);
		sc.close();
	}
}
