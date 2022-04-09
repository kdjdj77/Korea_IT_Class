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
	struct address addr = { "홍길동", "01011112222", 0 };
	struct address addr1 = { 0 }, addr2 = { 0 };

	addr.bellSound = 5;
	strcpy(addr.phone, "01022223333"); // 01022223333을 addr.phone에 복사(대입)
	//scanf("&s", addr.name);
	//scanf("&s", addr.phone);
	//scanf("&d", addr.bellSound);
	printf("이 름 : %s\n", addr.name);
	printf("전화번호 : %s\n", addr.phone);
	printf("벨소리 : %d\n", addr.bellSound);

}