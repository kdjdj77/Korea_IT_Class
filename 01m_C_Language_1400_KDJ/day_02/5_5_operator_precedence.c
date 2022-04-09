/*

	5. 연산자 우선순위
	1) 연산자 결합 방향
	이항 연산자는 두 개의 피연산자로 연산을 진행하고 하나의 결괏값을 반환

	ex) 
	int num = 3, num2 = 5;
	int result = 0;

	result = num1 + num2;
	-> 1. num1 + num2
	-> 2. result = 8

	이를 바탕으로 C언어에서는 세 개 이상의 피연산자를 두 개 이상의 연산자를 이용해서 연산.
	ex) 
	1 + 2 + 3 + 4
	-> 3 + 3 + 4
	-> 6 + 4
	-> 10

	여러 개의 더하기 연산자가 한 문장에 등장하는 경우 왼쪽부터 순서대로 연산 진행


	이러한 연산이 가능한 이유는 C언어의 연산자마다 결합 방향이 정해져 있기 때문.
	산술 연산자의 결합 방향은 왼쪽에서 오른쪽으로 정해져 있음.
	따라서, 등장하는 연산자를 왼쪽에서부터 순서대로 처리.


	2) 연산자 우선순위
	C언어에는 다양한 연산자가 존재하고, 각각 우선순위, 결합 방향이 정의되어 있음.

	아래는 연산자 우선순위를 정리한 표.
	우선순위		연산자					의미						결합 방향
	1			++, -- (prefix)			1씩 증가 또는 감소		왼쪽에서 오른쪽
	2			+, -					부호 연산자				왼쪽에서 오른쪽
	3			*, /, %					곱셈, 나눗셈, 나머지	왼쪽에서 오른쪽
	4			+, -					덧셈, 뺄셈				왼쪽에서 오른쪽
	5			<, >, <=, >=			대소 비교				왼쪽에서 오른쪽
	6			==, !=					등가 비교				왼쪽에서 오른쪽
	7			=, +=, -=, *=, /=, %=	대입 연산				오른쪽에서 왼쪽

	*/
#include <stdio.h>

void main_5_5() 
{
	printf("\n-------main_5_5--------\n");
	//연산자 우선순위
	int num_01 = 5, num_02 = 5, num_03 = 10;

	int result_01 = ++num_01 + num_03 * 3;
	int result_02 = num_02++ + num_03 * 3;

	printf("연산 결과 : %d\n", result_01);
	printf("연산 결과 : %d\n", result_02);
}