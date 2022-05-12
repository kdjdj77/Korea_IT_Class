package day_11;
import java.util.Scanner;

public class Review 
{
//이름과 반복횟수 입력받아 출력하는 메소드
	public static void printName(String name, int n)
	{
		for (int i = 0; i < n; i++)
			System.out.println(name);
	}
//나이 입력받고 성인/미성년 판별하는 메소드
	public static void printAdult(int age)
	{
		if (age < 19) System.out.println("미성년입니다");
		else System.out.println("성인입니다");
	}
//배열을 배열 모양으로 출력하는 메소드
	public static void printArr(int[] arr)
	{
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i + 1 < arr.length)
				System.out.print(", ");
		}
		System.out.print(" }");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//이름과 반복횟수 입력받아 출력하는 메소드
		System.out.print("이름 >> ");
		String name = sc.nextLine();
		System.out.print("횟수 >> ");
		int cnt = sc.nextInt();
		Review.printName(name, cnt);
	//나이 입력받고 성인/미성년 판별하는 메소드
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		Review.printAdult(age);
	//배열을 배열 모양으로 출력하는 메소드
		int[] arr = {1, 3, 5, 7};
		Review.printArr(arr);
		
		sc.close();
	}
}
