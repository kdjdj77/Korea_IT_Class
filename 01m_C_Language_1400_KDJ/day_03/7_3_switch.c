/*
	3. switch���� �̿��� ������ ����
	1) switch
		switch���� �پ��� ������ �˻��� �� �ְ� ����� ���� ������ 
		�ϳ��� ������ ���Ŀ� ���� �پ��� ������ �˻��� �� ���.

		switch���� �⺻ ���´� ������ ����.
		switch(ǥ����)
		{
		case 1:
			ǥ���� ����� 1�� ��� ����� ����
			break;
		case 2:
			ǥ���� ����� 2�� ��� ����� ����
			break;
		default:
			ǥ���� ����� 2�� ��� ����� ����
			break;
		}

		switch���� ���ԵǴ� ǥ������ if���� ���ǰ� ������ ����.
		ǥ������ �����͸� ǥ���ϴ� ���� �Ǵ� ������ �ǹ��ϴµ�,
		�� ǥ������ ��ȯ�ϴ� ���� ���� switch�� ���� ����� ������ ����.

		case Ű���� ������ ���� ǥ��.
		ǥ������ ����� ��ȯ�Ǵ� ���� case�� ���� ��ġ�ϴ� ��쿡
		switch���� �ش� case ������ ���๮�� ����.
		case�� �������� ������ ���� ���� ���ϴ� ��ŭ case�� ���� ����.
		

	2) switch������ break�� ����
		Ű���� break�� switch���� �� ������ �����Ͽ� ǥ������ 
		�ᱣ���� �ش��ϴ� case ������ ����� �� �ֵ��� ���� ����.
		�׷��� switch������ break�� �ʼ� ��Ұ� �ƴϹǷ� ���� ����.

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_7_3() 
{
/*
	//1. switch
	int num = 4;
	printf("input some positive number : ");
	scanf("%d", &num);

	switch (num)
	{
	case 1:
		printf("num is %d\n", num);
		break;
	case 2:
		printf("num is %d\n", num);
		break;
	case 3:
		printf("num is %d\n", num);
		break;
	default:
		printf("bigger than 3\n");
		break;
	}
	printf("switch state end\n");
*/

/*
	//2. break in switch
	int num;
	printf("input some positive number : ");
	scanf("%d", &num);

	switch (num)
	{
	case 1:
	case 3:
	case 5:
		printf("odd\n");
		break;
	case 2:
	case 4:
	case 6:
		printf("even\n");
		break;
	default:
		printf("bigger than 6\n");
	}
	printf("switch state end.\n");
*/

/*	����1
	int num;
	printf("���� �Է� : ");
	scanf("%d", &num);

	if (num % 2 != 0)
	{
		printf("odd\n");
	}
	else printf("even\n");
*/

/*	����2
	int num;
	printf("���� �Է� : ");
	scanf("%d", &num);
	switch (num / 10)
	{
	case 10:
	case 9:
		printf("A\n");
		break;
	case 8:
		printf("B\n");
		break;
	case 7:
		printf("C\n");
		break;
	case 6:
		printf("D\n");
		break;
	default:
		printf("F\n");
	}
*/
}