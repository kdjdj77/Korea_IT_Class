/*
	4. ��Ÿ ���
	��Ÿ ����� �ݺ��� � �߰��Ǿ� �������� ������ �ϴ� Ű�����
	����ڰ� �ڵ带 ������ �°� �ۼ��ϴ� �� ���Ǽ��� ���� ��.

	1) break
		break�� ���� ���� ���� �ڵ� ����� ���� �����ϴ� ����
		switch���� ���Ե� case ���� �ܿ��� while, for�� �� �ݺ�����
		���� ������ ���� ��� ����.

	2) continue
		continue�� �ݺ������� 
		'������ �ڵ带 �����ϰ� �ݺ����� ó������ ���ư���'��� �ǹ̷� ���.
		���⼭ �ݺ����� ó���̶� �ڵ��� ù �κ��� �ƴ� ���ǽ��� �˻��ϴ� �ݺ����� ���� ù �ܰ�.
	

	3) return
		return�� �Լ� ���� �Էµż� �ش� �Լ��� ȣ���� ������ �����͸� ��ȯ�ϴ� ����
		�Ǵ�, �Լ��� ���Ḧ �˸��� ���.

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_8_4() 
{
	//1. break
	for (int num = 1; num < 10; num++)
	{
		if ((num % 3) == 0)
		{
			break;
		}
		printf("%d ", num);
	}
	printf("\n");
	//2. continue
	for (int num = 1; num < 10; num++)
	{
		if ((num % 3) == 0)
		{
			continue;
		}
		printf("%d ", num);
	}
	printf("\n");
	//3. return
	for (int num = 1; num < 10; num++)
	{
		if ((num % 3) == 0)
		{
			return;
		}
		printf("%d ", num);
	}
	printf("\n");
}