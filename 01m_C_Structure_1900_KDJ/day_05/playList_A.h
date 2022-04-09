#pragma once
/*
playList.h								//�Լ� ����
	1. ����ü ���� (��� ����)
		���� ���� ������ ����Ʈ
		�÷��̸���Ʈ ���� ����Ʈ
		���� ��� playList�Լ� ����
	2. 
playList.c								//�Լ� ������ ���� ����
playListTest.c
*/

// ��ü ���� ��� playList ����� ����ü ����
typedef struct _playListNode
{
	char data[20];
	struct playListNode* pLink;
}playListNode;

typedef struct
{
	playListNode* head;
}playListNode_h;

//�÷��̸���Ʈ (selectsList) ��� ���� ����(����ü)
typedef struct selectsListNode
{
	struct playListNode* data;			//������ ���ǿ� ���� playList��� �ּ�
	struct selectsListNode* Link;		//�ڱ� ����
}selectsListNode;

typedef struct
{
	selectsListNode* head;
}selectsListNode_h;

//���� ��� playList�� �Լ� ����
playListNode_h* createPlayLinkedList_h(void);

void insertPlayListLastNode(playListNode_h* CL, char* x);
void insertSelectsListLastNode(selectsListNode_h* sCL, char* p_tmp);

void printSelectsList(selectsListNode_h* CL);
//void insertSelectsListLastNode(selectsListNode_h* sCL, playListNode* p_tmp);
