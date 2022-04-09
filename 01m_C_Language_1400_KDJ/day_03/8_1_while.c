/*
	1. while문에 의한 반복
		반복문이란 여러 문장을 반복 실행하고자할 때 사용하는 구문.
		반복문을 사용하면 코드의 양을 줄일 수 있어 코드를 간결하게 작성 가능.
		C언어는 while, do-while, for, 세 가지 반복문을 제공

		1) while문의 반복 명령
		while은 '~하는 동안에'라는 의미로 
		C 언어의 while문은 주어진 조건을 만족하는 동안 특정한 문장을 반복 실행.
		반복 실행하고자 하는 while문의 중괄호 안에 작성
		while문의 기본 형태는 다음과 같음

		while(조건)
		{
			실행하고자 하는 문자
		}


		2) 무한루프
		반복문은 조건을 만족하는 상태를 계속 유지하면 종료되지 않음.
		반복문이 종료되지 않고 계속해서 반복하는 것을 무한루프(무한반복)라고 함.

		ex)
		int num = 3;
		while(num < 5)
		{
			printf();
		}

		무한루프에 빠지는 것을 방지하기 위해 반복 조건의 결과를 
		변경할 수 있는 최소한의 연산을 포함해야 함. 
		예를 들어 조건식에 사용된 변수의 값을 변경할 수 있는 증감식과 같은 코드 삽입.

		그러나 어떤 목적을로 프로그램을 만든느냐에 따라 무한루프가 필요할 때도 있음.
		가령 전원이 켜지면 전원이 꺼질 때까지 쉬지 않고 작동하는 에어컨 등의
		전자제품을 제어하는 프로그램 등.

		ex)
		while(1)
		{
			printf();
		}

		콘솔 강제 종료는 ctrl + c
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_8_1() 
{
	//1. while 문의 반복명령
	// example 01
/*
	int num = 0;
	while (num < 3)
	{
		printf("num is %d now\n", num);
		num++;
	}
*/

	// example 02
/*
	while (num != -1)
	{
		printf("숫자를 입력하세요(-1 입력시 종료) : ");
		scanf("%d", &num);
		num = -1;
		if (num == -1) printf("종료합니다\n");
		else printf("%d을(를) 입력하셨습니다.\n", num);
	}
*/

	// 무한루프
/*
	int num;
	while (1)
	{
		printf("무한 반복 중... 숫자를 입력하세요 : ");
		scanf("%d", &num);
		printf("%d을(를) 입력하셨습니다.\n", num);
	}
*/
}