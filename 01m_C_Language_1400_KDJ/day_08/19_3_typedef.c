/*
	3. typedef ����
	1) typedef ����
		typedef ������ ������ �����ϴ� �ڷ����� �� �̸��� �ο��ϴ� ��.
		���� �̸��� ���ο� �̸����� ����� ���� �ƴ϶� �� �̸��� �߰��� ���� ��.
		���� int �ڷ����� ���ο� �̸����� INTEGER��� �̸��� ���̰� �ʹٸ�
		������ ���� ���� ����.
		
		��� ��
		typedef int INTEGER;
		
		���� ���� ���� �� INTEGER�� �ڵ� ������ int�� ������ ���� ����.
		�׷��� �̸��� ����� ���� �ƴ϶� �� �̸��� �߰��� ������
		������ int�� ����� ������ ���� ����.

		typedef ���� ��ġ�� ������ �ִ� ���� �ƴϳ� �Ϲ������� ���α׷� ���� ��ġ�� �����ϴ� ��찡 ����.


	2) ����ü�� typedef
		����ü �̸��� typedef ���� ����� �� �� ����.
		���ǵ� ����ü�� typedef�� �����ϰ�, ���Ӱ� �ٿ��� �̸����� ���� ����.

		��� ��
		struct point {
			int x;
			int y;
		}
		typedef struct point POINT;

		����ü�� typedef ���� �ÿ��� struct ������ ����.
		typedef�� struct point�� �� �̸��� �ο������Ƿ�
		���� ����ü ������ ������ �� struct Ű���� ���� ����.
		���� ���� ����ü�� typedef ������ ��ģ �Ŀ��� ������ ����
		����ü ���� ���� ����.
		
		���� ��		
		POINT position = {30, 60};

		
		����ü�� ���� typedef ������ ������ ���� ���·ε� ����.
		
		���ʿ��� ������ ������ typedef ���� ��
		typedef struct {
			int x;
			int y;
		} POINT;

		�� ������ �ռ� ���캻 ����ü�� ���� typedef ����� ����.
		�ٸ� ���⼭�� POINT��� �̸� �ܿ��� ����ü ������ ������ ����� ����.

		
		�ٸ� �Ϲ����� ���� ������ ���� ����
		�Ϲ��� ��
		typedef struct _POINT {
			int x;
			int y;
		} POINT;
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

//1. typedef
typedef int INT;
typedef int* PINT;
typedef unsigned int UINT;

//2. ����ü�� typedef
typedef struct _POINT
{
	int x;
	int y;
}POINT;

struct person2
{
	char name[30];
	int age;
};
typedef struct person2 PERSON; //���ǵ� ����ü�� ���� typedef ����

typedef struct _Employee
{
	char name[30];
	int salary;
}Employee;

void main_19_3()
{
	//���� ������ ����� �ڷ��� �̸��� ���� ����
	typedef char CHAR;
	typedef char* STR;

	//typedef ���� ���� �ڷ����� ���� �ڷ����� ������ ���� ����
	INT num = 3;
	PINT ptr = &num;
	UINT unum = 5;

	CHAR ch = 'c';
	STR str = "Hello!";

	printf("%d %d %d\n", num, *ptr, unum);
	printf("%c %s\n", ch, str);

	POINT position = { 30, 60 };
	PERSON saram = { "�����", 10 };
	Employee worker = { "�ٷ���", 100000000 };

	printf("X : %d, Y : %d\n", position.x, position.y);
	printf("�̸� : %s, ���� : %d\n", saram.name, saram.age);
	printf("�̸� : %s, ���� : %d\n", worker.name, worker.salary);
}