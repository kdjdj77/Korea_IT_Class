package day_05;
import java.util.Scanner;

public class review 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//1. 두 정수 입력받아 큰 수 출력
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("큰 수 : " + (num1 > num2 ? num1 : num2));
		System.out.println("-------------");
	//2. 두 정수를 입력받아 두 수의 차 출력
		System.out.println("두 수의 차 : " 
				+ (num1 > num2 ? num1 - num2 : num2 - num1));
		System.out.println("-------------");
	//3. 나이가 10이상 25이하이면 1000원 나머지 무료
	//나이 입력받아 금액 출력
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("금액 : " 
				+ (age >= 10 && age <= 25 ? "1000원" : "무료"));
		System.out.println("-------------");
	//4. 키와 나이 입력받아 120cm 이상, 8살 이상이라면 탑승가능 아니면 탑승불가
		System.out.print("키 입력 : ");
		int tall = sc.nextInt();
		System.out.print("나이 입력 : ");
		int age2 = sc.nextInt();
		System.out.println(age2 >= 8 && tall >= 120 ? "탑승가능" : "탑승불가");
		System.out.println("-------------");
	//5. 한 박스당 20개 라면 들어가는 상자, 라면의 개수 입력받아서 필요한 상자 개수
		System.out.print("라면 개수 입력 : ");
		int ramen = sc.nextInt();
		System.out.println("필요한 상자 개수 : " 
		+ ((ramen % 20 > 0) ? (ramen / 20 + 1) : (ramen / 20)));
		System.out.println("-------------");
	//6. 이름 입력받아 이름이 관리자이면 관리자 모드로 변환합니다 출력 아니면 
	// 000님 환영합니다 출력
		sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println(name.equals("관리자") 
				? "관리자 모드로 변환합니다" : (name + "님 환영합니다"));
		System.out.println("-------------");
	//upgrade. 두 정수 입력받아 큰 수 출력 ( 같으면 같다고 출력 )
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		System.out.println(num1 == num2 ? 
				"같다" : ("큰 수 : " + (num1 > num2 ? num1 : num2)));
		sc.close();
	}
}
