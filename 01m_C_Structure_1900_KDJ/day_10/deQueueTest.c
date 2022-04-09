#include "deQueue.h"

int main(void)
{
	element item;
	DQueueType* dq = createDQueue();
	isDQueueEmpty(dq);
	
	insertRear(dq, 'C');
	insertFront(dq, 'B');
	insertFront(dq, 'A');
	insertRear(dq, 'D');
	item = deleteFront(dq);
	item = deleteRear(dq);
	printDQueue(dq);

	return 0;
}