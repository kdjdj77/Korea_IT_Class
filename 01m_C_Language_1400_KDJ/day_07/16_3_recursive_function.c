/*
	3. ���ȣ�� �Լ�
	1) ���ȣ�� �Լ�
		���ȣ�� �Լ��� �Լ��� ��ü ������ �ڱ� �ڽ��� ȣ���ϴ� ���� �ǹ�.
		
		ex)
		void sayHello() {
			printf("hello\n");
			sayHello();
		}/*
	3. ���ȣ�� �Լ�
	1) ���ȣ�� �Լ�
		���ȣ�� �Լ��� �Լ��� ��ü ������ �ڱ� �ڽ��� ȣ���ϴ� ���� �ǹ�.
		
		ex)
		void sayHello() {
			printf("hello\n");
			sayHello();
		}

		int main(){
			sayHello();
		}

		���ȣ�� �Լ� ��� �� ���ȣ�� ���� ������ �ݵ�� �ʿ�.
		�׷��� ������ ���ѹݺ� ������ �߻�. �� �� ctrl + c�� ���� ����.
		��� ���� �ð��� ������ �ڵ����� ����Ǵ� ��쵵 �ִµ�,
		�̴� �޸� ������ ���̻� ����� �� ���� �ý��������� ���� ���� �Ǵ� ���.
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//count�� ���� ������ ���� �Ű�����
void sayHello(int count)
{
	printf("hello\n");

	//count�� 3�� �Ǹ� �� �̻� ȣ�� �� ��
	if (count != 3)
		sayHello(count + 1);
}

//���� 1 �Լ�
int getDiffByValue(int num1, int num2)
{
	return (num1 >= num2) ? (num1 - num2) : (num2 - num1);
}

void callDiffByRef(int* ptr1, int* ptr2)
{
	if (*ptr1 < *ptr2)
	{
		int temp;
		temp = *ptr2;
		*ptr2 = *ptr1;
		*ptr1 = temp;
	}
}

//���� 2 �Լ�
int recursiveSum(int n)
{
	if (n >= 2) return n + recursiveSum(n - 1);
	else return 1;
}

void main_16_3()
{
	sayHello(1);

	//���� 1
	int number1 = 10, number2 = 20;
	printf("getDiffByValue ȣ�� ��� : %d\n", getDiffByValue(number1, number2));
	callDiffByRef(&number1, &number2);
	printf("getDiffByRef ȣ�� ��� : %d, %d\n", number1, number2);

	//���� 2
	int n;
	printf("n �Է� : ");
	n = 5; //scanf("%d", &n);
	int result = recursiveSum(n);
	printf("%d\n", result);
}

		int main(){
			sayHello();
		}

		���ȣ�� �Լ� ��� �� ���ȣ�� ���� ������ �ݵ�� �ʿ�.
		�׷��� ������ ���ѹݺ� ������ �߻�. �� �� ctrl + c�� ���� ����.
		��� ���� �ð��� ������ �ڵ����� ����Ǵ� ��쵵 �ִµ�,
		�̴� �޸� ������ ���̻� ����� �� ���� �ý��������� ���� ���� �Ǵ� ���.
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//count�� ���� ������ ���� �Ű�����
void sayHello(int count)
{
	printf("hello\n");
	
	//count�� 3�� �Ǹ� �� �̻� ȣ�� �� ��
	if (count != 3) 
		sayHello(count + 1);
}

//���� 1 �Լ�
int getDiffByValue(int num1, int num2)
{
	return (num1 >= num2) ? (num1 - num2) : (num2 - num1);
}

void callDiffByRef(int* ptr1, int* ptr2)
{
	if (*ptr1 < *ptr2)
	{
		int temp;
		temp = *ptr2;
		*ptr2 = *ptr1;
		*ptr1 = temp;
	}
}

//���� 2 �Լ�
int recursiveSum(int n)
{
	if (n >= 2) return n + recursiveSum(n - 1);
	else return 1;
}

void main_16_3()
{
	sayHello(1);

	//���� 1
	int number1 = 10, number2 = 20;
	printf("getDiffByValue ȣ�� ��� : %d\n", getDiffByValue(number1, number2));
	callDiffByRef(&number1, &number2);
	printf("getDiffByRef ȣ�� ��� : %d, %d\n", number1, number2);

	//���� 2
	int n;
	printf("n �Է� : ");
	n = 5; //scanf("%d", &n);
	int result = recursiveSum(n);
	printf("%d\n", result);
}