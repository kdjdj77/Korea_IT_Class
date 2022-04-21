package day_04;

public class relationalOperator 
{
	public static void main(String[] args) 
	{
	//비교 가능한 타입
	//int, double, char, boolean?
		System.out.println(10 > 10);
		System.out.println(10 >= 5);
		System.out.println(10 == 10.0);
		System.out.println('a' > 'b');
		//System.out.println(10 > true);
		//System.out.println("안녕" > "안녕하세요");
		
	//String이 서로 같은지 비교할 때는 반드시 메소드를 사용한다.
	//String1.equals(String2)
		System.out.println("가나다".equals("가나다"));
		String name = "홍길동";
		System.out.println(name.equals("김철수"));
		
	}
}
