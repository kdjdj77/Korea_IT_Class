/*
ArrayList.c

NameCard.h

1. 3���� ��ȭ��ȣ ������, ArrayList.c���� �����Ѵ�.
2. �̸����� �˻��Ѵ�. ������ ����ϰ� �ȴ�.
3. �̸��� ������� �˻��Ͽ� ������ ����, ������ �����ϰ� �Ѵ�.
4. ��� ������ ���

====================================================================

stack(LIFO : Last In First Out)
+-------+-------+-------+------------
|	A	|	B	|	C	|	D		�� push
|		|		|		|			�� pop
+-------+-------+-------+------------
stack[0]				stack[3]

data A, B, C, D������ insert
������ ������ D, C, B, A ����

s[0]	s[1]	s[2]	s[3]
+-------+-------+-------+-------+----
|	10	|	20	|	30	|	40	|	(Top = 4)
|		|		|		|		|
+-------+-------+-------+-------+----
								��
							Top = 3(���ÿ��� ���� ���� ��ġ)

stack�� Top�� ��ġ�� Ȯ���Ͽ� ������ Ȯ���Ѵ�.

==================================================================

stack : 1. push(st, A)
(���)	2. pop(st)
		   peek()

typedef struct _ArrayStackNodeType
{
	char data;	//int data;
}ArrayStackNode;

�迭�� ���� ����
1. �迭�� ����
2. ���� ���̰�
3. �ڷḦ �����ϱ� ���� ������ ����

typedef struct _ArrayStackType
{
	int maxCount;		//stack �迭 ����Ʈ�� �ִ� ���̰�
	int currentCount	//���� ����� �ڷ��� ����
	ArrayStackNode* pData;
}ArrayStack;

s[0]	s[1]	s[2]	s[3]
+-------+-------+-------+-------+----
| Node	| Node	| Node	| Node	|	int maxCount
|(first)|		|		|		|	int currentCount
+-------+-------+-------+-------+----
	��
int maxCount
int currentCount
ArrayStackNode* pData
					��
				  Node
				+-------+
				| char	|
				|		|
				+-------+

�迭�̱� ������ �迭 ����Ʈ�� ������ ������ ����.
typedef struct _ArrayListNodeType
{
	char data;	//int data;
}ArrayListNode;

typedef struct _ArrayStackType
{
	int maxCount;		//�迭 ����Ʈ�� �ִ� ���̰�
	int currentCount	//���� ����� �ڷ��� ����
	ArrayListNode* pData;
}ArrayList;

================================================================
								���� �ڷḦ �߰��� ���(currentCount)
s[0]	s[1]	s[2]	s[3]		��
+-------+-------+-------+-------+-------+-------+-------+
|	10	|	20	|	30	|	40	|		|		|		|
|		|		|		|		|		|		|		| �� maxCount - 1
+-------+-------+-------+-------+-------+-------+-------+
							��
						���� Top(currentCount - 1)

Stack : ������ ������ �Ա��� �ϳ� (LIFO)
		1. push	: �����͸� �׾Ƴ��´�.
		2. pop	: �����͸� ���� ���� ��

================================================================
stack	1) array
		2) Linked

node�� ������ �迭 ����Ʈ == stack ����Ʈ == Queue ����Ʈ


+-------+-------+-------+-------+-------+-------+-------+
|	10	|	20	|	30	|	40	|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
| link	| link	| link	| link	|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
	��						��
  first					   end

================================================================
//stack Data ����
typedef struct _node
{
	int data;
	struct _node* pLink;
}node;

//stack Data �ʱ�ȭ
void Init_Stack(void)
{
	first = (node*)malloc(sizeof(node));	//����	(head)
	end = (node*)malloc(sizeof(node));		//��		
	first->pLink = end;	//�ʱ�ȭ �ܰ��̱� ������ data�� ����
	end->pLink = end;	//�ϳ��� node�� first, end�� �ֱ� ������
						//first �� end, end �� end �� ����Ų��
}

//push �Լ�
void push(int num)
{
	node = (node*)malloc(sizeof(node));
	p_node->data = num;		//node�� link�� access �� �� �ִ� p_node
	p_node->next = end->pLink;
	end->pLink = p_node;
}

//���ο� �����Ͱ� ������ ��
p_node->pLink = end->pLink;	//p_node(�� ���)�� link = end
end->pLink = p_node;		//end�� link = p_node(�� ���)

int pop(void)
{
	int ret;
	p_node = first->pLink;				//pLink�� p_node�� ����Ű���� �Ѵ�
	first->pLink = end->pLink->pLink;	//pLink = pLink
	ret = p_node->data;
	free(p_node);
	return ret;
}

================================================================
================================================================
Queue
				FIFO
		--------+-------+-------+--------
	��		A	|	B	|	C	|	D		��
	��			|		|		|			��
		--------+-------+-------+--------
	front								rear

Queue <==> Stack

��ť : ������ �Է�
��ť : ������ ��������

list / Stack / Queue(array)

�迭 ť
���� ����Ʈ ť


*/