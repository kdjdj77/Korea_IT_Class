/*
	1. if, else, else if를 이용한 흐름의 분기
	if 키워드를 사용해 작성한 if문에는 
	else 또는 else if 키워드를 추가해 기능을 보완할 수 있음.
	각 키워드는 프로그램의 흐름을 다양하게 분기할 수 있도록 도와줌.

	1) if-else문
		else는 if문 없이 독립적으로 문장을 구성할 수 없음.
		즉, if가 있어야 else를 사용할 수 있음.
		if와 else로 구성된 구문을 if-else문이라고 부르며 기본 형태는 다음과 같음.

		if-else문의 기본 형태
		if(조건){			
			조건 만족 시 실행 문장 1;
			조건 만족 시 실행 문장 2;
		}
		else {
			조건을 만족하지 않는 경우 실행할 문장 1;
			조건을 만족하지 않는 경우 실행할 문장 2;
		}

		if-else문에서 if절 안에 삽입된 조건이 참이면 if절의 중괄호 안에 있는 문장이 실행.
		조건이 거짓이면 else절 중괄호 안에 있는 문장이 실행.
		if절과 else절 모두 실행되는 경우가 없음.


	2) if-else if-else문
		앞서 학습한 if-else문은 조건의 만족 여부에 따라 
		두 개의 코드 블록(if절 또는 else절) 중 하나의 블록만을 실행할 수 있는 구조.
		여기에 else if절을 사용하면 조건을 원하는 만큼 추가할 수 있고,
		프로그램의 흐름을 다양하게 분기시킬 수 있음.
		
		if-else if-else문의 기본 형태
		if(조건1){
			조건1 만족 시 실행 문장 1;
			조건1 만족 시 실행 문장 2;
		}
		else if(조건 2){
			조건2 만족 시 실행 문장 1;
			조건2 만족 시 실행 문장 2;
		}
		else {
			모든 조건이 만족하지 않을 경우 실행 문장 1;
			모든 조건이 만족하지 않을 경우 실행 문장 2;
		}

		조건문에서 조건이 여러 개인 경우, 
		어느 한 조건을 만족하여 블록을 실행하면
		나머지 실행문의 조건은 검사하지 않고 건너 뜀.
		
		조건 만족 여부를 위에서부터 아래로 확인하기에,
		순서를 잘못 적게 되면 사용자의 의도와 다른 결과가 나올 수 있음.


	3) else절 생략하기
		앞서 작성한 예제 중 if를 단독으로 사용한 조건문을 제외하면,
		모든 조건문에는 else절이 포함되어 있었음.
		그러나 조건문에서 else절은 else if절과 마찬가지로 필수 요소가 아니므로 생략 가능.



	4) 중첩 if문
		if문은 그 자체로 하나의 구문.
		따라서 if문 중괄호 안의 실행문에는 또 다른 if문을 포함할 수 있음.
	
		중첩 if문의 기본 형태
		if (조건 1) {
			if (조건 2) {
				조건을 모두 만족할 경우 실행할 문장
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
	//연산의 횟수를 줄여서 계산속도를 빠르게 하는것 고려
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
	//3. else절 생략
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

	//if 와 if-else의 차이
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

	//4. 중첩 if
	int num_01 = 5, num_02 = 8;
	//첫 번째 if의 조건이 참
	if (num_02 > 5) // (num_02 > 5) && (num_01 == 5)
	{
		if (num_01 == 5)
		{
			printf("The first if state!\n");
		}
	}
	//첫 번째 if의 조건이 거짓
	if (num_02 < 5) // (num_02 < 5) && (num_01 == 5)
	{
		if (num_01 == 5)
		{
			printf("The second if state!\n");
		}
	}
}