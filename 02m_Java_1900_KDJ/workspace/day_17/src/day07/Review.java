package day07;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5. 사용자에게 한글로 숫자를 입력받아서
		// 숫자로 변경하여 출력하시오
		// 입력 >> 일공이사
		// 출력 >> 1024
		System.out.print("입력 >> ");
		String inputNum = sc.nextLine();
		String hangeul = "공일이삼사오육칠팔구";
		String changedNum = "";
		
		for (int i = 0; i < inputNum.length(); i++) {
			changedNum += hangeul.indexOf(inputNum.charAt(i));
		}
		System.out.println("결과 >> " + changedNum);
		
		
		
		// 4. 사용자에게 순위,제목,이름 을 콤마가 포함된 하나의 문자열로 입력받아서
		// 해당 순위를 1 증가하여 출력하시오
		// 입력 >> 10,괴물,홍길동
		// 출력 >> 11,괴물,홍길동
		String str = sc.nextLine();
		String strRes = Integer.parseInt(str.substring(0, str.indexOf(","))) + 1 + str.substring(str.indexOf(","));
		System.out.println(strRes);
		
		
		
		
		// 3. 사용자에게 휴대폰 번호를 입력받아서 대시를 제거하여 출력하시오
		// 입력 >> 010-1111-1234
		// 출력 >> 01011111234
		String phone = sc.nextLine();
		String phoneRes = "";
		
		phoneRes = phone.replaceAll("-", "");
		
		// {"010", "1111", "1234"}
//		String[] temp = phone.split("-");
//		phoneRes = String.join("", temp);
		
		
//		for (int i = 0; i < phone.length(); i++) {
//			if(phone.charAt(i) != '-') {
//				phoneRes += phone.charAt(i);
//			}
//		}
		
//		phoneRes += phone.substring(0, 3);
//		phoneRes += phone.substring(4, 8);
//		phoneRes += phone.substring(9, 13);
		
		System.out.println("결과 >> " + phoneRes);
		

		// 2. 사용자에게 이름, 나이, 주소를 입력 받아서
		// 콤마로 연결된 하나의 문자열로 출력하시오
		// 예시
		// 이름 >> 홍길동
		// 나이 >> 10
		// 주소 >> 서울시
		String[] info = new String[3];
		
		System.out.print("이름 >> ");
		info[0] = sc.nextLine();
		System.out.print("나이 >> ");
		info[1] = sc.nextLine();
		System.out.print("주소 >> ");
		info[2] = sc.nextLine();
		System.out.println(String.join(",", info));
		
		
//		System.out.println(name + "," + age + "," + address);
		
		
		
		// 1. 사용자에게 문자열을 입력 받아서 대문자는 소문자로, 소문자는 대문자로, 나머지는 그대로
		// 변경하여 출력하시오
		System.out.print("문자열 입력 >> ");
		String input = sc.nextLine();
		// input --> "aA+"
		
		String res = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch >= 'a' && ch <= 'z') {// 소문자라면
				//대문자로 바꾸기
				res += (char)(ch - 32);
			}else if(ch >= 'A' && ch <= 'Z') {//대문자라면 
				//소문자로 바꾸기
				res += (char)(ch + 32);
			}else {// 소문자도 아니고 대문자도 아니라면
				//그대로
				res += ch;
			}
		}
		
//		res += (char)(input.charAt(0) - 32); // 'a' - 32
//		res += (char)(input.charAt(1) + 32); // 'A'
//		res += input.charAt(2); // '+'
		
		System.out.println("결과 >> " + res);
		

		// 출력 : 홍길동,10,서울시





	}
}








