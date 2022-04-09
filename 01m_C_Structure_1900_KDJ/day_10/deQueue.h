#pragma once

typedef char element;

typedef struct _DQNode	//이중 연결 리스트 데크의 노드 구조
{
	element data;
	struct _DQNode* lLink;
	struct _DQNode* rLink;
}DQNode;

typedef struct			//데크에서 사용하는 포인터 front, rear를 구조체 정의
{
	DQNode* front, * rear;
}DQueueType;

DQueueType* createDQueue(void);
int isDQueueEmpty(DQueueType* DQ);
void insertFront(DQueueType* DQ, element item);
void insertRear(DQueueType* DQ, element item);
element deleteFront(DQueueType* DQ);
element deleteRear(DQueueType* DQ);
void printDQueue(DQueueType* DQ);