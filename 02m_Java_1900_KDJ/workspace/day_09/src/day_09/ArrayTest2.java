package day_09;

public class ArrayTest2 
{
	public static void main(String[] args) 
	{
		int[] arr1 = new int[5];
		System.out.println("arr1.length : " + arr1.length);
		System.out.print("{");
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i]);
			if (i + 1 != arr1.length)
				System.out.print(", ");
		}
		System.out.println("}");
		
		//�Ϲ� for��
		int[] scores = {10, 20, 30, 40};
		for (int i = 0; i < scores.length; i++)
		{
			int num = scores[i];
			System.out.println(num);
		}
		//���� for��, ���� for��, foreach��
		for (int num : scores)
			System.out.println(num);
		String[] names = {"��ö��", "�迵��", "ȫ�浿"};
		for(String n : names)
			System.out.println(n);
	}
}
