package q두개뽑아서더하기;

/*
문제 설명
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.
*/

import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
    	HashSet<Integer> set = new HashSet<>();
    	int len = numbers.length;
        for(int i = 0; i < len-1; i++) {
        	for(int j = i+1; j < len; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int a : set) res[i++] = a;
        Arrays.sort(res);
        return res;
    }
}