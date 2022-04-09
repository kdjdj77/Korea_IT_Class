/*
	1. 구조체
	1) 구조체의 이해
		구조체는 하나 이상의 변수를 한꺼번에 묶어서 만드는 '새로운 유형의 자료형'.
		구조체를 구성하는 각 변수는 각각의 메모리 공간을 할당받지만, 이들은 구조체에 속해 있어
		모두 하나의 정보를 표현하는 구조체 멤버로서 역할 수행.

		구조체는 사용자에 의해 정의되는 새로운 유형의 자료형이라는 의미로
		'사용자 정의 자료형'이라고 부르기도 함.

		사용법 (person이라는 이름의 구조체 정의)
		struct person {
			char name[30];
			int age;
		}

		구조체는 struct 키워드를 사용해 정의.
		구조체를 정의할 때 구조체의 이름을 결정해야 하는데, 위에서 person이 구조체 이름.
		이후 person이라는 이름은 int나 char과 같은 자료형의 이름이 됨.
		그러나 이는 기본 자료형이 아닌 기본 자료형이 모여 만들어진 '구조체 자료형'
		구조체를 구성하고 있는 변수를 '멤버 변수'라고 하며
		C 언어가 허용하는 모든 유형의 변수는 멤버 변수가 될 수 있음.
		또한, 개수의 제한이 없어 여러 개의 변수를 구조체의 멤버 변수로 선언할 수 있음.


	2) 구조체 변수의 선언 및 접근
		구조체는 사용자 정의 자료형.
		따라서 구조체 정의가 완료되면 구조체를 통한 '구조체 변수'의 선언 가능.

		구조체 변수 선언
		struct 구조체이름 변수이름;

		ex) person 구조체 변수 선언
		struct person boy;
		struct person girl;

		위와 같이 구조체 변수를 선언하면 boy와 girl은 
		각각 name과 age를 멤버 변수로 가지는 구조체 변수로
		각자 필요한 메모리 공간을 할당 받음.
		할당된 변수들에 대해서는 각각 초기화를 비롯한 접근이 가능.
		멤버 변수를 접근할 때는 .(dot)연산자 사용.

		문자열 변수에 대한 초기화를 위해서는 문자열 함수에서 사용한 strcpy를 사용.

		

	3) 구조체 변수의 초기화
		구조체 변수 또한 선언과 동시에 초기화를 진행할 수 있음.

		ex) person 구조체 변수의 선언과 동시에 초기화
		struct person boy = {"김소년", 12};

		2)와는 다르게 strcpy를 사용하지 않고 바로 초기화 가능.
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

//구조체 변수의 선언 및 접근
struct person
{
	char name[30];
	int age;
};

void main_19_1()
{
	struct person boy, girl;

	//name 멤버 변수에 대한 값 할당
	strcpy(boy.name, "김소년");
	strcpy(girl.name, "이소녀");

	//age 멤버변수에 대한 접근
	boy.age = 12;
	girl.age = 9;

	printf("소년의 이름은 %s, 나이는 %2d세\n", boy.name, boy.age);
	printf("소녀의 이름은 %s, 나이는 %2d세\n", girl.name, girl.age);

	//구조체 변수 선언과 동시에 초기화
	struct person boy2 = { "김소년", 12 };
	struct person girl2 = { "이소녀", 9 };

	printf("소년의 이름은 %s, 나이는 %2d세\n", boy2.name, boy2.age);
	printf("소녀의 이름은 %s, 나이는 %2d세\n", girl2.name, girl2.age);
}