#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include "NameCard.h"

NameCard* MakeNameCard(char* name, char* phone) {
	NameCard* newCard = (NameCard*)malloc(sizeof(NameCard));
	strcpy(newCard->name, name);
	strcpy(newCard->phone, phone);
	return newCard;
}

void ShowNameCardInfo(NameCard* pCard) {
	printf("[�̸�] %s \n", pCard->name);
	printf("[��ȭ��ȣ] %s \n", pCard->phone);
}

int NameCompare(NameCard* pCard, char* name) {
	return strcmp(pCard->name, name);
}

void ChangePhoneNum(NameCard* pCard, char* phone) {
	strcpy(pCard->phone, phone);
}