/*
	1. 포인터의 포인터
	1) 싱글포인터와 더블 포인터
		포인터 변수는 메모리의 주솟값을 저장하는 변수.
		포인터 변수 또한 하나의 변수이므로 필요한 메모리 공간을 할당받아 사용하고 있음.
		따라서 포인터 변수가 차지하고 있는 메모리 공간에 대한 주솟값을 저장하는 것이 가능.
		이를 저장하는 변수를 두고 포인터의 포인터를 저장한다고 하여 더블포인터라고 함.

		더블 포인터 선언
		int** dptr;

		더블 포인터 사용
		int num = 3;
		int* ptr = &num;	// 변수 num의 주솟값을 싱글 포인터 ptr에 저장
		int** dptr = &ptr;	// 싱글 포인터 변수 ptr의 주솟값을 더블 포인터 dptr에 저장.

		dptr을 대상으로 다음과 같은 방식으로 포인터 변수에 접근할 수 있음.
		*dptr	// dptr이 저장하고 있는 값, 즉 ptr의 주솟값
		**dptr	// dptr이 저장하고 있는 주솟값에 저장되어 있는 값.


	2) 더블 포인터와 Call-by-reference
		Call-by-reference는 함수를 호출 시
		인자로 포인터를 전달하여 함수가 주솟값에 직접 접근할 수 있도록 하는 방식.
		더블 포인터 변수는 포인터 변수의 주솟값을 저장하는 변수로
		포인터 연산자를 사용해 메모리에 직접적인 접근을 허용.
		따라서 더블 포인터를 Call-by-reference 방식에 사용하는 것도 충분히 가능.

*/
#include <stdio.h>

void main_17_1()
{
	int num = 3;
	int* ptr1 = &num;
	int** dptr = &ptr1;
	int* ptr2;

	printf("%p %p\n", ptr1, dptr);
	printf("%d %d\n", num, **dptr);
	ptr2 = *dptr;
	*ptr2 = 9;
	printf("%d %d\n", num, **dptr);
}