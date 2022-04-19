package day_03;

public class OperatorTest2 
{
	public static void main(String[] args) 
	{
//µ°º¿
		System.out.println("---int - ??---");
		System.out.println(10 - 5);		//int - int -> int
		System.out.println(10 - 3.1);	//int - double -> double
		System.out.println(10 - 'a');	//int - char -> int
//		System.out.println(10 - "æ»≥Á");	//error
		
		System.out.println("---double - ??---");
		System.out.println(3.1 - 1.1);	//double - double -> double
		System.out.println(3.1 - 'a');	//double - char -> double
//		System.out.println(3.1 - "æ»≥Á");	//double - String -> String
		
		System.out.println("---char - ??---");
		System.out.println('b' - 'a');	//char - char -> int
//		System.out.println('b' - "æ»≥Á");	//error
		
		System.out.println("---String - ??---");
//		System.out.println("æ»≥Á" - "æ»≥Á");	//error

//∞ˆº¿
		System.out.println("---int * ??---");
		System.out.println(10 * 5);		//int * int -> int
		System.out.println(10 * 3.1);	//int * double -> double
		System.out.println(10 * 'a');	//int * char -> int
//		System.out.println(10 * "æ»≥Á");	//error
		
		System.out.println("---double * ??---");
		System.out.println(3.1 * 3.0);	//double * double -> double
		System.out.println(3.1 * 'a');	//double * char -> double
//		System.out.println(3.1 * "æ»≥Á");	//double * String -> String
		
		System.out.println("---char * ??---");
		System.out.println('b' * 'a');	//char * char -> int
//		System.out.println('b' * "æ»≥Á");	//error
		
		System.out.println("---String * ??---");
//		System.out.println("æ»≥Á" * "æ»≥Á");	//error

//≥™¥∞º¿
		System.out.println("---int / ??---");
		System.out.println(10 / 3);		//int / int -> int
		System.out.println(10 / 2.5);	//int / double -> double
		System.out.println(10 / 'a');	//int / char -> int
//		System.out.println(10 / "æ»≥Á");	//error
		
		System.out.println("---double / ??---");
		System.out.println(10.5 / 2.0);	//double / double -> double
		System.out.println(97.0 / 'a');	//double / char -> double
//		System.out.println(3.1 / "æ»≥Á");	//double / String -> String
		
		System.out.println("---char / ??---");
		System.out.println('b' / 'a');	//char / char -> int
//		System.out.println('b' / "æ»≥Á");	//error
		
		System.out.println("---String / ??---");
//		System.out.println("æ»≥Á" / "æ»≥Á");	//error	
		//devide by 0 ¡÷¿««“ ∞Õ
	}

}
