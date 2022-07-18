/****************************************
 *	배열, object, string 과 for
 *	for, for~in, for~of, forEach
 */
console.log("[for, for~in, for~of, forEach]");

const points = [40, 100, 1, 5, 25, 10];
const fruits = ["Banana", "Orange", "Apple", "Mango"];
const cars = ["Saab", "Volvo", "BMW"];

/***********************************
 * for 사용
 * object 의 property 에 대한 접근 횟수를 줄이는게
 * 성능에 유리하다.
 */
// TODO

/*************************************
 * for (  in  ) 
 *   value 가 아닌 index 로 순환한다
 */
// console.log("-".repeat(20));
// TODO


/************************************
 * for (  of   )  
 *   <-- iterable 객체에 대해, ES6 이상
 * value 에 대해 순환
 */
// console.log("-".repeat(20));
// TODO

/***********************************
 * 배열.forEach(함수)
*  배열원소를 하나하나 뽑아내면서 함수가호출되어 실행 (이런식으로 되호출되는 함수를 callback 함수라 한다)
 *  이때의 callback 함수
 * 		매개변수는 (value, index, array)
 */
// console.log("-".repeat(20));
 
// TODO


/********************************
 * for~in 과 object
 *  for(property in object)
 * 
 * 	object 에서 for~of 는 사용 못함
 * 	
 * 	for~of 는 iterable 한 객체에 대해서만 사용 가능.
 */
// console.log("-".repeat(20));
// console.log('[object 와 for~in]');
 
// const person = {
// 	firstname : "John",
// 	lastname : "Doe",
// 	age : 50,
// 	eyecolor : "blue"
// };

// TODO

/****************************************
 * string 
 * 	 for, for~in, for~of, 
 * 
 * 	 string 은 iterable 하기 때문에 for~of 사용 가능
 */
// console.log("-".repeat(20));
// console.log('[string 과 for]');
// const str = "Hello";

// TODO

/***********************************************
 * iterable
 * 
 * JS 에서 배열과 같이 for ~ of 로 순환할수 있는 객체를 iterable 이라 한다.
 * 
 * JS 의 기본 내장 iterable 은 
 *  String, Array, TypedArray, Map, Set
 * 
 * 그 밖에도 얼마든지 사용자 정의 iterable 객체 정의 가능
 * 
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Iteration_protocols
 * 
 * (이는 고급 주제이므로 기회가 되면 다루겠습니다)
 */
 console.log("\n[프로그램 종료]", '\n'.repeat(20));








































