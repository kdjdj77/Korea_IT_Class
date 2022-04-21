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
		String은 클래스타입이기 때문에 메소드를 통해서 영변환을 해 줘야 한다
		int -> String	:	Integer.toString(값(int));
		String -> int	:	Integer.parseInt(값(String));	
		
		double -> String	:	Double.toString(값(double));
		String -> double	:	Double.parseDouble(값(String));
*/
		int num2 = Integer.parseInt("15");
		double num3 = Double.parseDouble("3.14");
		System.out.println((num2 + 1) + " " + (num3 + 0.01));
		
		//암묵적 형변환, 자동형변환
		String a = 10 + "";
		System.out.println(a + 45);
		
		double b = 3 * 1.0;	//3 + 0.0
		System.out.println(b);
		
	}
}