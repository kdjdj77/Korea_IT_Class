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
		printf("===���� Queue==============\n");
		printf("0. ���α׷� ����\n");
		printf("1. ������ �߰�\n");
		printf("2. ������ ����\n");

		printf("�Է� : ");
		fflush(stdin);
		scanf("%d", &input);
		if (input == 0) break;
		else if (input == 1)
		{
			printf("�߰��� ���ĺ� �Է� : ");
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