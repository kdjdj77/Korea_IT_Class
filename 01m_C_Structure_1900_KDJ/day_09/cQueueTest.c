#define __CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include"cQueue.h"

int main(void)
{
	qType* cq = createCQueue();
	isCQueueEmpty(cq);
	isCQueueFull(cq);
	element data;
	int input = 0;
	while (1)
	{
		printf("===원형 Queue==============\n");
		printf("0. 프로그램 종료\n");
		printf("1. 데이터 추가\n");
		printf("2. 데이터 삭제\n");

		printf("입력 : ");
		fflush(stdin);
		scanf("%d", &input);
		if (input == 0) break;
		else if (input == 1)
		{
			printf("추가할 알파벳 입력 : ");
			fflush(stdin);
			data = getchar();
			enCQueue(cq, data);
			printCQueue(cq);
		}
		else if (input == 2)
		{
			deCQueue(cq);
			printCQueue(cq);
		}
	}
}