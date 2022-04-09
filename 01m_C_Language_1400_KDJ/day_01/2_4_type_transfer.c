/*
	1. 자동형변환
		변수 초기화 시 대입 연산자(=) 왼쪽 변수와 오른쪽 데이터 자료형이 서로 일치하지 않으면
		왼쪽에 있는 변수를 기준으로 자동 형변환이 일어남.

		double number = 10; // 10.0으로 변환
		int number = 5.431; // 5로 변환


	2. 명시적 형 변환
		명시적 형 변환은 자동으로 형 변환이 일어나지 않을 때 강제로
		형 변환을 명령하는 것을 의미.


*/
#include <stdio.h>
void main_2_4()
{
	//1. 자동 형변환
	double num_01 = 10;
	int num_02 = 5.431;

	printf(" main_2_4\n");
	printf("%f\n", num_01);
	printf("%d\n", num_01);

	printf("%d\n", num_02);
	printf("%f\n", num_02);

	printf("-------------------------------\n");

	//2. 명시적 형변환
	printf("%d\n", (short)3.1415);
	printf("%d\n", (int)3.1415);
	printf("%f\n", 3.1415);
	printf("%f\n", (float)3.1415);

	printf("%d\n", 3.1415);
	printf("%f\n", (int)3.1415);
}