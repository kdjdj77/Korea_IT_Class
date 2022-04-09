#include<stdio.h>
#include<stdlib.h>

typedef struct _node
{
	int data;
	struct _node* link;
}node;

node* p_front, * p_rear;
node* p_node;

void InitQueue(void);		//Queue �ʱ�ȭ
void enQueue(int);			//data �Է�
int deQueue(void);			//data ����
void displayQueue(void);	//���

int main(void)
{
	int ret;
	InitQueue();

	enQueue(1);
	enQueue(14);
	enQueue(22);
	enQueue(27);
	enQueue(32);
	printf("enQueue()�Լ� ȣ���� ���\n");
	displayQueue();

	ret = deQueue();
	ret = deQueue();
	ret = deQueue();
	printf("deQueue()�Լ� ȣ���� ���\n");
	displayQueue();

	ret = deQueue();
	ret = deQueue();
	printf("deQueue()�Լ� ȣ���� ���\n");
	displayQueue();

	return 0;
}
void InitQueue(void)
{
	p_front = (node*)malloc(sizeof(node));
	p_rear = (node*)malloc(sizeof(node));
	p_front->link = p_rear;
	p_rear->link = p_front;
}
void enQueue(int num)
{
	p_node = (node*)malloc(sizeof(node));
	p_node->data = num;
	if (p_front->link == p_rear)	//�����Ͱ� �������� ������
	{
		p_front->link = p_node;
		p_node->link = p_rear;
		p_rear->link = p_node;
	}
	else
	{
		p_rear->link->link = p_node;
		p_node->link = p_rear;
		p_rear->link = p_node;
	}
}
int deQueue(void)
{
	int ret;
	node* del_node;

	if (p_front->link == p_rear)
		printf("Queue�� ��� �ֽ��ϴ�.\n");
	else
	{
		del_node = p_front->link;
		p_front->link = del_node->link;
		ret = del_node->data;
		printf("deQueue() : %d\n", ret);
		free(del_node);
	}
	return ret;
}
void displayQueue(void)
{
	node* p_tmp;
	if (p_front->link != p_rear)
	{
		for (p_tmp = p_front->link; p_tmp->link != p_rear; p_tmp = p_tmp->link)
		{
			printf("%d -> ", p_tmp->data);
		}
		printf("%d -> ", p_tmp->data);
	}
	else if (p_front->link == p_rear)
		printf("ť�� ��� �ֽ��ϴ�.");
	printf("\n");
}


/*�迭 Queue
#define MAX 100

//Queue ����
int Queue[MAX];
int Front, Rear;	//ó���� ��

void InitQueue(void);		//Queue �ʱ�ȭ
void enQueue(int);			//Queue �Է�
void displayQueue(void);	//���
int deQueue(void);			//Queue ����

int main(void)
{
	int ret;
	InitQueue();

	enQueue(1);
	enQueue(14);
	enQueue(22);
	enQueue(27);
	enQueue(32);
	printf("enQueue()�Լ� ȣ���� ���\n");
	displayQueue();

	ret = deQueue();
	ret = deQueue();
	ret = deQueue();
	printf("deQueue()�Լ� ȣ���� ���\n");
	displayQueue();

	return 0;
}
//Queue �ʱ�ȭ
void InitQueue(void)
{
	Front = Rear = 0;	//��� �迭�� 0���� �ʱ�ȭ
}
//data �Է�
void enQueue(int num)
{
	Queue[Rear++] = num;		//�����Ͱ� �߰��Ǹ� Rear�� ���� �ڷ� �з���
	if (Rear >= MAX) 		//Rear�� index�� �ִ밡 �Ǹ� 0
		Rear = 0;
}
//data ����
int deQueue(void)
{
	int ret;
	ret = Queue[Front++];		//�����Ͱ� �����Ǹ� Front�� ���� �ڷ� �з���
	if (Front >= MAX)		//Front�� index�� �ִ밡 �Ǹ� 0
		Front = 0;

	return ret;
}
//���
void displayQueue(void)
{
	printf("Front -> ");
	for (int i = Front; i < Rear; i++)
		printf("%d -> ", Queue[i]);
	printf("Rear\n");
}
*/
