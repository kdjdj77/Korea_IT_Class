/* 정규표현식 (reqular expresson)
 *
 * 문자열 검색, 치환  등의 동작에 있어서
 * 단순한 '문자열 비교' 를 하는 것이 아니라 
 * 특정 '패턴'과 비교하고자 할때 이를 단 몇줄의 코드로 구현 가능!
 * 주어진 문자열에서 패턴을 찾아내는 것을 '패턴 매칭(pattern matching)' 이라 함
 * 
 * 사용자가 입력한 문자열 패턴 유효성 체크 등에 많이 사용
 * 		ex) 주민등록번호, URL, email, 비밀번호, 
 * 			날짜포맷(yyyy-mm-dd) 
 * 			전화번호(010-xxxx-xxxx) ... 
 *
 *  JavaScript 는 정규표현식 객체 (RegExp)를 사용하여 정규표현식을 다룬다
 *  
 *  정규표현식 객체 리터럴 구문
 *     /pattern/modifiers
 *
 * 정규표현식을 사용하는 주요 string method
 * 주로 검색, 치환 등의 동작을 수행할때 사용된다.
 *    search(),  replace(), split() ...
 * 
 * RegExp 의 주요 메소드
 *   exec() : 패턴매칭 수행후 '첫번째 매치' 리턴 (object 로 리턴)
 *            매칭이 없으면 null 리턴
 *   test() : 패턴매칭 결과 리턴 true / false
 *   toString() : 정규표현식 문자열 리턴
 *   compile()  <-  v1.5 에서 deprecated 됨
 *
 * RegExp 공식
 *   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/RegExp
 *
 * 참조
 *  https://www.w3schools.com/js/js_regexp.asp
 *  https://www.w3schools.com/jsref/jsref_obj_regexp.asp
 *
 * 정규표현식 연습 사이트 추천
 * : https://regexr.com/    (정규식 , 문자열 매칭 연습)
 * : https://regexone.com/  ( step by step 으로 연습 하기 좋음)
 * : https://regexper.com/  (특징: 시각화, 정규식을 이미지로 다운가능)
 * : https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html  (오라클 공식)
 */
let text, n, pattern;

// console.log('[정규표현식을 사용하는 string 메소드 예]');
// text = "Hello JavaScript";

// search(string) <- 해당 'string' 을 문자열에서 찾는다
// TODO

// search(RegExp) <- 해당 정규표현식 패턴(RegExp) 을 문자열에서 찾는다
// TODO

// replace(str1, str2) 
// str1 을 문자열에서 찾아 str2 로 치환
// TODO

// replace(RegExp, str2)
// 정규표현식 패턴(RegExp) 을 문자열에서 찾아 str2 로 치환
// TODO


/**********************************************
 * JavaScript RegExp 리터럴의 modifier 들
 *
 * i : case-insensitive matching  (대소문자 구분 X)
 * g : global matching 수행  (첫번째 매칭뿐 아니라 전체 매칭 수행)
 * m:  multiline matching 수행
 */

/* 정규표현식 메소드
 *
 *   exec() : 패턴매칭 수행후 '첫번째 매치' 리턴 (object 로 리턴)
 *            매칭이 없으면 null 리턴
 *   test() : 패턴매칭 결과 리턴 true / false
 */
console.log('-'.repeat(20));
console.log('[정규표현식 메소드 예]');
text = 'The best things in life are free!';

// TODO