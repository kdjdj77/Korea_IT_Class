package com.lec.java.collection07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection07Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// TODO
		// String 타입을 저장할 수 있는 HashSet 를 생성하고
		// 5개 이상의 데이터는 저장, 수정, 삭제 등의 동작을 해보고,
		// iterator, enhanced-for 문을 사용해서 출력해보기
		
		// String 타입을 저장할 수 있는 HashSet 인스턴스 생성
		HashSet<String> set = new HashSet<String>();
 		
		// 데이터 저장
		System.out.println("add 결과: " + set.add("One"));
		System.out.println("add 결과: " + set.add("Two"));
		System.out.println("add 결과: " + set.add("Three"));
		System.out.println("add 결과: " + set.add("Four"));
		System.out.println("add 결과: " + set.add("Five"));
		System.out.println("add 결과: " + set.add("Two"));
		System.out.println("add 결과: " + set.add("Three"));
		
		System.out.println();
		System.out.println("데이터 저장");
		System.out.println("데이터 개수: " + set.size());
		
		System.out.println();		
		
		// 데이터 검색 - Iterator 사용
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// 데이터 삭제
		set.remove("Five");
		
		System.out.println("삭제 후:");
		itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// enhanced for는 인덱스가 필요 없는 for문이기 때문에
		// Set 타입의 자료형에서도 사용 가능
		System.out.println("enhanced for 사용");
		for(String str : set) {
			System.out.println(str);
		}
		
		
		// 기존의 List 에서 중복된 값을 제거하기 (Set<> 활용)
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		
		System.out.println(list);
		
		// 기존의 List<> 로부터 Set<> 생성
		Set<Integer> set2 = new HashSet<>(list);
		System.out.println(set2);
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
















