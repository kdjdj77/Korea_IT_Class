package loginTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User[] users = new User[3];
		
		// �α��� ȸ������ ��� �����ϱ�
		while(true) {
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.������");
			System.out.print("�Է� >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				User u = new User();
				System.out.print("�̸� : ");
//				u.name = sc.nextLine();
				u.setName(sc.nextLine());
				
				System.out.print("id : ");
				u.setId(sc.nextLine());
				
				System.out.print("pw : ");
				u.setPw(sc.nextLine());
				
				for (int i = 0; i < users.length; i++) {
					if(users[i] == null) {
						users[i] = u;
						break;
					}
				}
				
			}else if(choice == 2) {
				System.out.print("id : ");
				String id = sc.nextLine();
				System.out.print("pw : ");
				String pw = sc.nextLine();
				// �α����� �����ϸ� ���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���� �ּ��� ����ϱ�
				
				boolean check = false; // flag ����
		
				// ���� for��
				for(User user : users ) {
					// user == users[i]
					// ù��° �ݺ��� user == users[0]
					// �ι�° �ݺ��� user == users[1]
					// ����° �ݺ��� user == users[2]
					if(user == null) {
						break;
					}
					
					if(user.getId().equals(id) && user.getPw().equals(pw)) {
						check = true;
						System.out.println("�α��� ����");
						System.out.println(user.getName() + "�� ȯ���մϴ�");
						break;
					}
					
				}
							
//				for (int i = 0; i < users.length; i++) {
//					if(users[i] == null) {
//						break;
//					}
//					
//					if(users[i].getId().equals(id) && users[i].getPw().equals(pw)) {
//						check = true;
//						System.out.println("�α��� ����!");
//						System.out.println(users[i].getName() + "�� ȯ���մϴ�");
//						break;
//					}
//				}
				
				// �α��� ���� ���� Ȯ��
				if(check == false) { // for�� �ȿ��ִ� if������ �� ���� ���ٸ�==�α����� �������� �ʾҴٸ�==�α����� �����ߴٸ�
					System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���");
				}
				
			}else if(choice == 3) {
				break;
			}else {
				System.out.println("�߸��Է��߽��ϴ�");
			}
			
		}
		
		
	}
}































