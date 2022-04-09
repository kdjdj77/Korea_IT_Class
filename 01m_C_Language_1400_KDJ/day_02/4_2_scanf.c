/*
	1. scanf 함수의 이해
	1) 기본 입력 함수 scanf
		scanf 함수는 데이터 입력에 사용되는 함수.
		scanf 함수를 호출하려면 다음 두 가지 정보가 함께 전달되어야 함.

		*입력할 데이터의 자료형에 대응하는 형식 문자
		*입력할 데이터가 저장될 메모리 공간(변수)

		기본적인 사용법
		int num;			- 변수(입력될 데이터가 저장될 메모리 공간)
		scanf("%d", &num)	- 키보드로 입력된 정수를 변수 num에 저장

		여기서 &(ampersand)는 주소를 의미
		자세한 내용은 포인터에서 진행


	2) scanf 함수를 통한 입력 형태의 다양화
		입력 데이터의 개수를 여러 개 지정 가능
		각 입력 데이터의 형식 문자를 다르게 지정 가능.

		scanf("%d %d %d", &num1, &num2, &num3); // 동일 타입
		scanf("%f %d %f", &num1, &num2, &num3); // 다른 타입


	3) scanf 함수의 형 변환 (X)
		scanf 함수는 사용자가 데이터 입력 시 입력 데이터를 형식 문자에 맞게 형 변환.
		입력 데이터와 형식 문자의 자료형이 다를 경우 scanf 함수는 다음과 같이 처리.
		(1). 사용자 입력 전달
		(2). 형식 문자에 맞게 입력 데이터의 형 변환
		(3). 형 변환 완료 데이터를 변수에 저장

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main_4_2() 
{
	printf("\n-------main_4_2--------\n");
	//1. 기본 입출력
	/*
	char ch_01;
	int num_01;
	float num_02;

	scanf("%c", &ch_01);
	scanf("%d", &num_01);
	scanf("%f", &num_02);
	printf("%c %d %f\n", ch_01, num_01, num_02);


	//2. 입력 형태의 다양화
	int num_03, num_04, num_05;
	float num_06, num_07;
	
	printf("세 개의 정수 입력 : ");
	scanf("%d %d %d", &num_03, &num_04, &num_05);
	printf("입력된 정수들 : %d %d %d\n", num_03, num_04, num_05);

	printf("세 개의 정수 입력(콤마로 구분) : ");
	scanf("%d, %d, %d", &num_03, &num_04, &num_05);
	printf("입력된 정수들 : %d %d %d\n", num_03, num_04, num_05);

	printf("실수, 정수, 실수 차례대로 입력 : ");
	scanf("%f %d %f", &num_06, &num_03, &num_07);
	printf("입력된 정수들 : %0.2lf %d %0.2lf\n", num_06, num_03, num_07);


	//3. scanf 함수의 형 변환
	int num_08, num_09, num_10;
	//순서대로 8진수 16진수 10진수
	scanf("%o %x %d", &num_08, &num_09, &num_10);
	printf("입력된 정수들 : %d %d %d\n", num_08, num_09, num_10);
	*/

	printf("%4c\n", '*');
	printf("%5s\n", "***");
	printf("%6s\n", "*****");
	printf("%7s\n", "*******");
}