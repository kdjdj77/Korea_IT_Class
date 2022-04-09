#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

#include "ArrayList.h"
#include "NameCard.h"

int main(void) {
	List list;
	NameCard* pCard;
	ListInit(&list);

	pCard = MakeNameCard("ȫ�浿", "010-1234-5678");
	LInsert(&list, pCard);

	pCard = MakeNameCard("�̼���", "010-1234-1234");
	LInsert(&list, pCard);

	pCard = MakeNameCard("�տ���", "010-5678-5678");
	LInsert(&list, pCard);

	if (LFirst(&list, &pCard)) {
		if (!NameCompare(pCard, "�̼���")) {
			ShowNameCardInfo(pCard);
		}
		else {
			while (LNext(&list, &pCard)) {
				if (!NameCompare(pCard, "�̼���")) {
					ShowNameCardInfo(pCard);
					break;
				}
			}
		}
	}

	if (LFirst(&list, &pCard)) {
		if (!NameCompare(pCard, "�̼���")) {
			ChangePhoneNum("�̼���", "010-5467-8741");
		}
		else {
			while (LNext(&list, &pCard)) {
				if (!NameCompare(pCard, "�̼���")) {
					ChangePhoneNum("�̼���", "010-5467-8741");
					break;
				}
			}
		}
	}

	// ���� ��ȸ �� ����
	if (LFirst(&list, &pCard)) {
		if (!NameCompare(pCard, "�̼���")) {
			pCard = LRemove(&list);
			free(pCard);
		}
		else {
			while (LNext(&list, &pCard)) {
				if (!NameCompare(pCard, "�̼���")) {
					pCard = LRemove(&list);
					free(pCard);
					break;
				}
			}
		}
	}


	printf("���� ������ ��: %d\n", LCount(&list));
	if (LFirst(&list, &pCard)) {
		ShowNameCardInfo(pCard);

		while (LNext(&list, &pCard))
			ShowNameCardInfo(pCard);
	}
	return 0;
}

