/*
	2. 포인터를 이용한 배열의 연산
	1) 배열의 이름과 * 연산자
		배열의 이름은 포인터이므로 배열의 이름을 피연산자로 하여 * 연산자를 사용할 수 있음.
		이 경우 * 연산자는 포인터가 가리키고 있는 메모리 공간에 접근한다는 의미.
				
		따라서 다음 두 코드는 같은 값을 반환
		ex)
		printf("%d\n", myArr[0]);
		printf("%d\n", *myArr);

		인덱스 번호를 통한 접근의 경우 대괄호 안에 작성한 인덱스 번호를 증가시키면 
		순차적으로 배열의 요소에 접근할 수 있음.
		포인터 연산을 통해 배열의 요소에 순차적으로 접근하려면 포인터 변수의 값을 
		1씩 증가시켜 '포인터형'의 크기 만큼 주솟값을 증가시켜야 함.

		ex)
		int num = 3;
		int* ptr = &num;
		ptr++;		// int(4바이트)만큼 주솟값 증가
		ptr += 1;	// int만큼(4바이트) 주솟값 증가

		위에서는 int형 포인터 변수를 사용해 4바이트씩 증가하지만,
		포인터형이 char일 경우 1바이트, short형일 경우 2바이트 만큼 증가.
		즉, 포인터형의 크기 만큼 증가.

		배열의 할당 영역을 벗어나는 포인터 연산을 사용하면?
		포인터 연산은 메모리 주소값에 대한 연산이고, 
		주솟값 역시 하나의 값에 불과하므로 영역을 벗어나는 연산을 처리해도 문법적으로 에러 유발 안 함.

*/
#include <stdio.h>

void main_11_2()
{
	//배열 이름과 *연산자
	short s_arr[3] = { 1, 2 ,3 };
	int i_arr[3] = { 10, 20, 30 };

	//인덱스 번호를 통한 접근
	for (int i = 0; i < 3; i++) printf("%d ", s_arr[i]);
	printf("\n");
	for (int i = 0; i < 3; i++) printf("%d ", i_arr[i]);
	printf("\n");
	//포인터 연산을 통한 접근
	for (int i = 0; i < 3; i++) printf("%d ", *(s_arr + i));
	printf("\n");
	for (int i = 0; i < 3; i++) printf("%d ", *(i_arr + i));
	printf("\n");
	//주소 확인
	for (int i = 0; i < 3; i++) printf("%p ", &s_arr[i]);
	printf("\n");
	for (int i = 0; i < 3; i++) printf("%p ", &i_arr[i]);
	printf("\n");
}