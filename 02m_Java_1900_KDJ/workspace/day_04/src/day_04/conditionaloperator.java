package day_04;
import java.util.Scanner;
public class conditionaloperator 
{
	public static void main(String[] args) 
	{
		//System.out.println(false ? 10 : 5);
		//���� �Է¹޾Ƽ� ���� / �̼����� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		System.out.println(age > 19 ? "�����Դϴ�" : "�̼������Դϴ�");
		sc.close();
	}
}