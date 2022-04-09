#pragma once
#ifndef __ARRAY_LIST_H_	//���ǵǾ� ���� ������ �������� �ʴ´�
#define __ARRAY_LIST_H_
#define TRUE 1
#define FALSE 0
#define LIST_LEN 50

typedef int LData;		//LData�� ���� typedef ����

typedef struct __ArrayList	//�迭 ����Ʈ ������ ����ü
{
	LData arr[LIST_LEN];	//����Ʈ�� ����� �迭
	int numData;			//ī��Ʈ
	int curPosition;		//������ ��ġ
}ArrayList;

typedef ArrayList List;

void ListInit(List* pList);				//1. ����Ʈ �ʱ�ȭ
void LInsert(List* pList, LData data);	//2. ������ ����
int LFirst(List* pList, LData* pData);	//3. ù ��° ���������� �˻�
int LNext(List* pList, LData* pData);	//4. ���� ������ ȣ��(Insert�� ������ �ִ��� �˻�)
LData LRemove(List* pList);				//5. ������ ����
int LCount(List* pList);				//6. ����Ʈ

#endif