#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

#include "ArrayList.h"
#include "NameCard.h"

int main(void) {
	List list;
	NameCard* pCard;
	ListInit(&list);

	pCard = MakeNameCard("홍길동", "010-1234-5678");
	LInsert(&list, pCard);

	pCard = MakeNameCard("이순신", "010-1234-1234");
	LInsert(&list, pCard);

	pCard = MakeNameCard("손오공", "010-5678-5678");
	LInsert(&list, pCard);

	if (LFirst(&list, &pCard)) {
		if (!NameCompare(pCard, "이순신")) {
			ShowNameCardInfo(pCard);
		}
		else {
			while (LNext(&list, &pCard)) {
				if (!NameCompare(pCard, "이순신")) {
					ShowNameCardInfo(pCard);
					break;
				}
			}
		}
	}

	if (LFirst(&list, &pCard)) {
		if (!NameCompare(pCard, "이순신")) {
			ChangePhoneNum("이순신", "010-5467-8741");
		}
		else {
			while (LNext(&list, &pCard)) {
				if (!NameCompare(pCard, "이순신")) {
					ChangePhoneNum("이순신", "010-5467-8741");
					break;
				}
			}
		}
	}

	// 정보 조회 후 삭제
	if (LFirst(&list, &pCard)) {
		if (!NameCompare(pCard, "이순신")) {
			pCard = LRemove(&list);
			free(pCard);
		}
		else {
			while (LNext(&list, &pCard)) {
				if (!NameCompare(pCard, "이순신")) {
					pCard = LRemove(&list);
					free(pCard);
					break;
				}
			}
		}
	}


	printf("현재 데이터 수: %d\n", LCount(&list));
	if (LFirst(&list, &pCard)) {
		ShowNameCardInfo(pCard);

		while (LNext(&list, &pCard))
			ShowNameCardInfo(pCard);
	}
	return 0;
}

