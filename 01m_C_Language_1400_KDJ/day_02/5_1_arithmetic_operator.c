/*
	산술 연산은 우리가 흔히 알고 있는 덧셈, 뺄셈 곱셈, 나눗셈 등 수학적 연산을 의미.
	산술 연산을 실행할 때 더하기, 빼기 등 의미를 지닌 기호를 사용해야 하는 데 
	이때 사용하는 +, -등의 기호를 통틀어 산술연산자라고 칭함.

	1. 산술 연산자
	아래는 이항연산자로 두 개의 피연산자를 요구하는 연산자.
	연산자	기능											사용 예
	+		두 값을 더함									5 + 3
	-		왼쪽 값에서 오른쪽 값을 뺌.					10 - 4
	*		두 값을 곱함.								6 * 8
	/		왼쪽 값을 오른쪽 값으로 나눔.					9 / 3
	%		왼쪽 값을 오른쪽 값으로 나누었을 때의 나머지	9 % 2


	산술 연산의 결괏값 또한 자료형을 가짐.
	이때 결괏값의 자료형은 두 피연산자의 자료형에 따라 결정.

	두 피연산자 자료형		결괏값 자료형
	int, int				int
	int, float				float
	int, char				int
	char, char				char
	char, float				float
	float, float			float


	2. 부호 연산자로 사용되는 산술 연산 기호
	피연산자가 하나일 때는 부호를 나타내는 '부호 연산자'역할을 수행하기도 함.
	+기호는 0이상의 값을 의미하는 부호 연산자로 생략 가능.

	ex) 
	int num = -10;		// 음의 정수 -10을 변수에 대입
	int num2 = +10		// 양의 정수 10을 변수에 대입, 여기서 +는 생략 가능
	int num3 = -num2	// num3에 -num2를 대입하는데 이는 num2에 -를 붙임으로써 num2가 저장하고 있는 값에 -1를 곱하여 num3에 대입

*/
#include <stdio.h>

void main_5_1() 
{
	printf("\n-------main_5_1--------\n");
	//산술연산자

	int num_01 = 10, num_02 = 3;
	char c = 'A';
	printf("%d + %d = %d\n", num_01, num_02, num_01 + num_02);
	printf("%d - %d = %d\n", num_01, num_02, num_01 - num_02);
	printf("%d * %d = %d\n", num_01, num_02, num_01 * num_02);
	printf("%d / %d = %d\n", num_01, num_02, num_01 / num_02);
	printf("%d / %d = %f\n", num_01, num_02, (double)num_01 / num_02);
	printf("%d %% %d = %d\n", num_01, num_02, num_01 % num_02);
	printf("-----------------------\n");

	//연산자에 따른 자료형
	printf("%d + %d  = %d\n", num_01, num_02, num_01 + num_02);
	printf("%d - %f  = %d\n", num_01, (float)num_02, num_01 - (float)num_02);
	printf("%d - %d  = %d\n", num_01, (char)num_02, num_01 - (char)num_02);
	printf("%d - %d  = %d\n", num_01, c, num_01 - c);
}