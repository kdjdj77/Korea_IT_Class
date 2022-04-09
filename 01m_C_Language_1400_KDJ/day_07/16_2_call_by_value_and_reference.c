/*
	2. Call-by-value, Call-by-reference
	1) Call-by-value
		�Լ� ���� �� �Ű������� �⺻ ������ ������ �����ϸ� �Լ� ȣ�� �� �ܼ��� ���� ����.
		�̸� 'Call-by-value'��� ��.
		�� ����� ���� �����Ͽ� �����ϹǷ� �ش� ���� �Լ���
		���� �������� ���ǰ� ���Ŀ��� �ڿ������� �Ҹ�.

	2) Call-by-reference
		�Լ� ȣ�� �� ���� ��(�ּ�)�� ����.
		�̸� 'Call-by-reference'��� ��.

*/
#include <stdio.h>

void swapNumberValue(int num1, int num2)
{
	int temp = num1;
	num1 = num2;
	num2 = temp;
	printf("�Լ� �ȿ��� Ȯ���� ���, num1 : %d, num2 : %d\n", num1, num2);
}

void swapNumberReference(int* ptr1, int* ptr2)
{
	int temp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = temp;
	printf("�Լ� �ȿ��� Ȯ���� ���, num1 : %d, num2 : %d\n", *ptr1, *ptr2);
}
void main_16_2()
{
	int number1 = 33, number2 = 99;
	swapNumberValue(number1, number2);
	printf("�Լ� ȣ�� �� ���,       num1 : %d, num2 : %d\n", number1, number2);
	swapNumberReference(&number1, &number2);
	printf("�Լ� ȣ�� �� ���,       num1 : %d, num2 : %d\n", number1, number2);
}