/*
Node : ������ ����
  arrayList
+-----------+
|   data	|	//arrayList�� Node
+-----------+

  int a[5]
+-------+-------+-------+-------+-------+
|  10	|  20	|  30	|  40	|  50	|
+-------+-------+-------+-------+-------+

malloc() / realloc		= �迭�� ũ�⸦ �����ϱ� ���� malloc() / realloc ���
						 : �迭�� ũ�⸦ ���ؾ� �Ѵ�
linkedList(���Ḯ��Ʈ)	= malloc() / realloc �� ������ �ذ��ϱ� ���� linkedlist(���Ḯ��Ʈ)
						 : �����͸� ����ϱ� ������ �迭�� ���� ���� �ʿ䰡 ����(���� X)

  linkedList
+-------+---+	+-------+---+
| data	| ��-+-->| data	| ��-+--> NULL
+-------+---+	+-------+---+

	��----> == link(������, *pLink)
Node�� data�� �� Node�� �ּҰ��� ������.

struct arrayList
{
	int data;
};

struct linkedList
{
	int data;
	int *pData;	//�� Node�� �ּҰ�
};
*/