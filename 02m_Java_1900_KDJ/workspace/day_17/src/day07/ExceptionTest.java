package day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ar = {10, 20, 30};
		
		// ����ڿ��� �ε�����ȣ�� ������ �Է� �޾Ƽ�
		// �迭 �� �ش� ��Ҹ� ������ ���� ����� ����ϴ� ���α׷�
		try {
			System.out.print("�ε��� >> ");
			int idx = sc.nextInt();
			System.out.print("���� �� >> ");
			int num = sc.nextInt();
			
			System.out.println("��� : " + ar[idx] / num);		
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε�����ȣ�� Ȯ���ϼ���");
		}catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ��Է��ϼ���");
		}catch(Exception e){
			// getMessage() : ���� �߻��� �ο����� �κ��� ���ڿ��� return�ϴ� �޼ҵ�
			System.out.println(e.getMessage());
			// printStackTrace() : �߻��� ������ ������ ������ִ� �޼ҵ�
			e.printStackTrace();
			System.out.println("�����߻���");
		}finally {
			System.out.println("���ܰ� �߻� �ϵ� ���ϵ� ������ ����Ǵ� ����");
		}
		
		System.out.println("���α׷� �����");
		
	}
}




















