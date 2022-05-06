package day_09;

public class ArrayTest 
{
	public static void main(String[] args) 
	{
		//인덱스 번호는 0, 1, 2 / 배열의 길이(요소 개수) : 3
		int[] scores = {80, 75, 35, 21, 35, 95, 75, 46, 55, 2};
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		//System.out.println(scores[3]);
		//System.out.println(scores[-1]);
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}
	}
}
