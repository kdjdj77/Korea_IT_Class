package day_10;

public class NestedArrayTest 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{10, 20, 30, 40, 50}, {30, 40}, {50, 60, 70}};
		for(int[] n : arr) System.out.println(n);
		
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2 = new int[2][3];
		System.out.println(arr2.length);
	}
}
