#include <stdio.h>
#include <string.h>

struct address
{
	char name[20];
	char phone[20];
	int bellSound;
};

void main_2(void)
{
	struct address addr = { "ȫ�浿", "01011112222", 0 };
	struct address addr1 = { 0 }, addr2 = { 0 };

	addr.bellSound = 5;
	strcpy(addr.phone, "01022223333"); // 01022223333�� addr.phone�� ����(����)
	//scanf("&s", addr.name);
	//scanf("&s", addr.phone);
	//scanf("&d", addr.bellSound);
	printf("�� �� : %s\n", addr.name);
	printf("��ȭ��ȣ : %s\n", addr.phone);
	printf("���Ҹ� : %d\n", addr.bellSound);

}