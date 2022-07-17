//console.log("안녕하세요");
//실행 : node 파일명

const students = {
   apple : "a",
   banana : "b",
   orange : "c"
}

//console.log(students);
console.log(students.apple);

const {apple, banana, orange} = students;
console.log(apple);
console.log(banana);
console.log(orange);
/*
1. import br from "react-router-dom"
      react-router-dom라이브러리를 통째로 br이라는 이름으로 가지고 온다
      사용 : br.BrowserRouter (export명이 맞지 않으면 에러)

2. import {BrowserRouter} from "react-router-dom"
      react-router-dom라이브러리 중에서 {}안의 요소만 가지고 온다
      사용 : BrowserRouter
*/

const user = ["d", "e", "f"];
const [dd, ee, ff] = user;
console.log(dd);
//배열은 키 값이 아닌, 인덱스 순서로 값을 받아올 수 있음

const dog = {
   name : "루시",
   age : 10,
   weight : 5
};
const desDog = function({ name, age, weight }) {
   console.log(`우리집 강아지의 이름은 ${name}입니다. 그리고 나이는 ${age}살이고
   무게는 ${weight}kg 입니다`);
};
/*
문자열과 변수 쓰는 방법
   `안녕하세요 ${name} 입니다`
   "안녕하세요" + name + "입니다"
   "안녕하세요", name, "입니다"
*/
//desDog(dog.name, dog.age, dog.weight);
desDog(dog);
//매개변수로 객체를 전달했고 함수의 정의문에서 {}를 사용하여
//해당 객체 키값의 value를 가지고 올 수 있다