package day_03;
import java.util.Scanner;

public class InputText2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
/*		
		//���� �ʱ�ȭ
		System.out.print("���� : ");
		int age = sc.nextInt();	//���ۿ� \n�� ���� ����
		
		System.out.print("�̸� : ");
		sc.nextLine();			//���� �ʱ�ȭ
		String name = sc.nextLine();
		
		System.out.printf("%s��, %d��\n", name, age);
*/		
		//�� �� ���� ���⸦ �̿��Ͽ� �ѹ��� �Է�
		System.out.print("���� �� �� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf("num1 : %d\nnum2 : %d", num1, num2);
		
		sc.close();
	}
}
