/*
struct(����ü)

struct arrayList 
{
	 ���� 1;
	 ���� 2;
	 ���� 3;
};
//����ü ��� ���� : ���� �ٸ� ������ ���� �������� �ϳ��� ��� ���
int a;						//������ ���� a
int a[] = {10, 20, 3.05}	// �Ұ�(������ �迭�̱� ����)

//student : �̸�(����), ����(����), �ּ�(����), ��ȭ��ȣ(����)
//student�� �����ϱ� ���� ����ü ���

����ü�� �±� �̸� : ����ü�� �ĺ��ϱ� ���� �ĺ��� (����ü �Ű������� ������ �������� �ĺ�)
struct student	// student�� ����ü�� �±׸�
{
	char name[20];
	int age;
	char address[30];
	char number[15];
	int kor;
	int eng;
	float avg;
};

����ü�� ũ�� 
sizeof(struct grade);	//(O)	struct �±׸����� ũ�⸦ ���� �� �ִ�.
sizeof(grade);			//(X)	�±׸����δ� ����� �� ����
struct grade	//
{
	int kor;
	int eng;
	int math;
	float avg;
};

struct student st;	//����ü student�� ������ �־�� �޸𸮿� �Ҵ�
����ü ����.������� �� ����Ѵ�. (ex st.name)

*/

#include <stdio.h>

struct address		//char[20] = 20����Ʈ x2, int 4����Ʈ => 44����Ʈ
{
	char name[20];
	char phone[20];
	int bellSound;
}addr;	//����ü ����

void main_1(void)
{
	printf("address ����ü�� ũ��� = %d\n", sizeof(struct address));
	struct address addr = { 0 };	//����ü ���� add�� �޸𸮿� �Ҵ� + 0���� �ʱ�ȭ
	addr.name; //����ü�±׸�.������� �� ������ ����
}
//����ü ������� ������ �� ����ü �������� �̿��Ͽ� ����ü�� ����