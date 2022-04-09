/*
	3. typedef 선언
	1) typedef 선언
		typedef 선언은 기존에 존재하는 자료형에 새 이름을 부여하는 것.
		기존 이름이 새로운 이름으로 변경된 것이 아니라 새 이름을 추가로 갖는 것.
		만약 int 자료형에 새로운 이름으로 INTEGER라는 이름을 붙이고 싶다면
		다음과 같이 선언 가능.
		
		사용 예
		typedef int INTEGER;
		
		위와 같이 선언 후 INTEGER는 코드 내에서 int와 동일한 역할 수행.
		그러나 이름이 변경된 것이 아니라 새 이름이 추가된 것으로
		여전히 int를 사용한 변수의 선언 가능.

		typedef 선언 위치가 정해져 있는 것은 아니나 일반적으로 프로그램 시작 위치에 정의하는 경우가 많음.


	2) 구조체와 typedef
		구조체 이름도 typedef 선언 대상이 될 수 있음.
		정의된 구조체에 typedef를 선언하고, 새롭게 붙여진 이름으로 변수 선언.

		사용 예
		struct point {
			int x;
			int y;
		}
		typedef struct point POINT;

		구조체는 typedef 선언 시에도 struct 선언을 포함.
		typedef로 struct point에 새 이름을 부여했으므로
		이제 구조체 변수를 선언할 때 struct 키워드 생략 가능.
		위와 같이 구조체에 typedef 선언을 마친 후에는 다음과 같이
		구조체 변수 선언 가능.
		
		선언 예		
		POINT position = {30, 60};

		
		구조체에 대한 typedef 선언을 다음과 같은 형태로도 가능.
		
		불필요한 구문을 생략한 typedef 선언 예
		typedef struct {
			int x;
			int y;
		} POINT;

		위 선언은 앞서 살펴본 구조체에 대한 typedef 선언과 동일.
		다만 여기서는 POINT라는 이름 외에는 구조체 변수를 선언할 방법이 없음.

		
		다만 일반적인 경우는 다음과 같이 쓰임
		일반적 예
		typedef struct _POINT {
			int x;
			int y;
		} POINT;
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

//1. typedef
typedef int INT;
typedef int* PINT;
typedef unsigned int UINT;

//2. 구조체와 typedef
typedef struct _POINT
{
	int x;
	int y;
}POINT;

struct person2
{
	char name[30];
	int age;
};
typedef struct person2 PERSON; //정의된 구조체에 대한 typedef 선언

typedef struct _Employee
{
	char name[30];
	int salary;
}Employee;

void main_19_3()
{
	//지역 내에서 사용할 자료형 이름에 대한 선언
	typedef char CHAR;
	typedef char* STR;

	//typedef 선언 이후 자료형은 기존 자료형과 동일한 역할 수행
	INT num = 3;
	PINT ptr = &num;
	UINT unum = 5;

	CHAR ch = 'c';
	STR str = "Hello!";

	printf("%d %d %d\n", num, *ptr, unum);
	printf("%c %s\n", ch, str);

	POINT position = { 30, 60 };
	PERSON saram = { "강사람", 10 };
	Employee worker = { "근로자", 100000000 };

	printf("X : %d, Y : %d\n", position.x, position.y);
	printf("이름 : %s, 나이 : %d\n", saram.name, saram.age);
	printf("이름 : %s, 연봉 : %d\n", worker.name, worker.salary);
}