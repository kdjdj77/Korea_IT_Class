package day_07;

public class IncrementalOperator 
{
	public static void main(String[] args) 
	{
		//전위형 (우선순위가 높다)
		int a = 10;
		++a;
		System.out.print(a + " ");
		System.out.println(++a);	//증가 후 출력
		
		//후위형 (우선순위가 낮다)
		int b = 10;
		b++;
		System.out.print(b + " ");
		System.out.println(b++);	//출력 후 증가
	}

}
