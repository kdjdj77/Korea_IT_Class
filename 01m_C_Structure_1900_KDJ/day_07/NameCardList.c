/*
#include<stdio.h>
#include"NameCard.h"
#include"ArrayList.h"

int main(void)
{
	int input = 0;
	List list;
	LData data;
	ListInit(&list);					//1. ����Ʈ �ʱ�ȭ
	while (input == 5)
	{
#ifndef �Է�
		if (input == 1)
		{
			LInsert(&list, MakeNameCard("������", "11111111111"));//2. ������ ����
			LInsert(&list, MakeNameCard("������", "22222222222"));
			LInsert(&list, MakeNameCard("�ٴٴ�", "33333333333"));

			printf("���� ������ �� : %d\n", LCount(&list));	//6. ����Ʈ
		}
#endif
#ifndef ���
		if (input == 2)
		{
			if (LFirst(&list, &data))			//3. ù ��° ���������� �˻�
			{
				ShowNameCardInfo(data);

				while (LNext(&list, &data))		//4. ���� ������ ȣ��(Insert�� ������ �ִ��� �˻�)
					ShowNameCardInfo(data);
			}
			printf("\n");
		}
#endif
#ifndef ����
		if (input == 3)
		{
		printf("�˻��� �̸� : ");
		char* N, PH;
		puts(N);
		if (LFirst(&list, &data))
		{
			if (!NameCompare(data, N))
			{
				printf("�ߺ��� �̸� ����! �̸� �˻� �Ϸ�\n");	//5. ������ ����'
				printf("����� ��ȭ��ȣ �Է� : ");
				puts(PH);
				ChangePhonNum(data, PH);
			}
			while (LNext(&list, &data))
			{
				if (!NameCompare(data, N))
				{
					printf("�ߺ��� �̸� ����! �̸� �˻� �Ϸ�\n");
					printf("����� ��ȭ��ȣ �Է� : ");
					puts(PH);
					ChangePhonNum(data, PH);
					break;
				}
			}
		}
#endif
#ifndef ����
		if (input == 4)
		{
			printf("������ ������ �̸� �Է� : ");
			puts(N);
			if (LFirst(&list, &data))
			{
				if (!NameCompare(data, N))
				{
					LRemove(&list);
					printf("�ߺ��� �̸� ����! ���� �Ϸ�\n");	//5. ������ ����'
				}
				while (LNext(&list, &data))
				{
					if (!NameCompare(data, N))
					{
						LRemove(&list);
						printf("�ߺ��� �̸� ����! ���� �Ϸ�\n");
						break;
					}
				}
			}
		}
#endif


		return 0;
	}
}
*/