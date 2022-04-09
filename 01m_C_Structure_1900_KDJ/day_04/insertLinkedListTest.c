#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include "insertLinkedList.h"

int main(void)
{
	linkedList_h* L;
	L = createLinkedList_h();
	printf("(1)�� ���� ����Ʈ ����\n");
	printList(L);

	printf("\n(2)����Ʈ�� [s]��� ����\n");
	insertFirstNode(L, "s");
	printList(L);

	printf("\n(3)����Ʈ�� [t]��� ����\n");
	insertFirstNode(L, "t");
	printList(L);

	printf("\n(4)����Ʈ�� [r]��� ����\n");
	insertFirstNode(L, "r");
	printList(L);

	printf("\n(5)�޸� �����Ͽ� ���� ����Ʈ�� �����\n");
	freeLinkedList_h(L);
	printList(L);

	getchar();
	return 0;
}