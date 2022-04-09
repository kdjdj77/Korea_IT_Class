
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
//LinkedList�� ����
LinkedList* CreateLinkedList()
{
	LinkedList *pReturn = (LinkedList *)malloc(sizeof(LinkedList));
	memset(pReturn, 0, sizeof(LinkedList));
	return pReturn;
}
//----------------------------------------------------------------------
//����� ����Ʈ�� ���� �������� ��
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
				pCurrentNode	<-	 ��� ���
					  i		 	<-		0			//0�� ��� ���� ��� ����
		+-----------------------|
		|						|			no
		|	  			  i < position?	--------------------+
		|						|yes						|
		|						|							|
		|	  pCurrtneNode <- pCurrentNode�� ���� ��� 		|
		|						|							|
		|						|							|
		+----------------- i <- i + 1						|
															|
															|
				  pCurrentNode->data ��ȯ	----------------+
								|
								|
							  �� ��
*/
//---------------------------------------------------------------------
//���� ����Ʈ�� ���ο� ������ �߰�
