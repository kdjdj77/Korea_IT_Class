/*
	2. 포인터 연산하기
	1) 포인터 연산자
		포인터에서 주솟값이나 실제 저장되어 있는 
		값을 나타내기 위해 *와 & 연산자를 사용한다.
		포인터 연산자로 다음 두 가지를 사용.

		&: 변수의 주솟값을 반환하는 연산자.
		   &는 피연산자로 주소가 있는 변수가 주어져야 함.
		   리터럴 상수는 피연산자가 될 수 없음.
		   변수의 타입이 맞지 않을 때 문제가 될 수 있음.

		   ex)
		   int num = 5;
		   double* ptr1 = &num; // 타입 불일치
		   int* ptr2 = &5;		// 리터럴 상수

		*: 포인터가 가리키는 메모리를 참조하는 * 연산자
		   포인터 변수를 피연산자로 하며,
		   포인터 변수에 저장된 주솟값에 해당하는 메모리 공간에 접근하여 
		   그 곳에 저장되어 있는 값을 반환.

		   ex)
		   int num = 5;
		   int* ptr = &num;

		   위 코드에서 ptr은 포인터 변수이고 num의 주솟값을 저장.
		   여기에 *연산자를 사용하면 해당 메모리 주소(num)에 저장되어 있는 값을 반환.
		   따라서 *ptr은 사실상 num 의미.

		   ex)
		   int num = 5;
		   int* ptr = &num;
		   *ptr = 10;
		   printf("%d\n", *ptr); // 10


	2) 포인터를 사용하는 이유
		포인터를 사용하려면 별도의 포인터 변수를 선언해야 하고 
		포인터 연산자를 사용한 주소 연산, 참조 연산 등을 수행해야 함.
		따라서 포인터 사용은 번거로운 작업으로 꼭 필요한 경우가 아니라면 
		굳이 포인터 변수를 사용하지 않는 것이 더 좋음.

		그러나 다음의 경우에는 포인터 변수를 반드시 사용.
		(1) 임베디드 프로그래밍에서 메모리 제어
		(2) 동적 할당 선언 및 동적 할당 메모리에 대한 접근 시도.
		
*/
#include <stdio.h>

void main_10_2() 
{
	//포인터 연산자
	int num = 10;
	int* p_num = &num;

	*p_num = 20;
	printf("num : %d\n", num);
	(*p_num)++; (*p_num)++;
	printf("num : %d\n", num);
	printf("*p_num : %d\n", *p_num);

	//문제 1
/*
	int a = 10;
	int* p = &a;

	*p = 20;
	printf("%d", a);	//20
	*p = 50;
	printf("%d", a);	//50
*/
	//문제 2
/*
	int number = 10;
	int* p_number = &number;

	printf("%d %d\n", number, *p_number);
	printf("%p", p_number);
*/

	//문제 3
/*
	int* ptr;
	int num1 = 5;
	int num2 = 8;

	ptr = &num1; num1 = 10;
	printf("%d\n", *ptr);

	ptr = &num2; num2 = 15;
	printf("%d\n", *ptr);
*/
	//문제 4
/*
	//2 4 2 2 4 2
	//2 4 2 4 4 2
	//2 2 2 2 2 2

	int i = 2, j = 4, k = 8;
	int* p = &i, * q = &j, * r = &k;

	k = i;
	printf("%d %d %d %d %d %d\n", i, j, k, *p, *q, *r);
	p = q;
	printf("%d %d %d %d %d %d\n", i, j, k, *p, *q, *r);
	*q = *r;
	printf("%d %d %d %d %d %d\n", i, j, k, *p, *q, *r);
*/
}