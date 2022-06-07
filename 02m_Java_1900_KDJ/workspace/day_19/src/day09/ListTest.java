package day09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// ũ�Ⱑ ���������� ���ϴ� �迭 : ����Ʈ
		// ������ ���� Ŭ����Ÿ���� ��������
//		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println(names);
		
		//size() : ���̸� return �ϴ� �޼ҵ�
		System.out.println(names.size());
		
		//add(���) : ��Ҹ� �߰��ϴ� �޼ҵ�
		// �ߺ����, ������� ����
		names.add("���");
		names.add("��ö��");
		names.add("�迵��");
		names.add("ȫ�浿");
		names.add("���");
		
		System.out.println(names);
		
		// add(�ε�����ȣ, ���) : �ش� �ε��� �ڸ��� ��� ����
		names.add(2, "�߰��ȿ��");
		System.out.println(names);
		
		// get() : ��� ��������
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("------------");
		for(String a : names) {
			System.out.println(a);
		}
		
		// remove(�ε���) : �ε�����ȣ�� ���� 
		names.remove(0);
		System.out.println(names);
		
		// remove(���) : ��ҷ� ����
		names.remove("�߰��ȿ��");
		System.out.println(names);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		Car c1 = new Car("��ö��", 100);
		Car c2 = new Car("�迵��", 200);
		Car c3 = new Car("ȫ�浿", 300);
		
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		System.out.println(list.get(1).name);
		
		for(Car a : list) {
			System.out.println(a.price);
		}
		
		// ��ĳ����
		List<String> list2 = new ArrayList<String>();
		
		List<String> list3 = new LinkedList<String>();
		
	}
}

























