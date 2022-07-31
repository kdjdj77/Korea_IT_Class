import {useState, useCallback, useEffect} from "react";
import { useDispatch, useSelector } from "react-redux";
import styled from "styled-components";
import { INSERT_TODO } from "../reducer/todo";

const TodoForm = function() {

   const dispatch = useDispatch();

   const state = useSelector(function(state) {
      return state.todo;
   });
   /*
   rootReducer 설정(reducer들을 combine)
   => 리덕스 설정에서 store에 매개변수로 전달(저장소에 저장)
   => Provider에 store을 전달
   => useSelector( () 결과값이 reducer에서 만든 모든 state들이 전달되고
   그 중에서 하위선택자를 이용, 내가 원하는 reducer의 state를 가지고 올 수 있다
   */
   //insertTodo, RemoveTodo 구현 TODO
   useEffect(function() {
      console.log(state);
   }, [state]);

   const [todo, setTodo] = useState("");

   const onChangeTodo = useCallback(function(e) {
      setTodo(e.target.value);
   }, [setTodo]);

   const onAddState = useCallback(function() {
      dispatch({
         type:INSERT_TODO,
         data:{
            id:state[state.length - 1].id + 1,
            todo:todo,
         }
      });
      setTodo("");
   }, [state, todo, dispatch]);

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