/*
    JS의 자료형(data type) : https://www.w3schools.com/js/js_datatypes.asp
	
    타입
    https://www.w3schools.com/js/js_typeof.asp

        값을 갖고 있는 5개 타입
            number : 숫자 타입
            string : 문자열 타입
            boolean : 논리 타입 (true, false)        
            object : 객체 타입
            function : 함수 타입

        6가지 object 타입
            Object : 객체
            (Array : 배열)
            Date
            String 
            Number
            Boolean

        값을 갖고 있지 않은 타입 2가지
            undefined : 타입이 지정되지 않음
            null : 데이터가 없는 object

        
    JS 는 dynamic type 을 지원하는 언어다.
*/

console.log('-'.repeat(20));
console.log('[number, string, undefined]');
let x;

console.log('x =', x, typeof(x));

x = 5;
console.log('x =', x, typeof(x));

x = "John";
console.log('x =', x, typeof(x));

x = undefined; 
console.log('x =', x, typeof(x));

// JS 의 문자열 리터럴 은 홀따옴표 나 쌍따옴표로 감싼다
console.log('-'.repeat(20))
console.log('string (문자열)')
x = "JavaScript"
x = 'JavaScript'

// 16진수 이스케이프 시퀀스
console.log('\xA9');
// 유니코드 이스케이프 시퀀스
console.log('\u00A9');

// JS 의 숫자타입(number)
console.log('-'.repeat(20))
console.log('number (숫자)')

console.log(34);
console.log(34.00);   // 출력은 34 !

console.log(123e5);

console.log();
x = "10" + 10;  // string
console.log('x =', x, typeof(x));
x = "10" * 10;  // 100 (number) "10" -> 10 로 변환 ?? 잉?
console.log('x =', x, typeof(x));
x = "10" - 10;  
console.log('x =', x, typeof(x));
x = "10" / 10; 
console.log('x =', x, typeof(x));

x = "10" > 2; 
console.log('x =', x, typeof(x));

console.log();

x = "a" * 10;  // 에러 아니다!?  NaN : Not a Number
console.log('x =', x, typeof(x));  // NaN number 

x = 10 / 0;
console.log('x =', x, typeof(x));  // Infinity number

console.log('-'.repeat(20))
console.log('boolean 타입')

x =  10 > 5;
console.log('x =', x, typeof(x));

x = 10 == "10";
console.log('x =', x, typeof(x));

x = 10 === "10";
console.log('x =', x, typeof(x));


/*
 * 배열 (array)
 * 
 * [ .. ]  bracket 으로 감싸고
 * 그 안에 배열 원소(item) 들이 콤마로 나열됨. 
 */
console.log('-'.repeat(20));
console.log('array (배열)');

x = [10, 20, 30];

console.log('x =', x, typeof(x)); // [ 10, 20, 30 ] object
console.log(x[0], x[1], x[2]);
console.log(x[3]); // index 벗어나면 undefined!  <-- 에러 아님
console.log(x.length);   // 원소의 개수

x = [
    100,
    200,
    300,   // 마지막 원소 뒤에 콤마 남겨도 에러 아님.
];

/*
 * 오브젝트, 객체 (object)
 * { .. }  curly brace 로 감싸고
 * name:value 쌍이 콤마로 구분되어 나열됨.
 * name:value 쌍 을 object 의 property 라고 한다.
 */
console.log('-'.repeat(20))
console.log(['object (오브젝트)'])

const person = {firstName: "John", lastName: "Doe", age: 50, eyeColor: "blue"};

console.log('person =', person, typeof(person));

// property name 을 사용하여 value 접근
console.log(person['firstName']);   // 방법1
console.log(person.firstName);   // 방법2
console.log(person.address);   // 없는 property 에 대해선 undefined

// null
x = null;
console.log('x =', x, typeof(x));

// undefined, NaN, null, Infinity 가 출력되고 있다면
// 무언가 잘못 만들어졌다는 뜻이다.


console.log("\n[프로그램 종료]", '\n'.repeat(20));