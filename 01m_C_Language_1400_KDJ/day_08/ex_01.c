#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//문제 1
typedef struct _coffee
{
	char origin[100];
	int price;
	char barista[100];
}coffee;

//문제 2
typedef struct _employee
{
	char name[100];
	char phone[100];
	int salary;
}employee;

void main_ex()
{
/*문제 2
	employee em;
	printf("---입력---\n");
	printf("직원의 이름 : "); gets(em.name);
	printf("직원의 전화번호 : "); gets(em.phone);
	printf("직원의 월급여 : "); scanf("%d", &em.salary);
	
	printf("---출력---\n");
	printf("직원의 이름 : %s\n", em.name);
	printf("직원의 전화번호 : %s\n", em.phone);
	printf("직원의 월급여 : %d\n", em.salary);
*/
	//문제 3
	employee worker[3];
	printf("---입력---\n");
	for (int i = 0; i < sizeof(worker) / sizeof(employee); i++)
	{
		printf("직원%d의 이름 : ", i + 1);		gets(worker[i].name);
		printf("직원%d의 전화번호 : ", i + 1);	gets(worker[i].phone);
		printf("직원%d의 월급여 : ", i + 1);		scanf("%d", &worker[i].salary);
	}

	printf("---출력---\n");
	for (int i = 0; i < sizeof(worker) / sizeof(employee*); i++)
	{
		printf("직원%d의 이름 : %s\n", i + 1, worker[i].name);
		printf("직원%d의 전화번호 : %s\n", i + 1, worker[i].phone);
		printf("직원%d의 월급여 : %d\n", i + 1, worker[i].salary);
	}
}