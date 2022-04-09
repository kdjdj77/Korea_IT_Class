/*
	3. 변수의 생명주기
		변수는 선언되는 위치에 따라 지역변수와 전역변수로 구분.
		변수 선언 위치는 함수의 사용과 긴밀한 관계가 있음.

	1) 지역변수
		지역변수는 특정 지역 내에서만 사용할 수 있는 변수.
		여기서 지역이란 중괄호로 감싸고 있는 코드 블록을 의미.
		지역 내에서 선언된 변수는 선언된 지역 내에서만 유효.
		아래는 지역변수 특성을 정리.

		(1) 중괄호 내에 선언된 모든 변수를 지역변수라고 함.
		(2) 함수의 매개변수도 지역변수의 일종
		(3) 지역변수는 자신이 선언된 지역 외 다른 영역에서는 사용할 수 없음.
		(4) 변수의 이름은 중복을 허용하지 않으나,
			선언된 지역이 서로 다른 경우 이름이 중복되어도 문제되지 않음.


	2) 전역변수		
		모든 지역에서 접근이 가능한 변수.
		전역변수를 선언하려면 그 부분을 중괄호로 묶지 않아야 함.
		전역변수가 많을 경우 프로그램의 유지보수가 어려워질 수 있으나 남용하지 않는 것이 바람직.
		아래는 전역변수 특성 정리.

		(1) 프로그램 시작과 동시에 메모리 공간에 할당되어 종료할 때까지 존재
		(2) 프로그램의 모든 영역에서 접근 가능
		(3) 전역변수와 동일한 이름의 지역변수가 선언된 경우 해당 지역 내에서는 
		    전역변수 대신 지역변수 사용.


	3) static 변수
		static은 전역, 지역변수 모두에 선언할 수 있는데, 
		지역변수가 가진 특성 일부를 보완해주는 역할.

		static을 사용하지 않을 때: 선언된 지역 내에서 생성과 소멸을 반복
		static을 사용할 때		 : 선언된 지역 내에서 생성 후 소멸되지 않음

		지역 변수는 해당 지역 내에서만 유효한 변수로 
		함수가 호출될 때마다 공간을 할당받았다가 함수의 실행문이 종료되면 소멸.
		그러나 static 키워드와 함께 선언된 static 지역 변수는 최초로 메모리를 할당받은 후
		프로그램이 종료할 때까지 소멸되지 않고 유지.

		static 선언 변수는 0으로 초기화
		static 변수는 외부참조 불가(정보은닉)
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//1. 지역변수
int localFunc(int num)
{
	printf("%p\n", &num);
	int result = 0;
	return result + num;
}

//2. 전역변수
/*
int number = 0;
void printNumber()
{
	printf("전역변수 number는 %d를 저장하고 있음.\n", number);
}
*/
//3. static 변수
void increaseNumber()
{
	static int number2 = 0;
	number2++;
	printf("number : %d\n", number2);
}
void main_15_3()
{
//1
	int num = 5;
	printf("%p\n", &num);
	int result = localFunc(num);
	printf("결과 : %d\n", result);

//2
	int number = 3;
	printf("지역변수 number는 %d를 저장하고 있음\n", number);
	//printNumber();

//3
	increaseNumber();
	increaseNumber();
	increaseNumber();
	increaseNumber();
	increaseNumber();

	static n;
	printf("%d", n);
	//printf("%d", number2);
}