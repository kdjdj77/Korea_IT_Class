package day_03;

public class OperatorTest 
{
	public static void main(String[] args) 
	{
		System.out.println("---int + ??---");
		System.out.println(10 + 10);	//int + int -> int
		System.out.println(10 + 3.14);	//int + double -> double
		System.out.println(10 + 'a');	//int + char -> int
		System.out.println(10 + "¾È³ç");	//int + String -> String

		System.out.println("---double + ??---");
		System.out.println(3.14 + 10);	//double + int -> double
		System.out.println(3.1 + 1.9);	//double + double -> double
		System.out.println(3.1 + 'a');	//double + char -> double
		System.out.println(3.1 + "¾È³ç");	//double + String -> String
		
		System.out.println("---char + ??---");
		System.out.println('a' + 10);	//char + int -> int
		System.out.println('a' + 1.9);	//char + double -> double
		System.out.println('a' + 'a');	//char + char -> int
		System.out.println('a' + "¾È³ç");	//char + String -> String
		
		System.out.println("---String + ??---");
		System.out.println("¾È³ç" + 10);		//String + int -> String
		System.out.println("¾È³ç" + 1.9);		//String + double -> String
		System.out.println("¾È³ç" + 'a');		//String + char -> String
		System.out.println("¾È³ç" + "¾È³ç");	//String + String -> String
		
		System.out.println(10 + "20" + 'a' + 7);
		System.out.println(7 + 'a' + "" + 50);	//¿¬»ê¼ø¼­ : ¿ŞÂÊºÎÅÍ ¿À¸¥ÂÊÀ¸·Î
	}
}
