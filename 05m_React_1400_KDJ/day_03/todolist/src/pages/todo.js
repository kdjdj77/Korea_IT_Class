import TodoTitle from "../components/todoTitle"
import TodoForm from "../components/todoForm"
import TodoList from "../components/todoList"
// 컴포넌트의 시작명은 대문자 (이유 : 훅 함수가 사용되기 위해서)

const Todo = function() {
   return (
      <>
         <TodoTitle/>
         <TodoForm/>
         <TodoList/>
      </>
   );
};
export default Todo;


/*
const 컴포넌트명 = function() {  <---랜더함수
   return (
      ...
   )
}
export default 컴포넌트명




*/