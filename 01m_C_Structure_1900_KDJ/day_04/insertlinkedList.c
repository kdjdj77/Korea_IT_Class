#define _CRT_SECURE_NO_WARNINGS
#include<string.h>
#include<malloc.h>
#include "insertLinkedList.h"

//���� ���� ����Ʈ ����
linkedList_h* createLinkedList_h(void)
{
	linkedList_h* L;								//��� ��� ����
	L = (linkedList_h*)malloc(sizeof(linkedList_h));//��� ��� �޸� �Ҵ�
	L->head = NULL;									//���� ����Ʈ
	return L;										//��� ��� ��ȯ
}

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

//���� ����Ʈ ���
void printList(linkedList_h* L)
{
	listNode* p;									//p ����
	printf("L = (");
	p = L->head;									//p <- ��� ��尡 ����Ű�� ���
	while (p != NULL)								//p�� NULL�� ������(������ ��尡 �ɶ�����)
	{
		printf("%s", p->data);					//p�� data ���
		p = p->link;							//p <- p�� link�� ����Ű�� ���
		if (p != NULL) printf(", ");			//p�� ������ ��尡 �ƴ϶�� ", " �߰����
	}
	printf(") \n");
}

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

//��带 �������� �����ϴ� �ڵ�
void insertLastNode(linkedList_h* L, char* x)
{
	listNode* newNode;								//�� ��� ����
	listNode* temp;									//temp ����
	newNode = (listNode*)malloc(sizeof(listNode));	//�� ��� �޸� �Ҵ�
	strcpy(newNode->data, x);						//�� ��忡 ������(���ڿ�) ����
	newNode->link = NULL;							//�� ����� link�� NULL
	if (L->head == NULL)							//������ ��尡 ��� ����̸�
	{
		L->head = newNode;						//head�� ����Ű�� �ּ� <- �� ����� �ּ�
		return;
	}
	temp = L->head;									//temp�� head�� ����Ű�� ��� ����
	while (temp->link != NULL)						//temp�� link�� NULL�� �� ������
	{												//(temp�� ������ ��尡 �ɶ�����)
		temp = temp->link;						//temp <- temp�� ����Ű�� �ּ��� ���
	}											//�ݺ��ϸ� temp�� ������ ��尡 �ȴ�
	temp->link = newNode;							//temp�� link <- �� ���
}