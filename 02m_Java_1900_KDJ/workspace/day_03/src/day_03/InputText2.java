package day_03;
import java.util.Scanner;

public class InputText2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
/*		
		//버퍼 초기화
		System.out.print("나이 : ");
		int age = sc.nextInt();	//버퍼에 \n이 남아 있음
		
		System.out.print("이름 : ");
		sc.nextLine();			//버퍼 초기화
		String name = sc.nextLine();
		
		System.out.printf("%s님, %d살\n", name, age);
*/		
		//값 두 개를 띄어쓰기를 이용하여 한번에 입력
		System.out.print("점수 두 개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf("num1 : %d\nnum2 : %d", num1, num2);
		
		sc.close();
	}
}
