/*
	2. Call-by-value, Call-by-reference
	1) Call-by-value
		함수 정의 시 매개변수를 기본 형태의 변수로 지정하면 함수 호출 시 단순히 값만 전달.
		이를 'Call-by-value'라고 함.
		이 방식은 값을 복사하여 전달하므로 해당 값은 함수의
		지역 내에서만 사용되고 이후에는 자연스럽게 소멸.

	2) Call-by-reference
		함수 호출 시 실제 값(주소)를 전달.
		이를 'Call-by-reference'라고 함.

*/
#include <stdio.h>

void swapNumberValue(int num1, int num2)
{
	int temp = num1;
	num1 = num2;
	num2 = temp;
	printf("함수 안에서 확인한 결과, num1 : %d, num2 : %d\n", num1, num2);
}

void swapNumberReference(int* ptr1, int* ptr2)
{
	int temp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = temp;
	printf("함수 안에서 확인한 결과, num1 : %d, num2 : %d\n", *ptr1, *ptr2);
}
void main_16_2()
{
	int number1 = 33, number2 = 99;
	swapNumberValue(number1, number2);
	printf("함수 호출 후 결과,       num1 : %d, num2 : %d\n", number1, number2);
	swapNumberReference(&number1, &number2);
	printf("함수 호출 후 결과,       num1 : %d, num2 : %d\n", number1, number2);
}