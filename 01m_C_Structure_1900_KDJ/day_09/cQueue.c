#include<stdio.h>
#include<stdlib.h>
#include "cQueue.h"

//���� ť ����
qType* createCQueue(void)
{
	qType* cq = (qType*)malloc(sizeof(qType));	//cq �Ҵ�
	cq->front = 0;	//front 0 �ʱ�ȭ
	cq->rear = 0;	//rear 0 �ʱ�ȭ
}
//���� ���� �˻�
int isCQueueEmpty(qType* cq)
{
	if (cq->front == cq->rear)	//front�� rear�� ���ٸ� true
	{							//(front�� rear�� 0�� ��)
		printf("���� ť�� ���� ������� �Դϴ�.\n");
		return 1;
	}
	else return 0;
}
//��ȭ ���� �˻�
int isCQueueFull(qType* cq)
{
	if (((cq->rear + 1) % cq_size) == cq->front)
	{
		printf("���� ť�� ���� ��ȭ���� �Դϴ�.\n");
		return 1;
	}
	else return 0;
}
//���� ť�� ������ �Է�
void enCQueue(qType* cq, element item)
{
	if (isCQueueFull(cq)) return;	//��ȭ���� ���� �ߴ�
	else
	{
		cq->rear = (cq->rear + 1) % cq_size;	//�������� �̿��Ͽ� rear ���� ����
		cq->queue[cq->rear] = item;
	}
}
//���� ť�� ���� ����
element deCQueue(qType* cq)
{
	if (isCQueueEmpty(cq)) return;	//������� ���� �ߴ�
	else
	{
		cq->front = (cq->front + 1) % cq_size;	//�������� �̿��Ͽ� front ���� ����
		return cq->queue[cq->front];
	}
}
//������ ����(���纻 ����)
element peekCQueue(qType* cq){}
//���� ť ���
void printCQueue(qType* cq)
{
	int i, first, last;
	first = (cq->front + 1) % cq_size;
	last = (cq->rear + 1) % cq_size;
	printf("���� Queue : [ ");
	i = first;
	while (i != last)
	{
		printf("%c ", cq->queue[i]);
		i = (i + 1) % cq_size;
	}
	printf("]\n");
}