package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "apple juice is delicious";
		
		String[] ar = {"�ȳ�", "�ϼ���", "�ݰ�����"};
		
		// join() ����ƽ �޼ҵ�
		System.out.println(String.join(" ", ar));
		
		String[] temp = str1.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("----------");
		// 12 ������ 15-1 ���� �ڸ��ڴ�
		System.out.println(str1.substring(12, 15));
		
		// 12�� ���� ������ �ڸ��ڴ�
		System.out.println(str1.substring(12));
		
		
		System.out.println(str1.length());
		
//		System.out.println(str1.charAt(0));
//		
		for(int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		System.out.println(str1.indexOf('e'));// 0��° ���� ã��
		System.out.println(str1.indexOf('e', 5));// 5��° ���� ã��
		System.out.println(str1.indexOf("ice")); // �����ϴ� �ε���
		System.out.println(str1.indexOf("e", 5));
		System.out.println(str1.indexOf("�ȳ�"));// ���� ��� -1�� return
		
		
		
		
		
	}
}























