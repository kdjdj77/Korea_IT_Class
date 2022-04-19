package day_03;

public class OperatorTest 
{
	public static void main(String[] args) 
	{
		System.out.println("---int + ??---");
		System.out.println(10 + 10);	//int + int -> int
		System.out.println(10 + 3.14);	//int + double -> double
		System.out.println(10 + 'a');	//int + char -> int
		System.out.println(10 + "�ȳ�");	//int + String -> String

		System.out.println("---double + ??---");
		System.out.println(3.14 + 10);	//double + int -> double
		System.out.println(3.1 + 1.9);	//double + double -> double
		System.out.println(3.1 + 'a');	//double + char -> double
		System.out.println(3.1 + "�ȳ�");	//double + String -> String
		
		System.out.println("---char + ??---");
		System.out.println('a' + 10);	//char + int -> int
		System.out.println('a' + 1.9);	//char + double -> double
		System.out.println('a' + 'a');	//char + char -> int
		System.out.println('a' + "�ȳ�");	//char + String -> String
		
		System.out.println("---String + ??---");
		System.out.println("�ȳ�" + 10);		//String + int -> String
		System.out.println("�ȳ�" + 1.9);		//String + double -> String
		System.out.println("�ȳ�" + 'a');		//String + char -> String
		System.out.println("�ȳ�" + "�ȳ�");	//String + String -> String
		
		System.out.println(10 + "20" + 'a' + 7);
		System.out.println(7 + 'a' + "" + 50);	//������� : ���ʺ��� ����������
	}
}
