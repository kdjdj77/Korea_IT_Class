/*
    조건문 : Conditional Statements 에서

    거짓(Falsy) 으로 평가될때!
        false, 0, '', null, undefined, NaN   <-- 'Falsy 한 값'이라 한다

    참(Truthy) 으로 평가될때
        true, 37, 'Mark', {}, [], Infinity   <-- 'Truthy 한 값' 이라 한다

    https://developer.mozilla.org/ko/docs/Glossary/Truthy
    https://developer.mozilla.org/ko/docs/Glossary/Falsy

*/
function print(data){
    if(data) // 판정
        console.log(data, '-- Truthy 판정');
    else
        console.log(data, '-- Falsy 판정');
}

print(true);
print(false);
print(100);
print(-1);
print(0);
print(null);
print(undefined);
print(NaN);

print([10, 20, 30]);
print([]);
print({a: 10, b: 20});
print({});
print(3 / 0);

// Truthy, Falthy 판정
let value = {a: 1};

// 1. 삼항연산자
console.log(value ? true : false);

// 2. !! 사용
console.log(!!value); 



console.log("\n[프로그램 종료]", '\n'.repeat(20));
