/*
struct 키워드를 생략할 수 있게 해주는 키워드 : typedef
struct address
{
	char name[20];
	char phone[20];
	int bellSound;
};
typedef struct address addr;
//ㄴ>방법 1
typedef struct address
{
	char name[20];
	char phone[20];
	int bellSound;
}addr;
//ㄴ>방법 2
address ct = {"홍길동", "01044445555", 2};

포인터 변수
함수 포인터
배열 포인터
구조체 포인터(->)

구조체의 멤버로 다른 구조체 변수 사용
typedef struct point	//점의 좌표
{
	int x, y;
}po;

typedef struct line		//직선
{
	po start, end;		//다른 구조체 변수를 멤버 변수로 선언
}li;

li ln1 = { { 10, 20 }, { 30, 40 } }; //start, end
//ㄴ> ln1.start.x = 10 / ln1.start.y = 20 / ln1.end.x = 30 / ln1.end.y = 40
*/

#include <stdio.h>
#include <string.h>
#include <math.h>

typedef struct point
{
	int x, y;
}po;

typedef struct line
{
	po start, end;
}li;

double get_length(const li* ln);

void main_3(void)
{
	li ln1 = { { 10, 20 }, { 30, 40 } };

	printf("직선의 시작점 : (%d, %d)\n", ln1.start.x, ln1.start.y);
	printf("직선의 끝점 : (%d, %d)\n", ln1.end.x, ln1.end.y);
	printf("직선의 길이 : %0.2f\n", get_length(&ln1));
}

double get_length(const li* ln)
{
	int dx = ln->end.x - ln->start.x;
	int dy = ln->end.y - ln->start.y;
	return sqrt(dx * dx + dy * dy);
}