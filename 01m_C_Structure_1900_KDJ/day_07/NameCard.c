/*
#include<stdio.h>
#include"NameCard.h"
#include<string.h>
#include<malloc.h>

//���� �޸� �Ҵ� �� �ʱ�ȭ
NameCard* MakeNameCard(char* name, char* phone)
{
	NameCard* L;
	L = (NameCard*)malloc(sizeof(NameCard));
	strcpy(L->name, name);
	strcpy(L->phone, phone);
	return L;
}
//NameCard����ü ���� ���� ���
void ShowNameCardInfo(NameCard* pCard)
{
	printf("�̸� : %s\n", pCard->name);
	printf("��ȭ��ȣ : %s\n", pCard->phone);
}
//�˻��� �̸��� �ߺ��Ǵ� �̸�����(0), �ƴ���(1) ���� ��ȯ
int NameCompare(NameCard* pCard, char* name)
{
	return strcmp(pCard->name, name);
}
//��ȭ��ȣ ���� ����
void ChangePhoneNum(NameCard* pCard, char* phone)
{
	strcpy(pCard->phone, phone);
}
*/