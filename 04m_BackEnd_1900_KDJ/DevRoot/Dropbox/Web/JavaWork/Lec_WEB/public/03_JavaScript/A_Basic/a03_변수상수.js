/*
    변수 (variable)
        값을 담는 공간.  변수이름(variable name)을 부여해서 관리    

 	변수는 사용하기 전에 먼저 '선언(declaration)' 해야 한다
	
     변수 선언 구문 방법 4가지:
		● let 변수이름    ← let 으로 선언된 변수는 값 변경 가능
        ● const 변수이름  ← const 로 선언된 변수는 값 변경 불가. 이는 상수(constant) 라 한다. 반드시 선언시 초기화 해야 한다
        ● var 변수이름    ← var 키워드는 오늘날 JS 에서는 가급적 사용하지 않음.  값 변경 가능
        ● 걍 변수이름..  ← 전역(global) 로 선언됨 (가급적 비추)

    변수에 값을 대입 (assign)
         =  대입연산자 (assignment operator) 사용

	변수의 초기화 (initialization)
		변수에 최초로 값(value) 을 대입 (assignment) 하는 것.

    타입 확인
        모든 값이나 변수는 타입(type) 과 값(value) 을 갖고 있다.
        typeof 연산자를 통해 타입 확인 가능.

    변수 이름
        변수 이름은 고유한 식별자 (identifier)로 작명해야 한다
        - 문자, 숫자, _, $ 사용 가능
        - 숫자로 시작하면 안된다
        - 대소문자 구분한다  (case sensitive)
        - 예약어 (reserved word), 키워드는 변수명으로 사용 불가

    
    가급적 코드에서 사용하는 모든 변수들은 코드의 상단에서 선언해두자.
*/     

let num1;
num1 = 20;
console.log('num1 =', num1);

num1 = 30 * 2;
console.log('num1 =', num1);

let num2;
console.log('num2 =', num2); // 한번도 대입하지 않은 변수는 undefined 값을 가진다.

// console.log('num3 =', num3);  // 선언되지 않은 변수는 사용 불가. 에러!

// typeof 연산자
console.log('-'.repeat(20));
console.log(typeof 10);   // 10 은 number 타입
console.log(typeof "10"); // "10" 은 string 타입
console.log(typeof(10), typeof("10"));  // 함수처럼 사용해도 동작

console.log('num1 =>', num1, typeof(num1));  // 변수의 값과 타입

// let num1;  // let, const 로 선언한 변수는 재선언 불가

let a, b, c;
a = 5;
b = 6;
c = a + b;
console.log(a, b, c);

let person = "John", car = "volvo", price = 200;
console.log(person, car, price);

// 상수
const PI = 3.14;
console.log('PI =', PI, typeof(PI));
// PI = 123;
// const K;  // JS 에선 const 는 반.드.시. 선언과 동시에 초기화 꼭!
// K = 100;


// var 는 중복 선언 가능.
var k = 10;
console.log('k = ', k);
var k = 20;
console.log('k = ', k);

// 키워드 없이 선언 가능 --> global
// 이는 delete 를 사용하여 삭제 가능.
myValue = 200;
console.log('myValue = ', myValue);
delete myValue;  // 전역변수 myValue 삭제
// console.log('myValue = ', myValue);

/*
* let, const 는 block scope (블럭 영역) 를 갖는 변수다
*   블럭 안에서 선언된 변수는 선언이후 블럭안에서만 사용가능함
*   블럭이 끝나면 해당 이름의 변수는 사용 불가
*  
*   이러한 변수를 지역변수(local variable) 이라 하고
*    local scope (지역 범위) 를 갖는다 라고 말합니다.
*    scope 는 해당 이름을 사용할수 있는 범위
*/
{
    let i = 100;
    console.log('i = ', i);
}
// console.log('i = ', i);

{
    let i = 200;
}

// scope 동작 방식은 C 언어와 비슷
let grade = 4;
let age = 1;
{
    let age = 2;
    {
        let age = 3;
        console.log('age.3 =', age);
        console.log('grade =', grade);
    }
    console.log('age.2 =', age);
}

console.log('age.1 =', age);


console.log("\n[프로그램 종료]", '\n'.repeat(20));
