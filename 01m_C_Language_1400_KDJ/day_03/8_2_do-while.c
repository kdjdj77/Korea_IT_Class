/*	
	2. do-while문에 의한 반복
	1) do-while문의 특징
		while문과 do-while문의 가장 큰 차이점은 바로 '조건에 대한 검사가 이루어지는 시점'
		while문은 조건에 대한 검사를 가장 먼저 진행하고 반복 여부를 결정하는 반면,
		do-while문은 조건에 대한 검사를 가장 마지막에 진행.
	
		do-while문의 기본 형태

		do{
			실행하고자 하는 문장
		}while(조건);


		ex)
		num = 1;
		do {
			printf("%d", num);
			num++;
		} while(num < 3);
	

	2) do-while문이 필요한 경우
		do-while문은 실행문을 실행 후 조건을 검사하기 때문에 
		반드시 1회 이상 실행문이 실행되어야 하는 프로그램에 사용하는 것이 좋음.

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_8_2() 
{
/*
	//example 01
	int num = -1;

	do
	{
		printf("-1 입력시 종료 : ");
		scanf("%d", &num);
	} 
	while (num != -1);
*/

	//example 02
	int number = 0;
	int sum = 0;

	do {
		number++;
		sum += number;
	} while (number < 10);

	printf("1~10까지의 합 : %d\n", sum);
}