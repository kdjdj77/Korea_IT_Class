import { TodoApi } from "apis/todoApi";
import useInput from "hooks/useInput";
import { Dispatch, FC, SetStateAction, useEffect, useState } from "react";
import { Todo } from "types/api/todo.types";
import * as Styled from "./Style";

type TodoItempPrtosType = {
  todo: Todo;
  onEditFlag: any;
  onEditContent: any;
  onDeleteTodo: any;
};

const TodoItem: FC<TodoItempPrtosType> = ({ todo, onEditFlag, onEditContent, onDeleteTodo }) => {
  const [edit, setEdit] = useState<boolean>(false);
  const [content, onChangeContent, setContent] = useInput(todo.content);

  // edit btn handler
  const onEditBtnHandler = () => {
    setEdit(true);
  };

  const onEditBtnCacncle = () => {
    setEdit(false);
    setContent(todo.content);
  };

  const onEditFlagHandler = () => {
    onEditFlag({ id: todo.id, content: todo.content, flag: todo.flag === 0 ? 1 : 0 });
  };

  const onEditContentHadnler = () => {
    onEditContent({ id: todo.id, content, flag: todo.flag, setEdit: setEdit });
  };

  const onDeleteTodoHadnler = () => {
    onDeleteTodo({ id: todo.id });
  };

  return (
    <Styled.Item>
      <input
        type="checkbox"
        checked={todo.flag === 0 ? false : true}
        onChange={onEditFlagHandler}
      />
      {edit ? <textarea value={content} onChange={onChangeContent}></textarea> : todo.content}
      <button onClick={edit ? onEditContentHadnler : onEditBtnHandler}>
        {edit ? "완료" : "수정"}
      </button>
      <button onClick={onEditBtnCacncle}>취소</button>
      <button onClick={onDeleteTodoHadnler}>삭제</button>
    </Styled.Item>
  );
};
export default TodoItem;
