/*
struct(구조체)

struct arrayList 
{
	 구문 1;
	 구문 2;
	 구문 3;
};
//구조체 사용 이유 : 서로 다른 데이터 형의 변수들을 하나로 묶어서 사용
int a;						//정수형 변수 a
int a[] = {10, 20, 3.05}	// 불가(정수형 배열이기 때문)

//student : 이름(문자), 나이(정수), 주소(문자), 전화번호(정수)
//student를 관리하기 위해 구조체 사용

구조체의 태그 이름 : 구조체를 식별하기 위한 식별자 (구조체 매개변수의 주인이 누구인지 식별)
struct student	// student는 구조체의 태그명
{
	char name[20];
	int age;
	char address[30];
	char number[15];
	int kor;
	int eng;
	float avg;
};

구조체의 크기 
sizeof(struct grade);	//(O)	struct 태그명으로 크기를 구할 수 있다.
sizeof(grade);			//(X)	태그명만으로는 사용할 수 없다
struct grade	//
{
	int kor;
	int eng;
	int math;
	float avg;
};

struct student st;	//구조체 student를 정의해 주어야 메모리에 할당
구조체 변수.멤버변수 로 사용한다. (ex st.name)

*/

#include <stdio.h>

struct address		//char[20] = 20바이트 x2, int 4바이트 => 44바이트
{
	char name[20];
	char phone[20];
	int bellSound;
}addr;	//구조체 선언

void main_1(void)
{
	printf("address 구조체의 크기는 = %d\n", sizeof(struct address));
	struct address addr = { 0 };	//구조체 변수 add를 메모리에 할당 + 0으로 초기화
	addr.name; //구조체태그명.멤버변수 로 변수에 접근
}
//구조체 멤버들은 접근할 때 구조체 변수만을 이용하여 구조체에 접근