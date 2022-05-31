package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "apple juice is delicious";
		
		String[] ar = {"안녕", "하세요", "반가워요"};
		
		// join() 스태틱 메소드
		System.out.println(String.join(" ", ar));
		
		String[] temp = str1.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("----------");
		// 12 번부터 15-1 까지 자르겠다
		System.out.println(str1.substring(12, 15));
		
		// 12번 부터 끝까지 자르겠다
		System.out.println(str1.substring(12));
		
		
		System.out.println(str1.length());
		
//		System.out.println(str1.charAt(0));
//		
		for(int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		System.out.println(str1.indexOf('e'));// 0번째 부터 찾기
		System.out.println(str1.indexOf('e', 5));// 5번째 부터 찾기
		System.out.println(str1.indexOf("ice")); // 시작하는 인덱스
		System.out.println(str1.indexOf("e", 5));
		System.out.println(str1.indexOf("안녕"));// 없을 경우 -1이 return
		
		
		
		
		
	}
}























