package day_04;
import java.util.Scanner;
public class conditionaloperator 
{
	public static void main(String[] args) 
	{
		//System.out.println(false ? 10 : 5);
		//나이 입력받아서 성인 / 미성년자 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.println(age > 19 ? "성인입니다" : "미성년자입니다");
		sc.close();
	}
}