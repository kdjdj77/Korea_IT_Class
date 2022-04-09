/*
	2. 구조체와 배열
	1) 구조체 배열의 선언 및 접근
		배열은 동일한 자료형의 데이터를 한데 모아 관리하는 자료구조.
		구조체 또한 '사용자 정의 자료형'으로 사용자는 구조체로 이루어진
		배열을 선언할 수 있으며, 배열에 접근하는 것과 동일한 방식으로 
		구조체로 이루어진 배열에 접근하는 것이 가능.

		ex) 배열 선언 예
		int iarr[3];
		struct person parr[3];

*/
#include <stdio.h>

struct person
{
	char name[30];
	int age;
};

void main_19_2()
{
	//1. 구조체 배열의 선언 및 접근
	struct person boy[3] = { {"김소년", 12}, {"유소년", 14}, {"청소년", 16} };
	struct person girls[3];
	strcpy(girls[0].name, "이소녀");
	strcpy(girls[1].name, "오소녀");
	strcpy(girls[2].name, "하소녀");
	girls[0].age = 9;
	girls[1].age = 13;
	girls[2].age = 7;

	for (int i = 0; i < 3; i++)
	{
		printf("소년의 이름은 %s, 나이는 %2d세\n", boy[i].name, boy[i].age);
		printf("소녀의 이름은 %s, 나이는 %2d세\n", girls[i].name, girls[i].age);
	}
}