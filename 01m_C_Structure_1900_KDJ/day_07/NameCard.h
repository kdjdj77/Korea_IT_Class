#pragma once
#define NAME_LEN 30
#define PHONE_LEN 15

typedef struct _nameCard
{
	char name[NAME_LEN];
	char phone[PHONE_LEN];
}NameCard;
typedef NameCard* LData;

//동적 메모리 할당 및 초기화
NameCard* MakeNameCard(char* name, char* phone);
//NameCard구조체 변수 정보 출력
void ShowNameCardInfo(NameCard* pCard);
//검색할 이름이 중복되는 이름인지(0), 아닌지(1) 값을 반환
int NameCompare(NameCard* pCard, char* name);
//전화번호 정보 변경
void ChangePhoneNum(NameCard* pCard, char* phone);