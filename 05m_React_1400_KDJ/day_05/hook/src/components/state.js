import {useState, useRef} from "react";
import AddState from "./addState";
const State = function() {
/* //클릭하면 state 변환

   const [state, setState] = useState("state 처음 시작");
   // const[변수명, 변수 값을 바꿔줄 함수명] = useState(변수의 기본값)
   // setState("값") --> 변수의 값이 바뀜

   const onChangeText = function() {
      setState("두번째 시작하는 state");
   };
   return (
      <div onClick={onChangeText}>
         {state}
      </div>
   );

*/

   // state의 불변성 (state의 값이 객체나 배열일 때)

   /*
   const obj1 = {}
   const obj2 = {}   

   obj1 === obj2 (false)
   const obj3 = obj1 // obj3가 obj1과 같은 참조 값을 가진다 (오브젝트 복사)

   따라서, obj1이 가지고 있는 객체값이 변경되면 obj3도 같은 객체를 가지기 때문에
   값이 변경된다. 즉, 원본 데이터의 훼손, 이러한 훼손은 예상치 못한 오류와 버그를
   일으킬 가능성이 크다. (참조 오류)
   
   <얕은 복사의 에러를 해결하기 위한 깊은 복사>
   1. spread operator (...)
   2. const a = state --> a의 변조 과정 --> setState(a)
   3. immer.js와 같은 라이브러리를 이용 (리덕스)

   * state에 값을 추가하는 방법
   1. setState(...state, {id:4, name:"홍길동"})
      (권장)

   2. const arr = state;
      arr.push = {id:4, name:"홍길동"};
      setState(arr);
      (원본 데이터가 훼손되어 참조 오류 발생 가능)
   */
   //    변수명   변수를 바꾸는 함수명
   const [userList, setUserList] = useState([
      {
         id :1,
         name:"Kim",
      },
      {
         id:2,
         name:"Park",
      },
      {
         id:3,
         name:"Lee",
      },
   ]);

   const onClickEvent = function(idValue, nameValue) {
      setUserList([...userList, {id: idValue, name: nameValue}]);
   };

   /*
   백엔드 받아오는 데이터의 형식의 대부분은 배열인 경우가 많다
   따라서 이러한 배열들을 화면에 보여주기 위해 사용하는 함수
   ==> 배열일 경우에만 사용가능
   
   1. map
      [반복문, 한줄 씩 읽어오는 것]
      ex)
         배열명.map((결과값 변수명) => 실행문)

      ex) 실행문의 경우
         userList.map((v) => console.log(v.id)) //1, 2, 3

      ex) HTML 반복의 경우
         userList.map((v) => (
            <div>
               <div></div>
            </div>
         ))

   2. find/findIndex
      [검색, 조건에 맞는 데이터를 읽어오는 것]
      -> 주로 배열 내에서 조건식을 만족하는 값/인덱스를 찾아올 때 사용
      
      ex)
         배열명.find((결과값 변수명) => 조건식)

      ex)
         userList.find((v) => v.id === 1).name; //Kim
         userList.findIndex((v) => v.id === 1); //0
   3. filter
      [거름망, 조건에 맞지 않는 데이터를 거르고 맞는 데이터만 읽어오는 것]
      -> 주로 백엔드에서 데이터가 삭제되었을 때 프론트엔드에서도 삭제하기
         위해 사용

      ex)
         배열명.filter((결과값 변수명) => 조건식)
   */
   const onRemoveHandler = function(e) {
      //console.log(typeof e.target.value);
      const removeState = userList.filter(
         function(item) {return item.id !== parseInt(e.target.value);}
         /*filter는 제거하라는 명령문이 아니라
         해당 상태가 맞지 않는 데이터를 제외하고 읽어오는 것이므로
         원본 데이터를 훼손한 상태가 아니다*/
      )
      setUserList(removeState);
   };

   const removeButtonArr = useRef([]);
   const onRemoveHandler_2 = function() {
      console.log(removeButtonArr);
   };

   const onRemoveHandler_3 = function(itemId) {
      console.log(itemId);
      const removeState = userList.filter(
         function(item) {return item.id !== itemId;}
      )//itemId은 Number타입이기 때문에 parseInt 불필요
      setUserList(removeState);
   };

   return (
      <>
      {/*map, find, filter 실행 시 결과값 받아오는 변수에는 index사용가능*/}
         {userList.map(function(item, index) {
            return (
            <div key={item.id}>
               {item.id}.{item.name}
               <button 
                  value={item.id} 
                  /*map의 안에서 매개변수로 전달을 하게 되면 해당 객체에
                   해당하는 모든 정보를 매개변수로 전달받을 수 있다*/
                  onClick={function() {
                     return onRemoveHandler_3(item.id);
                  }}
                  ref={function(el) {
                     return removeButtonArr[item.id] = el;
                  }}
               >삭제</button>
            </div>
            );
         })}
         <AddState 
            onClickEvent={onClickEvent}
            stateId={userList.length > 0 && userList[userList.length-1].id} 
         />
      </>
   );
};
export default State;

/*
immer 사용법 : setState(draft.data.review.push(객체명))
{
   message:"failure",
   data:"상품을 준비 중입니다"
}
---------------------------------------
{
   message : "success"
   data : {
         prodName : "떡볶이"
         prodPrice : 8000000
         prodImg : "https://www.tester.koreait/img/12345"
         prodContent : "<div class="a">이 상품은 ...</div> "
         review : [
            {
               User : [
                     id : 952
                     email : "koreait@gmail.com"
                     name : "김**"
               ]
               point : 5
               contents : "<div> ... </div>"
            },
            {},
            {},
            {},
            {},

            ....
         ]
   }

}

*/