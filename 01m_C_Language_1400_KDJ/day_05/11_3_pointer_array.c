/*
	3. 포인터 배열
	1) 포인터 배열
		기본 자료형을 사용해 변수를 선언하면 값을 저장할 수 있는 일반적인 의미의 변수가 되고,
		포인터형을 사용해 변수를 선언하면 포인터(주솟값)을 저장할 수 있는 포인터 변수가 됨.
		이와 마찬가지로 기본 자료형을 사용해 배열을 선언하면 값 또는 변수를 저장할 수 있는 배열이 되고,
		포인터형을 사용해 배열을 선언하면 포인터(주솟값)을 저장할 수 있는 포인터 배열이 됨.

		ex) 
		int* i_parr[10];
		double* d_parr[20];

		포인터 배열의 선언은 기본 자료형 배열의 선언 방법은 동일.

*/
#include <stdio.h>

void main_11_3() 
{
	//배열 이름과 * 연산자
	int n1 = 3, n2 = 6, n3 = 9;

	//포인터 변수의 선언 및 초기화
	int* ptr1 = &n1, * ptr2 = &n2, * ptr3 = &n3;

	//포인터 배열의 선언 및 초기화
	int* p_arr[3] = { ptr1, ptr2, ptr3 };

	//주소에 들어있는 값 및 주소 출력
	for (int i = 0; i < 3; i++) printf("%d ", *p_arr[i]);
	printf("\n");
	for (int i = 0; i < 3; i++) printf("%p ", p_arr[i]);
	printf("\n");

	//문제 1

	int arr[5] = { 10, 20, 30, 40, 50 };
	int* ptr = &arr;
	for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
		printf("%d ", *(ptr++));
	printf("\n");

	//문제 2
	int arr2[8] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int* ptrr = &arr2[7];
	int sum = 0;
	for (int i = 0; i < sizeof(arr2) / sizeof(int); i++)
	{
		if (*ptrr % 2 == 1) sum += *ptrr;
		ptrr--;
	}
	printf("%d\n", sum);
}