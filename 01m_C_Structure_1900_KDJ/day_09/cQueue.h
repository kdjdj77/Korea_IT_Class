#pragma once
#define cq_size 4

typedef char element; //큐 원소의 자료형 char로 정의

typedef struct
{
	element queue[cq_size];	//배열 큐 선언
	int front, rear;
}qType;

qType* createCQueue(void);				//원형 큐 초기화
int isCQueueEmpty(qType* cq);			//공백 상태 확인
int isCQueueFull(qType* cq);			//포화 상태 확인
void enCQueue(qType* cq, element item);	//데이터 저장
element deCQueue(qType* cq);			//데이터 삭제
element peekCQueue(qType* cq);			//데이터 삭제(복사본 저장)
void printCQueue(qType* cq);			//원형 큐 출력