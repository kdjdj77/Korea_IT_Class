package com.lec.java.collection06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set, HashSet<E>

	Collection<E>
	 |__ Set<E>
	      |__ HashSet<E>, TreeSet<E>
	
	 Set:
	 1. 자료의 중복 저장이 허용되지 않는다. (hashCode() 값의 중복여부!)
	 2. 저장 순서가 유지되지 않는다.(인덱스 없다.)
	 (예) {1, 2, 3} = {1, 1, 2, 2, 3} : 중복 저장이 안되기 때문에 같은 Set
	 (예) {1, 2, 3} = {1, 3, 2}: 저장 순서가 중요하지 않기 때문에 같은 Set
	
	 HashSet: 매우 빠른 검색 속도를 제공

	 	(※ HashXXX ← '검색속도 향상'을 쓰는 자료구조 입니다)
*/

public class Collection06Main {

	public static void main(String[] args) {
		System.out.println("HashSet 클래스");
		
		// Integer 타입을 저장할 수 있는 HashSet 인스턴스 생성
		Set<Integer> set = new HashSet<Integer>();
		
		// 데이터 저장: add()
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);  // 중복데이터는 저장되지 않는다
		set.add(400);
		set.add(500);
		set.add(1);
		set.add(2);
		
		// HashSet의 크기: size()
		System.out.println("set 의 길이: " + set.size());
		
		// Set은 중복 저장을 허용하지 않는다.
		
		// 데이터 검색:
		// Set은 인덱스가 없기 때문에 get() 메소드를 제공하지 않습니다.
		// 데이터 검색을 위해서는 Iterator를 사용해야 함
		System.out.println();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 저장순서와 관계없다.
		
		// 데이터 삭제
		// remove(element): Set에 있는 element를 찾아서 삭제
		//   element 있다면 삭제 후 true를 리턴
		//   element 없다면 false 리턴
		System.out.println("삭제결과: " + set.remove(2));  // index 2 를 삭제하는게 아니다!! 2 값을 삭제하는 것이다
		System.out.println("삭제결과: " + set.remove(2));
		
		System.out.println();
		System.out.println("삭제 후:");
		for(Integer e : set) {
			System.out.println(e);
		}
		
		// Set 자료형 데이터 변경을 할 수 있는 set() 메소드를 제공하지 않습니다.
		// 삭제(remove) 후 추가(add)하면 변경하는 효과
		// TODO : 500 -> 555 로 변경하고 싶다면?
		set.remove(500);
		set.add(555);
		System.out.println("수정 후:");
		for(Integer e : set) {
			System.out.println(e);
		}
		
		// enhanced-for 사용
		System.out.println();
		System.out.println("Enhanced for 사용 출력");
		// TODO
		
		// forEach() 메소드 사용
		System.out.println();
		System.out.println("forEach() 사용 출력");
		// TODO
		
		
		// toString() 제공됨
		System.out.println();
		// TODO
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
