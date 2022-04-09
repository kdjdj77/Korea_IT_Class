/*
	3. 문자열 변수 표현
	1) 배열의 문자열 저장
		C언어에서는 큰따옴표("")를 이용해서 문자열 표현.
		문자열이란 문자 여러 개가 나란히 나열되어 있는 데이터를 의미.

		ex)
		"Hello. World"

		C 언어에서 문자열을 저장할 때는 char형 배열을 선언 후 저장.
		위 문자열을 배열에 저장하기 위해 다음과 같은 코드 작성

		ex)
		char greet[] = "Hello, World";

		위에서 문자열을 구성하고 있는 문자의 개수는 총 12개.
		그러나 sizeof 연산자를 사용해 실제 길이 정보를 확인해보면 13.
		이는 오류가 아니라 C 언어가 문자열을 표현할 때 문자열을 구성하는
		문자의 맨 마지막에 '\0'이라는 문자를 삽입하기 때문
		이 때, 마지막에 삽입된 '\0' 문자를 가리켜 '널(Null) 문자'라고 함.
		Null은 데이터 없음을 나타내며, 문자열이 사용될 때 문자열의 끝이라는 의미로 사용.
		따라서 문자열을 저장하기 위해 char형 배열을 선언할 때,
		널 문자가 차지할 공간까지 고려해서 배열의 길이를 결정해야야 함.


	2) 널 문자와 문자열
		다음과 같이 배열의 길이와 실제 문자의 개수가 다른 문자열이 있다고 가정.
		
		ex) 
		char goodbye[50] = "Good bye";

		50칸 공간 중 실제 필요한 공간은 9칸이고, 문자열 끝에는 널 문자가 삽입.

		널 문자는 문자열의 끝을 표시. 
		printf 함수로 문자열을 출력할 때도 널 문자 기준으로 출력 진행.
		문자열은 형식 문자 %s를 사용해 출력.

		ex)
		printf("%s\n", goodbye);
		
		위 예시에서 printf 함수는 "Good bye"라는 문자열 출력.
		printf 함수는 char형 배열에서 널 문자가 나올 때까지만 출력하도록 설계.


	3) 문자열의 입력과 출력
		(1) printf 함수를 통한 문자열의 출력
			printf 함수로 문자열을 출력할 때는 널 문자로 문자열의 종료를 알릴 수 있음.

		(2) scanf 함수를 통한 문자열의 입력
			scanf함수를 통한 입력은 공백 문자(스페이스, 탭, 엔터 등)로 인해 종료.
			문자열을 입력할 때는 & 연산자를 사용하지 않음.
			문자열 입력이 종료되면 문자열 끝에 널 문자가 자동으로 삽입.


*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main_9_3() 
{
	//1. 배열의 문자열 저장
	char greet[] = "Hello, World";
	printf("%s\n", greet);
	printf("1차원 배열 greet의 길이는 %d\n", sizeof(greet));

	//2. 널 문자와 문자열
	char goodbye[50] = "Good bye";
	printf("%s\n", goodbye);
	printf("1차원 배열 goodbye의 길이는 %d\n", sizeof(goodbye));
	printf("%d\n", goodbye[8]);

	//3-1. printf 함수를 통한 문자열 출력
	char mind[30] = "I Love Programming";
	printf("%s\n", mind);

	mind[7] = '\0';
	printf("%s\n", mind);	//8번째 요소에 널 문자 삽입

	mind[1] = '\0';
	printf("%s\n", mind);	//2번째 요소에 널 문자 삽입
/*
	//3-2. scanf 함수를 통한 문자열 입력
	char str[50];

	printf("문자열을 입력하세요 : ");
	scanf("%s", str);	//연산자 &를 사용하지 않음

	printf("입력된 문자열 : %s\n", str);
	printf("%p", str);
*/
	//문제 1
/*
	char c[50];
	scanf("%s", c);
	for (int i = 0; i < 50; i++)
	{
		if (c[i + 1] == '\0')
		{
			printf("%c", c[i]);
			break;
		}
		if (c[i] > c[i + 1]) c[i + 1] = c[i];
	}
*/
/*
	char c[50], answer = 0;
	scanf("%s", c);
	for (int i = 0; i < 50; i++)
	{
		if (answer < c[i]) answer = c[i];	//max 보다 문자열의 i 번째 ascii가 크면 갱신
		if (c[i] == '\0') break;			//문자열이 \0을 만나면 반복문 종료
	}
	printf("%c\n", answer);
*/
}