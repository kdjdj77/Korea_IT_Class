#include "listC.h"

/*
			  position	<== 자료를 추가하려는 위치의 값
				  i		<== 마지막 자료의 위치 값
		+-----------------------|
		|						|			no
		|	  			  i > position?	--------------------+
		|						|yes						|
		|						|							|
		|	위치에 있는 자료를 (i + 1)의 위치로 이동(복사)		|
		|						|							|
		|						|							|
		|				   i <== i - 1						|
		+-----------------------+							|
															|
				  위치 position에 새로운 자료 추가  ----------+
								|
								|
							  종 료

*/
int insertElement(int L[], int n, int x)
{// L[] : Array, n : position? currentCount?, x : 원소(data)
	int i, k = 0, move = 0;	// move	: 자리 이동 횟수 카운트
							//  k	: 데이터가 들어갈 위치 값

	for (i = 0; i < n; i++)					// 0부터 position - 1까지 반복
	{
		if ((L[i] <= x) && (x <= L[i + 1]))	// data의 값이 L[i], L[i + 1] 사이이면
		{									
			k = i + 1;						// k에 i + 1 대입 (x가 들어갈 index 값이 될 것)
			break;							// 탈출
		}
	}
	if (i == n) k = n;		// 반복문을 다 돌았는데 if에 안걸렸으면 i == n : true
							// k의 값은 currentCount의 index인 n

	for (i = n; i > k; i--)	// currentCount의 index인 n부터 자료를 넣고자 하는 위치 k
	{						// 까지 반복
		L[i] = L[i - 1];	// 앞의 값을 뒤의 값에 대입
		move--;				// move : k - n이 될 것
	}
	L[k] = x;				// 자료를 넣고자 하는 위치 k에 데이터 x를 집어넣음
	return move;
}

/*
				position	<== 자료를 제거하려는 위치
					i		<== position
		+-----------------------|
		|						|				no
		|	  		  (i < currentCount - 1)? --------------+
		|					 yes|							|
		|						|							|
		|	위치 (i + 1)에 있는 자료를 i의 위치로 이동(복사)	|
		|						|							|
		|						|							|
		|				   i <== i + 1						|
		+-----------------------+							|
															|
								+---------------------------+
								|
								|
							  종 료

// currentCount - 1 : 배열의 마지막 위치값
*/
int deleteElement(int L[], int n, int x) // n : 개수, x : 실제 데이터, L[] : 길이값
{
	int i, k = 0, move = 0;

	for (i = 0; i < n; i++)				// 데이터의 개수만큼 반복
	{
		if (L[i] == x)					// 삭제하려는 데이터 x의 값과 L[i]가 같으면
		{								
			k = i;						// k에 i 대입
			break;						//탈출
		}
	}
	if (i == n) move = n;;		//반복문을 다 돌았는데 if에 안걸렸으면 i == n : true
								//move의 값은 n
	for (i = k; i < n - 1; i++)	//삭제하고자 하는 자료의 위치 k부터 currentCount -1
	{							//까지 반복
		L[i] = L[i + 1];		//뒤의 값을 앞에 대입
		move++;					//move : n - k - 1가 될 것
	}
	return move;
}