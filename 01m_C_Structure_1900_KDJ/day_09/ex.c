/*
struct list
{
	int num;
	struct list* num;	// 자기참조 구조체
};
배열 / 연결 / 스택 / 큐 / 원형 큐 모든 자료구조에서 쓰는 방식 : 자기참조
head->next->list의 뜻

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
값 삭제시
		+-------+-------+-------+-------+-------+-------+
		|	 /	|	20	|	30	|	40	|	...	|	80	|
		|	/	|		|		|		|		|		|
		+-------+-------+-------+-------+-------+-------+
				front = 1						rear = 7
값 7개 삭제시
		+-------+-------+-------+-------+-------+-------+
		|	 /	|	 /	|	 /	|	 /	|	...	|	80	|
		|	/	|	/	|	/	|	/	|		|		|
		+-------+-------+-------+-------+-------+-------+
										front = 6,rear = 7
										공간이 있음에도 포화상태 : 잘못된 방식(비효율)
순차 큐 : rear = rear + 1
원형 큐 : rear = (rear + 1) mod n // n으로 나눈 나머지
		 front = (front + 1) mod n
	rear가 MAX_LEN 도달시 1위치로(0 위치는 사용하지 않음)

=========================================================================
알고리즘
//원형 Queue 생성
createQueue()
	cq[n];
	front <-- 0;
	rear <-- 0;
end createQueue()

//원형 Queue 공백 상태 검사
isCQueueEmpty(cq)
	if (front == rear) then return true;
	else return false;
end isCQueueEmpty()

//포화상태 검사
isCQueueFull(cq)
	if ( ( (rear + 1) mod n ) == front) then return true;
	else return false;
end isCQueueFull()

//원형 Queue에서의 front와 rear의 관계
//	front = =rear				: 공백 상태
//	(rear + 1) mod n == front	: 포화 상태

//원형 Queue에 Data 입력
enCQueue(cq, item)
	if ( isCQueueFull(cq) ) then Queue_Full();	//포화상태 삽입 중단
	else 
		rear <-- (rear + 1) mod n;	//나머지를 이용하여 rear 값을 조절
		cq[rear] <-- item;
end enCQueue()

원형 Queue size가 4인 Queue에서 현재 rear의 위치가 ==> 2 : (2 + 1) mod 4

=======================================================================
1. 원형 큐 생성

		[1]		|	[2]			front = 0
				|				rear = 0
		--------+--------
front →	[0]		|	[3]
rear  →			|

2. 데이터 A 삽입 enCQueue(cq, 'A')

rear  →	[1]	A	|	[2]			front = 0
				|				rear = 1 : ( 0 + 1 ) mod 4
		--------+--------
front →	[0]		|	[3]
				|

3. 데이터 B 삽입 enCQueue(cq, 'A')
						↙rear
		[1]	A	|	[2]	B		front = 0
				|				rear = 2 : ( 0 + 2 ) mod 4
		--------+--------
front →	[0]		|	[3]
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