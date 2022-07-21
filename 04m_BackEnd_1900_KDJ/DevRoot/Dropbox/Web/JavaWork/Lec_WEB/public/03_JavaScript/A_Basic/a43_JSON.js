/*
  JSON : JavaScript Object Notation
 	주로 data 를 담기 위한 용도의 JavaScript object 구문
 	오늘날 웹, 앱 등 애플리케이션 개발에서 데이터교환의 중요한 ★텍스트★포맷.
 	
 	JSON 구문에선  
 		name/value 쌍에서 name은 반드시 쌍따옴표로 감싸야 한다
 		문자열 데이터는 반드시 쌍따옴표로만 감싸야 한다.
 			ex) {"name":"John"}
 		
 	JavaScript에선
 		object 에서 property name에 꼭 따옴표를 붙일 필요는 없었다.
 		문자열 데이터는 쌍따옴표 혹은 홀따옴표로 감쌀수 있다.  	
 			ex) {name:'John'}
 			
 			
 	JSON 에서 담을수 있는 data type 들
 		string, number, object(JSON), array, boolean, null
 	
 	JSON 에서 담을수 없는 data type 들
 		function, date, undefined
 		
 
 [JS 의 관련 주요함수]	
    JSON.parse()  : string -> object
    JSON.stringify() : object -> string
		-> date object 는 허용되지 않는다. (문자열로 변환된다)
		-> function은 안된다. stringify() 하면 함수는 빠진다.

 JSON 파일명 : *.json
 JSON MIME type : application/json
	
   참조
   https://www.w3schools.com/js/js_json_syntax.asp
*/
let myObj, myJSON, arr;

myObj = { name: "John", age: 31, city: 'New York' };
console.log(myObj);  // 원래는 이런 모양
console.log(JSON.stringify(myObj));


myJSON = '{"name":"John", "age":31, "city":"New York"}';
myObj = JSON.parse(myJSON);
console.log(myObj);
console.log(myObj.name);

arr = [ "John", 'Peter', 'Sally', "Jane" ];
myJSON = JSON.stringify(arr);
console.log(myJSON);

//JSON 으로 변환안되는 값들
myObj = { 
	name: "John", 
	today: new Date(),    // Date() 객체는 결국 JSON변환시 "문자열"로 변환된다.
	city : "New York", 
	place : undefined,    // JSON 변환안됨
	func1 : function(){}  // JSON 변환안됨
	};
console.log(JSON.stringify(myObj));

console.log("\n[프로그램 종료]", '\n'.repeat(20));
