package q최빈값구하기;

/*
문제 설명
정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 1,000
0 ≤ n ≤ 1,000
*/

import java.util.HashMap;
//해쉬맵을 사용한 풀이
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxNum = 0, maxCnt = 0;
        for(int a : array) {
        	map.put(a, map.getOrDefault(a, 0) + 1);
        	if (map.get(a) > maxCnt) { 
        		maxCnt = map.get(a); 
        		maxNum = a;
        	} else if (map.get(a) == maxNum) maxNum = -1;
        }
        return maxNum;
    }
}
//배열을 사용한 풀이
//class Solution {
//    public int solution(int[] array) {
//        int[] arr = new int[1000];
//        for (int a : array) arr[a]++;
//        int maxNum = 0, maxCnt = 0, cnt = 0;
//        for(int i = 0; i < 1000; i++) {
//        	if (arr[i] > maxCnt) { maxCnt = arr[i]; maxNum = i; }
//        	else if (arr[i] == maxCnt) maxNum = -1;
//        }
//        return maxNum;
//    }
//}