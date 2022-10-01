import { TodoApi } from "apis/todoApi";
import useInput from "hooks/useInput";
import { Dispatch, FC, SetStateAction, useEffect, useState } from "react";
import { Todo } from "types/api/todo.types";
import * as Style from "./Style";

type TodoInputProps = {
  onAddTodo: any;
};

const TodoInput: FC<TodoInputProps> = ({ onAddTodo }) => {
  const [todo, onChangeTodo, setTodo] = useInput("");
  const [isDone, setIsDone] = useState<boolean>(false); // 굳이 할 필요는 없지만 state 이해를 위해 effect 함께 사용

  const onAddTodoHandler = () => {
    onAddTodo({ content: todo, setIsDone: setIsDone });
  };

  useEffect(() => {
    if (isDone) return setTodo("");
  }, [isDone]);

  return (
    <Style.Wrapper>
      <Style.Input type="text" value={todo} onChange={onChangeTodo} />
      <button onClick={onAddTodoHandler}>추가</button>
    </Style.Wrapper>
  );
};
export default TodoInput;
