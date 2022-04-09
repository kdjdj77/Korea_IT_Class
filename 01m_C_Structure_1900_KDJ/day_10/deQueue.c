#include<stdio.h>
#include<stdlib.h>
#include"deQueue.h"
//��ũ ����
DQueueType* createDQueue(void)
{
	DQueueType* dq = (DQueueType*)malloc(sizeof(DQueueType));	//dq �Ҵ�
	dq->front = NULL;
	dq->rear = NULL;
	return dq;
}
//��ũ ���� �������� �˻�
int isDQueueEmpty(DQueueType* dq)
{
	if (dq->front == NULL)	//front�� NULL�̶�� ���� �����Ͱ� ������� �ʴٴ� ��
	{
		printf("Deque�� ���� ������� �Դϴ�.\n");
		return 1;
	}
	else return 0;
}
//��ũ�� front������ ��� ����
void insertFront(DQueueType* dq, element item)
{
	DQNode* newNode = (DQNode*)malloc(sizeof(DQNode));
	newNode->data = item;
	if (isDQueueEmpty(dq))		//��ũ�� ���� ������ ���
	{
		dq->front = newNode;		//front��� = newNode
		dq->rear = newNode;			//rear��� = newNode		(front = rear)
		newNode->rLink = NULL;		//newNode�� ��ũ�� ���� NULL
		newNode->lLink = NULL;
	}
	else
	{
		dq->front->lLink = newNode;	//�ڷᰡ �ִٴ� ���� front�� ���� ��尡 �ִٴ� ��
									//�� ���(front)�� lLink�� newNode ����
		newNode->rLink = dq->front;	//newNode�� rLink�� �� ���(front) ����
		newNode->lLink = NULL;		//front���� �����̱� ������ newNode�� lLink�� NULL
		dq->front = newNode;		//�׸��� front�� newNode�� �ȴ�.
	}
}
//��ũ�� rear������ ��� ����
void insertRear(DQueueType* dq, element item)
{
	DQNode* newNode = (DQNode*)malloc(sizeof(DQNode));
	newNode->data = item;
	if (isDQueueEmpty(dq))	//��ũ�� ���� ������ ���
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
//��ũ�� front������ ��� ����
element deleteFront(DQueueType* dq)
{
	DQNode* old = dq->front;		//old <-- front
	element item;
	if (isDQueueEmpty(dq)) return;	//������� ���� �ߴ�
	else
	{
		item = old->data;			//������ ���(front)�� ������ ����
		if (dq->front->rLink == NULL)	//������ �ƴѵ� front�� rLink�� NULL�̶�� ����
		{								//�����Ͱ� �ϳ��� ����ִٴ� ��
			dq->front = NULL;	//���� ��ũ�� �ʱ�ȭ��Ų��.
			dq->rear = NULL;
		}
		else							//�� �� �̻��� �ڷᰡ ���� ���
		{
			dq->front = dq->front->rLink;	//front�� ���� ��带 front�� ����
			dq->front->lLink = NULL;		//front�� lLink = NULL
		}									//(���� ���� ���� front�� ����Ű�� �־���)
		free(old);
		return item;
	}
}
//��ũ�� rear������ ��� ����
element deleteRear(DQueueType* dq)
{
	DQNode* old = dq->rear;
	element item;
	if (isDQueueEmpty(dq)) return;	//������� ���� �ߴ�
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
//���
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
