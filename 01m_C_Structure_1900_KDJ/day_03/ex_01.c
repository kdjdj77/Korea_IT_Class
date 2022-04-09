/*
-----------------------데이터 추가-------------------------
				   40					currentCount
					↓						v
+-------+-------+-------+-------+-------+-------+-------+
|  10	|  20	|  30	|  40	|  50	|  60	|		|
|		|		|		|		|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
|   0	|   1	|   2	|   3	|   4	|   5	|	6	|
+-------+-------+-------+-------+-------+-------+-------+

40을 index 2에 넣고 싶다
-> currentCount의 값을 currentCount + 1 index에 넣음
-> currentCount - 1의 값을 currentCount index에 넣음
-> ... 총 4번
-> 40을 currentCount -3 index에 넣음
-> currentCount ++ (자료를 추가해서 자료의 개수가 늘었기 때문)

1. maxCount()		: 길이				= 8
2. currentCount()	: 현재 인덱스		= 5
3. 포인터 변수		: 접근하기 위해 필요	

-----------------------데이터 삭제-------------------------
			  삭제(position)			   currentCount
					↓						v
+-------+-------+-------+-------+-------+-------+-------+
|  10	|  20	|  30	|  40	|  50	|  60	|		|
|		|		|		|		|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
|   0	|   1	|   2	|   3	|   4	|   5	|	6	|
+-------+-------+-------+-------+-------+-------+-------+

index 2의 값을 삭제하고 싶다
-> position + 1의 값을 position에 넣음
-> position + 2의 값을 position + 1 에 넣음
-> ... 총 3번
-> currentCount의 index 자료 삭제
-> currentCount -- (자료를 삭제해서 자료의 개수가 줄었기 때문)

1. maxCount()		: 길이				= 8
2. currentCount()	: 현재 인덱스		= 5
3. 포인터 변수		: 접근하기 위해 필요


------------------------배열 리스트(선형 리스트)-----------------------

1. 배열의 길이값 존재(데이터의 제한)
2. 메모리의 비효율성

+-----------+-----------+-------+-------+-------+-------+-------+
|int data;	|  20		|  30	|  40	|  50	|  60	|		|
|char ch;	|			|		|		|		|		|		|
+-----------+-----------+-------+-------+-------+-------+-------+
|   0		|   1		|   2	|   3	|   4	|   5	|	6	|
+-----------+-----------+-------+-------+-------+-------+-------+

------------------------연결 리스트(포인터)----------------------------

					   dummy node(header node) : 기준 node (데이터 없이 NULL만 존재)
					  +-------+---+
					  |  \    |NU |
					  |	  \	  |LL |
					  +-------+---+
							↓
						데이터 추가
			 header node	↓				↙새로 추가된 첫 노드
			+-------+---+		+-------+---+
			|  \	| ●-+------>| data	|NU	|
			|	\	|	|		|		|LL	|
			+-------+---+		+-------+---+				//node의 개수 : 1
							↓
						데이터 추가
							↓						↙새로 추가된 두번째 노드
+-------+---+		+-------+---+		+-------+---+
|  \	| ●-+------>| data	| ●-+------>| data	|NU	|
|	\	|   |		|		|   |		|		|LL	|
+-------+---+		+-------+---+		+-------+---+		//node의 개수 : 2

typedef struct LinkedListNodeType
{
	int data;
	struct LinkedListNodeType *pLink;
}LinkedListNode;

typedef struct LinkedListType
{
	int currentCount;
	LinkedListNode headerNode;
}LinkedList;						

/////여기까지 녹화 완료(헤더 노드 만드는 것)/////

----------------------------------------------------------------------

Node 개수 : 0	  새로 추가된 첫 노드		2번째 자료
+-------+---+		+-------+---+		+-------+---+
|  \	| ●-+------>| 10	| ●-+------>| 20	|NU	|
|	\	|   |		|		|   |		|		|LL	|
+-------+---+		+-------+---+		+-------+---+
		  ↑			index 0	  ↑			index 1
		  |					  |
인덱스 0인 자료의 주소		  |
					인덱스 1인 자료의 주소

typedef struct LinkedListNodeType
{
	int data;
	struct LinkedListNodeType *pLink;
}LinkedListNode;

typedef struct LinkedListType
{
	int currentCount;
	LinkedListNode headerNode;
}LinkedList;
//----------------------------------------------------------------------
//LinkedList의 생성
LinkedList* CreateLinkedList()
{
	LinkedList *pReturn = (LinkedList *)malloc(sizeof(LinkedList));
	memset(pReturn, 0, sizeof(LinkedList));
	return pReturn;
}
//----------------------------------------------------------------------
//연결된 리스트의 값을 가져오는 것
int getLinkedListData(LinkedList *pList, int position)
{
	int i = 0;
	LinkedListNode *pCurrentNode = &(pList->headerNode);
	for(i = 0; i < position; i ++)
	{
		pCurrentNode = pCurrentNode->pLink;
	}
	return pCurrentNode->data;
}

				pCurrentNode	<-	 헤더 노드
					  i		 	<-		0			//0을 헤더 노드로 잡고 실행
		+-----------------------|
		|						|			no
		|	  			  i < position?	--------------------+
		|						|yes						|
		|						|							|
		|	  pCurrtneNode <- pCurrentNode의 다음 노드 		|
		|						|							|
		|						|							|
		+----------------- i <- i + 1						|
															|
															|
				  pCurrentNode->data 반환	----------------+
								|
								|
							  종 료
---------------------------------------------------------------------
//연결 리스트에 새로운 데이터 추가

				pCurrentNode	<-	 헤더 노드
					  i		 	<-		0			//0을 헤더 노드로 잡고 실행
		+-----------------------|
		|						|			no
		|	  			  i < position?	--------------------+
		|						|yes						|
		|						|							|
		|	  pCurrtneNode <- pCurrentNode의 다음 노드 		|
		|						|							|
		|						|							|
		+----------------- i <- i + 1						|
															|
															|
				  pCurrentNode->data 반환	----------------+
								|
								|
							  종 료
*/