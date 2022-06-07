package day09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<String, Integer>();
		System.out.println(scores);
		
		// 순서없이 저장이 된다
		// key는 중복X, value는 중복O
		// put(key, value) : key가 중복되지 않는다면 요소추가, key가 중복된다면 요소수정
		scores.put("국어", 80);
		scores.put("영어", 70);
		scores.put("수학", 100);
		scores.put("과학", 100);
		scores.put("국어", 100);
		
		System.out.println(scores);
		System.out.println(scores.size());
		
		
		// get(key) : 해당 value를 return
		System.out.println(scores.get("국어"));
		System.out.println(scores.get("과학"));
		System.out.println(scores.get("수학"));
		System.out.println(scores.get("영어"));
		
		// remove(key) : key와 value 한 쌍 삭제
		scores.remove("국어");
		System.out.println(scores);
		
		// 반복문을 통해 맵의 요소 출력하기
//		for( a : scores) {
//			
//		}
		
		// keySet() : 맵 안의 key값들을 모아놓은 Set를 return
		System.out.println(scores.keySet());
		for(String key: scores.keySet()) {
			System.out.println(key + ":" + scores.get(key));
		}
		
		// values()
		System.out.println(scores.values());
		for (int value : scores.values()) {
			System.out.println(value);
		}
		
		// entrySet() : 맵에서 entry들이 요소로 들어있는 Set를 return
		// entry : key 와 value 한 쌍
		for( Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println("------");
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}
}























