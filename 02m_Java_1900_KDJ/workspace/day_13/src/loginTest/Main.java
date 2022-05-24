package loginTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User[] users = new User[3];
		
		// 로그인 회원가입 기능 구현하기
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.나가기");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				User u = new User();
				System.out.print("이름 : ");
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
				// 로그인이 실패하면 아이디 또는 비밀번호를 다시 확인해 주세요 출력하기
				
				boolean check = false; // flag 변수
		
				// 빠른 for문
				for(User user : users ) {
					// user == users[i]
					// 첫번째 반복때 user == users[0]
					// 두번째 반복때 user == users[1]
					// 세번째 반복때 user == users[2]
					if(user == null) {
						break;
					}
					
					if(user.getId().equals(id) && user.getPw().equals(pw)) {
						check = true;
						System.out.println("로그인 성공");
						System.out.println(user.getName() + "님 환영합니다");
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
//						System.out.println("로그인 성공!");
//						System.out.println(users[i].getName() + "님 환영합니다");
//						break;
//					}
//				}
				
				// 로그인 실패 여부 확인
				if(check == false) { // for문 안에있는 if문으로 들어간 적이 없다면==로그인이 성공하지 않았다면==로그인이 실패했다면
					System.out.println("아이디 또는 비밀번호를 확인해주세요");
				}
				
			}else if(choice == 3) {
				break;
			}else {
				System.out.println("잘못입력했습니다");
			}
			
		}
		
		
	}
}































