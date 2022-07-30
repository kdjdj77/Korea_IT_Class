const TodoList = function({onRemoveHandler, state}) {

   const onRemoveClick = function() {
      onRemoveHandler(state.id);
   };

   return (
      <div>
         {state.id}. {state.Todo} 
         <button onClick={onRemoveClick}>완료</button>
      </div>
   );
};
export default TodoList;