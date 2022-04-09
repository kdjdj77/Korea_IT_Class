#include<stdio.h>
int main_Stack_ex(void)
{
	char stack[5];	//초기화
	int top = 0;	//초기화

	stack[top] = 'A';
	printf("%c 스택에 처음으로 데이터 삽입\n", stack[top]);
	top++;

	stack[top] = 'B';
	printf("%c 스택에 두 번째로 데이터 삽입\n", stack[top]);
	top++;

	stack[top] = 'C';
	printf("%c 스택에 세 번째로 데이터 삽입\n", stack[top]);
	top++;
	printf("\n");

	top--;
	printf("%c 스택에 데이터 나감\n", stack[top]);
	stack[top] = ' ';

	top--;
	printf("%c 스택에 데이터 나감\n", stack[top]);
	stack[top] = ' ';

	top--;
	printf("%c 스택에 데이터 나감\n", stack[top]);
	stack[top] = ' ';

	return 0;
}