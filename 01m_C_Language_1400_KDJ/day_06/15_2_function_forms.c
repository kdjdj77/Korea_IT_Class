/*
	2. 함수의 형태
	1) 함수의 4가지 형태
		함수는 이름을 정하고, 매개 변수를 통해 입력값을 결정하고, 
		반환값의 자료형을 결정 후 기능을 정의하는 과정으로 진행.
		그런데 경우에 따라서 다음 두 가지는 사용 여부 변경 가능.

		(1) 함수가 호출될 때 전달되어야 하는 값(입력값)
		(2) 함수로부터 반환되는 값(반환값)

		위 두 가지는 목적에 맞게 사용 여부를 결정할 수 있으며,
		이를 바탕으로 함수 형태를 네 가지로 구분.

		(1) 입력값과 반환값이 모두 있는 경우.
		
		(2) 입력값만 존재하는 경우.
			함수 정의 시 매개변수를 선언해야 함.
			그러나 반환값이 존재하지 않기에 반환값의 자료형이 필요하지 않음.
			이때는 반환형을 void로 선언해 '반환하지 않는다'라는 사실을 명시.
			return 키워드가 존재하지 않음.

			ex)
			void printNumber(int num) {
				printf("당신이 입력한 정수는 %d입니다\n", num);
			}

		(3) 반환값만 존재하는 경우.
			앞서 void가 '반환하지 않는다'라는 의미로 사용되었는데
			void가 매개변수 자리에 사용되면 '인자를 입력받지 않는다(전달받지 않는다)'는 의미.
			
			ex)
			정의
			int inputNumber(){
				int num;
				printf("정수를 입력해주세요: ");
				scanf("%d", &num);
				return num;
			}

			호출
			inputNumber();


		(4) 입력값과 반환값이 모두 없는 경우.
			void는 '반환하지 않는다'와 '인자를 전달받지 않는다'는 의미를 모두 지님.
			void는 매개변수 자리와 반환형 자리에 동시에 삽입 가능.

			ex)
			void guide() {
				printf("inputNumber 함수를 통해 정수 입력 가능\n");
				printf("또한 printNumber 함수를 통해 입력한 정수 출력 가능\n");
			}
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void guide()
{
	printf("inputNumber 함수를 통해 정수 입력 가능\n");
	printf("또한, printNumber함수를 통해 입력한 정수 출력 가능\n");
}

void printNumber(int num)
{
	printf("당신이 입력한 정수는 %d 입니다.\n", num);
}

int inputNumber()
{
	int num = 0;
	//scanf("%d", &num);
	return num;
}

void main_15_2()
{
	guide();
	int num = inputNumber();
	printNumber(num);
	num = inputNumber();
	printNumber(num);
}