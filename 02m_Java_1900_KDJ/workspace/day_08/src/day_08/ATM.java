package day_08;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {	
	/*ATM ���α׷�
	1. ���� �߱޹ޱ�
		��й�ȣ �����ϱ�(4�ڸ�)
		��й�ȣ Ȯ��(���°��� �Ϸ�)
		���� �߱�
	2. �Ա��ϱ�
		���¹�ȣ �Է�
		��й�ȣ �Է�(Ƚ������ 3ȸ)
		�Աݱݾ� �Է�
	3. ����ϱ�
		���¹�ȣ �Է�
		��й�ȣ �Է�(Ƚ������ 3ȸ)
		��ݱݾ� �Է�
		�ܾ�Ȯ�� �� ���
	*/
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String id = "";
		int pw = r.nextInt();
		int money = 0;
		while(true) {
			System.out.println("===ATM=====================");
			System.out.println("1. ���� �߱�");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�Է� : ");
			int ch = sc.nextInt();
			if (ch == 1) {
				for (int i = 0; i < 10; i++) {
					if (i == 2 || i == 6) id += '-';
					id += Integer.toString(r.nextInt(10));
				}
				/*String.format("%02d-%04d-%04d", r.nextInt(100), 
					r.nextInt(10000), r.nextInt(10000));*/
				System.out.println(id);
				System.out.print("��й�ȣ�� �����ϼ��� : ");
				pw = sc.nextInt();
				System.out.print("��й�ȣ�� Ȯ�� : ");
				if (sc.nextInt() != pw) {
					System.out.println("�߸� �Է��Ͽ����ϴ�\nó������ �ٽ� �����մϴ�");
					id = "";
					pw = r.nextInt();
				}
				else System.out.println("���� ���� �Ϸ�");

			}
			else if (ch == 2) {
				sc.nextLine();
				System.out.print("���¹�ȣ �Է� : ");
				if (sc.nextLine().equals(id)) {
					int count = 3;
					while (count != 0) {
						System.out.print("��й�ȣ �Է� : ");
						if (sc.nextInt() != pw) {
							System.out.println("�߸��� �Է�\n���� Ƚ�� " + (count - 1) + "ȸ");
							count--;
						}
						else {
							System.out.print("�Աݱݾ� �Է� : ");
							money += sc.nextInt();
							break;
						}
					}
				}
				else System.out.println("�߸� �Է��Ͽ����ϴ�\nó������ �ٽ� �����մϴ�");
			}
			else if (ch == 3) {
				sc.nextLine();
				System.out.print("���¹�ȣ �Է� : ");
				if (sc.nextLine().equals(id)) {
					int count = 3;
					while (count != 0) {
						System.out.print("��й�ȣ �Է� : ");
						if (sc.nextInt() != pw) {
							System.out.println("�߸��� �Է�\n���� Ƚ�� " 
												+ (count - 1) + "ȸ");
							count--;
						}
						else {
							System.out.println("���� " + money + "��");
							System.out.print("��ݱݾ� �Է� : ");
							int temp2 = sc.nextInt();
							if (temp2 <= money)
								money -= temp2;
							else System.out.println("�ܾ��� �����մϴ�");
							break;
						}
					}
				}
				else System.out.println("�߸� �Է��Ͽ����ϴ�\nó������ �ٽ� �����մϴ�");
			}
			else if (ch == 0) {
				System.out.println("����");
				break;
			}
			else System.out.println("�߸��� �Է�");
		}
		sc.close();
	}
}
