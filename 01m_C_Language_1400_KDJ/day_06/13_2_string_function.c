/*
	2. 문자열 관련 함수
	1) 문자 단위 입출력 함수
		C언어는 scanf와 printf함수 외에도 다양한 표준 입출력 함수 제공.
		문자 단위 입출력 함수로는 putchar, getchar함수가 존재.

		ex)
		putchar(출력할 문자);
		getchar();
		
		putchar 함수는 사용자로부터 문자형 또는 정수형 데이터를 전달받아
		전달된 문자 정보를 출력하는 표준 출력 함수.
		getchar 함수는 키보드로부터 하나의 문자를 입력받아 입력 데이터를
		반환하는 표준 입출력 함수.



	2) 문자 입력 종료하기
		C언어에는 EOF라는 상수 존재. 
		이는 End Of File을 의미하는 표준 상수로 문자 입력 시 문자 입력이 종료되었음을 나타냄.
		앞서 학습한 getchar 함수는 문자의 입력을 담당하는데 
		다음 두 상황에서 getchar 함수는 EOF 반환.
		(1) 함수 호출 실패: 읽어 들일 데이터가 없는 경우.
		(2) 윈도우에서 ctrl + z 또는 맥이나 리눅스에서 ctrl + d가 입력되는 경우

		F는 C언어 프로그램에서 텍스트 파일을 읽어 들일 때 파일의 끝을 표현하기 위해 사용.
		그러나 우리는 파일이 아닌 키보드 입력을 통해 문자를 입력하므로 ctrl + z를 입력해 EOF 반환.



	3) 문자열 단위 입출력 함수
		문자열 단위 입출력 함수로는 puts 함수와 gets 함수가 존재.

		ex) 문자열 단위 입출력 함수
		puts(출력할 문자열);
		gets(pointer);

		puts 함수는 인자로 전달되는 문자열 출력.
		gets 함수는 키보드로 입력되는 문자열을 인자로 전달된 주소에 저장.
		이때 입력되는 문자열 끝에 자동으로 널 문자 삽입.

		puts 함수가 호출되면 문자열을 출력 후 자동으로 줄 바꿈.
		따라서 형식 문자가 없는 문자열 출력 시 puts 함수는 printf함수의 대체 함수로 사용 가능.


	4) 문자열 처리 함수
		C언어는 문자열을 다양한 방법으로 처리할 수 있도록 여러 종류의 표준 함수 제공.
		해당 함수를 사용하기 위해서 다음 코드를 입력.

		#include <string.h>
		
		문자열 처리 표준 함수는 대부분 string.h라는 헤더 파일 내에 선언.
		따라서 이를 포함시켜야만 관련 함수 사용 가능.
		아래 표는 string 헤더 내 주요 함수
		
		함수						기능
		strlen(str)					인자로 전달된 주소의 문자열에서 널 문자를 제외한 문자열 길이 반환.
		strcpy(str1, str2)			두 번째 인자로 전달된 주소의 문자열을 첫 번째 인자의 주소에 복사.
		strncpy(str1, str2, count)	두 번째 인자로 전달된 주소의 문자열을 첫 번째 인자의 주소에 복사하되 
									원하는 개수 만큼만 복사.
		strcat(str1, str2)			두 번째 인자로 전달된 주소의 문자열을 첫 번째 인자로 전달된 주소의 문자열에 이어 붙이기.
		strncat(str1, str2, count)	두 번째 인자로 전달된 주소의 문자열을 첫 번째 인자로 전달된 주소의 
									문자열에 이어 붙이되 
									원하는 개수 만큼만 이어 붙이기.
		strcmp(str1, str2)			인자로 전달된 두 문자열을 비교하여 내용이 같으면 0을,
									같지 않으면 0이 아닌 값을 반환

									str1이 str2와 같은 문자열이면 0
									str1이 str2보다 알파벳 순서로 앞서 있다면 음수 반환
									str1이 str2보다 알파벳 순서로 뒤에 있다면 양 반환
									
		strncmp(str1, str2, count)	인자로 전달된 두 문자열을 비교하되 각 문자열의 앞에서부터 원하는 개수 만큼만 비교.						
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

void main_13_2() 
{
//1. 문자 단위 입출력 함수
/*
	int ch1, ch2, ch3;

	ch1 = getchar();
	ch2 = getchar();
	ch3 = getchar();

	putchar(ch1);
	putchar(ch2);
	putchar(ch3);
*/
//2. 문자 입력 종료하기
/*
	int ch;

	while (1)
	{
		ch = getchar();
		if (ch == EOF)
		{
			break;
		}
		putchar(ch);
	}
*/
//3. 문자열 단위 입출력 함수
/*
	char ch[30];
	gets(ch);
	puts(ch);
	printf("이 문자열은 다음 줄에서 출력됨.\n");
*/
//4. 문자열 처리 함수

//example 01
	char str1[50] = "apple is good";
	char str2[50] = "berry is good";
	char* str3 = "banana is good";
	char str4[50];
	
	//문자열 길이 출력
	printf("str1의 길이 : %d\n", strlen(str1));
	printf("str2의 길이 : %d\n", strlen(str2));
	printf("str3의 길이 : %d\n", strlen(str3));

	//str1의 내용 전체를 str4에 복사
	strcpy(str4, str1);

	//str1의 내용 중 다섯 글자를 str2에 복사
	strncpy(str2, str1, 5);

	printf("%s\n%s\n%s\n", str1, str2, str4);

//example 02
	char str5[50] = "Michael ";
	char str6[50] = "Michael ";

	//str1에 문자열 이어붙이기
	strcat(str5, "Bolton");
	printf("%s\n", str5);

	//str2에 문자열 이어붙이기
	strncat(str6, "Jackson Five", 7);
	printf("%s\n", str6);

	//str1과 str2 비교
	printf("비교 결과 : %d\n", strcmp(str5, str6));

	//str1과 str2 앞 7개 문자만 비교
	printf("비교 결과 : %d\n", strncmp(str5, str6, 7));

//문제 1
/*
	char name1[50], name2[50];
	gets(name1); gets(name2);

	if (strcmp(name1, name2) == 0) printf("같습니다\n");
	else printf("같지 않습니다\n");
*/
//문제 2
/*
	char strr[50];
	int sum = 0;
	printf("문자열 입력 : ");
	gets(strr);

	for (int i = 0; i < strlen(strr); i++)
	{
		if (strr[i] >= 48 && strr[i] <= 57)
			sum += strr[i] - 48;
	}
	printf("숫자의 합은 : %d", sum);
*/
}