#include<stdio.h>
#include "ArrayList.h"

void ListInit(List* pList)				//1. ����Ʈ �ʱ�ȭ
{
	pList->numData = 0;
	pList->curPosition = 0;
}
void LInsert(List* pList, LData data)	//2. ������ ����
{
	if (pList->numData >= LIST_LEN)			//�����Ͱ� �� �ڸ��� ������ ����
	{
		printf("Unable Input Data\n");
		return;
	}
	pList->arr[pList->numData] = data;		//arr�� numData index�� data ����
	(pList->numData)++;						//�����Ͱ� �߰��Ǿ����Ƿ� numData++
}
int LFirst(List* pList, LData* pData)	//3. ù ��° ���������� �˻�
{
	if (pList->numData == 0) return FALSE;

	(pList->curPosition) = 0;
	*pData = pList->arr[0];
	return TRUE;
}
int LNext(List* pList, LData* pData)	//4. ���� ������ ȣ��(Insert�� ������ �ִ��� �˻�)
{
	if (pList->curPosition >= (pList->numData) - 1) return FALSE;

	(pList->curPosition)++;
	*pData = pList->arr[pList->curPosition];
	return TRUE;
}

LData LRemove(List* pList)				//5. ������ ����
{

	int pos = pList->curPosition;
	int num = pList->numData;
	int i;
	LData rdata = pList->arr[pos];

	for (i = pos; i < num - 1; i++)
		pList->arr[i] = pList->arr[i + 1];
	(pList->numData)--;
	(pList->curPosition)--;
	return rdata;

	/*
	for (int i = pList->curPosition; i <= pList->numData; i++)
	{
		pList->arr[i] = pList->arr[i + 1];
	}
	pList->numData--;
	pList->curPosition--;
	return;
	*/
}

int LCount(List* pList)					//6. ����Ʈ
{
	return pList->numData;
}
