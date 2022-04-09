/*
	1. �޸� ���� �Ҵ�
	1) malloc �Լ�
		�޸� ������ �� �������� �Ҵ��ϴ� ǥ�� �Լ�.

		����
		#include <stdlib.h>	// malloc�� ����ϱ� ���ؼ��� stdlib.h ��� �ʿ�
		malloc(size);		// ���ڷ� �Ҵ��ϰ��� �ϴ� �޸� ������ ũ�⸦ ����Ʈ ������ ���� ����.
		
		int* numPtr = (int*)malloc(sizeof(int));
		
		malloc �Լ��� �Ҵ�� �޸� ������ �ּڰ� ��ȯ.
		��ȯ�Ǵ� ������ Ÿ���� void��.
		���� malloc �Լ��κ��� ��ȯ�� �����͸� �������� ������ 
		�����ϱ� ���ؼ��� ��ȯ���� ���� �� ��ȯ ���.
		
		malloc �Լ��� ���� �Ҵ�� �޸� ������ ����ڰ� �����ϰų� 
		���α׷��� ����Ǵ� ��찡 �ƴϸ� ����ؼ� �޸𸮿� ��������.
		������ ���� �� �� ���� �޸� �ּҸ� �����ϴ� free�Լ��� ȣ���ؾ� ��.

		free(numPtr)

		free �Լ��� ȣ������ �ʾƵ� ���α׷��� ����Ǹ� �޸� ������ ����.
		���� ���α׷������� �޸��� ������ �Ҹ��� ����ϰ� �߻��ϴ� ��찡 �����Ƿ�
		���� ������ ��������� ��.


	2) ���� ���� ���� �ذ�


	3) ��Ÿ ���� �Ҵ� �Լ�
		�޸� ���� �Ҵ� �� malloc �Լ��� ���� ���� ���.
		�ܿ��� �ٸ� ���� �Ҵ� �Լ��� Ž��.

		(1) calloc �Լ�			
			calloc �Լ��� ���ڷ� �Ҵ��ϰ��� �ϴ� �޸� ������ ������ �� �޸� ������ ũ�⸦ ���޹���.
			ũ�� ������ ����Ʈ�̸�, malloc �Լ��� ���������� �Ҵ�� �޸� ������ �ּڰ��� void�� �����ͷ� ��ȯ.
			malloc�Լ��� ���ڸ� �����ϴ� ��Ŀ��� ���̸� ��������, ��������� ������ ���� ����.
			�ٸ� malloc �Լ��� �޸� ������ ������ ������ �ʱ�ȭ���� ������,
			calloc �Լ��� ��� ��Ʈ�� 0���� �ʱ�ȭ.

			����
			calloc(����, ũ��)

			������
			malloc(sizeof(int) * 30);
			calloc(30, sizeof(int));


		(2) realloc �Լ�
			malloc �Լ��� calloc �Լ��� ������ ���� �ٸ� ���� �Ҵ� �Լ�.
			realloc �Լ��� �� ������ �Ҵ�Ǿ� �ִ� �޸� ������ ũ�⸦ �����ϴ� ���.
			realloc �Լ��� ���ڷ� Ȯ���ϰ��� �ϴ� �޸� ������ 
			�ּڰ��� ���Ҵ�� �޸� ũ�⸦ ���ڷ� ���� ����.
			������ ũ�⿡ ���� �Ҵ��� ��ġ�� ���� �ش� 
			�޸� ������ �ּڰ��� void�� �����ͷ� ��ȯ.
			realloc �Լ��� ���� �޸� ũ�⸦ Ȯ���� ���� ���� �޸� �ּ� �ڿ� Ȯ��.
			�׷��� ���� �Ҵ�� �޸� ���� �ڿ� Ȯ���� ������ �˳����� ������ 
			���ο� �޸� �ּҿ� ���Ӱ� �Ҵ�.

			����
			realloc(������, ���ο� ũ��);

*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//char* getString();

void main_18_2()
{
//1. malloc
	int* iptr = (int*)malloc(sizeof(int) * 5);
	double* dptr = (double*)malloc(sizeof(double) * 3);

	//�Ҵ�� �޸� ������ i * 10��ŭ �� �Ҵ�
	for (int i = 0; i < 5; i++)
		iptr[i] = 10 * (i + 1);	
	for (int i = 0; i < 5; i++)
		printf("%d ", iptr[i]);
	printf("\n");

	dptr[0] = 3.14;
	dptr[1] = 4.31;
	dptr[2] = 1.43;
	printf("%g %g %g\n", dptr[0], dptr[1], dptr[2]);

	//�� ���� �޸� ����
	if (iptr != NULL) free(iptr);
	if (dptr != NULL) free(dptr);

/*2. �������� ���� �ذ�
	char* result = getString();
	printf("�����ϴ� �ܾ�� : %s\n", result);
	if (result != NULL) free(result);
*/
/*3. ��Ÿ �����Ҵ� �Լ�
	int* ptr;
	int count = 0;
	int maxSize = 3;
	int num;

	ptr = (int*)calloc(maxSize, sizeof(int));
	while (1)
	{
		printf("������ �Է��ϼ��� (-1 �Է� �� ����) : ");
		num = -1; //scanf("%d", &num);
		if (num == -1) break;
		if (count == maxSize)	//�Է��� ������ ������ �޸� ũ�� ��ŭ á�� ���
		{
			maxSize += maxSize;
			//���Ҵ��� ���� �޸� ���� Ȯ��
			ptr = (int*)realloc(ptr, maxSize * sizeof(int));
		}
		//����ڰ� �Է��� ������ �� ���� �޸� �ʱ�ȭ
		ptr[count++] = num;
	}
	for (int i = 0; i < count; i++) printf("%d ", ptr[i]);
	printf("\n");

	if (ptr != NULL) free(ptr);
*/
/*���� 1
	char* s1 = "Take a look!";
	char* s2 = (char*)malloc(sizeof(char) * 20);
	strcpy(s2, s1);
	printf("%s\n", s2);
	if (s2 != NULL) free(s2);
*/
/*���� 2
	int input;
	int count2 = 0;
	scanf("%d", &input);
	char* str = (char*)malloc(sizeof(char) * (input + 1));
	scanf("%s", str);
	for (int i = 0; i < input; i++)
		if (str[i] == 97) count2++;
	printf("%d", count2);
	if (str != NULL) free(str);
*/
}

/*
char* getString()
{
	char str[100];
	char* str = (char*)malloc(sizeof(char) * 100);
	printf("�����ϴ� �ܾ��? : ");
	gets(str);

	return str;
*/
