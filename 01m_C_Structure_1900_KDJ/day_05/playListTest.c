#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include "playList.h"

int main_ex(void)
{
	linkedList_h* N, * K;
	N = createLinkedList_h();
	K = createLinkedList_h();

	insertFirstNode(N, "s");
	insertFirstNode(N, "t");
	insertFirstNode(N, "r");
	insertFirstNode(N, "H");
	insertFirstNode(N, "j");
	insertFirstNode(N, "N");
	insertFirstNode(N, "B");
	insertFirstNode(N, "A");

	findRepeatSong(N, K, "B");
	findRepeatSong(N, K, "N");
	findRepeatSong(N, K, "A");
	findRepeatSong(N, K, "H");
	printList(N);
	printList(K);


	freeLinkedList_h(K);
	freeLinkedList_h(N);

	getchar();
	return 0;
}