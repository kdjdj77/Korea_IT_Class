package day_03;
import java.util.Scanner;

public class InputText2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();	//버퍼에 \n이 남아 있음
		
		System.out.print("이름 : ");
		sc.nextLine();			//버퍼 초기화
		String name = sc.nextLine();
		
		System.out.printf("%s님, %d살\n", name, age);
		sc.close();
	}
}
