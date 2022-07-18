/* 배멸 array 타입
    여러개의 데이터를 담는 집합자료형
    
    array literal 은   [item1, item2, ...   ]  으로 만든다
    array 의 데이터(원소) 들은 , 콤마로 구분한다
    각 데이터(원소) 들은 어떠한 타입도 가능하다

    배열의 길이 (length)
 		배열 원소의 개수, 즉 배열에 담긴 데이터의 개수 
 		
 	배열 인덱스 (첨자, index)
 		배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
 		배열인덱스를 사용하여 배열원소에 접근하여 사용


    배열변수는 일반적으로 const 로 선언한다.

    Array reference
    https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array
    https://www.w3schools.com/jsref/jsref_obj_array.asp
*/

// console.log('[왜 배열(array) 이 필요한가?]');

// TODO


/****************************************
 * 배열생성 방법
 *  방법1 : [ ... ] 
 *  방법2 : new 사용
 */
// console.log('-'.repeat(20));
// console.log("[배열생성]");

// 배열생성 방법
// 방법1
// TODO

// 방법2 : new 사용
// TODO

// 일반적으로 배열변수는 const 로 선언한다
// TODO

/********************************************
 * 배열 여부 판단 하기
 * 현재 객체가 배열인지 아닌지 판단
 * 
 * 방법1: Array.isArray() : 구 브라우저에서는 동작 안함  (ES5.1부터)
 * 방법2: constructor 사용 구 브라우저에서 동작시키려면 별도희 함수 만들어 사용
 * 방법3: instanceof 연산자 사용
 */
// console.log('-'.repeat(20));
// console.log("[배열여부 판단]");

// 방법1
// TODO

// 방법2
// TODO

// 방법3
// TODO


/*****************************************
 * 배열원소, index, length
 *  배열의 원소를 사용하기 위해 index 사용
 *  배열 index 는 0 부터 시작 (0-base index)
 */
// console.log('-'.repeat(20));
// console.log('[배열원소, index, length]');

// TODO


/**************************************
 * 배열원소 추가, 제거
 *  push() : 배열끝 원소 추가
 *  pop() : 배열 끝 원소 추출 (배열에서 제거). 추출할 원소가 없으면 undefined 리턴
 *  shift() : 배열 첫 원소 추출 (배열에서 제거)
 *  unshift() : 배열앞에 원소 추가, 새로운 length 리턴
 * 
 *  shift, unshift 는 pop, push 보다 성능이 느리다!
 */
// console.log('-'.repeat())
// console.log("[push() pop() shift() unshift()]");
// console.log(fruits);

// TODO


/**************************************
 * 데이터 삭제, 삽입 splicing
 *  첫번째 매개변수 : 삭제할 데이터 위치 (start)
 *  두번째 매개변수 : 삭제될 데이터 개수 (deleteCount)
 *  세번째 이후 .. : 삽입될 데이터 들..
 *  리턴값: 삭제된 원소들의 배열
 */
// console.log('-'.repeat(20));
// console.log("데이터 삭제/삽입 splice()");
// console.log(fruits);

// TODO

// 주의! delete 를 사용하여 배열 원소 삭제 하지 말기
// 이는 배열에 구멍(undefined hole) 을 만들게 된다.
// delete 보다는 
// pop(), shift(), splice() 를 사용하길 ㅊㅊ

// TODO


/**************************
 *  concat() 
 */
// console.log('-'.repeat(20));
// console.log("concat()");

// TODO


/*************************
 *  slice()
 * 배열의 일부분 추출, 원본에는 영향 안줌
 */
// console.log('-'.repeat(20));
// console.log("slice()");

// TODO


/****************************
 * 원소 검색 indexOf(), includes()
 * 배열안에 특정 원소가 있는지 여부
 *  indexOf() : 찾으면 index 리턴, 못찾으면 -1 리턴
 *  includes() : 찾으면 true, 아니면 false 리턴, ES7(ES2016) 에 등장
 */
//  console.log('-'.repeat(20));
//  console.log("indexOf(), includes()");
//  console.log(fruits);

// TODO



/*************************************
 *  join() 
 *    array → string
 * 배열의 원소들을 주어진 문자열로 묶어서 하나의 문자열로 리턴
 */
// console.log('-'.repeat(20));
// console.log("[join()]");

// TODO


/******************************************
 * JavaScript 에선 array 도 object 의 특별한 형태다
 *  차이점이라면 index 의 형태다.
 *  JS 의 array : numbered index 사용
 *  JS 의 object : names index 사용
 */
// arr1 = [];   // 비어있는 배열

// TODO


/********************************
 * 배열 역순 reverse()
 *  원본 변화 없다.
 */
// console.log('-'.repeat(20));
// console.log("reverse()");
// console.log(cars);
 
// TODO

/**********************************
 * 배열 정렬 sort()
 *  sort() 는 원본 변경 발생한다
 */
// console.log('-'.repeat(20));
// console.log("sort()");
// console.log(fruits);
 
// TODO




console.log("\n[프로그램 종료]", '\n'.repeat(20));





























