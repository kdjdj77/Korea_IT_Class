package day_04;
import java.util.Scanner;

public class Task 
{
	public static void main(String[] args) 
	{
	//1. �� ���� �Է¹޾� ū �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("ū �� : " + (num1 > num2 ? num1 : num2));
		
	//2. �� ������ �Է¹޾� �� ���� �� ���
		System.out.println("�� ���� �� : " 
				+ (num1 > num2 ? num1 - num2 : num2 - num1));
	//3. ���̰� 10�̻� 25�����̸� 1000�� ������ ����
	//���� �Է¹޾� �ݾ� ���
		int age = sc.nextInt();
		System.out.println("�ݾ� : " 
				+ (age >= 10 && age <= 25 ? "1000��" : "����"));
	//4. Ű�� ���� �Է¹޾� 120cm �̻�, 8�� �̻��̶�� ž�°��� �ƴϸ� ž�ºҰ�
		int tall = sc.nextInt();
		int age2 = sc.nextInt();
		System.out.println(age2 >= 8 && tall > 120 ? "ž�°���" : "ž�ºҰ�");
	//5. �� �ڽ��� 20�� ��� ���� ����, ����� ���� �Է¹޾Ƽ� �ʿ��� ���� ����
		int ramen = sc.nextInt();
		System.out.println("�ʿ��� ���� ���� : " + ramen / 20);
	//6. �̸� �Է¹޾� �̸��� �������̸� ������ ���� ��ȯ�մϴ� ��� �ƴϸ� 
	// 000�� ȯ���մϴ� ���
		String name = sc.nextLine();
		System.out.println(name.equals("������") 
				? "������ ���� ��ȯ�մϴ�" : (name + "�� ȯ���մϴ�"));
	}
}




