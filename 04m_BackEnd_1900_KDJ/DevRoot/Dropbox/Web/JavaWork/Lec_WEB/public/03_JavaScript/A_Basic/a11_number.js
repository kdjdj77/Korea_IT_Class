/*
    Number 타입
    JavaScript 의 숫자타입은 Number 타입 '오직 한가지'뿐이다
    Number 는 소숫점이 있을수도(실수) / 없을수도(정수) 있다
    Number 는 항상 64bit floating point 데이터로 저장된다.
    Number의 정밀도(precision)
        - 정수는 15자리까지 정확도 유지
        - 소수점 이하 17자리 정확도 유지
        - 실수간의 연산은 언제나 100% 정확하지 않다 (정밀도 문제)
    Number가 가질 수 있는 가장 큰 값은 1.8E308
    
    일반적으로 리터럴(literal) 로 Number 생성
        ex) 176, 0b101, 013, 0x0A ...

    JavaScript 에선 Number 뿐 아니라 모든 데이터가 내부적으로 object 로 다루어지기 때문에
    property 나 method (함수) 사용이 가능하다.

    NaN (Not a Number) : Number 연산이 안되는 경우 NaN 이 결과값으로 나온다.
    Infinity : 무한대 값

    https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number
*/

let num1, num2, num3;

num1 = 10;
num2 = 3.14;
console.log(num1, num2);

// 정밀도(precision)
num1 = 999999999999999;
num2 = 9999999999999999;
console.log(num1);
console.log(num2);

console.log(123 === 123.0);  // 
console.log(0.2 + 0.1 === 0.3);
console.log(0.2 + 0.1);

// NaN : Not a Number
console.log('\n[NaN]');
num1 = 100 / "10";
console.log(num1, typeof num1);
num2 = 100 / "Apple";
console.log(num2, typeof num2);

// isNaN()
console.log(isNaN(num1), isNaN(num2));

// NaN 과의 산술연산결과는 NaN 이다
num1 = NaN;
console.log(num1);
console.log(num1 + 5);
console.log(num1 + "5");  // "NaN5"
console.log(num1 * 10);


/********************************** 
 * 진법 리터럴
 *  0x 로 시작 16진법(hexadecimal)
 *  0 으로 시작 8진법 (octal)
 *  0b 로 시작 2진법 (binary)
 */
console.log('-'.repeat(20))
console.log('[진법리터럴, toString]');
 
num1 = 0xFF;  // 16진법
num2 = 010;  // 8진법
num3 = 0b10;  // 2진법
console.log(num1, num2, num3);

num1 = 24;
console.log(num1, num1.toString());
console.log(typeof num1, typeof num1.toString());  // number -> string
// 24.toString();   // 숫자 리터럴에는 바로 메소드 붙일수 없다.
(24).toString();    // 괄호 붙여서는 가능.

// toString(radix)  진법에 따른 변환
num1 = 76;
console.log(num1.toString());
console.log(num1.toString(2));
console.log(num1.toString(8));
console.log(num1.toString(16));


/*******************
 * 일반적으로 Number 는 숫자 literal 을 통해 생성되나,
 * object 로서 Number 를 생성할수 있다  (new 사용)  <-- 매우 비추함!  예측하지 못하는 동작과 성능 이슈
 *  
 */  
console.log('-'.repeat(20));
console.log('[Number() 로 생성하기]');

num1 = 123;
num2 = new Number(123);
num3 = new Number(123);
console.log(num1 + num2);
console.log(typeof num1, typeof num2);
console.log(num1 == num2);
console.log(num1 === num2);
console.log(num2 === num3); // false ★ JS 에서 object 끼리의 비교결과는 언제나 false!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


/*********************************
 * Number 의 메소드(method) 들 
 */ 
console.log('-'.repeat(20));
console.log('[Number 의 메소드들]');
 

// toFixed(n)
//  소숫점 이하 n자리까지 표현한 '문자열' 결과  (이하 반올림)
//  https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed

num1 = Math.PI;

console.log(num1);
console.log(num1.toFixed(2));
console.log(num1.toFixed(3));

// toExponential() 메서드는 숫자를 지수 표기법으로 표기해 반환합니다.
//  https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential

// TODO

// toPrecision(n)
//  Number 객체를 지정된 정밀도로 나타내는 문자열을 반환한다.
//  n : 유효 자릿수
// https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number/toPrecision

num1 = 123.456;
console.log(num1);
console.log(num1.toPrecision(4));

num1 = 5.123456;
console.log(num1.toPrecision());
console.log(num1.toPrecision(5));
console.log(num1.toPrecision(2));
console.log(num1.toPrecision(1));

/****************************************
 * number 로 변환하는 방법 3가지
 * 
 *  Number() 함수
 *  parseInt()
 *  parseFloat()
 * 
 *  다양한 경우에서 사용자가 입력한 값은 문자열(string) 타입으로 입력된다
 * 이의 산술연산을 하거나 Number 메소드를 적용하려면 number로 변환해야 한다
 */
console.log('-'.repeat(20));
console.log('Number 변환하기');

num1 = "3.141592";
// num1.toFixed(2);
console.log(parseFloat(num1).toFixed(2));

console.log(parseInt("-10"));
console.log(parseInt("-10.33"));  // -10  소숫점 이하 절삭
console.log(parseInt("10 20 30"));  // 10  헐? 이게 된다?
console.log(parseInt("14years"));   // 14 헐? 변환 된다!
console.log(parseInt("year 2022"));  // NaN

// Number() 함수 사용하여 변환
console.log(Number("10"));
console.log(Number("    10"));
console.log(Number("10    "));
console.log(Number("    10    "));
console.log(Number("10.33"));
console.log(Number("10,33"));
console.log(Number("10 33"));

// Date 객체도 Number() 사용하여 number 변환
console.log(new Date()); 
console.log(Number(new Date()));  // 1970.1.1 이후 경과된 ms 


/***********************************  
 * Number 의 property
 *   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number#static_properties
 * 
 * Number 의 static 메소드
 *   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number#%EC%A0%95%EC%A0%81_%EB%A9%94%EC%86%8C%EB%93%9C
 */
console.log('-'.repeat(20));
console.log('Number 의 property, static 메소드');

console.log(1 / 0);
console.log(Number.POSITIVE_INFINITY);
console.log(Number.NEGATIVE_INFINITY);

// Number.isInteger()  정수 여부
console.log(Number.isInteger(3));
console.log(Number.isInteger(3.0));
console.log(Number.isInteger(3.1));


// Number 값의 범위
console.log(Number.MAX_VALUE);
console.log(Number.MIN_VALUE);



console.log("\n[프로그램 종료]", '\n'.repeat(20));