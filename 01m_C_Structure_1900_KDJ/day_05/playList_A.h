#pragma once
/*
playList.h								//함수 선언
	1. 구조체 정의 (노드 구조)
		음악 전제 파일의 리스트
		플레이리스트 파일 리스트
		음악 목록 playList함수 선언
	2. 
playList.c								//함수 선언한 것을 정의
playListTest.c
*/

// 전체 음악 목록 playList 노드의 구조체 선언
typedef struct _playListNode
{
	char data[20];
	struct playListNode* pLink;
}playListNode;

typedef struct
{
	playListNode* head;
}playListNode_h;

//플레이리스트 (selectsList) 노드 구조 정의(구조체)
typedef struct selectsListNode
{
	struct playListNode* data;			//선택한 음악에 대한 playList노드 주소
	struct selectsListNode* Link;		//자기 참조
}selectsListNode;

typedef struct
{
	selectsListNode* head;
}selectsListNode_h;

//음악 목록 playList의 함수 선언
playListNode_h* createPlayLinkedList_h(void);

void insertPlayListLastNode(playListNode_h* CL, char* x);
void insertSelectsListLastNode(selectsListNode_h* sCL, char* p_tmp);

void printSelectsList(selectsListNode_h* CL);
//void insertSelectsListLastNode(selectsListNode_h* sCL, playListNode* p_tmp);
