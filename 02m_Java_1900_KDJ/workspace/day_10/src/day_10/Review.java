package day_10;
import java.util.Scanner;

public class Review
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//1. 사용자에게 입력받을 정수의 개수 입력받음
		//그 개수만큼 정수 입력받고 배열 출력
		System.out.print("개수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("정수 " + (i + 1) + " 입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("{");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i + 1 != arr.length)
				System.out.print(", ");
		}
		System.out.println("}");
		
		//2. 해당 배열 속에서 최대값 출력하기
		int max = arr[0];
		for (int n : arr) if (max < n) max = n;
		System.out.println("최대값 : " + max);
		
		//3. 해당 배열 속에서 최소값 출력하기
		int min = arr[0];
		for (int n : arr) if (min > n) min = n;
		System.out.println("최소값 : " + min);
		
		//4. 해당 배열을 대문자는 소문자로, 소문자는 대문자로, 그 외는 그대로
		char[] alphabets = {'a', 'D', '*', 'x'};
		for (char n : alphabets)
		{
			if (n >= 65 && n <= 90)
				System.out.print((char)(n + 32));
			else if (n >= 97 && n <= 122)
				System.out.print((char)(n - 32));
			else System.out.print(n);
		}
		sc.close();
	}
}
