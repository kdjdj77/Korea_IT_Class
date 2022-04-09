/*
struct list
{
	int num;
	struct list* num;	// �ڱ����� ����ü
};
�迭 / ���� / ���� / ť / ���� ť ��� �ڷᱸ������ ���� ��� : �ڱ�����
head->next->list�� ��

struct list a = { 10, 0 }, b = { 20, 0 }, c = { 30, 0 };
struct list* head = &a;
a.next = &b;
b.next = &c;
					a					b					c
				+-------+---+		+-------+---+		+-------+---+
head = &a------>| 10	|&b-+------>| 20	|&c-+------>| 30	|NU	|
				|		|   |		|		|	|		|		|LL	|
				+-------+---+		+-------+---+		+-------+---+
head->num		=> 10
head->next->num => 20

============================================================================
Queue
		+-------+-------+-------+-------+-------+-------+
		|	10	|	20	|	30	|	40	|	...	|	80	|	
		|		|		|		|		|		|		|	
		+-------+-------+-------+-------+-------+-------+
		front = 0								rear = 7
�� ������
		+-------+-------+-------+-------+-------+-------+
		|	 /	|	20	|	30	|	40	|	...	|	80	|
		|	/	|		|		|		|		|		|
		+-------+-------+-------+-------+-------+-------+
				front = 1						rear = 7
�� 7�� ������
		+-------+-------+-------+-------+-------+-------+
		|	 /	|	 /	|	 /	|	 /	|	...	|	80	|
		|	/	|	/	|	/	|	/	|		|		|
		+-------+-------+-------+-------+-------+-------+
										front = 6,rear = 7
										������ �������� ��ȭ���� : �߸��� ���(��ȿ��)
���� ť : rear = rear + 1
���� ť : rear = (rear + 1) mod n // n���� ���� ������
		 front = (front + 1) mod n
	rear�� MAX_LEN ���޽� 1��ġ��(0 ��ġ�� ������� ����)

=========================================================================
�˰���
//���� Queue ����
createQueue()
	cq[n];
	front <-- 0;
	rear <-- 0;
end createQueue()

//���� Queue ���� ���� �˻�
isCQueueEmpty(cq)
	if (front == rear) then return true;
	else return false;
end isCQueueEmpty()

//��ȭ���� �˻�
isCQueueFull(cq)
	if ( ( (rear + 1) mod n ) == front) then return true;
	else return false;
end isCQueueFull()

//���� Queue������ front�� rear�� ����
//	front = =rear				: ���� ����
//	(rear + 1) mod n == front	: ��ȭ ����

//���� Queue�� Data �Է�
enCQueue(cq, item)
	if ( isCQueueFull(cq) ) then Queue_Full();	//��ȭ���� ���� �ߴ�
	else 
		rear <-- (rear + 1) mod n;	//�������� �̿��Ͽ� rear ���� ����
		cq[rear] <-- item;
end enCQueue()

���� Queue size�� 4�� Queue���� ���� rear�� ��ġ�� ==> 2 : (2 + 1) mod 4

=======================================================================
1. ���� ť ����

		[1]		|	[2]			front = 0
				|				rear = 0
		--------+--------
front ��	[0]		|	[3]
rear  ��			|

2. ������ A ���� enCQueue(cq, 'A')

rear  ��	[1]	A	|	[2]			front = 0
				|				rear = 1 : ( 0 + 1 ) mod 4
		--------+--------
front ��	[0]		|	[3]
				|

3. ������ B ���� enCQueue(cq, 'A')
						��rear
		[1]	A	|	[2]	B		front = 0
				|				rear = 2 : ( 0 + 2 ) mod 4
		--------+--------
front ��	[0]		|	[3]
				|


enLqueue(lq, item)
	new <-- getNode();
	new.data <-- item;
	new.link <-- NULL;

	if (front == NULL) then
		rear <- new;
		front <- new;
	else
		rear.link <- new;
		reawr <- new;
end enLqueue()
*/