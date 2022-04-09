#include<stdio.h>
#include<stdlib.h>
#include"deQueue.h"
//데크 생성
DQueueType* createDQueue(void)
{
	DQueueType* dq = (DQueueType*)malloc(sizeof(DQueueType));	//dq 할당
	dq->front = NULL;
	dq->rear = NULL;
	return dq;
}
//데크 공백 상태인지 검사
int isDQueueEmpty(DQueueType* dq)
{
	if (dq->front == NULL)	//front가 NULL이라는 것은 데이터가 들어있지 않다는 것
	{
		printf("Deque는 현재 공백상태 입니다.\n");
		return 1;
	}
	else return 0;
}
//데크의 front앞으로 요소 삽입
void insertFront(DQueueType* dq, element item)
{
	DQNode* newNode = (DQNode*)malloc(sizeof(DQNode));
	newNode->data = item;
	if (isDQueueEmpty(dq))		//데크가 공백 상태인 경우
	{
		dq->front = newNode;		//front노드 = newNode
		dq->rear = newNode;			//rear노드 = newNode		(front = rear)
		newNode->rLink = NULL;		//newNode의 링크는 전부 NULL
		newNode->lLink = NULL;
	}
	else
	{
		dq->front->lLink = newNode;	//자료가 있다는 것은 front에 현재 노드가 있다는 것
									//그 노드(front)의 lLink에 newNode 삽입
		newNode->rLink = dq->front;	//newNode의 rLink에 그 노드(front) 삽입
		newNode->lLink = NULL;		//front부터 삽입이기 때문에 newNode의 lLink는 NULL
		dq->front = newNode;		//그리고 front는 newNode가 된다.
	}
}
//데크의 rear앞으로 요소 삽입
void insertRear(DQueueType* dq, element item)
{
	DQNode* newNode = (DQNode*)malloc(sizeof(DQNode));
	newNode->data = item;
	if (isDQueueEmpty(dq))	//데크가 공백 상태인 경우
	{
		dq->front = newNode;
		dq->rear = newNode;
		newNode->rLink = NULL;
		newNode->lLink = NULL;
	}
	else
	{
		dq->rear->rLink = newNode;
		newNode->rLink = NULL;
		newNode->lLink = dq->rear;
		dq->rear = newNode;
	}
}
//데크의 front앞으로 요소 삭제
element deleteFront(DQueueType* dq)
{
	DQNode* old = dq->front;		//old <-- front
	element item;
	if (isDQueueEmpty(dq)) return;	//공백상태 삭제 중단
	else
	{
		item = old->data;			//삭제할 노드(front)의 데이터 복사
		if (dq->front->rLink == NULL)	//공백이 아닌데 front의 rLink가 NULL이라는 것은
		{								//데이터가 하나만 들어있다는 것
			dq->front = NULL;	//공백 데크로 초기화시킨다.
			dq->rear = NULL;
		}
		else							//두 개 이상의 자료가 있을 경우
		{
			dq->front = dq->front->rLink;	//front의 다음 노드를 front로 만듬
			dq->front->lLink = NULL;		//front의 lLink = NULL
		}									//(원래 삭제 전의 front를 가리키고 있었음)
		free(old);
		return item;
	}
}
//데크의 rear앞으로 요소 삭제
element deleteRear(DQueueType* dq)
{
	DQNode* old = dq->rear;
	element item;
	if (isDQueueEmpty(dq)) return;	//공백상태 삭제 중단
	else
	{
		item = old->data;
		if (dq->rear->lLink == NULL)
		{
			dq->front = NULL;
			dq->rear = NULL;
		}
		else
		{
			dq->rear = dq->rear->lLink;
			dq->rear->rLink = NULL;
		}
		free(old);
		return item;
	}
}
//출력
void printDQueue(DQueueType* dq)
{
	DQNode* temp = dq->front;
	printf("Deque : [ ");
	while (temp)
	{
		printf("%c ", temp->data);
		temp = temp->rLink;
	}
	printf("]\n");
}
