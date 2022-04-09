#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
#include<malloc.h>
#include "playList_A.h"

//���� ���� ����Ʈ ����
playListNode_h* createPlayLinkedList_h(void)
{
	playListNode_h* CL;										//��� ��� ����
	CL = (playListNode_h*)malloc(sizeof(playListNode_h));	//��� ��� �޸� �Ҵ�
	CL->head = NULL;										//���� ����Ʈ
	return CL;												//��� ��� ��ȯ
}
/*
//���Ḯ��Ʈ �޸� ����
void freeLinkedList_h(linkedList_h* L)
{
	listNode* p;						//listNode�� ����Ű�� p ����
	while (L->head != NULL)				//head�� NULL�� ������ �ݺ�(��� ��常 ���� ������ �ݺ�)
	{
		p = L->head;				//NULL�� ����Ű�� �ִ� ��尡 p�̴�
		L->head = L->head->link;	//head = link
		free(p);					//p �޸� ����
		p = NULL;					//p NULL�� �ʱ�ȭ
	}
}

//ù ��° ���� �����ϴ� �ڵ�
void insertFirstNode(linkedList_h* L, char* x)
{
	listNode* newNode;								//ù ��� ����
	newNode = (listNode*)malloc(sizeof(listNode));	//ù ��� �޸� �Ҵ�
	strcpy(newNode->data, x);						//ù ��忡 ������(���ڿ�) ����
	newNode->link = L->head;						//ù ��尡 ����Ű�� �ּ� <- head�� ����Ű�� �ּ�(NULL)
	L->head = newNode;								//head�� ����Ű�� �ּ� <- ù ����� �ּ�
}
*/
//���� ����Ʈ ���
void printList(playListNode_h* L)
{
	playListNode* p;									//p ����
	p = L->head;									//p <- ��� ��尡 ����Ű�� ���
	while (p != NULL)								//p�� NULL�� ������(������ ��尡 �ɶ�����)
	{
		printf("%s", p->data);					//p�� data ���
		p = p->link;							//p <- p�� link�� ����Ű�� ���
		if (p != NULL) printf(", ");			//p�� ������ ��尡 �ƴ϶�� ", " �߰����
	}
	printf("\n");
}
/*
//��带 pre �ڿ� �����ϴ� �ڵ�
void insertMiddleNode(linkedList_h* L, listNode* pre, char* x)	//L = ��� ���, pre = �� ���, x = ��
{
	listNode* newNode;								//�� ��� ����
	newNode = (listNode*)malloc(sizeof(listNode));	//�� ��� �޸� �Ҵ�
	strcpy(newNode->data, x);						//�� ��忡 ������(���ڿ�) ����
	if (L->head == NULL)							//�����Ϸ��� ���� ������ ��� ���̸�
	{
		newNode->link = NULL;					//�� ����� link <- NULL
		L->head = newNode;						//head�� ����Ű�� �ּ� <- newNode�� �ּ�
	}
	else if (pre == NULL)							//pre�� ��� ����̸�
	{
		newNode->link = L->head;				//�� ����� link <- ��� ��尡 ����Ű�� �ּ�
		L->head = newNode;						//��� ��尡 ����Ű�� �ּ� <- �� ����� �ּ�
	}
	else											//�� ��(��� ��� �ڵ� �ƴϰ� ������ ��� �ڵ� �ƴϸ�)
	{
		newNode->link = pre->link;				//�� ����� link <- pre
		pre->link = newNode;					//pre�� link <- �� ���
	}
}
*/
//��带 �������� �����ϴ� �ڵ�
void insertPlayListLastNode(playListNode_h* CL, char* x)
{
	playListNode* newNode, * temp;							//�� ���, temp ����
	newNode = (playListNode*)malloc(sizeof(playListNode));	//�� ��� �޸� �Ҵ�
	strcpy(newNode->data, x);						//�� ��忡 ������(���ڿ�) ����
	newNode->pLink = NULL;							//�� ����� link�� NULL
	if (CL->head == NULL)							//������ ��尡 ��� ����̸�
	{
		CL->head = newNode;						//head�� ����Ű�� �ּ� <- �� ����� �ּ�
		return;
	}
	temp = CL->head;								//temp�� head�� ����Ű�� ��� ����
	while (temp->pLink != NULL)						//temp�� link�� NULL�� �� ������
	{												//(temp�� ������ ��尡 �ɶ�����)
		temp = temp->pLink;						//temp <- temp�� ����Ű�� �ּ��� ���
	}											//�ݺ��ϸ� temp�� ������ ��尡 �ȴ�
	temp->pLink = newNode;							//temp�� link <- �� ���
}
