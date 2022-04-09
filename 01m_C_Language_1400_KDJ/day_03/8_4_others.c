/*
	4. 기타 제어문
	기타 제어문은 반복문 등에 추가되어 보보적인 역할을 하는 키워드로
	사용자가 코드를 목적에 맞게 작성하는 데 편의성을 높혀 줌.

	1) break
		break는 현재 진행 중인 코드 블록을 강제 종료하는 역할
		switch문에 포함된 case 영역 외에도 while, for문 등 반복문을
		강제 종료할 때도 사용 가능.

	2) continue
		continue는 반복문에서 
		'이후의 코드를 생략하고 반복문의 처음으로 돌아가라'라는 의미로 사용.
		여기서 반복문의 처음이란 코드의 첫 부분이 아닌 조건식을 검사하는 반복문의 가장 첫 단계.
	

	3) return
		return은 함수 끝에 입력돼서 해당 함수를 호출한 곳으로 데이터를 반환하는 역할
		또는, 함수의 종료를 알리는 기능.

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_8_4() 
{
	//1. break
	for (int num = 1; num < 10; num++)
	{
		if ((num % 3) == 0)
		{
			break;
		}
		printf("%d ", num);
	}
	printf("\n");
	//2. continue
	for (int num = 1; num < 10; num++)
	{
		if ((num % 3) == 0)
		{
			continue;
		}
		printf("%d ", num);
	}
	printf("\n");
	//3. return
	for (int num = 1; num < 10; num++)
	{
		if ((num % 3) == 0)
		{
			return;
		}
		printf("%d ", num);
	}
	printf("\n");
}