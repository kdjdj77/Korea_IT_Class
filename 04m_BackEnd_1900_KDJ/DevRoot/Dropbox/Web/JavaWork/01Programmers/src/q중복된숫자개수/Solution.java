package q중복된숫자개수;

/*
문제 설명
정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 1,000
0 ≤ n ≤ 1,000
*/

class Solution {
    public int solution(int[] array, int n) {
    	int res = 0;
        for(int a : array) if (a == n) res++;
        return res;
    }
}