#include<stdio.h>
int main_Stack_ex(void)
{
	char stack[5];	//�ʱ�ȭ
	int top = 0;	//�ʱ�ȭ

	stack[top] = 'A';
	printf("%c ���ÿ� ó������ ������ ����\n", stack[top]);
	top++;

	stack[top] = 'B';
	printf("%c ���ÿ� �� ��°�� ������ ����\n", stack[top]);
	top++;

	stack[top] = 'C';
	printf("%c ���ÿ� �� ��°�� ������ ����\n", stack[top]);
	top++;
	printf("\n");

	top--;
	printf("%c ���ÿ� ������ ����\n", stack[top]);
	stack[top] = ' ';

	top--;
	printf("%c ���ÿ� ������ ����\n", stack[top]);
	stack[top] = ' ';

	top--;
	printf("%c ���ÿ� ������ ����\n", stack[top]);
	stack[top] = ' ';

	return 0;
}