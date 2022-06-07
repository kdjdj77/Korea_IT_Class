package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<String>();
		
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		// ���� X, �ߺ���� X
		fruits.add("�ٳ���");
		fruits.add("���");
		fruits.add("����");
		fruits.add("������");
		fruits.add("���ξ���");
		fruits.add("���ξ���");
		fruits.add("���ξ���");
		fruits.add("���ξ���");
		fruits.add("���ξ���");
		fruits.add("���ξ���");
		
		System.out.println(fruits);
		
		// ������ ���� ������ �ε��� ��ȣ ��� �Ұ���
//		fruits.get(0);
		
		fruits.remove("���ξ���");
		System.out.println(fruits);
		fruits.remove("��ȭ��");
		System.out.println(fruits);
		
		for(String a : fruits) {
			System.out.println(a);
			if(a.equals("�ٳ���")) {
				System.out.println("ã�Ҵ�");
			}
		}
		System.out.println("------------------");
		
		int num = Integer.parseInt("10");
		
		// iterator() : ������ �ο����ִ� �޼ҵ�
		Iterator<String> it = fruits.iterator();
		
		// next()
		// hasNext() : ���� ���� ��Ұ� �ִٸ� true, ���ٸ� false�� return
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}






















