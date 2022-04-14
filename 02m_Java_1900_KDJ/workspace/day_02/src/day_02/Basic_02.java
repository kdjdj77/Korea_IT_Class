package day_02;

public class Basic_02 
{
	public static void main(String[] args) 
	{
		System.out.print("hello ");				//개행 없음
		System.out.println();					//개행
		System.out.print("nice to meet you\n");
		System.out.println("========================================");
	
		System.out.printf("day %d\n", 14);
		System.out.printf("int\t: %02d\nfloat\t: %7.2f\nchar\t: %4c\n"
				+ "String\t: %5.4s\n", 3, 3.14, 'A', "hello");
	}
}
