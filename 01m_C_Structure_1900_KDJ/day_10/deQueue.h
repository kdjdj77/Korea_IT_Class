#pragma once

typedef char element;

typedef struct _DQNode	//���� ���� ����Ʈ ��ũ�� ��� ����
{
	element data;
	struct _DQNode* lLink;
	struct _DQNode* rLink;
}DQNode;

typedef struct			//��ũ���� ����ϴ� ������ front, rear�� ����ü ����
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