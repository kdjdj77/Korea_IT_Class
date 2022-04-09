/*
Node : 데이터 저장
  arrayList
+-----------+
|   data	|	//arrayList의 Node
+-----------+

  int a[5]
+-------+-------+-------+-------+-------+
|  10	|  20	|  30	|  40	|  50	|
+-------+-------+-------+-------+-------+

malloc() / realloc		= 배열의 크기를 변경하기 위해 malloc() / realloc 사용
						 : 배열의 크기를 정해야 한다
linkedList(연결리스트)	= malloc() / realloc 의 단점을 해결하기 위해 linkedlist(연결리스트)
						 : 포인터를 사용하기 때문에 배열의 길이 값이 필요가 없다(제한 X)

  linkedList
+-------+---+	+-------+---+
| data	| ●-+-->| data	| ●-+--> NULL
+-------+---+	+-------+---+

	●----> == link(포인터, *pLink)
Node는 data와 앞 Node의 주소값을 가진다.

struct arrayList
{
	int data;
};

struct linkedList
{
	int data;
	int *pData;	//앞 Node의 주소값
};
*/