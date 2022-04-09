#include<stdio.h>
#include "ArrayList.h"

int main(void)
{
	List list;
	int data;
	ListInit(&list);					//1. 리스트 초기화

	LInsert(&list, 10);					//2. 데이터 저장
	LInsert(&list, 20);
	LInsert(&list, 30);
	LInsert(&list, 20);
	LInsert(&list, 20);
	
	printf("현재 데이터 수 : %d\n", LCount(&list));	//6. 프린트

	if (LFirst(&list, &data))			//3. 첫 번째 데이터인지 검사
	{
		printf("%d ", data);

		while (LNext(&list, &data))		//4. 다음 데이터 호출(Insert할 공간이 있는지 검사)
			printf("%d ", data);
	}
	printf("\n");
	
	if (LFirst(&list, &data))
	{
		if (data == 20) LRemove(&list);	//5. 데이터 삭제
		while (LNext(&list, &data))
		{
			if (data == 20) LRemove(&list);
		}
	}
	
	//삭제된 후의 남은 데이터 출력
	printf("현재 데이터 수 : %d\n", LCount(&list));	//6. 프린트
	if (LFirst(&list, &data))
	{
		printf("%d ", data);
		while (LNext(&list, &data))
			printf("%d ", data);
	}
	printf("\n");

	return 0;
}
