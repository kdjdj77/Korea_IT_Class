#pragma once
//���� ����Ʈ�� ��� ���� ����
typedef struct ListNode
{
	char data[4];
	struct ListNode* link;
}listNode;

//��� ��� ����
typedef struct
{
	listNode* head;
}linkedList_h;

//��� ��� ����
linkedList_h* createLinkedList_h(void);
//����Ʈ �޸� ����
void freeLinkedList_h(linkedList_h* L);
//����Ʈ ������� ���
void printList(linkedList_h* L);
//ù ��� �Է�
void insertFirstNode(linkedList_h* L, char* x);
//�߰��� ��带 ����
void insertMiddleNode(linkedList_h* L, listNode* pre, char* x);
//������ ��� �Է�
void insertLastNode(linkedList_h* L, char* x);