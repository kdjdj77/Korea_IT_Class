package day07;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		// charAt(10)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			if(num == 1) {
				// �ε������� �߻���Ű��
				throw new ArrayIndexOutOfBoundsException("���ڿ� �Է���");
			}else if(num == 2) {
				throw new ArithmeticException("���ڿ� �Է�");
			}			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�����߻���");
		}
		
		System.out.println("���α׷� ���� �����");
		
		
	}
}























