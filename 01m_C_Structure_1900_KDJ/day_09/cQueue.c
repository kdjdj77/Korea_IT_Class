#include<stdio.h>
#include<stdlib.h>
#include "cQueue.h"

//원형 큐 생성
qType* createCQueue(void)
{
	qType* cq = (qType*)malloc(sizeof(qType));	//cq 할당
	cq->front = 0;	//front 0 초기화
	cq->rear = 0;	//rear 0 초기화
}
//공백 상태 검사
int isCQueueEmpty(qType* cq)
{
	if (cq->front == cq->rear)	//front와 rear가 같다면 true
	{							//(front와 rear가 0일 때)
		printf("원형 큐는 현재 공백상태 입니다.\n");
		return 1;
	}
	else return 0;
}
//포화 상태 검사
int isCQueueFull(qType* cq)
{
	if (((cq->rear + 1) % cq_size) == cq->front)
	{
		printf("원형 큐는 현재 포화상태 입니다.\n");
		return 1;
	}
	else return 0;
}
//원형 큐에 데이터 입력
void enCQueue(qType* cq, element item)
{
	if (isCQueueFull(cq)) return;	//포화상태 삽입 중단
	else
	{
		cq->rear = (cq->rear + 1) % cq_size;	//나머지를 이용하여 rear 값을 조절
		cq->queue[cq->rear] = item;
	}
}
//원형 큐에 원소 삭제
element deCQueue(qType* cq)
{
	if (isCQueueEmpty(cq)) return;	//공백상태 삭제 중단
	else
	{
		cq->front = (cq->front + 1) % cq_size;	//나머지를 이용하여 front 값을 조절
		return cq->queue[cq->front];
	}
}
//데이터 삭제(복사본 저장)
element peekCQueue(qType* cq){}
//원형 큐 출력
void printCQueue(qType* cq)
{
	int i, first, last;
	first = (cq->front + 1) % cq_size;
	last = (cq->rear + 1) % cq_size;
	printf("원형 Queue : [ ");
	i = first;
	while (i != last)
	{
		printf("%c ", cq->queue[i]);
		i = (i + 1) % cq_size;
	}
	printf("]\n");
}