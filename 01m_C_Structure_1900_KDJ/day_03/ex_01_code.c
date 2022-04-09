
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
/*
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
//---------------------------------------------------------------------
//연결 리스트에 새로운 데이터 추가
