/*	
	2. do-while���� ���� �ݺ�
	1) do-while���� Ư¡
		while���� do-while���� ���� ū �������� �ٷ� '���ǿ� ���� �˻簡 �̷������ ����'
		while���� ���ǿ� ���� �˻縦 ���� ���� �����ϰ� �ݺ� ���θ� �����ϴ� �ݸ�,
		do-while���� ���ǿ� ���� �˻縦 ���� �������� ����.
	
		do-while���� �⺻ ����

		do{
			�����ϰ��� �ϴ� ����
		}while(����);


		ex)
		num = 1;
		do {
			printf("%d", num);
			num++;
		} while(num < 3);
	

	2) do-while���� �ʿ��� ���
		do-while���� ���๮�� ���� �� ������ �˻��ϱ� ������ 
		�ݵ�� 1ȸ �̻� ���๮�� ����Ǿ�� �ϴ� ���α׷��� ����ϴ� ���� ����.

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_8_2() 
{
/*
	//example 01
	int num = -1;

	do
	{
		printf("-1 �Է½� ���� : ");
		scanf("%d", &num);
	} 
	while (num != -1);
*/

	//example 02
	int number = 0;
	int sum = 0;

	do {
		number++;
		sum += number;
	} while (number < 10);

	printf("1~10������ �� : %d\n", sum);
}