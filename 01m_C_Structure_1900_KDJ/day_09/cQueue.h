#pragma once
#define cq_size 4

typedef char element; //ť ������ �ڷ��� char�� ����

typedef struct
{
	element queue[cq_size];	//�迭 ť ����
	int front, rear;
}qType;

qType* createCQueue(void);				//���� ť �ʱ�ȭ
int isCQueueEmpty(qType* cq);			//���� ���� Ȯ��
int isCQueueFull(qType* cq);			//��ȭ ���� Ȯ��
void enCQueue(qType* cq, element item);	//������ ����
element deCQueue(qType* cq);			//������ ����
element peekCQueue(qType* cq);			//������ ����(���纻 ����)
void printCQueue(qType* cq);			//���� ť ���