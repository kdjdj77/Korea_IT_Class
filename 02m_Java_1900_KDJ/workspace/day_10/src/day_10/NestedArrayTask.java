package day_10;
import java.util.Scanner;

public class NestedArrayTask 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//국어, 영어, 수학점수 입력받음
		//학생은 1번부터 4번까지
		System.out.println("학생 성적 입출력 프로그램");
		String[] classes = {"국어", "영어", "수학"};
		int stu_num = 4;
		int[][] arr = new int[stu_num][classes.length];
		while (true)
		{
			System.out.println("1. 학생 성적 입력하기");
			System.out.println("2. 학생 성적 평균점수");
			System.out.println("3. 종료");
			System.out.print("입력 >> ");
			int input = sc.nextInt();
			if (input == 1)
			{
				for (int i = 0; i < arr.length; i++)
				{
					System.out.println("---" + (i + 1) + "번 학생---");
					for (int j = 0; j < arr[i].length; j++)
					{
						System.out.print(classes[j] + "성적 입력 : ");
						arr[i][j] = sc.nextInt();
					}
				}
			}
			else if (input == 2)
			{
				sc.nextLine();
				int sum = 0;
				System.out.print("학생 번호 입력 >> ");
				int n = sc.nextInt() - 1;
				for (int j = 0; j < arr[n].length; j++)
					sum += arr[n][j];
				System.out.print(n + "번 학생의 평균은 ");
				System.out.println((float)sum / classes.length);
			}
			else if (input == 3) break;				
			else System.out.println("다시 입력해 주세요");
		}
		sc.close();
	}
}
