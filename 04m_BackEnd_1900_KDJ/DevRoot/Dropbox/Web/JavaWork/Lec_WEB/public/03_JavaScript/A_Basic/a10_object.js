/*
    object

    property : value 쌍으로 구성된 데이터

    {property:value, property:value, ...}

    property 는 중복될수 없다.
    value 는 어떠한 타입도 될수 있다.
        : number, string, array, function, object..

    사실 JavaScript 의 모든 데이터의 실체는 object 이다.
    
    ※일반적으로  object 변수는 는 const 로 선언한다
    그러나 이번단원에서 진도 편의상 let 등을 사용하기도 하겠습니다
 */

let obj1, obj2, obj3, result;


const car = {type: "Fiat", model: "500", color: "white"};

console.log(car);
console.log(typeof car);

console.log("제 자동차는" + car);
console.log("제 자동하는", car);
console.log(car.toString());
console.log(`제 자동차는 ${car}`);

// empty object
obj1 = {}
console.log(obj1);



/* object 의 property 사용하기
    방법1 : objectName.propertyName
    방법2 : objectName["propertyName"] 
*/
console.log('-'.repeat(20));
console.log('[object 의 property]');

const person = {
    firstName: "John",
    lastName: "Doe",
    age: 50,
    eyeColor: "blue",   // <- 마지막에 콤마 붙여도 OK
};

console.log(person.firstName);
console.log(person['firstName']);
console.log(typeof person);
console.log(typeof person.firstName);

let a = 'firstName';
let b = 'age';
console.log(`${person[a]} is ${person[b]} years old`);


// 없는 property 에 대해선?
console.log(person.address);

// property 값 변경하기
console.log(person);
person.firstName = "Jane";
console.log('변경후', person);

// person = {name: 'hello'};  에러

// property 값 추가하기!
person.email = 'Jane@mail.com';
console.log('추가후', person);

// property 는 중복될수 없다.
obj1 = {
    score: 100,
    'score': 200,  // property 를 문자열로 주어도 동작
    'score': 300,
};

console.log(obj1);


// value 는 어떠한 타입도 가능.
obj2 = {
    name: 'John',
    age: 34,
    height: 172.3,
    married: false,
    score: [100, 97, 33],
    family: {
        spouser: 'Jana',
        children: ['Clark', 'Steve', 'Charlie'],
    },
}

console.log(obj2);
console.log(obj2.name, obj2['name'], typeof obj2.name);
console.log(obj2.age, obj2['age'], typeof obj2.age);
console.log(obj2.married);
console.log(obj2.score);
console.log(obj2.score[1]);
console.log(obj2.family);
console.log(obj2.family.children[2]);

/****************************************************
 *  object method 와 this
 * object 의 value 는 어떠한 타입도 가능하다
 * 즉, 함수도 object 의 property value 로 가능하다
 * object 의 property 함수를 메소드(method) 라 부른다.
 * object 안에서 this 는 '자기자신객체', 즉, 해당 object 가 참조(혹은 바인딩) 된 객체를 말한다
 */
console.log('-'.repeat(20));
console.log('[object method 와 this]');

obj3 = {
    firstName: "John",
    lastName: "Doe",
    id: 5566,

    sayHello: function(){
        console.log('hello');
    },

    // 같은 object 내의 property 사용하려면 this 꼭!
    fullName: function(){
        return `${this.id}: ${this.firstName} ${this.lastName}`;
    },
}

obj3.sayHello();
console.log(obj3.fullName());

// 위 코드 에서 this 는 obj3 를 참조한다.
// 즉 this.firstName 은 obje.firstName 이 동작하는 것이다.
    
// JavaScript 에서 this 는 '특정 object' 를 참조하게 되어 있다.
// '어떤 object 를 참조?' 하냐는 this 가 사용(호출) 되는 시점마다 '다르다'.
// (JS  위 this 가 다른 언어의 this에 비해 직관적으로 이해하기 어려운면이 있습니다)
// 이후 진도 나가면서 this가 등장할때마다 this가 무엇을 참조하는지 눈여겨 봅시다.
// 참고: https://www.w3schools.com/js/js_this.asp
    

const x = {
    name: "kim",
    age: 34,
    height: 172.3,
    score: [94, 35, 79],

    getScore: function(n){
        return this.score[n];
    },

    getTotal: function(){
        let sum = 0;

        for(i = 0; i < this.score.length; i++){
            sum += this.score[i];
        }

        return sum;
    },

    getAvg: function(){
        return this.getTotal() / this.score.length;
    },

};

console.log(x.getScore(0));  // 94
console.log(x.getScore(2));  // 79

console.log(x.getTotal());   // 208
console.log(x.getAvg());     // 69.33333..

console.log('-'.repeat(20));

// 배열의 원소도 어떠한 타입도 가능.

const y = [
    "kim", 34, 172.3,
    {kor: 94, eng: 35, math: 79},
    [
        {
            address: '서울',
            year: 1998,
        },
        {
            address: '제주',
            year: 2012,
        },
    ],
    function(){
        console.log('hello');
    },

    function(){
        return this[3]['kor'] + this[3]['eng'] + this[3]['math'];
    }
];

console.log(y[0]);
console.log(y[3].eng, y[3]['eng']);
console.log(y[4][1].year);
y[5]();
console.log(y[6]());


console.log("\n[프로그램 종료]", '\n'.repeat(20));
