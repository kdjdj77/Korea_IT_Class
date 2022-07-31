import './todoTitle.css';
const TodoTitle = function({state}) {
   return (
      <div className="navBar">
         할 일 목록 리스트 <span> {state.length} </span> 개
      </div>
   );
};
export default TodoTitle;