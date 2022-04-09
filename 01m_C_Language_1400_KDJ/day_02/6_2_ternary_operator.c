/*

	1. 삼항 연산자
	1) 삼항 연산자
	삼항 연산자는 세 개의 항을 이용하는 연산자.
	삼항 연산자의 기본 형태는 다음과 같음
	조건 ? 결과 : 결과 2

	조건: '참' 또는 '거짓'을 반환하는 식 또는 값
	결과1: 조건을 통해 반환된 결과가 '참'일 경우에 삼항 연산자가 반환할 결과
	결과2: 조건을 통해 반환된 결과가 '거짓'일 경우에 삼항 조건 연산자가 반환될 결과

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main_6_2() 
{
	printf("\n-------main_6_2--------\n");

	//삼항연산자
	int num, absolute;

	printf("정수 입력 : ");
	scanf("%d", &num);

	absolute = num > 0 ? num : -num;
	printf("절댓값 %d\n", absolute);
}