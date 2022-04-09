#include<stdio.h>
#include<stdlib.h>

//stack ��� ����
typedef struct _node
{
	int data;
	struct _node* next;
}node;

node* head,* end;
node* pNode;

void Init_stack(void);		//���� �ʱ�ȭ �Լ�
void push(int);				//data �Է�
void display_stack(void);	//ȭ�� ���
int pop(void);				//����

int main_stackTest(void)
{
	int ret;
	Init_stack();

	push(1);
	push(2);
	push(10);
	push(15);
	push(21);

	printf("push() �Լ� ȣ���Ͽ� ���� ��� ����\n");
	display_stack();

	ret = pop();
	ret = pop();
	ret = pop();

	printf("pop() �Լ� ȣ���Ͽ� ���� ��� ����\n");
	display_stack();

	return 0;
}
//���� �ʱ�ȭ �Լ�
void Init_stack(void)
{
	head = (node*)malloc(sizeof(node));	//head node �Ҵ�
	end = (node*)malloc(sizeof(node));	//end node �Ҵ�
	head->next = end;					//head�� ����Ű�� node == end
	end->next = end;					//end�� ����Ű�� node == end
}
//data �Է�
void push(int num)
{
	pNode = (node*)malloc(sizeof(node));//�ӽ� ��� pNode �Ҵ�
	pNode->data = num;					//pNode->data�� num �� ����
	pNode->next = head->next;			//pNode�� ����Ű�� node == head�� ����Ű�� node
										//(head �ڸ��� pNode�� ��ġ)
	head->next = pNode;					//head�� ����Ű�� node == pNode
										//(head ���� ��带 pNode��)
}
//����
int pop(void)
{
	int ret;						//������ int ���� ret ����
	pNode = head->next;				//head�� ����Ű�� ��带 pNode�� ����
	head->next = head->next->next;	//head�� �ٴ��� node�� head�� ���� node�� ��
									// end -> ��1 -> ��2 -> head�� �����Ǿ� �ֱ� ������
									// head->next�� ��2 �ڸ��� ��1�� �־� ��2 ����
	ret = pNode->data;				//ret�� ������ ����� data�� ����
	free(pNode);					//pNode ����

	return ret;
}
//ȭ�� ���
void display_stack(void)
{
	node* currNode;
	printf("head -> ");

	for (currNode = head->next; currNode != end; currNode = currNode->next)
		printf("%d -> ", currNode->data);
	printf("end\n");
}