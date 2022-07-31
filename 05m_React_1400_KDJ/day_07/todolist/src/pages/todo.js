import {useState, useCallback} from "react"
import TodoTitle from "../components/todoTitle"
import TodoForm from "../components/todoForm"
import TodoList from "../components/todoList"
// 컴포넌트의 시작명은 대문자 (이유 : 훅 함수가 사용되기 위해서)

const Todo = function() {
   const [state, setState] = useState([
      {
         id: 1,
         Todo: "리액트 공부하기",
      },
      {
         id: 2,
         Todo: "리액트 또 공부하기",
      },
   ]);

   const onAddHandler = useCallback(function(id, todo) {
      return setState([...state, {id: id, Todo: todo}]);
   }, [state]);
/*
   const onRemoveHandler = useCallback(function(id) {
      const removeState = state.filter(function(item) {
         return item.id !== id;
      })
      setState(removeState);
   }, [state]);
*/
   return (
      <>
         <TodoTitle state={state}/>
         <TodoForm 
            onAddHandler={onAddHandler} 
            id={state.length > 0 && state[state.length - 1].id}
         />
         {state.map(function(v) {
            return <TodoList 
               key={v.id} 
               onRemoveHandler={onRemoveHandler}
               state={v}
            />
         })}
      </>
   );
};
export default Todo;
