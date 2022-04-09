/*
	1. if문의 조건부 실행
	1) if문을 이용한 조건부 실행
		c언어 프로그램은 모든 코드를 순차적으로 실생시킴.
		그러나 if문을 사용하면 코드를 선택적으로 실행할 수 있음.

		if문의 기본 형태
		if(조건){
			조건 만족 시 실행 문장 1;
			조건 만족 시 실행 문장 2;
		}

		if문의 괄호 안에는 조건 삽입.
		이 조건을 만족하는 '참(1)'인 경우에만 
		if문의 중괄호 안에 삽입된 문장들이 순차적으로 실행.

		if문 중괄호 내에 삽입된 문장이 하나일 경우 중괄호 생략 가능.


*/
#include <stdio.h>
void main_7_1()
{
	//1. if
	int num = 3;

	if (num < 3)
	{
		printf("num is smaller than 3!\n");
	}
	if (num == 3)
	{
		printf("num is 3!\n");
	}
	if (num > 3)
	{
		printf("num is bigger than 3!\n");
	}
}