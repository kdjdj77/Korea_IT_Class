/*
	1. 힙 영역
	1) 힙 영역의 필요성
		변수가 할당되는 메모리 영역으로 데이터 영역, 스택 영역을 소개.
		각각은 변수의 생성과 소멸 시점이 이미 정해져 있는 메모리 영역.
		그러나 프로그램을 구현하다 보면 변수의 생성과 소멸 시점을 
		임의로 변경하는 것이 더 효율적일 때도 있음.
		C 언어에서는 그러한 유형의 변수를 할당할 수 있도록 힙 영역이라는 메모리 지원.

		힙 영역은 사용자가 직접 관리할 수 있는 메모리 공간으로,
		힙 영역에 변수를 저장하거나 소멸할 때도 별도의 접근 방법 사용.		
*/
#include <stdio.h>
#include <string.h>

char* getString1()
{
	char* str = "안녕하세요";
	/*
	char str[100];
	printf("좋아하는 단어는? : ");
	gets(str);
	*/
	return str;
}

void main_18_1()
{
	char* result = getString1();
	printf("좋아하는 단어는 : %s\n", result);
}