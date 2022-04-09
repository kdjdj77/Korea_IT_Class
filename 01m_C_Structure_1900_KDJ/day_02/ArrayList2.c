//배열 리스트의 자료 저장하는 저장단위를 정의
typedef struct arrayListNodeType
{
	char data;
}arrayListNode;

//이 노드를 가지고 자료를 저장하는 실제 배열 리스트 정의
typedef struct arrayListType
{
	int maxCount;
	int currentCount;
	arrayListNode* pData;
}arrayList;

//배열 리스트 구현 createList(), 메모리에 할당
arrayList *createList(int count) 
// count : 배열의 길이값, *createList : 함수 포인터, arrayList : 리턴값
{//arrayList 타입을 반환하고 int count를 인자로 받는 함수 포인터
	arrayList *pReturn = (arrayList*)malloc(sizeof(arrayList));
	//arrayListType 구조체를 가리키는 포인터 pReturn 정의
	//크기는 arrayList의 크기와 같음
	pReturn->maxCount = count;
	//배열의 길이값 초기화
	//pReturn이 가리키는 구조체의 maxCount는 인자로 받은 Count
	pReturn->currentCount = 0;
	//배열생성시 값 초기화
	//pReturn이 가리키는 구조체의 currentCount는 0
	pReturn->pData = (arrayListNode*)malloc(sizeof(arrayListNode*) * count);
	//pReturn이 가리키는 구조체의 pData(포인터)는 arrayListNode의 크기 * count
	//Node의 크기 * count가 pReturn의 pData 크기값(최대 바이트)이 된다.
	memset(pReturn->pData, 0, sizeof(arrayListNode) * count);
	//pData의 메모리를 0으로 초기화시켜라
	return 0;
}
//pData는 arrayListNode(char)를 가리킨다 -> 1바이트


/*
			  position	<== 자료를 추가하려는 위치
			  	  i		<== 마지막 자료의 위치 값
		+-----------------------|
		|						|			no
		|	  			  i > position?	--------------------+
		|						|yes						|
		|						|							|
		|	위치에 있는 자료를 (i + 1)의 위치로 이동(복사)		|
		|						|							|
		|						|							|
		+----------------- i <== i - 1						|
															|
															|
				  위치 position에 새로운 자료 추가  ----------+
								|							
								|							
							  종 료

*/
//데이터 자료 추가 = 현재 currentCount가 몇인지 항상 알고 들어가야 한다.
//(현재 데이터가 존재하는지 Null인지, currentCount == maxCount인지)
int addListData(arrayList* pList, int position, int data)
{
	int i = 0;
	for (i = pList->currentCount - 1; i >= position; i--)	// i >= position이면 반복
	{
		pList->pData[i + 1] = pList->pData[i];
	}
	pList->pData[position].data = data; // 위치 position에 새로운 자료 추가
	pList->currentCount++;

	return 0;
}


/*
		   40
			↓
+-------+-------+-------+-------+-------+-------+-------+
|  10	|  20	|  30	|		|		|		|		|
|		|		|		|		|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
|   0	|   1	|   2	|   3	|   4	|   5	|	6	|
+-------+-------+-------+-------+-------+-------+-------+

40을 index 1에 넣고 싶다
-> currentCount의 값을 currentCount + 1 index에 넣음
-> currentCount - 1의 값을 currentCount index에 넣음
-> 40을 currentCount -1 index에 넣음
*/

//1. createList함수를 함수 포인터로 사용하는 이유
//2. addListData 해석

