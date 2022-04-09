//�迭 ����Ʈ�� �ڷ� �����ϴ� ��������� ����
typedef struct arrayListNodeType
{
	char data;
}arrayListNode;

//�� ��带 ������ �ڷḦ �����ϴ� ���� �迭 ����Ʈ ����
typedef struct arrayListType
{
	int maxCount;
	int currentCount;
	arrayListNode* pData;
}arrayList;

//�迭 ����Ʈ ���� createList(), �޸𸮿� �Ҵ�
arrayList *createList(int count) 
// count : �迭�� ���̰�, *createList : �Լ� ������, arrayList : ���ϰ�
{//arrayList Ÿ���� ��ȯ�ϰ� int count�� ���ڷ� �޴� �Լ� ������
	arrayList *pReturn = (arrayList*)malloc(sizeof(arrayList));
	//arrayListType ����ü�� ����Ű�� ������ pReturn ����
	//ũ��� arrayList�� ũ��� ����
	pReturn->maxCount = count;
	//�迭�� ���̰� �ʱ�ȭ
	//pReturn�� ����Ű�� ����ü�� maxCount�� ���ڷ� ���� Count
	pReturn->currentCount = 0;
	//�迭������ �� �ʱ�ȭ
	//pReturn�� ����Ű�� ����ü�� currentCount�� 0
	pReturn->pData = (arrayListNode*)malloc(sizeof(arrayListNode*) * count);
	//pReturn�� ����Ű�� ����ü�� pData(������)�� arrayListNode�� ũ�� * count
	//Node�� ũ�� * count�� pReturn�� pData ũ�Ⱚ(�ִ� ����Ʈ)�� �ȴ�.
	memset(pReturn->pData, 0, sizeof(arrayListNode) * count);
	//pData�� �޸𸮸� 0���� �ʱ�ȭ���Ѷ�
	return 0;
}
//pData�� arrayListNode(char)�� ����Ų�� -> 1����Ʈ


/*
			  position	<== �ڷḦ �߰��Ϸ��� ��ġ
			  	  i		<== ������ �ڷ��� ��ġ ��
		+-----------------------|
		|						|			no
		|	  			  i > position?	--------------------+
		|						|yes						|
		|						|							|
		|	��ġ�� �ִ� �ڷḦ (i + 1)�� ��ġ�� �̵�(����)		|
		|						|							|
		|						|							|
		+----------------- i <== i - 1						|
															|
															|
				  ��ġ position�� ���ο� �ڷ� �߰�  ----------+
								|							
								|							
							  �� ��

*/
//������ �ڷ� �߰� = ���� currentCount�� ������ �׻� �˰� ���� �Ѵ�.
//(���� �����Ͱ� �����ϴ��� Null����, currentCount == maxCount����)
int addListData(arrayList* pList, int position, int data)
{
	int i = 0;
	for (i = pList->currentCount - 1; i >= position; i--)	// i >= position�̸� �ݺ�
	{
		pList->pData[i + 1] = pList->pData[i];
	}
	pList->pData[position].data = data; // ��ġ position�� ���ο� �ڷ� �߰�
	pList->currentCount++;

	return 0;
}


/*
		   40
			��
+-------+-------+-------+-------+-------+-------+-------+
|  10	|  20	|  30	|		|		|		|		|
|		|		|		|		|		|		|		|
+-------+-------+-------+-------+-------+-------+-------+
|   0	|   1	|   2	|   3	|   4	|   5	|	6	|
+-------+-------+-------+-------+-------+-------+-------+

40�� index 1�� �ְ� �ʹ�
-> currentCount�� ���� currentCount + 1 index�� ����
-> currentCount - 1�� ���� currentCount index�� ����
-> 40�� currentCount -1 index�� ����
*/

//1. createList�Լ��� �Լ� �����ͷ� ����ϴ� ����
//2. addListData �ؼ�

