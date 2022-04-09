/*
#include<stdio.h>
#include"NameCard.h"
#include"ArrayList.h"

int main(void)
{
	int input = 0;
	List list;
	LData data;
	ListInit(&list);					//1. 리스트 초기화
	while (input == 5)
	{
#ifndef 입력
		if (input == 1)
		{
			LInsert(&list, MakeNameCard("가가가", "11111111111"));//2. 데이터 저장
			LInsert(&list, MakeNameCard("나나나", "22222222222"));
			LInsert(&list, MakeNameCard("다다다", "33333333333"));

			printf("현재 데이터 수 : %d\n", LCount(&list));	//6. 프린트
		}
#endif
#ifndef 출력
		if (input == 2)
		{
			if (LFirst(&list, &data))			//3. 첫 번째 데이터인지 검사
			{
				ShowNameCardInfo(data);

				while (LNext(&list, &data))		//4. 다음 데이터 호출(Insert할 공간이 있는지 검사)
					ShowNameCardInfo(data);
			}
			printf("\n");
		}
#endif
#ifndef 변경
		if (input == 3)
		{
		printf("검색할 이름 : ");
		char* N, PH;
		puts(N);
		if (LFirst(&list, &data))
		{
			if (!NameCompare(data, N))
			{
				printf("중복된 이름 있음! 이름 검색 완료\n");	//5. 데이터 삭제'
				printf("변경된 전화번호 입력 : ");
				puts(PH);
				ChangePhonNum(data, PH);
			}
			while (LNext(&list, &data))
			{
				if (!NameCompare(data, N))
				{
					printf("중복된 이름 있음! 이름 검색 완료\n");
					printf("변경된 전화번호 입력 : ");
					puts(PH);
					ChangePhonNum(data, PH);
					break;
				}
			}
		}
#endif
#ifndef 삭제
		if (input == 4)
		{
			printf("삭제할 명함의 이름 입력 : ");
			puts(N);
			if (LFirst(&list, &data))
			{
				if (!NameCompare(data, N))
				{
					LRemove(&list);
					printf("중복된 이름 있음! 삭제 완료\n");	//5. 데이터 삭제'
				}
				while (LNext(&list, &data))
				{
					if (!NameCompare(data, N))
					{
						LRemove(&list);
						printf("중복된 이름 있음! 삭제 완료\n");
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