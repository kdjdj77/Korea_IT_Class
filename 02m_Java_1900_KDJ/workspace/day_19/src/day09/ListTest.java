package day09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// 크기가 가변적으로 변하는 배열 : 리스트
		// 생성자 쪽의 클래스타입은 생략가능
//		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println(names);
		
		//size() : 길이를 return 하는 메소드
		System.out.println(names.size());
		
		//add(요소) : 요소를 추가하는 메소드
		// 중복허용, 순서대로 저장
		names.add("배상엽");
		names.add("김철수");
		names.add("김영희");
		names.add("홍길동");
		names.add("배상엽");
		
		System.out.println(names);
		
		// add(인덱스번호, 요소) : 해당 인덱스 자리에 요소 삽입
		names.add(2, "추가된요소");
		System.out.println(names);
		
		// get() : 요소 가져오기
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
		
		// remove(인덱스) : 인덱스번호로 삭제 
		names.remove(0);
		System.out.println(names);
		
		// remove(요소) : 요소로 삭제
		names.remove("추가된요소");
		System.out.println(names);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		Car c1 = new Car("김철수", 100);
		Car c2 = new Car("김영희", 200);
		Car c3 = new Car("홍길동", 300);
		
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		System.out.println(list.get(1).name);
		
		for(Car a : list) {
			System.out.println(a.price);
		}
		
		// 업캐스팅
		List<String> list2 = new ArrayList<String>();
		
		List<String> list3 = new LinkedList<String>();
		
	}
}

























