#include<stdio.h>
#include<stdlib.h>

//stack 노드 선언
typedef struct _node
{
	int data;
	struct _node* next;
}node;

node* head,* end;
node* pNode;

void Init_stack(void);		//스택 초기화 함수
void push(int);				//data 입력
void display_stack(void);	//화면 출력
int pop(void);				//삭제

int main_stackTest(void)
{
	int ret;
	Init_stack();

	push(1);
	push(2);
	push(10);
	push(15);
	push(21);

	printf("push() 함수 호출하여 나온 결과 값은\n");
	display_stack();

	ret = pop();
	ret = pop();
	ret = pop();

	printf("pop() 함수 호출하여 나온 결과 값은\n");
	display_stack();

	return 0;
}
//스택 초기화 함수
void Init_stack(void)
{
	head = (node*)malloc(sizeof(node));	//head node 할당
	end = (node*)malloc(sizeof(node));	//end node 할당
	head->next = end;					//head가 가리키는 node == end
	end->next = end;					//end가 가리키는 node == end
}
//data 입력
void push(int num)
{
	pNode = (node*)malloc(sizeof(node));//임시 노드 pNode 할당
	pNode->data = num;					//pNode->data에 num 값 넣음
	pNode->next = head->next;			//pNode가 가리키는 node == head가 가리키는 node
										//(head 자리에 pNode가 위치)
	head->next = pNode;					//head가 가리키는 node == pNode
										//(head 다음 노드를 pNode로)
}
//삭제
int pop(void)
{
	int ret;						//임의의 int 변수 ret 선언
	pNode = head->next;				//head가 가리키는 노드를 pNode에 복사
	head->next = head->next->next;	//head의 다다음 node가 head의 다음 node가 됨
									// end -> 값1 -> 값2 -> head로 설정되어 있기 때문에
									// head->next인 값2 자리에 값1을 넣어 값2 삭제
	ret = pNode->data;				//ret에 삭제된 노드의 data값 복사
	free(pNode);					//pNode 해제

	return ret;
}
//화면 출력
void display_stack(void)
{
	node* currNode;
	printf("head -> ");

	for (currNode = head->next; currNode != end; currNode = currNode->next)
		printf("%d -> ", currNode->data);
	printf("end\n");
}