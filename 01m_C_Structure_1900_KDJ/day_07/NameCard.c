/*
#include<stdio.h>
#include"NameCard.h"
#include<string.h>
#include<malloc.h>

//동적 메모리 할당 및 초기화
NameCard* MakeNameCard(char* name, char* phone)
{
	NameCard* L;
	L = (NameCard*)malloc(sizeof(NameCard));
	strcpy(L->name, name);
	strcpy(L->phone, phone);
	return L;
}
//NameCard구조체 변수 정보 출력
void ShowNameCardInfo(NameCard* pCard)
{
	printf("이름 : %s\n", pCard->name);
	printf("전화번호 : %s\n", pCard->phone);
}
//검색할 이름이 중복되는 이름인지(0), 아닌지(1) 값을 반환
int NameCompare(NameCard* pCard, char* name)
{
	return strcmp(pCard->name, name);
}
//전화번호 정보 변경
void ChangePhoneNum(NameCard* pCard, char* phone)
{
	strcpy(pCard->phone, phone);
}
*/