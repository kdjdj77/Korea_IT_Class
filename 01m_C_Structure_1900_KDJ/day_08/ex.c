/*
ArrayList.c

NameCard.h

1. 3명의 전화번호 정보를, ArrayList.c에서 구현한다.
2. 이름으로 검색한다. 정보를 출력하게 된다.
3. 이름을 대상으로 검색하여 정보를 변경, 삭제도 가능하게 한다.
4. 모든 정보를 출력

====================================================================

stack(LIFO : Last In First Out)
+-------+-------+-------+------------
|	A	|	B	|	C	|	D		← push
|		|		|		|			→ pop
+-------+-------+-------+------------
stack[0]				stack[3]

data A, B, C, D순서로 insert
나가는 순서는 D, C, B, A 순서

s[0]	s[1]	s[2]	s[3]
+-------+-------+-------+-------+----
|	10	|	20	|	30	|	40	|	(Top = 4)
|		|		|		|		|
+-------+-------+-------+-------+----
								↓
							Top = 3(스택에서 가장 높은 위치)

stack은 Top의 위치를 확인하여 공간을 확인한다.

==================================================================

stack : 1. push(st, A)
(노드)	2. pop(st)
		   peek()

typedef struct _ArrayStackNodeType
{
	char data;	//int data;
}ArrayStackNode;

배열의 스택 구조
1. 배열의 길이
2. 현재 길이값
3. 자료를 저장하기 위한 포인터 변수

typedef struct _ArrayStackType
{
	int maxCount;		//stack 배열 리스트의 최대 길이값
	int currentCount	//현재 저장된 자료의 개수
	ArrayStackNode* pData;
}ArrayStack;

s[0]	s[1]	s[2]	s[3]
+-------+-------+-------+-------+----
| Node	| Node	| Node	| Node	|	int maxCount
|(first)|		|		|		|	int currentCount
+-------+-------+-------+-------+----
	↑
int maxCount
int currentCount
ArrayStackNode* pData
					↓
				  Node
				+-------+
				| char	|
				|		|
				+-------+

배열이기 때문에 배열 리스트와 스택의 구성이 같다.
typedef struct _ArrayListNodeType
{
	char data;	//int data;
}ArrayListNode;

typedef struct _ArrayStackType
{
	int maxCount;		//배열 리스트의 최대 길이값
	int currentCount	//현재 저장된 자료의 개수
	ArrayListNode* pData;
}ArrayList;

================================================================
								새로 자료를 추가할 노드(currentCount)
s[0]	s[1]	s[2]	s[3]		↓
+-------+-------+-------+-------+-------+-------+-------+
|	10	|	20	|	30	|	40	|		|		|		|
|		|		|		|		|		|		|		| ← maxCount - 1
+-------+-------+-------+-------+-------+-------+-------+
							↓
						현재 Top(currentCount - 1)

Stack : 나가고 들어오는 입구는 하나 (LIFO)
		1. push	: 데이터를 쌓아놓는다.
		2. pop	: 데이터를 갖고 오는 것

================================================================
stack	1) array
		2) Linked

node의 구조는 배열 리스트 == stack 리스트 == Queue 리스트


+-------+-------+-------+-------+-------+-------+-------+
|	10	|	20	|	30	|	40	|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
| link	| link	| link	| link	|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
	↓						↓
  first					   end

================================================================
//stack Data 구조
typedef struct _node
{
	int data;
	struct _node* pLink;
}node;

//stack Data 초기화
void Init_Stack(void)
{
	first = (node*)malloc(sizeof(node));	//시작	(head)
	end = (node*)malloc(sizeof(node));		//끝		
	first->pLink = end;	//초기화 단계이기 때문에 data가 없다
	end->pLink = end;	//하나의 node에 first, end가 있기 때문에
						//first → end, end → end 를 가리킨다
}

//push 함수
void push(int num)
{
	node = (node*)malloc(sizeof(node));
	p_node->data = num;		//node의 link에 access 할 수 있는 p_node
	p_node->next = end->pLink;
	end->pLink = p_node;
}

//새로운 데이터가 들어왔을 때
p_node->pLink = end->pLink;	//p_node(새 노드)의 link = end
end->pLink = p_node;		//end의 link = p_node(새 노드)

int pop(void)
{
	int ret;
	p_node = first->pLink;				//pLink를 p_node도 가리키도록 한다
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
	←		A	|	B	|	C	|	D		←
	←			|		|		|			←
		--------+-------+-------+--------
	front								rear

Queue <==> Stack

인큐 : 데이터 입력
디큐 : 데이터 가져오기

list / Stack / Queue(array)

배열 큐
연결 리스트 큐


*/