#include<stdio.h>
#include "ArrayList.h"

void ListInit(List* pList)				//1. 리스트 초기화
{
	pList->numData = 0;
	pList->curPosition = 0;
}
void LInsert(List* pList, LData data)	//2. 데이터 저장
{
	if (pList->numData >= LIST_LEN)			//데이터가 들어갈 자리가 없으면 리턴
	{
		printf("Unable Input Data\n");
		return;
	}
	pList->arr[pList->numData] = data;		//arr의 numData index에 data 저장
	(pList->numData)++;						//데이터가 추가되었으므로 numData++
}
int LFirst(List* pList, LData* pData)	//3. 첫 번째 데이터인지 검사
{
	if (pList->numData == 0) return FALSE;

	(pList->curPosition) = 0;
	*pData = pList->arr[0];
	return TRUE;
}
int LNext(List* pList, LData* pData)	//4. 다음 데이터 호출(Insert할 공간이 있는지 검사)
{
	if (pList->curPosition >= (pList->numData) - 1) return FALSE;

	(pList->curPosition)++;
	*pData = pList->arr[pList->curPosition];
	return TRUE;
}

LData LRemove(List* pList)				//5. 데이터 삭제
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

int LCount(List* pList)					//6. 프린트
{
	return pList->numData;
}
