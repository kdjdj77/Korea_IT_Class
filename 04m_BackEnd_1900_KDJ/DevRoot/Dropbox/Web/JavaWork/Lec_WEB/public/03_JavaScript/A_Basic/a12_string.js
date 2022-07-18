/* string 문자열 데이터
 *
 * string reference
 *  https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String
 *  https://www.w3schools.com/jsref/jsref_obj_string.asp
 */
let str, str1, str2, str3;

/*******************************
 * 문자열 생성 
 * 
 * 방법1. 문자열 리터럴.  "~" 혹은 '~' 으로 생성
 * 방법2. new String() 으로 정의 (비추)
 */
// console.log("[문자열 생성]");
// TODO


/******************************************
 * String 의 메소드들
 * 기본적으로 string 의 대부분의 메소드들은 immutable 하다. 
 * 즉 원본을 변화시키기 않고, 새로운 string 을 만들어 리턴한다.
 * 
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String#%EC%9D%B8%EC%8A%A4%ED%84%B4%EC%8A%A4_%EB%A9%94%EC%84%9C%EB%93%9C
 */
	
/******************************************
 *  문자열 안에서 문자열 찾기
 *  indexOf(), lastIndexOf(), search()
 *    찾은 위치 인덱스 리턴, 못찾으면 -1 리턴
 * 
 *  includes() : 찾으면 true 리턴
 *  startsWith(searchValue, start) : 주어진 문자열로 시작하면 true 리턴
 *  endsWith(searchValue, length): 주어진 문자열로 끝나면 true 리턴
 */
// console.log('-'.repeat(20));
// console.log("[문자열 검색 indexOf(), lastIndexOf(), search(), includes()]");
// str = "Please locate where 'locate' occurs!";

// TODO


/***********************************************
 *  문자열 추출
 *  slice(start, end) : start 부터 'end직전'까지 문자열 추출
 *  substring(start, end)
 *  substr(start, length) : start 부터 length 개의 문자 추출
 */
// console.log('-'.repeat(20));
// console.log("[문자열 추출 slice(), substring(), substr()]");
// str = "Apple, Banana, Kiwi";

// TODO


/*******************************
 * 문자열 치환
 *  replace() : 치환한 결과 문자열 리턴, 정규표현식 사용 가능
 *  기본적으로 첫번째 '매칭된 문자열 만 치환
 */
// console.log('-'.repeat(20));
// console.log("[문자열 치환 replace()]");
// str = "Please visit Japan!";

// TODO


/*********************************
 * 대소문자 전환
 *  toUpperCase(), toLowerCase() 
 */
// console.log('-'.repeat(20));
// console.log("[대소문자 전환 toUpperCase(), toLowerCase()]");
// str = "Hello World!";
 
// TODO

/*********************************
 * 문자열 연결 
 *  concat()
 */
// console.log('-'.repeat(20));
// console.log("문자열 연결 concat()");
// str1 = "Hello";
// str2 = "World";
 
// TODO


/**********************************
 * 좌우 공백 제거 
 *  trim()
 */
// console.log('-'.repeat(20));
// console.log("좌우 공백 제거 trim()");
// str = "       Hello World!        ";

// TODO

/************************************
 * 문자열 앞/뒤로 패딩문자 추가
 *  padStart(), padEnd()
 *  ECMA2017 에서 추가 https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/padStart
 */
// console.log('-'.repeat(20));
// console.log('[문자열 앞/뒤로 패딩문자 추가]');
// str = "5";

// TODO



/***********************
 * 문자 코드
 *  charAt(position)
 *  charCodeAt(position)
 *  Property access [ ] 
 */
// console.log('-'.repeat(20));
// console.log("[문자 코드 [ ], charAt(), charCodeAt()]");
// str = "HELLO WORLD";

// TODO

/************************
 * 문자열 대소 비교
 */

// TODO

/*********************************
 * string ↔ array
 *   string -> array : split()  str의 메소드
 *   array -> string : join()   array 의 메소드
 */
//  console.log('-'.repeat(20));
//  console.log("[string ↔ array]");

// TODO


// 응용: 문자열 뒤집기.  

// TODO

console.log("\n[프로그램 종료]", '\n'.repeat(20));


























