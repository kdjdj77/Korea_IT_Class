/***************************************
 *  배열의 메소드 filter(판별함수)
 *   특정조건(판별)을 만족하는 원소들만으로 새로운 배열 생성
 *   매개변수로 주어지는 판별함수는 Truthy/Falsy 를 리턴해야 한다
 *   배열원소가 판별함수에 주어시고 Truthy 가 리턴되면
 *   새로운 배열에 추가된다.
 * 
 *  리턴값: 그렇게 걸러져 나온 원소들이 담긴 배열
 * 
 * ES5 등장
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/filter
 */

 let array = [1, 2, 3, 4, 5, 6, 7, 8, 9];

 // 위 배열에서 3의배수만 걸러진 배열을 구하려면?
 //          [1, 2, 3,  4,  5,  6,  7,  8,  9]
 // 3의배수?  F  F  T   F   F   T   F   F   T
 //          [      3           6           9]


// 1. for 사용
let result = []
for(let i = 0; i < array.length; i++){
    if(array[i] % 3 == 0){
        result.push(array[i])
    }
}
console.log(result);

// 2. for-of 사용
result = []
for(e of array){
    if(e % 3 == 0){
        result.push(e);
    }
}
console.log(result);

// 3. forEach 사용
result = []
array.forEach(e => {
    if(e % 3 == 0){
        result.push(e);
    }
});
console.log(result);

// 4. filter 사용
console.log(array.filter(e => e % 3 == 0));

console.log("\n[프로그램 종료]", '\n'.repeat(20));