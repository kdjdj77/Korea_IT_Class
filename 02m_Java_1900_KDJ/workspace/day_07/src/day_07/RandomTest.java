package day_07;
import java.util.Random;

public class RandomTest 
{
	public static void main(String[] args) 
	{
		//랜덤한 정수를 가져오는 메소드
		//nextInt()
		Random r = new Random();
		System.out.println(r.nextInt(9));
	}
}