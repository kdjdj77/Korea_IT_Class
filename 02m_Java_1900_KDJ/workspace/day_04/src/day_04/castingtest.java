package day_04;

public class castingtest 
{
	public static void main(String[] args) 
	{
		System.out.println((int)3.14);
		System.out.println((double)97);
		System.out.println((char)97);
		//System.out.println((String)97);
/*
		String�� Ŭ����Ÿ���̱� ������ �޼ҵ带 ���ؼ� ����ȯ�� �� ��� �Ѵ�
		int -> String	:	Integer.toString(��(int));
		String -> int	:	Integer.parseInt(��(String));	
		
		double -> String	:	Double.toString(��(double));
		String -> double	:	Double.parseDouble(��(String));
*/
		int num2 = Integer.parseInt("15");
		double num3 = Double.parseDouble("3.14");
		System.out.println((num2 + 1) + " " + (num3 + 0.01));
		
		//�Ϲ��� ����ȯ, �ڵ�����ȯ
		String a = 10 + "";
		System.out.println(a + 45);
		
		double b = 3 * 1.0;	//3 + 0.0
		System.out.println(b);
		
	}
}