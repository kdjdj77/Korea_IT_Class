/*
	1. 구조체와 포인터
	1) 구조체 변수와 포인터
		구조체 배열과 일반적인 배열의 선언 및 접근 방법은 동일.
		다만 그 멤버 요소가 구조체 변수나 아니냐의 차이만 존재.
		구조체 포인터 변수의 선언 및 접근 방법 또한 일반적인 포인터 변수와 동일.
		다만 해당 주소에 저장된 데이터가 구조체냐 아니냐의 차이만 존재.

		int형 포인터 변수
		int num;
		int* ptr = &num;


		Person 구조체 포인터 변수
		typedef struct {
			char name[30];
			int age;
		} Person;

		Person boy;
		Person* ptr = &boy

		Person이라고 선언된 구조체 변수 boy를 선언하고,
		boy의 주솟값을 저장하는 포인터 변수 ptr을 선언.
		포인터 변수의 선언이 일반 자료형과 차이가 없는 것을 확인할 수 있음.
		그러나 접근할 땐는 구조체임을 고려하여 접근.
		구조체 포인터 변수를 통한 접근은 다음과 같음.

		Person 구조체 포인터 변수에 대한 접근 1
		(*ptr).age = 10;

		Person 구조체 포인터 변수에 대한 접근 2
		ptr -> age = 10;

		-> 연산자(화살표 연산자_를 사용한 접근 방식은 앞서 .연산자의 경우와 동일.
		

	2) 구조체의 멤버 변수로 선언된 포인터 변수
		포인터 변수도 구조체의 멤버 변수로 선언 가능.
		그리고 구조체 멤버일 때와 그렇지 않을 때 포인터 변수를 사용하는
		방법에는 문법적인 차이가 없음.

*/
#include <stdio.h>

typedef struct
{
	char name[30];
	int age;
}P;

//2. 구조체 멤버 변수로 선언된 포인터 변수
typedef struct
{
	int x;
	int y;
}Point2;

typedef struct
{
	Point2* start;
	Point2* end;
}Line;

void main_20_1()
{
	P boy = { "호날두", 35 };
	P* ptr = &boy;

	printf("%s (%d)\n", (*ptr).name, (*ptr).age);
	printf("%s (%d)\n", ptr->name, ptr->age);

	Point2 p1 = { 10, 8 };
	Point2 p2 = { 20, 40 };

	Line line = { &p1, &p2 };

	printf("선의 시작점 : [%d, %d]\n", line.start->x, line.start->y);
	printf("선의   끝점 : [%d, %d]\n", line.end->x, line.end->y);
}