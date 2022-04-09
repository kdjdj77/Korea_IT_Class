#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include "insertLinkedList.h"

int main(void)
{
	linkedList_h* L;
	L = createLinkedList_h();
	printf("(1)빈 공백 리스트 생성\n");
	printList(L);

	printf("\n(2)리스트에 [s]노드 삽입\n");
	insertFirstNode(L, "s");
	printList(L);

	printf("\n(3)리스트에 [t]노드 삽입\n");
	insertFirstNode(L, "t");
	printList(L);

	printf("\n(4)리스트에 [r]노드 삽입\n");
	insertFirstNode(L, "r");
	printList(L);

	printf("\n(5)메모리 해제하여 공백 리스트로 만들기\n");
	freeLinkedList_h(L);
	printList(L);

	getchar();
	return 0;
}