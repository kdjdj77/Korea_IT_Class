/*
���� ����Ʈ(�迭 ����Ʈ) : ����ü ���� -	�����Ϳ� ������ �� �� �� �̻���
										�����͸� �� ������ ���� ����

struct node
{
	int data;
	struct node* link;				//�ڱ� ���� ����ü
};
typedef struct node List_node;
typedef list_node* list_ptr;


+-----------+---------------+
| data(int)	| link(list_ptr)|
|			|				|	list_node Ÿ��
+-----------+---------------+

		link �ʵ忡 ����(���)
+-------+---+		+-------+---+		+-------+---+
| data	| ��-+------>| data	| ��-+------>| data	|NU	|
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
|				|				|	list_node Ÿ��
+---------------+---------------+

	ptr			ptr->data
+-------+		  ��	+-------+---+
| bat	|			| "bat"	|NU	|
|	  ��-+--------->	|		|LL	|
+-------+			+-------+---+
					ptr->link ��

������ ���� ptr�� ��� �����ϰ� �ּҰ� ����
malloc() : ������ Ȯ��, ������ �ּҰ� ��ȯ
sizeof() : ������ Ÿ���� ���̰� ��ȯ

	ptr(header node�� ����)
  ��
+-------+		+-------+---+		+-------+---+		+-------+---+		+-------+---+
|		|		| C		| ��-+------>| Java	| ��-+------>| C++	| ��-+------>| Linux | ��	|
|	  ��-+------>|		|	|		|		|	|		|		|	|		|		|	|
+-------+		+-------+---+		+-------+-+-+		+-----+-+---+		+-------+---+


+-------+		+-------+---+		+-------+---+		+-------+---+		+-------+---+
|		|		| C		| ��-+------>| Java	| ��-+-	  ->| C++	| ��-+------>| Linux | ��	|
|	  ��-+------>|		|	|		|		|	|		|		|	|		|		|	|
+-------+		+-------+---+		+-------+-+-+		+-----+-+---+		+-------+---+
											  |				  |
1. ��带 ��´�(�ּҰ�)						  |	+-------+---+ |
2. ��忡 "IOS" ����							  +-| IOS	| ��-+-+
3. ios ��忡�� c++�� ��ũ �� ����				|		|	|
4. �� ��° ��忡�� ios�� ��ũ �� ����				+-------+---+

/////////////////////////////////////////////////////////////////////////////////////////////

struct node												//��� ����ü
{
	int data;											//���� ������
	struct node* link;									//���� ������(link)
};
typedef struct node list_node;							//node�� list_node�� ���
typedef list_node* list_ptr;							//list_node�� �ּҸ� list_ptr�� ���

list_ptr create()										//���� ����Ʈ�� ����� ù ����� �ּҸ� ��ȯ�ϴ� �Լ�
{
	list_ptr first, second;								//node�� �ּ� first, second ����
	first = (list_ptr)malloc(sizeof(list_node));		//first�� �޸� �Ҵ�
	second = (list_ptr)malloc(sizeof(list_node));		//second�� �޸� �Ҵ�

	second->link = NULL;								//second�� link�� NULL (������ ���)
	second->data = 20;									//second�� data�� 20

	first->data = 10;									//first�� data�� 10
	first->link = second;								//first�� link�� second
	return first;										//ù ��� �ּ� ��ȯ
}

*/