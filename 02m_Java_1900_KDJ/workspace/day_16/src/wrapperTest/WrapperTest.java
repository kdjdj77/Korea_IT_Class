package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int i1 = 10;
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(10);
		int i4 = 10;
		
		System.out.println(i2);
		System.out.println(i3);
		// 서로 같은 객체인지(메모리상에 저장되어있는 동일한 객체를 가리키는지)
		// 확인하고 싶을 때는 ==을 사용하지만
		System.out.println(i2 == i3);
		// 서로 내용이 같은지 확인하고 싶을 때튼 .equals()를 사용한다
		System.out.println(i2.equals(i3));
		System.out.println(i1 == i4);
		
		System.out.println("-----------");
		System.out.println(i1 == i2);// auto unboxing
		System.out.println(i2.equals(i1));// auto boxing --> upcasting
		
		System.out.println("-----------");
	
		
		
		String s1 = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		
	}
}























