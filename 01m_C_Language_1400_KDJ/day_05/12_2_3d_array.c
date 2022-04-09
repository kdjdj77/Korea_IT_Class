/*
	2. 3차원 배열
	1) 3차원 배열
		3차원 배열은 2차원 배열보다 길이 정보가 하나 더 많은 총 세 개의 길이 정보를 가짐.
		3차원 배열의 선언 방법은 다음과 같음.

		ex) 
		int arr[2][3][4];

		위 예시의 int형 3차원 배 열의 경우 길이 정보 [2][3][4]를 가지는데,
		이는 높이2, 행3, 열4인 3차원 배열 의미.

		위 예에서 3차원 배열 arr은 총 24개의 int형 값 또는 변수 저장.
		sizeof 연산자로 arr의 크기를 계산하면 각 요소의 자료형 크기에 24를 곱한 결과 출력.




	2) 3차원 배열의 선언 및 접근
		3차원 배열의 선언과 접근은 높이 정보가 추가된 것을 제외하면 2차원 배열과 큰 차이가 없음.
		사실상 3차원 배열은 여러 개의 2차원 배열이 모여 있는 형태.

*/
#include <stdio.h>

void main_12_2() 
{
	//1. 3차원 배열
	int arr_1d[2];
	int arr_2d[2][3];
	short s_arr[2][3][4];
	int i_arr[2][3][4];

	printf("size of arr_1d : %d\n", sizeof(arr_1d));
	printf("size of arr_2d : %d\n", sizeof(arr_2d));
	printf("size of s_arr : %d\n", sizeof(s_arr));
	printf("size of i_arr : %d\n", sizeof(i_arr));

	//2. 3차원 배열의 선언 및 접근
	int arr[2][3][4] = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },{ 9, 10, 11, 12 } },
					{ { 13, 14, 15, 16 }, { 17, 18, 19 ,20 }, { 21, 22, 23, 24 } } };

	//3차원 배열의 첫 번째 2차원 배열 값 출력
	for (int i = 0; i < 2; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			for (int k = 0; k < 4; k++) printf("%2d ", arr[i][j][k]);
			printf("\n");
		}
		printf("\n");
	}
}