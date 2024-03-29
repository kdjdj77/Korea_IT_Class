/*
	2. C 언어의 기본 자료형
		1) 자료형
			프로그래밍 언어에서 자료형이란 데이터를 표현하는 방법 의미.
			변수 선언 시 해당 변수가 차지할 메모리 공간의 크기와,
			변수에 저장할 데이터 형태에 대한 정의 필요한데 이를 표현하는 방법이 자료형.
			프로그래밍 언어에서 자료형이란 데이터의 크기와 형태를 표현하는 역할.

			변수 선언 예
			int number = 3;	// 자료형이 int인 변수 선언


		2) C 언어 기본 자료형 종류
			(1) 기본 자료형
			C 언어가 기본으로 제공하는 자료형을 '기본 자료형'이라고 함.
			기본 자료형으로 표현할 수 있는 값의 형태로는 문자, 정수, 실수가 있음.

			문자: 음절 문자 및 기호를 포함한 문자
			정수: 양의 정수, 0, 음의 정수
			실수: 소수점 이하 값을 지닌 숫자.

			할당받는 메모리 공간이 클수록 표현 범위가 넓어짐


			(2) sizeof 연산자
			각 자료형의 크기는 바이트 단위로 정의.
			다양한 자료형 크기를 계산하여 정수로 반환하는 sizeof 연산자 제공

			sizeof 연산자 사용 예
			int num = 10;
			printf("%d\n", sizeof(num));


		3) 문자의 표현
			컴퓨터는 숫자를 이용해 변수를 인식하고 표현.
			마찬가지로 문자를 표현할 때도 숫자 이용.
			이때 사용하는 게 아스키 코드(ASCII Code).
			아스키 코드란 알파벳과 일부 특수 문자 각각에 대응하는 숫자를 지정해둔 것으로,
			문자를 표현하고자 하는 사용자와 C 언어 컴파일러 간의 약속

			문자형 데이터 표현 예
			char ch1 = 'A'

			프로그램에서 문자를 표현할 때는 작은따옴표('')로 묶어야 함.
			위 코드에서 변수 ch1은 선언 이후 문자 'A로 표현할 수도,
			정수 65로 표현할 수도 있음.

			정수와 문자 모두 출력 방식(형식 문자)에 따라 문자가 될 수 있고 숫자가 될 수 있음.

			형식 지정자 중 %c는 문자 형태로 값을 표현하는 형식 문자.
			1. 문자형 데이터를 전달받아 출력하는 기능
			2. 정수를 전달받아 해당되는 정수에 대응하는 아스키코드 문자를 출력하는 기능.

*/
#include <stdio.h>
void main_2_2()
{
	char ch_01 = 66, ch_02 = 'B';
	short sh_01 = 67;
	int in_01 = 68;

	printf(" main_2_2\n");

	printf("%c\n", ch_01);
	printf("%c\n", ch_02);
	printf("%c\n", sh_01);
	printf("%c\n", in_01);
	printf("%d\n", ch_02);

	printf("%d\n", sizeof(100));
	printf("%d\n", sizeof(char));
	printf("%d\n\n", sizeof(int));
}









