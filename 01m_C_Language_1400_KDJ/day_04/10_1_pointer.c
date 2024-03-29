/*
	1. 포인터의 이해
	1) 포인터의 개념
		C언어에서 포인터란 메모리의 주솟값을 의미하며 
		주솟값을 저장하는 변수를 가리켜 '포인터 변수'라고 함.
		변수를 선언 및 초기화하면 실제 메모리에 변수의 자료형에 해당하는 만큼 공간이 할당됨.
		포인터를 이용하면 메모리 공간에 직접 접근하는 것이 가능.
		'직접 접근'이란 메모리 공간에 저장된 변수를 이용해 
		연산을 진행하거나 출력하는 것을 넘어 메모리 공간을 직접 제어하는 것을 의미.


	2) 포인터 변수의 선언 및 초기화
		포인터 변수란 메모리의 주솟값을 저장하기 위한 변수로, 
		값을 저장하는 일반적인 변수의 선언 방법과는 차이가 있음.


		포인터 변수 선언 방법
		int* ptr; // int형 데이터가 저장된 메모리 공간의 포인터
					 즉, 메모리 주소를 지정할 수 있는 포인터 변수 ptr을 선언.

		변수와 포인터 변수 선언의 차이는 변수 이름 앞에 *를 붙인다는 것.
		선언 이후 포인터 변수에는 메모리 주소를 저장할 수 있으며,
		이를 위해서는 할당된 메모리 주소가 존재해야 함.

		포인터 변수의 선언 및 초기화 과정
		int num = 30;
		int* ptr;
		ptr = &num;

		위 코드에서 num은 정수형 데이터를 저장하는 변수,
		ptr은 int형 데이터 주소를 저장할 수 있는 포인터 변수.
		포인터 변수 선언 후 세 번째와 같이 num의 주소로 초기화 가능.
		이 때 & 연산자가 사용되는 것인데, 
		'&는 오른쪽에 등장하는 피연산자의 주솟값 반환한다'의 의미.
		결과적으로 포인터 변수 ptr에는 num의 주솟값이 저장.
		
*/
#include <stdio.h>

void main_10_1() 
{
	//포인터 선언
	char c_num = 65;
	int i_num = 999;
	double d_num = 3.14;

	char* c_ptr = &c_num;
	int* i_ptr = &i_num;
	double* d_ptr = &d_num;

	printf("%c, %p\n", c_num, c_ptr);
	printf("%d, %p\n", i_num, i_ptr);
	printf("%f, %p\n", d_num, d_ptr);
}