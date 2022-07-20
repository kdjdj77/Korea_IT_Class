/* 배멸 array 타입
    여러개의 데이터를 담는 집합자료형
    
    array literal 은   [item1, item2, ...   ]  으로 만든다
    array 의 데이터(원소) 들은 , 콤마로 구분한다
    각 데이터(원소) 들은 어떠한 타입도 가능하다

    배열의 길이 (length)
 		배열 원소의 개수, 즉 배열에 담긴 데이터의 개수 
 		
 	배열 인덱스 (첨자, index)
 		배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
 		배열인덱스를 사용하여 배열원소에 접근하여 사용


    배열변수는 일반적으로 const 로 선언한다.

    Array reference
    https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array
    https://www.w3schools.com/jsref/jsref_obj_array.asp
*/

// console.log('[왜 배열(array) 이 필요한가?]');

// TODO


/****************************************
 * 배열생성 방법
 *  방법1 : [ ... ] 
 *  방법2 : new 사용
 */
 console.log('-'.repeat(20));
 console.log("[배열생성]");
 
 let arr1, arr2, arr3;
 
 // 배열생성 방법
 // 방법1
 arr1 = [40, 100, 1, 5, 25, 10];
 const fruits = ["Banana", "Orange", "Apple", "Mango"];
 let fruits2 = ["Banana", "Orange", "Apple", "Mango"];
 
 // 방법2 : new 사용
 let cars = new Array("Saab", "Volvo", "BMW");
 
 console.log(arr1);
 console.log(fruits);
 console.log(cars);
 
 console.log('arr1 =', arr1);
 console.log(`arr1 = ${arr1}`);  // 'arr1 =' + arr1.toString()
 console.log(arr1.toString());
 
 // fruits == fruits2 <-- 결과는????
 console.log(fruits == fruits2);  // JS 에서 object 의 비교는 언제나 false!!
 
 console.log(typeof arr1);
 
 // 일반적으로 배열변수는 const 로 선언한다
 const animals = [
     'tiger',
     'dog',
     'car', 
 ];
 console.log(animals);
 
 /********************************************
  * 배열 여부 판단 하기
  * 현재 객체가 배열인지 아닌지 판단
  * 
  * 방법1: Array.isArray() : 구 브라우저에서는 동작 안함  (ES5.1부터)
  * 방법2: constructor 사용 구 브라우저에서 동작시키려면 별도희 함수 만들어 사용
  * 방법3: instanceof 연산자 사용
  */
 console.log('-'.repeat(20));
 console.log("[배열여부 판단]");
 
 // 방법1
 console.log(Array.isArray(arr1));
 console.log(Array.isArray(arr2));
 
 // 방법2
 // TODO
 
 // 방법3
 // TODO
 
 
 /*****************************************
  * 배열원소, index, length
  *  배열의 원소를 사용하기 위해 index 사용
  *  배열 index 는 0 부터 시작 (0-base index)
  */
 console.log('-'.repeat(20));
 console.log('[배열원소, index, length]');
 
 console.log(fruits[0], typeof fruits[0]);
 console.log(fruits[100], typeof fruits[100]);
 
 // empty 배열
 arr2 = [];
 console.log(arr2.length, [].length);
 
 /**************************************
  * 배열원소 추가, 제거
  *  push() : 배열끝 원소 추가
  *  pop() : 배열 끝 원소 추출 (배열에서 제거). 추출할 원소가 없으면 undefined 리턴
  *  shift() : 배열 첫 원소 추출 (배열에서 제거)
  *  unshift() : 배열앞에 원소 추가, 새로운 length 리턴
  * 
  *  shift, unshift 는 pop, push 보다 성능이 느리다!
  */
 console.log('-'.repeat())
 console.log("[push() pop() shift() unshift()]");
 console.log(fruits);
 
 fruits.push('Melon');
 console.log(fruits);
 fruits.push('Grape');
 console.log(fruits);
 
 console.log('pop() 결과', fruits.pop());
 console.log(fruits);
 
 console.log("shift() 결과", fruits.shift());
 console.log(fruits);
 
 console.log("unshift() 결과", fruits.unshift('Grape'));
 console.log(fruits);
 
 console.log([].pop());  // undefined
 
 
 /**************************************
  * 데이터 삭제, 삽입 splicing
  *  첫번째 매개변수 : 삭제할 데이터 위치 (start)
  *  두번째 매개변수 : 삭제될 데이터 개수 (deleteCount)
  *  세번째 이후 .. : 삽입될 데이터 들..
  *  리턴값: 삭제된 원소들의 배열
  */
 console.log('-'.repeat(20));
 console.log("데이터 삭제/삽입 splice()");
 console.log(fruits);
 
 fruits.splice(2, 2, 'Peach');
 console.log(fruits);
 
 fruits.splice(3, 0, 'Kiwi', "Banana");
 console.log(fruits);
 
 
 // 주의! delete 를 사용하여 배열 원소 삭제 하지 말기
 // 이는 배열에 구멍(undefined hole) 을 만들게 된다.
 // delete 보다는 
 // pop(), shift(), splice() 를 사용하길 ㅊㅊ
 
 // TODO
 
 
 /**************************
  *  concat() 
  */
 console.log('-'.repeat(20));
 console.log("concat()");
 
 fruits.concat(['Lemon', 'Apple']);  // concat 은 원본 변화시키지 않는다
 console.log(fruits);
 
 // fruits = fruits.concat(['Lemon', 'Apple']);  // 원본 변경, const 는 불가
 arr3 = fruits.concat(['Lemon', "Apple"]);
 console.log(arr3);
 
 
 /*************************
  *  slice()
  * 배열의 일부분 추출, 원본에는 영향 안줌
  */
 console.log('-'.repeat(20));
 console.log("slice()");
 
 console.log(fruits.slice(1));   // 1번째부터 추출
 console.log(fruits.slice(1, 3));  // 1부터 3 전까지 추출
 
 
 /****************************
  * 원소 검색 indexOf(), includes()
  * 배열안에 특정 원소가 있는지 여부
  *  indexOf() : 찾으면 index 리턴, 못찾으면 -1 리턴
  *  includes() : 찾으면 true, 아니면 false 리턴, ES7(ES2016) 에 등장
  */
 console.log('-'.repeat(20));
 console.log("indexOf(), includes()");
 console.log(fruits);
 
 console.log(fruits.indexOf("Kiwi"));  // 3
 console.log(fruits.indexOf("Lemon"));  // -1
 
 console.log(fruits.includes("Kiwi"));  // true
 console.log(fruits.includes("Lemon"));  // false
 
 
 
 
 
 /*************************************
  *  join() 
  *    array → string
  * 배열의 원소들을 주어진 문자열로 묶어서 하나의 문자열로 리턴
  */
 // console.log('-'.repeat(20));
 // console.log("[join()]");
 
 // TODO
 
 
 /******************************************
  * JavaScript 에선 array 도 object 의 특별한 형태다
  *  차이점이라면 index 의 형태다.
  *  JS 의 array : numbered index 사용
  *  JS 의 object : names index 사용
  */
 arr1 = [];   // 비어있는 배열
 
 console.log(arr1);
 arr1[0] = 100;
 arr1[1] = 200;
 // arr1[10] = 400;
 console.log(arr1);
 
 arr1['name'] = 'John';
 console.log(arr1);
 
 
 /********************************
  * 배열 역순 reverse()
  *  원본 변화 없다.
  */
 console.log('-'.repeat(20));
 console.log("reverse()");
 console.log(cars);
  
 console.log(cars.reverse());
 
 /**********************************
  * 배열 정렬 sort()
  *  sort() 는 원본 변경 발생한다
  */
 console.log('-'.repeat(20));
 console.log("sort()");
 console.log(fruits);
  
 fruits.sort();
 console.log(fruits);
 
 // 역정렬?
 console.log(fruits.sort().reverse());
 
 // number 데이터 정렬하려 하니???
 arr1 = [40, 100, 1, 5, 25, 10];
 arr1.sort();
 console.log(arr1);  // [ 1, 10, 100, 25, 40, 5 ]
 
 // 뭔가 제대로 안된다.
 // sort() 메소드는 기본적으로 문자열(string) 정렬을 합니다
 // 그래서 "25" 가 "100" 보다 더 큰 값이 되는 겁니다
 // 따라서 number 타입등에서 sort() 할때는
 // sort(비교함수) 를 매개변수로 주어 동작케 해야 합니다
 //   비교함수(compare function)의 
 //     매개변수는 비교할 두개값 a, b
 //     리턴값은 
 //        a < b 이면 음수, 같으면 0, a > b 이면 양수 리턴 
 
 arr1.sort(function(a, b){return a - b});
 console.log(arr1);
 
 arr1.sort(function(a, b){return b - a});
 console.log(arr1);
 
 
 console.log("\n[프로그램 종료]", '\n'.repeat(20));
 