/*
struct Ű���带 ������ �� �ְ� ���ִ� Ű���� : typedef
struct address
{
	char name[20];
	char phone[20];
	int bellSound;
};
typedef struct address addr;
//��>��� 1
typedef struct address
{
	char name[20];
	char phone[20];
	int bellSound;
}addr;
//��>��� 2
address ct = {"ȫ�浿", "01044445555", 2};

������ ����
�Լ� ������
�迭 ������
����ü ������(->)

����ü�� ����� �ٸ� ����ü ���� ���
typedef struct point	//���� ��ǥ
{
	int x, y;
}po;

typedef struct line		//����
{
	po start, end;		//�ٸ� ����ü ������ ��� ������ ����
}li;

li ln1 = { { 10, 20 }, { 30, 40 } }; //start, end
//��> ln1.start.x = 10 / ln1.start.y = 20 / ln1.end.x = 30 / ln1.end.y = 40
*/

#include <stdio.h>
#include <string.h>
#include <math.h>

typedef struct point
{
	int x, y;
}po;

typedef struct line
{
	po start, end;
}li;

double get_length(const li* ln);

void main_3(void)
{
	li ln1 = { { 10, 20 }, { 30, 40 } };

	printf("������ ������ : (%d, %d)\n", ln1.start.x, ln1.start.y);
	printf("������ ���� : (%d, %d)\n", ln1.end.x, ln1.end.y);
	printf("������ ���� : %0.2f\n", get_length(&ln1));
}

double get_length(const li* ln)
{
	int dx = ln->end.x - ln->start.x;
	int dy = ln->end.y - ln->start.y;
	return sqrt(dx * dx + dy * dy);
}