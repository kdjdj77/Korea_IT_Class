package day_09;
import java.util.Scanner;

public class ArrayTask 
{
	public static void main(String[] args) 
	{
		int[] arr = {5, 4, 6, 9, 10};
		//배열 모습으로 출력
		System.out.print("{");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i + 1 != arr.length)
				System.out.print(", ");
		}
		System.out.println("}");
		
		//점수 3개 입력받아 총점과 평균 출력
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] scores = {0, 0, 0};
		String[] list = {"국어", "영어", "수학"};
		
		for (int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " 입력 : ");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum / scores.length);
		
		sc.close();
	}
}
