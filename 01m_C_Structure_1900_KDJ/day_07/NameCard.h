#pragma once
#define NAME_LEN 30
#define PHONE_LEN 15

typedef struct _nameCard
{
	char name[NAME_LEN];
	char phone[PHONE_LEN];
}NameCard;
typedef NameCard* LData;

//���� �޸� �Ҵ� �� �ʱ�ȭ
NameCard* MakeNameCard(char* name, char* phone);
//NameCard����ü ���� ���� ���
void ShowNameCardInfo(NameCard* pCard);
//�˻��� �̸��� �ߺ��Ǵ� �̸�����(0), �ƴ���(1) ���� ��ȯ
int NameCompare(NameCard* pCard, char* name);
//��ȭ��ȣ ���� ����
void ChangePhoneNum(NameCard* pCard, char* phone);