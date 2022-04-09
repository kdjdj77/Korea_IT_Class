/*
연결 리스트(배열 리스트) : 구조체 선언 -	데이터와 포인터 등 두 개 이상의
										데이터를 한 데이터 형에 저장

struct node
{
	int data;
	struct node* link;				//자기 참조 구조체
};
typedef struct node List_node;
typedef list_node* list_ptr;


+-----------+---------------+
| data(int)	| link(list_ptr)|
|			|				|	list_node 타입
+-----------+---------------+

		link 필드에 저장(재귀)
+-------+---+		+-------+---+		+-------+---+
| data	| ●-+------>| data	| ●-+------>| data	|NU	|
|		|   |		|		|   |		|		|LL	|
+-------+---+		+-------+---+		+-------+---+

struct node
{
	int data;
	struct node* link;
};
typedef struct node List_node;
typedef list_node* list_ptr;

list_node item1, item2, item3;

item1.data = 10;
item2.data = 20;
item3.data = 30;
item1.link = item2.link = item3.link = NULL;

	item1				item2				item3
+-------+---+		+-------+---+		+-------+---+
|  10	|NU	|		|  20	|NU	|		|  30	|NU	|
|		|LL	|		|		|LL	|		|		|LL	|
+-------+---+		+-------+---+		+-------+---+

/////////////////////////////////////////////////////////////////////////////////////////////

struct node
{
	char data[4];
	struct node* link;
};
typedef struct node List_node;
typedef list_node* list_ptr;

list_ptr ptr = NULL;
ptr = (list_ptr)malloc(sizeof(list_node));
strcpy(prt->data, "bat");
ptr->link = NULL;

+---------------+---------------+
| data(char[4])	| link(list_ptr)|
|				|				|	list_node 타입
+---------------+---------------+

	ptr			ptr->data
+-------+		  ↘	+-------+---+
| bat	|			| "bat"	|NU	|
|	  ●-+--------->	|		|LL	|
+-------+			+-------+---+
					ptr->link ↗

포인터 변수 ptr에 노드 생성하고 주소값 저장
malloc() : 데이터 확보, 데이터 주소값 반환
sizeof() : 데이터 타입의 길이값 반환

	ptr(header node의 역할)
  ↙
+-------+		+-------+---+		+-------+---+		+-------+---+		+-------+---+
|		|		| C		| ●-+------>| Java	| ●-+------>| C++	| ●-+------>| Linux | ●	|
|	  ●-+------>|		|	|		|		|	|		|		|	|		|		|	|
+-------+		+-------+---+		+-------+-+-+		+-----+-+---+		+-------+---+


+-------+		+-------+---+		+-------+---+		+-------+---+		+-------+---+
|		|		| C		| ●-+------>| Java	| ●-+-	  ->| C++	| ●-+------>| Linux | ●	|
|	  ●-+------>|		|	|		|		|	|		|		|	|		|		|	|
+-------+		+-------+---+		+-------+-+-+		+-----+-+---+		+-------+---+
											  |				  |
1. 노드를 얻는다(주소값)						  |	+-------+---+ |
2. 노드에 "IOS" 저장							  +-| IOS	| ●-+-+
3. ios 노드에는 c++의 링크 값 저장				|		|	|
4. 두 번째 노드에는 ios의 링크 값 저장				+-------+---+

/////////////////////////////////////////////////////////////////////////////////////////////

struct node												//노드 구조체
{
	int data;											//원소 데이터
	struct node* link;									//원소 포인터(link)
};
typedef struct node list_node;							//node를 list_node로 사용
typedef list_node* list_ptr;							//list_node의 주소를 list_ptr로 사용

list_ptr create()										//연결 리스트를 만들고 첫 노드의 주소를 반환하는 함수
{
	list_ptr first, second;								//node의 주소 first, second 생성
	first = (list_ptr)malloc(sizeof(list_node));		//first에 메모리 할당
	second = (list_ptr)malloc(sizeof(list_node));		//second에 메모리 할당

	second->link = NULL;								//second의 link는 NULL (마지막 노드)
	second->data = 20;									//second의 data는 20

	first->data = 10;									//first의 data는 10
	first->link = second;								//first의 link는 second
	return first;										//첫 노드 주소 반환
}

*/