#include<stdio.h>
#include "ArrayList.h"

int main(void)
{
	List list;
	int data;
	ListInit(&list);					//1. ����Ʈ �ʱ�ȭ

	LInsert(&list, 10);					//2. ������ ����
	LInsert(&list, 20);
	LInsert(&list, 30);
	LInsert(&list, 20);
	LInsert(&list, 20);
	
	printf("���� ������ �� : %d\n", LCount(&list));	//6. ����Ʈ

	if (LFirst(&list, &data))			//3. ù ��° ���������� �˻�
	{
		printf("%d ", data);

		while (LNext(&list, &data))		//4. ���� ������ ȣ��(Insert�� ������ �ִ��� �˻�)
			printf("%d ", data);
	}
	printf("\n");
	
	if (LFirst(&list, &data))
	{
		if (data == 20) LRemove(&list);	//5. ������ ����
		while (LNext(&list, &data))
		{
			if (data == 20) LRemove(&list);
		}
	}
	
	//������ ���� ���� ������ ���
	printf("���� ������ �� : %d\n", LCount(&list));	//6. ����Ʈ
	if (LFirst(&list, &data))
	{
		printf("%d ", data);
		while (LNext(&list, &data))
			printf("%d ", data);
	}
	printf("\n");

	return 0;
}
