/*
	3. �Լ� ������
	1) �Լ� ������
		�Լ����� �޸� �ּҰ� ����.
		������ ���������� �Լ��� �޸� ������ ����Ǿ� �ִٰ� �ʿ��� ������ ȣ���Ͽ� ����.
		C ���� �Լ��� �ּҸ� ������ �� �ִ� ������ ������ �����ϸ� �̸� '�Լ� ������'��� �θ�.

		ex)
		int myFunc(int num) {}	// ��ȯ���� int�̰� �Ű������� �� ����
		int�� ������ ����� myFunc �Լ�.

		myFunc�� �Լ��� �̸�. �Լ��� ����� ����ϱ� ���� �Լ��� ȣ���Ϸ��� �Լ��� �̸��� ���.
		��, �Լ��� �̸��� �޸� ������ ����Ǿ� �ִ� �Լ� ���๮�� ���� �ּڰ� �ǹ�.
		�Լ��� �̸��� �Լ��� ����� �޸� ������ �ּڰ�.
		���� �Լ��� �ּҸ� �Լ� �����ͷ� �����ϱ� ���ؼ��� �̸��� �����ؾ� �ϴµ�,
		�Լ� �����ʹ� �̸��� �����ϴ� �͸����δ� ������� ����.
		�Լ��� �����ϱ� ���ؼ��� �Լ��� ���𹮿� ���Ե� ��ȯ���� �Ű������� �Բ� �����Ǿ�� ��.

		ex)
		int (*fptr)(int, int);
		fptr = myFunc;

		fptr�� ���� ������ ������ ����������,
		myFunc�� ��(�ּڰ�)�� ������ �� ���� ��� ������ �Լ� ������.


	2) void�� ������
		������ ������ ������ �� �ڷ����� �����ϱ⵵ ������ �׷��� ���� ���� ����.
		�ڷ����� �������� �ʴ� ������ ������ ������ 'void�� ������'��� ��.

		ex)
		void* ptr;

		void�� �����ʹ� ���� ������ ������ ���������� �ּڰ��� �����ϴ� ������ ��.
		void�� �����Ϳ��� ��� ������ �ּڰ��̵� ������ �� �ְ�, �Լ��� �ּڰ��� ���� �� ����.
		void�� �����ʹ� ���� ���� ������ ������ ���� �ʾ� ������ ������ �Ұ����ϴٴ� Ư¡�� �־�
		�ܼ��� �ּҰ��� ������ �� �ִٴ� �ǹ̸� ����.
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//1. �Լ� ������
int myFunc(int num1, int num2)
{
	printf("num1 : %d, num2 : %d\n", num1, num2);
}

//���� 3 �Լ�
int FirstFunc(int a, int b) {};
double SecondFunc(double d) {};
void ThirdFunc(char* c) {};

//���� 4 �Լ�
int fibonacci(int n);

void main_17_3()
{
	int (*fptr)(int, int);
	fptr = myFunc;
	fptr(9, 6);

	/*���� 1
	value = 3.8
	double *ptr = &value (200)
	double **dptr = &ptr (180)

	value(200)	ptr(180)	dptr(160)
	3.8			200			180

	**dptr	3.8
	&dptr	160
	*&ptr	200
	*dptr	200
	&*dptr	180
	&ptr	180
	*/

	/*���� 2
	33 = a <- pa <- ppa
	66 = b <- pb <- ppb
	ptr = pb
	pb = pa
	pa = ptr

	33 66 66 33
	*/
	int a = 33, b = 66;
	int* pa = &a;
	int* pb = &b;
	int** ppa = &pa;
	int** ppb = &pb;
	int* ptr;

	ptr = *ppb;
	*ppb = *ppa;
	*ppa = ptr;

	printf("%d %d %d %d\n", a, b, *pa, *pb);

	//���� 3
	int (*first)(int, int);
	double(*second)(double);
	void (*third)(char*);

	first = FirstFunc;
	second = SecondFunc;
	third = ThirdFunc;

	//���� 4
	int n;
	printf("n �Է� : ");
	scanf("%d", &n);
	printf("�Ǻ���ġ ������ %d ��°�� �� : %d\n", n, fibonacci(n));
}

int fibonacci(int n)
{
	if (n > 2) return fibonacci(n - 1) + fibonacci(n - 2);
	else if (n || (n - 1)) return 1;
}