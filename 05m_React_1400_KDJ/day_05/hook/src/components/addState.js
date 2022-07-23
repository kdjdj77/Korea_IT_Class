import {useState} from "react";
const AddState = function({onClickEvent, stateId}) {

   const [name, setName] = useState('');

   const onChangeInput = function(e) {
      setName(e.target.value);
      //useState의 변수를 바꿔주는 함수는 비동기 함수이다
      console.log(name);
      //따라서 여기서 콘솔을 찍을 때 지금 현재 바뀐 값이 지정되지 않는다
   };

   const onAddStateHandler = function() {
      onClickEvent(stateId + 1, name);
      setName('');
   };

   return(
      <>
         <input
            type="text"
            placeholder="이름을 입력하세요"
            value={name}
            onChange={onChangeInput}
         />
         <button onClick={onAddStateHandler}>추가</button>
         <button>초기화</button>
      </>
   );
}
export default AddState;