/*
	1. if, else, else if�� �̿��� �帧�� �б�
	if Ű���带 ����� �ۼ��� if������ 
	else �Ǵ� else if Ű���带 �߰��� ����� ������ �� ����.
	�� Ű����� ���α׷��� �帧�� �پ��ϰ� �б��� �� �ֵ��� ������.

	1) if-else��
		else�� if�� ���� ���������� ������ ������ �� ����.
		��, if�� �־�� else�� ����� �� ����.
		if�� else�� ������ ������ if-else���̶�� �θ��� �⺻ ���´� ������ ����.

		if-else���� �⺻ ����
		if(����){			
			���� ���� �� ���� ���� 1;
			���� ���� �� ���� ���� 2;
		}
		else {
			������ �������� �ʴ� ��� ������ ���� 1;
			������ �������� �ʴ� ��� ������ ���� 2;
		}

		if-else������ if�� �ȿ� ���Ե� ������ ���̸� if���� �߰�ȣ �ȿ� �ִ� ������ ����.
		������ �����̸� else�� �߰�ȣ �ȿ� �ִ� ������ ����.
		if���� else�� ��� ����Ǵ� ��찡 ����.


	2) if-else if-else��
		�ռ� �н��� if-else���� ������ ���� ���ο� ���� 
		�� ���� �ڵ� ���(if�� �Ǵ� else��) �� �ϳ��� ��ϸ��� ������ �� �ִ� ����.
		���⿡ else if���� ����ϸ� ������ ���ϴ� ��ŭ �߰��� �� �ְ�,
		���α׷��� �帧�� �پ��ϰ� �б��ų �� ����.
		
		if-else if-else���� �⺻ ����
		if(����1){
			����1 ���� �� ���� ���� 1;
			����1 ���� �� ���� ���� 2;
		}
		else if(���� 2){
			����2 ���� �� ���� ���� 1;
			����2 ���� �� ���� ���� 2;
		}
		else {
			��� ������ �������� ���� ��� ���� ���� 1;
			��� ������ �������� ���� ��� ���� ���� 2;
		}

		���ǹ����� ������ ���� ���� ���, 
		��� �� ������ �����Ͽ� ����� �����ϸ�
		������ ���๮�� ������ �˻����� �ʰ� �ǳ� ��.
		
		���� ���� ���θ� ���������� �Ʒ��� Ȯ���ϱ⿡,
		������ �߸� ���� �Ǹ� ������� �ǵ��� �ٸ� ����� ���� �� ����.


	3) else�� �����ϱ�
		�ռ� �ۼ��� ���� �� if�� �ܵ����� ����� ���ǹ��� �����ϸ�,
		��� ���ǹ����� else���� ���ԵǾ� �־���.
		�׷��� ���ǹ����� else���� else if���� ���������� �ʼ� ��Ұ� �ƴϹǷ� ���� ����.



	4) ��ø if��
		if���� �� ��ü�� �ϳ��� ����.
		���� if�� �߰�ȣ ���� ���๮���� �� �ٸ� if���� ������ �� ����.
	
		��ø if���� �⺻ ����
		if (���� 1) {
			if (���� 2) {
				������ ��� ������ ��� ������ ����
			}
		}

		


*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void main_7_2() 
{
	//1. if-else
	char alphabet = 'C';

	if (alphabet == 'B')
	{
		printf("alphabet is B.\n");
	}
	else
	{
		printf("alphabet is not B\n");
	}

	//2. if - else if - else
	//������ Ƚ���� �ٿ��� ���ӵ��� ������ �ϴ°� ���
	if (alphabet == 'A')
	{
		printf("alphabet is A.");
		printf("I like apple\n");
	}
	else if (alphabet == 'B')
	{
		printf("alphabet is B.");
		printf("I like banana\n");
	}
	else if (alphabet == 'C')
	{
		printf("alphabet is C.");
		printf("I like carrot\n");
	}
	else
	{
		printf("I hate fruit and vegetables\n");
	}

/*
	//3. else�� ����
	int num = 10;
	printf("input your number : ");
	scanf("%d", &num);

	if (num == 2)
	{
		printf("your number is 2\n");
	}
	else if (num == 4)
	{
		printf("your number is 4\n");
	}
	else if (num == 8)
	{
		printf("your number is 8\n");
	}
*/

	//if �� if-else�� ����
	int num = 10;
	if (num > 8)
	{
		printf("your number is bigger than 8\n");
	}
	if (num > 4)
	{
		printf("your number is bigger than 4\n");
	}
	if (num > 2)
	{
		printf("your number is bigger than 2\n");
	}

	//4. ��ø if
	int num_01 = 5, num_02 = 8;
	//ù ��° if�� ������ ��
	if (num_02 > 5) // (num_02 > 5) && (num_01 == 5)
	{
		if (num_01 == 5)
		{
			printf("The first if state!\n");
		}
	}
	//ù ��° if�� ������ ����
	if (num_02 < 5) // (num_02 < 5) && (num_01 == 5)
	{
		if (num_01 == 5)
		{
			printf("The second if state!\n");
		}
	}
}