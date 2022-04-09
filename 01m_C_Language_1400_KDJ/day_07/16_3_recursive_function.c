/*
	3. 재귀호출 함수
	1) 재귀호출 함수
		재귀호출 함수란 함수가 몸체 내에서 자기 자신을 호출하는 것을 의미.
		
		ex)
		void sayHello() {
			printf("hello\n");
			sayHello();
		}/*
	3. 재귀호출 함수
	1) 재귀호출 함수
		재귀호출 함수란 함수가 몸체 내에서 자기 자신을 호출하는 것을 의미.
		
		ex)
		void sayHello() {
			printf("hello\n");
			sayHello();
		}

		int main(){
			sayHello();
		}

		재귀호출 함수 사용 시 재귀호출 종료 조건이 반드시 필요.
		그렇지 않으면 무한반복 현상이 발생. 이 때 ctrl + c를 통해 종료.
		어느 정도 시간이 지나면 자동으로 종료되는 경우도 있는데,
		이는 메모리 공간을 더이상 사용할 수 없어 시스템적으로 강제 종료 되는 경우.
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//count는 종료 조건을 위한 매개변수
void sayHello(int count)
{
	printf("hello\n");

	//count가 3이 되면 더 이상 호출 안 함
	if (count != 3)
		sayHello(count + 1);
}

//문제 1 함수
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

//문제 2 함수
int recursiveSum(int n)
{
	if (n >= 2) return n + recursiveSum(n - 1);
	else return 1;
}

void main_16_3()
{
	sayHello(1);

	//문제 1
	int number1 = 10, number2 = 20;
	printf("getDiffByValue 호출 결과 : %d\n", getDiffByValue(number1, number2));
	callDiffByRef(&number1, &number2);
	printf("getDiffByRef 호출 결과 : %d, %d\n", number1, number2);

	//문제 2
	int n;
	printf("n 입력 : ");
	n = 5; //scanf("%d", &n);
	int result = recursiveSum(n);
	printf("%d\n", result);
}

		int main(){
			sayHello();
		}

		재귀호출 함수 사용 시 재귀호출 종료 조건이 반드시 필요.
		그렇지 않으면 무한반복 현상이 발생. 이 때 ctrl + c를 통해 종료.
		어느 정도 시간이 지나면 자동으로 종료되는 경우도 있는데,
		이는 메모리 공간을 더이상 사용할 수 없어 시스템적으로 강제 종료 되는 경우.
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//count는 종료 조건을 위한 매개변수
void sayHello(int count)
{
	printf("hello\n");
	
	//count가 3이 되면 더 이상 호출 안 함
	if (count != 3) 
		sayHello(count + 1);
}

//문제 1 함수
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

//문제 2 함수
int recursiveSum(int n)
{
	if (n >= 2) return n + recursiveSum(n - 1);
	else return 1;
}

void main_16_3()
{
	sayHello(1);

	//문제 1
	int number1 = 10, number2 = 20;
	printf("getDiffByValue 호출 결과 : %d\n", getDiffByValue(number1, number2));
	callDiffByRef(&number1, &number2);
	printf("getDiffByRef 호출 결과 : %d, %d\n", number1, number2);

	//문제 2
	int n;
	printf("n 입력 : ");
	n = 5; //scanf("%d", &n);
	int result = recursiveSum(n);
	printf("%d\n", result);
}