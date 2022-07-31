import { useCallback } from "react";
import { useDispatch } from "react-redux";
import { REMOVE_STATE } from "../reducer/todo";

const TodoList = function({state}) {
   const dispatch = useDispatch();

   const onRemoveHandler = useCallback(function() {
      dispatch({
         type: REMOVE_STATE,
         id: state.id
      })
   }, [state]);

   return (
      <div>
         {state.id}. {state.todo} 
         <button onClick={onRemoveHandler}>완료</button>
      </div>
   );
};
export default TodoList;