/******************************
 * 배열의 reduce : n개의 입력 => 1개의 출력 
 * reduce 함수는 잘 사용 할 줄 알면 정말 유용한 내장 함수입니다. 
 * 
 * reduce(callback함수)
 * reduce(callback함수, 초깃값)
 * 
 * reduce 함수를 누적계산결과'값'을 리턴한다
 * (accumulator, current) => 누적계산결과
 * (accumulator, current, index, array) => 누적계산결과
 *   - index: 현재 current 가 몇번째 인지 
 *   - array: 함수를 실행하는 배열 자신 
 * 
 * ES5 등장
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/Reduce
 */

// 아래 주어진 배열에 대하여 '총합'을 구하기
let numbers = [1, 2, 3, 4, 5]
let result, sum

// 1. for
result = 0;
for(let i = 0; i < numbers.length; i++){
    result += numbers[i];
}
console.log(result);

// 2. for-of
result = 0;
for(e of numbers){
    result += e;
}
console.log(result);

// 3. forEach
result = 0;
numbers.forEach(e => {
    result += e;
})
console.log(result);

// 4. reduce
console.log(numbers.reduce((acc, cur) => acc + cur));
// [1, 2, 3, 4, 5]
//   ↘↓
// [   3, 3, 4, 5]
//      ↘↓
// [      6, 4, 5]
//         ↘↓
// [        10, 5]
//            ↘↓
// [           15]


console.log('-'.repeat(20));
// 중간과정 확인
console.log(numbers.reduce((acc, cur) => {
    console.log(`reduce : ${acc}, ${cur}`)
    return acc + cur;
}));



// numbers [1, 2, 3, 4, 5] 를 x 2 한 배열
//         [2, 4, 6, 8, 10]

console.log(numbers.reduce((acc, cur) => {
    acc.push(cur * 2)
    return acc;
}, []));
// [[], 1, 2, 3, 4, 5]
//   ↘ ↓
// [  [2],  2, 3, 4, 5]
//       ↘ ↓
// [    [2, 4],3, 4, 5]
//         ↘  ↓
// [      [2,4,6], 4, 5]
//             ↘  ↓
// [        [2,4,6,8], 5]
//                 ↘  ↓
// [         [2,4,6,8,10]]

console.log("\n[프로그램 종료]", '\n'.repeat(20));