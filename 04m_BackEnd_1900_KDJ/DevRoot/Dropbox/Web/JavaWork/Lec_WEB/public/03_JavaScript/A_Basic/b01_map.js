// map. filter, reduce

// mapping : n -> n
// ex) 주어진 데이터의 값들을 x2 한 결과 만들기
// [11, 12, 13, 14, 15]  n개의 데이터
//  ↓   ↓   ↓   ↓   ↓        x 2
// [22, 24, 26, 28, 30]  n개의 데이터

// filter :  n -> n>=
// ex) 주어진 데이터에서 3의 배수로만 구성된 결과 만들기
// [11, 12, 13, 14, 15]  n개의 데이터
//       ↓           ↓
// [    12,         15]

// reduce : n -> 1
// ex) 주어진 데이터의 합을 구하세요
// [11, 12, 13, 14, 15]  n개의 데이터
//           ↓
//          65

/******************************
 * 배열의 map(callback) 메소드
 * 배열 안의 원소들을 변환할때 사용
 * 
 * 리턴값: 변환된 값들이 담긴 배열
 * 
 * ES5 등장
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/map
 */
 let array = [1, 2, 3, 4, 5, 6, 7, 8, 9];

 // 위 배열의 모든 원소를 제곱한 새로운 배열을 만드려면?
 //      [1, 2, 3,  4,  5,  6,  7,  8,  9]
 // 제곱  ↓  ↓  ↓   ↓   ↓   ↓   ↓   ↓   ↓
 //      [1, 4, 9, 16, 25, 36, 49, 64, 81]
 
 
 // 1. for 사용
 let squared = []
 for(let i = 0; i < array.length; i++){
    squared.push(array[i] ** 2);
 }
 console.log(squared);

 // 2. for-of 사용
 squared = []
 for(e of array){
    squared.push(e ** 2)
 }
 console.log(squared);

 // 3. forEach() 사용
 squared = [];
 array.forEach(e => {
    squared.push(e ** 2);
 });
 console.log(squared);

 console.log('-'.repeat(20));
 // map(함수) 사용
// map() 은 생성된 새로운 배열 리턴
// callback 함수의 리턴값은 새로운 배열에 추가될 값이다.
console.log(array.map(n => n ** 2));

 
 console.log("\n[프로그램 종료]", '\n'.repeat(20));