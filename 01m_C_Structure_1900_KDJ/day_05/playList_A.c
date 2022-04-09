#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
#include<malloc.h>
#include "playList_A.h"

//공백 연결 리스트 생성
playListNode_h* createPlayLinkedList_h(void)
{
	playListNode_h* CL;										//헤더 노드 생성
	CL = (playListNode_h*)malloc(sizeof(playListNode_h));	//헤더 노드 메모리 할당
	CL->head = NULL;										//공백 리스트
	return CL;												//헤더 노드 반환
}
/*
//연결리스트 메모리 해제
void freeLinkedList_h(linkedList_h* L)
{
	listNode* p;						//listNode를 가리키는 p 생성
	while (L->head != NULL)				//head가 NULL일 때까지 반복(헤더 노드만 남을 때까지 반복)
	{
		p = L->head;				//NULL을 가리키고 있는 노드가 p이다
		L->head = L->head->link;	//head = link
		free(p);					//p 메모리 해제
		p = NULL;					//p NULL로 초기화
	}
}

//첫 번째 노드로 삽입하는 코드
void insertFirstNode(linkedList_h* L, char* x)
{
	listNode* newNode;								//첫 노드 생성
	newNode = (listNode*)malloc(sizeof(listNode));	//첫 노드 메모리 할당
	strcpy(newNode->data, x);						//첫 노드에 데이터(문자열) 복사
	newNode->link = L->head;						//첫 노드가 가리키는 주소 <- head가 가리키는 주소(NULL)
	L->head = newNode;								//head가 가리키는 주소 <- 첫 노드의 주소
}
*/
//연결 리스트 출력
void printList(playListNode_h* L)
{
	playListNode* p;									//p 생성
	p = L->head;									//p <- 헤더 노드가 가리키는 노드
	while (p != NULL)								//p가 NULL일 때까지(마지막 노드가 될때까지)
	{
		printf("%s", p->data);					//p의 data 출력
		p = p->link;							//p <- p의 link가 가리키는 노드
		if (p != NULL) printf(", ");			//p가 마지막 노드가 아니라면 ", " 추가출력
	}
	printf("\n");
}
/*
//노드를 pre 뒤에 삽입하는 코드
void insertMiddleNode(linkedList_h* L, listNode* pre, char* x)	//L = 헤더 노드, pre = 앞 노드, x = 값
{
	listNode* newNode;								//새 노드 생성
	newNode = (listNode*)malloc(sizeof(listNode));	//새 노드 메모리 할당
	strcpy(newNode->data, x);						//새 노드에 데이터(문자열) 복사
	if (L->head == NULL)							//삽입하려는 곳이 마지막 노드 뒤이면
	{
		newNode->link = NULL;					//새 노드의 link <- NULL
		L->head = newNode;						//head가 가리키는 주소 <- newNode의 주소
	}
	else if (pre == NULL)							//pre가 헤더 노드이면
	{
		newNode->link = L->head;				//새 노드의 link <- 헤더 노드가 가리키는 주소
		L->head = newNode;						//헤더 노드가 가리키는 주소 <- 새 노드의 주소
	}
	else											//그 외(헤더 노드 뒤도 아니고 마지막 노드 뒤도 아니면)
	{
		newNode->link = pre->link;				//새 노드의 link <- pre
		pre->link = newNode;					//pre의 link <- 새 노드
	}
}
*/
//노드를 마지막에 삽입하는 코드
void insertPlayListLastNode(playListNode_h* CL, char* x)
{
	playListNode* newNode, * temp;							//새 노드, temp 생성
	newNode = (playListNode*)malloc(sizeof(playListNode));	//새 노드 메모리 할당
	strcpy(newNode->data, x);						//새 노드에 데이터(문자열) 복사
	newNode->pLink = NULL;							//새 노드의 link는 NULL
	if (CL->head == NULL)							//마지막 노드가 헤더 노드이면
	{
		CL->head = newNode;						//head가 가리키는 주소 <- 새 노드의 주소
		return;
	}
	temp = CL->head;								//temp에 head가 가리키는 노드 복사
	while (temp->pLink != NULL)						//temp의 link가 NULL이 될 때까지
	{												//(temp가 마지막 노드가 될때까지)
		temp = temp->pLink;						//temp <- temp가 가리키는 주소의 노드
	}											//반복하면 temp가 마지막 노드가 된다
	temp->pLink = newNode;							//temp의 link <- 새 노드
}
