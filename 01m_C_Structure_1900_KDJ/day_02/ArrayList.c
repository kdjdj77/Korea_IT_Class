/*
리스트 / 스택 / 큐 / 트리 / 힙 / 정렬 ...

리스트 : 가장 많이 사용 ( 배열, 연결 )
		순서대로 자료를 저장하는 구조 ( 선형구조 )
		+---+---+---+---+
		|---+---+---+---+---> ( 순차적인 방향 )
		+---+---+---+---+
		리스트는 중간에 비어있으면 비정상적인 오류를 발생한다.

순서 없이 순차적으로 데이터가 들어온다

+---+
|	|	data Node
+---+

선형구조는 무조건 한 방향으로만 연결될 수 있다.
두 방향 이상 연결 = 비선형

자료를 어떤 구조로 만들 것인가
10, 20, 30
손쉽게 정리할 수 있는 방법 = 배열
+---+---+---+---+---+---+
|10 |20 |30 |   |   |   |
+---+---+---+---+---+---+
리스트는 누가 먼저 들어오는지는 중요하지 않다. 순서만 정하는 것
저장은 빈 곳 없이 차곡차곡 쌓이지만 사용하는 순서는 다름.

자료(Data) : 특정한 값
자료형(Data Type) : 자료를 처리하기 위한 명령 혹은 연산

int ( 정수형 ) 10 (data 값)
정수 자료형	: 자료(Data)			ex) 10, 20, 5, 4 ...
			  자료형(Data Type)	ex) +, -, *, / ...

배열 리스트 : C언어에서 사용되는 배열을 가지고 자료의 리스트를 구성

노드 : 자료(Data)를 저장하는 단위
	  C언어의 구조체(struct)를 이용하여 노드를 선언
	  저장되는 자료를 내부 멤버 변수로 가진다.

  Node
+-------+					struct NodeType
| data	| --> struct		{
|		|						int data;
+-------+					};
struct로 Node를 만드는 이유
: 구조체로 노드를 선언하면 한 개 혹은 그 이상의 
자료형을 저장할 수 있기 때문(문자, 정수, 포인터 ...)

//배열 리스트의 자료 저장하는 저장단위를 정의
typedef struct arrayListNodeType
{
	int data;
}arrayListNode;

		  arrayListNodeType
			 +--------+
			 |int data|
			 +--------+
이 노드를 가지고 자료를 저장하는 실제 배열 리스트 정의
+-------+-------+-------+---+
| data	| data	| data	|	|
|		|		|		|	|
+-------+-------+-------+---+
|   0	|   1	|   2	|...| <-- max count - 1
+-------+-------+-------+---+

arrayList를 통해서
1. maxCount		(최대 자료 개수)
2. currentCount	(현재 자료 개수)
3. 자료 저장을 위한 배열 포인터(*pData)
를 알 수 있다.

typedef struct arrayListNodeType
{
	int data;
}arrayListNode;

typedef struct arrayListType
{
	int maxCount;			//배열의 크기
	int currentCount;		//현재 자료 개수
	arrayListNode *pData;	//자료 저장을 위한 포인터 변수 선언
}arrayList;

//linkedList 내용
//typedef struct linkedListNodeType
//{
//	int data;
//	linkedListNodeType *pData;
//}LinkedListNode;
//
//		  linkedListNodeType
//			+--------+--+
//			|int data| ●|
//			+--------+--+
//구조체 linkedListNodeType은 int형 data와 포인터를 갖는다
*/