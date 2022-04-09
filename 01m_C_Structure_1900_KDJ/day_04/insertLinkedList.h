#pragma once
//연결 리스트의 노드 구조 정의
typedef struct ListNode
{
	char data[4];
	struct ListNode* link;
}listNode;

//헤더 노드 정의
typedef struct
{
	listNode* head;
}linkedList_h;

//헤더 노드 생성
linkedList_h* createLinkedList_h(void);
//리스트 메모리 해제
void freeLinkedList_h(linkedList_h* L);
//리스트 순서대로 출력
void printList(linkedList_h* L);
//첫 노드 입력
void insertFirstNode(linkedList_h* L, char* x);
//중간에 노드를 넣음
void insertMiddleNode(linkedList_h* L, listNode* pre, char* x);
//마지막 노드 입력
void insertLastNode(linkedList_h* L, char* x);