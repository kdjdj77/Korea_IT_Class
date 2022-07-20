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
console.log("[문자열 생성]");
str = "Volvo";
str = 'Volvo';

str = "It's alright";
str = 'He is called "Johnny"'; console.log(str);

// new String() 
str1 = "John";
str2 = new String("John");
str3 = new String("John");

console.log(typeof str1, typeof str2);
console.log(str1 == str2);
console.log(str1 === str2);

// 문자열 리터럴 중간에 줄바꿈... 가능?
str = "Hello Web App\
lication";
console.log(str);  // 그러나 위 방법 비추.

str = "Hello Web App" +
    "lication";  //  차라리 이 방법 ㅊㅊ
console.log(str);

// .length
console.log("length: 문자개수");
str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

console.log(str.length);

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
console.log('-'.repeat(20));
console.log("[문자열 검색 indexOf(), lastIndexOf(), search(), includes()]");
str = "Please locate where 'locate' occurs!";

console.log(str.indexOf("locate"));  // 7
console.log(str.lastIndexOf("locate")); // 21
console.log(str.indexOf("john")); // -1

console.log(str.indexOf("locate", 15));  // index 15 부터 검색
console.log(str.lastIndexOf("locate", 15));  // index 15부터 역방향 검색

console.log(str.search("locate")); // 7

// search() vs indexOf() : 둘은 다르다!
// 	search() : 두번째 매개변수 없다, regexp 사용가능
// 	indexOf() : regexp 사용 불가

console.log(str.includes("locate"));  // true
console.log(str.includes("abc"));   // false

console.log(str.startsWith("Please"));  // true
console.log(str.startsWith("please"));  // false

console.log(str.endsWith("occurs"));    // false
console.log(str.endsWith("occurs!"));   // true


/***********************************************
 *  문자열 추출
 *  slice(start, end) : start 부터 'end직전'까지 문자열 추출
 *  substring(start, end)
 *  substr(start, length) : start 부터 length 개의 문자 추출
 */
console.log('-'.repeat(20));
console.log("[문자열 추출 slice(), substring(), substr()]");
str = "Apple, Banana, Kiwi";

console.log(str.slice(7, 13));
console.log(str.slice(-12, -6)); // 음수 인덱싱 가능
console.log(str.slice(7));   // 7부터 끝까지
console.log(str.slice(-12));

console.log(str.substring(7, 13));   // slice() 와 유사하나 음수인덱싱 불가

console.log(str.substr(7, 6));   // 7부터 6글자

/*******************************
 * 문자열 치환
 *  replace() : 치환한 결과 문자열 리턴, 정규표현식 사용 가능
 *  기본적으로 첫번째 '매칭된 문자열 만 치환
 */
console.log('-'.repeat(20));
console.log("[문자열 치환 replace()]");
str = "Please visit Japan!";

console.log(str.replace("Japan", "Korea"));
console.log(str.replace("JAPAN", "Korea"));
console.log(str.replace(/JAPAN/i, "Korea")); // 정규표현식 대소문자 구분없이 치환
            // i : case Insensitive 약자.

str = "Please visit Japan! Go Japan";
console.log(str.replace("Japan", "Korea"));  // 기본적으로 첫번째 매칭만 치환
console.log(str.replace(/Japan/g, "Korea"));  // 정규표현식, g : global match

/*********************************
 * 대소문자 전환
 *  toUpperCase(), toLowerCase() 
 */
console.log('-'.repeat(20));
console.log("[대소문자 전환 toUpperCase(), toLowerCase()]");
str = "Hello World!";
 
console.log(str.toUpperCase());
console.log(str.toLowerCase());

/*********************************
 * 문자열 연결 
 *  concat()
 */
console.log('-'.repeat(20));
console.log("문자열 연결 concat()");
str1 = "Hello";
str2 = "World";
 
console.log(str1 + " " + str2);
console.log(str1.concat(" ", str2));
console.log("a".concat("b", "c", "d"));


/**********************************
 * 좌우 공백 제거 
 *  trim()
 */
console.log('-'.repeat(20));
console.log("좌우 공백 제거 trim()");
str = "       Hello World!        ";

console.log(`[${str}]`);
console.log(`[${str.trim()}]`);

/************************************
 * 문자열 앞/뒤로 패딩문자 추가
 *  padStart(), padEnd()
 *  ES2017 에서 추가 https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/padStart
 */
console.log('-'.repeat(20));
console.log('[문자열 앞/뒤로 패딩문자 추가]');
str = "5";

console.log(str);
console.log(str.padStart(4));
console.log(str.padStart(4, "x"));
console.log(str.padEnd(4));  // "5   "
console.log(str.padEnd(4, "x"));  //"5xxx"
console.log(str.padStart(10, "*-"));

// number 를 5자리 + 우측정렬로 표시하기
// (우선 number 를 string 으로 변환한뒤 해야 한다)
let num1 = 11, num2 = 2345, num3 = 761;
console.log('-'.repeat(5))
console.log(num1.toString().padStart(5, " "));
console.log(num2.toString().padStart(5, " "));
console.log(num3.toString().padStart(5, " "));

// 실수 number 를 소숫점2자리 + 총7자리 + 우측정렬 표시하기
num1 = 3.141592, num2 = 1234.2, num3 = 65.548
console.log('-'.repeat(7));
console.log(num1.toFixed(2).toString().padStart(7, " "));
console.log(num2.toFixed(2).toString().padStart(7, " "));
console.log(num3.toFixed(2).toString().padStart(7, " "));

/***********************
 * 문자 코드
 *  charAt(position)
 *  charCodeAt(position)
 *  Property access [ ] 
 */
console.log('-'.repeat(20));
console.log("[문자 코드 [ ], charAt(), charCodeAt()]");
str = "HELLO WORLD";

console.log(str.charAt(0));
console.log(str.charAt(100));   // 범위 벗어나면 아무것도 안나옴. 음수인덱싱 없슴

console.log(str.charCodeAt(0));  // 72   : UTF-16 코드값

console.log(str[0]);  // H
console.log(str[100]);  // undefined

// 문자열은 immutable 하다!
str[0] = 'Y';   // 에러 발생하진 않으나..
console.log(str);  // 변함 없다.

/************************
 * 문자열 대소 비교
 */
console.log("Hello" < "Hello");
console.log("HELLO" > "hello");

/*********************************
 * string ↔ array
 *   string -> array : split()  str의 메소드, 정규표현식(regexp) 사용 가능
 *   array -> string : join()   array 의 메소드
 */
console.log('-'.repeat(20));
console.log("[string ↔ array]");

str = "2022-07-20";

let arr = str.split("-");
console.log(arr);

str = "Hello";
console.log(str.split(""));  // [ 'H', 'e', 'l', 'l', 'o' ]

str = "Hello My World";
console.log(str.split(" "));  // [ 'Hello', 'My', 'World' ]

str = "     Hello My     World    ";
console.log(str.split(" "));

console.log(str.trim().split(/\s+/));  // \s : 공백. 띄어쓰기, \n, \t, \r ...
      // 단어별로 split 할때는 위와 같이 사용!

arr = ["H", "e", "l", "l", "o"];  // array -> string
console.log(arr.join("_"));

arr = ["08", "22", "37"];
console.log(arr.join(":"));


// 응용: 문자열 뒤집기.  

str = "자바스크립트";
console.log(str);
console.log(str.split(""));
console.log(str.split("").reverse());
console.log(str.split("").reverse().join(""));

console.log("\n[프로그램 종료]", '\n'.repeat(20));
