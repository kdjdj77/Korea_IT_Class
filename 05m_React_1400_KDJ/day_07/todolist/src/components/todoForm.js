import {useState, useCallback} from "react"
import styled from "styled-components";

const TodoForm = function({onAddHandler, id}) {

   const [todo, setTodo] = useState("");

   const onAddState = useCallback(function() {
      onAddHandler(id + 1, todo);
   }, [id, todo, setTodo, onAddHandler]);

   const onChangeTodo = useCallback(function(e) {
      setTodo(e.target.value);
   }, [setTodo]);

   return (
      <div>
         <TodoAddInput 
            type="text" 
            value={todo}
            onChange={onChangeTodo}
            placeholder="할 일을 적어주세요"
         />
         <TodoButton onClick={onAddState}>추가</TodoButton>
      </div>
   );
};
export default TodoForm;

const TodoAddInput = styled.input`
   border-radius:5px;
   width:500px;
   font-size:32px;
   position:relative;
   padding-left:20px;
`

const TodoButton = styled.button`
   border-radius:5px;
   width:53px;
   height:43px;
   position:absolute;
`