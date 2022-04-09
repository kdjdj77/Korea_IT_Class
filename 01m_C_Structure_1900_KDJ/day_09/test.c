#include<stdio.h>

struct list
{
	int num;
	struct list* next;
};

int main_ex(void)
{
	struct list a = { 10, 0 }, b = { 20, 0 }, c = { 30, 0 };
	struct list* head = &a, * current;

	a.next = &b;
	b.next = &c;

	printf("head->num : %d\n", head->num); //10
	printf("head->next->num : %d\n", head->next->num); //20

	return 0;
}
