/*
리스트			: 연결리스트(메모리 기반으로 구현하는 리스트)
				순차 리스트(배열)
리스트 자료구조	: 데이터를 나란히 저장하는 것이다.
				중복 데이터는 허용

리스트 자료구조의 추상 데이터 ADT(추상개념으로 정의)
- 자료구조를 만드는 사람이 정의

1. 리스트 초기화
void ListInit(List* pList);	//초기화 함수 init, 제일 처음에 실행되는 함수(포인터에 의해서)
초기화할 리스트의 주소값을 인자로 전달
리스트 생성 후 제일 먼저 호출하는 함수이다.

2. 데이터 저장
void LInsert(List* pList, LData data);
리스트에 데이터를 저장하고, 매개변수 data에 전달된 값을 저장

3. 첫 번째 데이터인지 검사
void LFirst(List* pList, LData* pData);
데이터의 참조를 위한 반복 호출 함수
데이터 참조를 위한 초기화

4. 다음 데이터 호출(Insert할 공간이 있는지 검사)
void LNext(List* pList, LData* pData);
데이터의 참조를 위한 반복 호출 함수

5. 데이터 삭제
LData LRemove(List* pList);
리스트에서 데이터 삭제

6. 프린트
int LCount(List* pList);
리스트의 카운트가 몇인지 화면에 출력
*/