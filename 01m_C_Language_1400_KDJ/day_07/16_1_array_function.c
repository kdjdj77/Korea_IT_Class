/*
	1. 배열을 전달받는 함수
	1) 함수 호출 시 인자 전달 방식
		정수형 데이터 하나를 전달받은 후 함수 예

		int number = 10;
		numberFunc(number); // 1을 증가시키는 함수
		printf("%d", number);

		함수가 호출되어 전달받은 인자의 값을 증가시킨 후에도
		변수 number의 값은 변하지 않고 유지.
		이러한 결과가 나타나는 이유는 함수 호출 시 인자로 변수를 전달한다는 것은,
		변수가 가진 값을 '복사'하여 전달(call by value)하기 때문.
		따라서 함수가 전달받은 값을 가지고 기능을 수행한다고 해도
		그 값을 복사해 준 실제 변수는 아무런 영향이 없음.


	2) 함수 호출 시 배열의 전달
		배열을 함수의 인자로 전달할 때는 배열의 이름은 포인터 변수이고,
		배열의 이름이 저장하고 있는 데이터는 포인터(주솟값)임을 인지해야 함.

		ex)
		int numberFunc(int* arr) {}
		int main() {
			int number[3] = {1, 2, 3};
			numberFunc(number);	// number는 포인터 변수
		}

		매개변수 arr에 배열의 이름인 number 전달.
		즉 int형 변수에 포인터(주솟값)를 전달하고 있는데
		대입까지는 문제가 없을 수 있어도 이후 연산 진행 시
		자료형 불일치로 연산에서 문제 발생 가능.

		따라서 배열을 전달받아 연산을 진행하는 함수를 만들기 위해서는
		다른 방식으로 매개변수 선언.
		배열의 이름을 전달하는 것은 포인터를 전달하는 것으로
		매개변수를 포인터 변수로 만들면 됨.

		포인터 변수를 매개변수로 사용 시 유의할 점은
		값이 아닌 주솟값을 전달받으므로 함수 내에서 값의 변경을 진행할 경우
		값을 전달해 준 배열의 값도 함께 변경된다는 것.
		이를 call by reference라고 함.

		매개변수를 포인터 변수로 선언하는 것과 대괄호([])를 사용해
		배열을 매개변수로 전달받는 것은 완전히 동일한 매개변수 선언.

*/
#include <stdio.h>

void readArray(int* arr)
{
	//int length = sizeof(*arr) / sizeof(int);

	//ex_01 : 배열의 끝을 알려주는 숫자(-1) 삽입 or 배열 초기화에서 모든 원소를 -1로 초기화
	int length = 0;
	while (arr[length] != -1) length++;

	//ex_02 : 배열 원소의 크기를 대략적으로 알 경우
	length = 0;
	while (arr[length] < 9999 && arr[length] > 0) length++;


	printf("배열의 요소 읽기 : [ ");
	for (int i = 0; i < length; i++)
	{
		printf("%d", arr[i]);
		if ((i + 1) < length) printf(", ");
		else printf("");
	}
	printf(" ]\n");
}

void multiArray(int* arr)
{
	arr[0] = 30;
}

void main_16_1()
{
	int arr[4] = { 3, 6, 9, -1 };
	readArray(arr);
	multiArray(arr);
	readArray(arr);
}