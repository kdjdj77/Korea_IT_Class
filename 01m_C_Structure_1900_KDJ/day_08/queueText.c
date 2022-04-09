#include<stdio.h>
#include<stdlib.h>

typedef struct _node
{
	int data;
	struct _node* link;
}node;

node* p_front, * p_rear;
node* p_node;

void InitQueue(void);		//Queue 초기화
void enQueue(int);			//data 입력
int deQueue(void);			//data 삭제
void displayQueue(void);	//출력

int main(void)
{
	int ret;
	InitQueue();

	enQueue(1);
	enQueue(14);
	enQueue(22);
	enQueue(27);
	enQueue(32);
	printf("enQueue()함수 호출한 결과\n");
	displayQueue();

	ret = deQueue();
	ret = deQueue();
	ret = deQueue();
	printf("deQueue()함수 호출한 결과\n");
	displayQueue();

	ret = deQueue();
	ret = deQueue();
	printf("deQueue()함수 호출한 결과\n");
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
	if (p_front->link == p_rear)	//데이터가 존재하지 않으면
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
		printf("Queue가 비어 있습니다.\n");
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
		printf("큐가 비어 있습니다.");
	printf("\n");
}


/*배열 Queue
#define MAX 100

//Queue 선언
int Queue[MAX];
int Front, Rear;	//처음과 끝

void InitQueue(void);		//Queue 초기화
void enQueue(int);			//Queue 입력
void displayQueue(void);	//출력
int deQueue(void);			//Queue 삭제

int main(void)
{
	int ret;
	InitQueue();

	enQueue(1);
	enQueue(14);
	enQueue(22);
	enQueue(27);
	enQueue(32);
	printf("enQueue()함수 호출한 결과\n");
	displayQueue();

	ret = deQueue();
	ret = deQueue();
	ret = deQueue();
	printf("deQueue()함수 호출한 결과\n");
	displayQueue();

	return 0;
}
//Queue 초기화
void InitQueue(void)
{
	Front = Rear = 0;	//모든 배열을 0으로 초기화
}
//data 입력
void enQueue(int num)
{
	Queue[Rear++] = num;		//데이터가 추가되면 Rear가 점점 뒤로 밀려남
	if (Rear >= MAX) 		//Rear의 index가 최대가 되면 0
		Rear = 0;
}
//data 삭제
int deQueue(void)
{
	int ret;
	ret = Queue[Front++];		//데이터가 삭제되면 Front가 점점 뒤로 밀려남
	if (Front >= MAX)		//Front의 index가 최대가 되면 0
		Front = 0;

	return ret;
}
//출력
void displayQueue(void)
{
	printf("Front -> ");
	for (int i = Front; i < Rear; i++)
		printf("%d -> ", Queue[i]);
	printf("Rear\n");
}
*/
