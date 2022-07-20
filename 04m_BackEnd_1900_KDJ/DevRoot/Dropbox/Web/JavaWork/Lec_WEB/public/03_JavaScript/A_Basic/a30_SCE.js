let result;

result = true && false;
console.log(result);

result = true || false;
console.log(result);

result = true && 'Hello';
console.log(result);   // true 가 아니라 'Hello' 다???

result = 0 && 'Hello';
console.log(result);   // false 가 아니라 0 이다???

result = 'Hello' || 'byte';
console.log(result);   // true 가 아니라 'Hello' 다!?

result = 0 || 200;
console.log(result);

result = null || 'good';
console.log(result);

/*****************************************************
 * Short Circuit Evaluation (단축평가)  (혹은 Lazy Evalutaion 이라고도 한다)
 * 
 * 표현식1 && 표현식2
 *  표현식1 이 Falsy 이면 && 의 결과값은 표현식1
 *  표현식1 이 Truthy 이면 && 의 결과값은 표현식2
 * 
 * 표현식1 || 표현식2
 *  표현식1 이 Falsy 이면 && 의 결과값은 표현식2
 *  표현식1 이 Truthy 이면 && 의 결과값은 표현식1
 */

let n = 5;
(n % 5 == 0) && console.log('5의 배수');

n = 3;
(n % 5 == 0) || console.log('5의 배수가 아닙니다');


/*****************************************
 * SCE 는 
 * React 등에서 '조건부 렌더링' 등을 할때 많이 사용하는 문법이다
 * 특정 값이 유효할때만 수행해야 하는 상황
 */
 console.log('-'.repeat(20));

 // 다음과 같은 함수가 정의되었다고 하자.
 let getName = function(animal){
     return animal.name;
 }
 
 let dog = { name: "흰둥이" };
 console.log(getName(dog));  // 잘된다.

 dog = {age : 10};
 console.log(getName(dog));  // undefined

 dog = null;
//  console.log(getName(dog));  // 에러

getName = function(animal){
    if(animal){  // 매개변수 검증
        return animal.name;
    }
    return animal;
}

getName = function(animal){
    return animal && animal.name;  // 매개변수 검증에 if 문 보다 SCE 많이 애용.
}

// TODO




console.log("\n[프로그램 종료]", '\n'.repeat(20));
