import TodoTitle from "../components/todoTitle"
import TodoForm from "../components/todoForm"
import TodoList from "../components/todoList"
import { useSelector } from "react-redux";
// 컴포넌트의 시작명은 대문자 (이유 : 훅 함수가 사용되기 위해서)

const Todo = function() {
   const state = useSelector(function(state) {
      return state.todo;
   });

   return (
      <>
         <TodoTitle state={state}/>
         <TodoForm/>
         {state.map(function(v) {
            return <TodoList 
               key={v.id}
               state={v}
            />
         })}
      </>
   );
};
export default Todo;
