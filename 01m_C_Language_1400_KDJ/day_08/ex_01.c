#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//���� 1
typedef struct _coffee
{
	char origin[100];
	int price;
	char barista[100];
}coffee;

//���� 2
typedef struct _employee
{
	char name[100];
	char phone[100];
	int salary;
}employee;

void main_ex()
{
/*���� 2
	employee em;
	printf("---�Է�---\n");
	printf("������ �̸� : "); gets(em.name);
	printf("������ ��ȭ��ȣ : "); gets(em.phone);
	printf("������ ���޿� : "); scanf("%d", &em.salary);
	
	printf("---���---\n");
	printf("������ �̸� : %s\n", em.name);
	printf("������ ��ȭ��ȣ : %s\n", em.phone);
	printf("������ ���޿� : %d\n", em.salary);
*/
	//���� 3
	employee worker[3];
	printf("---�Է�---\n");
	for (int i = 0; i < sizeof(worker) / sizeof(employee); i++)
	{
		printf("����%d�� �̸� : ", i + 1);		gets(worker[i].name);
		printf("����%d�� ��ȭ��ȣ : ", i + 1);	gets(worker[i].phone);
		printf("����%d�� ���޿� : ", i + 1);		scanf("%d", &worker[i].salary);
	}

	printf("---���---\n");
	for (int i = 0; i < sizeof(worker) / sizeof(employee*); i++)
	{
		printf("����%d�� �̸� : %s\n", i + 1, worker[i].name);
		printf("����%d�� ��ȭ��ȣ : %s\n", i + 1, worker[i].phone);
		printf("����%d�� ���޿� : %d\n", i + 1, worker[i].salary);
	}
}