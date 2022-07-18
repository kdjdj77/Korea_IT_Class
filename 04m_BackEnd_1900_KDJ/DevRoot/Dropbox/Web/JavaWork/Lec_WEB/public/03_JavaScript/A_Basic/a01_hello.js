// 한줄 주석

/* 블럭주석
여러줄 주석 */

console.log('hello javascript');
console.log("Hello Javascript");
console.log(100);
console.log(10, 20, 30);

// ; 
// 문장의 끝에 세미콜론으로 마무리
// JS 에서는 굳이 세미콜론은 안해도 되나, 
// 어떤경우에는 안하면 에러 발생할수 있기에 가급적 붙여주는걸 추천.

console.log(10, 20, 30)
console.log(3.14, 0.2, 123.)
console.log('a', "b", "c", );

console.log(111); console.log(222); console.log(333);

console.log("10", 10);  // string, number

// 문자열 + 숫자 => 문자열 연결
console.log("10" + 10);   // "1010"
console.log(10 + "10");   // "1010"
console.log("10" + 1 + 2);  // ????s
console.log("10" + (1 + 2));  // ????
console.log(1 + 2 + "10");   // ????
 
// 문자열 반복 출력
console.log("*****************************");
console.log("*".repeat(20));
