/*
	3. switch문을 이용한 선택적 실행
	1) switch
		switch문은 다양한 조건을 검사할 수 있게 만들어 놓은 것으로 
		하나의 변수나 수식에 대한 다양한 조건을 검사할 때 사용.

		switch문의 기본 형태는 다음과 같음.
		switch(표현식)
		{
		case 1:
			표현식 결과가 1일 경우 실행될 영역
			break;
		case 2:
			표현식 결과가 2일 경우 실행될 영역
			break;
		default:
			표현식 결과가 2일 경우 실행될 영역
			break;
		}

		switch문에 삽입되는 표현식은 if문의 조건과 유사한 역할.
		표현식은 데이터를 표현하는 변수 또는 수식을 의미하는데,
		이 표현식이 반환하는 값에 따라 switch문 내에 실행될 문장이 결정.

		case 키워드 옆에는 값이 표시.
		표현식의 결과로 반환되는 값이 case의 값과 일치하는 경우에
		switch문은 해당 case 이하의 실행문을 실행.
		case의 개수에는 제한이 따로 없어 원하는 만큼 case를 삽입 가능.
		

	2) switch문에서 break의 역할
		키워드 break는 switch문의 각 영역을 구분하여 표현식의 
		결괏값에 해당하는 case 영역만 실행될 수 있도록 돕는 역할.
		그러나 switch문에서 break는 필수 요소가 아니므로 생략 가능.

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_7_3() 
{
/*
	//1. switch
	int num = 4;
	printf("input some positive number : ");
	scanf("%d", &num);

	switch (num)
	{
	case 1:
		printf("num is %d\n", num);
		break;
	case 2:
		printf("num is %d\n", num);
		break;
	case 3:
		printf("num is %d\n", num);
		break;
	default:
		printf("bigger than 3\n");
		break;
	}
	printf("switch state end\n");
*/

/*
	//2. break in switch
	int num;
	printf("input some positive number : ");
	scanf("%d", &num);

	switch (num)
	{
	case 1:
	case 3:
	case 5:
		printf("odd\n");
		break;
	case 2:
	case 4:
	case 6:
		printf("even\n");
		break;
	default:
		printf("bigger than 6\n");
	}
	printf("switch state end.\n");
*/

/*	문제1
	int num;
	printf("정수 입력 : ");
	scanf("%d", &num);

	if (num % 2 != 0)
	{
		printf("odd\n");
	}
	else printf("even\n");
*/

/*	문제2
	int num;
	printf("점수 입력 : ");
	scanf("%d", &num);
	switch (num / 10)
	{
	case 10:
	case 9:
		printf("A\n");
		break;
	case 8:
		printf("B\n");
		break;
	case 7:
		printf("C\n");
		break;
	case 6:
		printf("D\n");
		break;
	default:
		printf("F\n");
	}
*/
}