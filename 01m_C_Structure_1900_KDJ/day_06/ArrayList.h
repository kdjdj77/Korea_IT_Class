#pragma once
#ifndef __ARRAY_LIST_H_	//정의되어 있지 않으면 실행하지 않는다
#define __ARRAY_LIST_H_
#define TRUE 1
#define FALSE 0
#define LIST_LEN 50

typedef int LData;		//LData에 대한 typedef 선언

typedef struct __ArrayList	//배열 리스트 정의한 구조체
{
	LData arr[LIST_LEN];	//리스트의 저장소 배열
	int numData;			//카운트
	int curPosition;		//데이터 위치
}ArrayList;

typedef ArrayList List;

void ListInit(List* pList);				//1. 리스트 초기화
void LInsert(List* pList, LData data);	//2. 데이터 저장
int LFirst(List* pList, LData* pData);	//3. 첫 번째 데이터인지 검사
int LNext(List* pList, LData* pData);	//4. 다음 데이터 호출(Insert할 공간이 있는지 검사)
LData LRemove(List* pList);				//5. 데이터 삭제
int LCount(List* pList);				//6. 프린트

#endif