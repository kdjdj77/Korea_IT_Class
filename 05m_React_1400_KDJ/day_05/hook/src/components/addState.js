import {useState, useRef} from "react";
const AddState = function({onClickEvent, stateId}) {

   const [name, setName] = useState('');
   const nameInput = useRef(null);

   const onChangeInput = function(e) {
      setName(e.target.value);
      //useState의 변수를 바꿔주는 함수는 비동기 함수이다
      console.log(name);
      //따라서 여기서 콘솔을 찍을 때 지금 현재 바뀐 값이 지정되지 않는다
   };

   const onAddStateHandler = function() {
      onClickEvent(stateId + 1, name);
      setName('');
      nameInput.current.focus();
   };

   const onResetHandler = function() {
      setName('');
      nameInput.current.focus();
      //nameInput.current.style.display="none";
      //nameInput.currnet = domselector.(input);
   };

   const onEnterAddState = function(e) {
      if (e.key === "Enter") {
         onClickEvent(stateId + 1, name);
         setName('');
      }
   };

   return(
      <>
         <input
            type="text"
            placeholder="이름을 입력하세요"
            value={name}
            /*이벤트 객체를 받기 위해서는 이벤트함수속성 = {실행함수명}으로 실행해야 하며
            단, 이벤트 객체 함수를 받지 않고 두 가지 이상의 함수를 실행하고자 할 때는 
            
            이벤트함수속성 = {()=>{함수1(), 함수2()}}
            
            로 실행해야 한다*/
            onChange={onChangeInput}
            ref={nameInput}
            onKeyPress={onEnterAddState}
         />
         <button onClick={onAddStateHandler}>추가</button>
         <button onClick={onResetHandler}>초기화</button>
      </>
   );
}
export default AddState;