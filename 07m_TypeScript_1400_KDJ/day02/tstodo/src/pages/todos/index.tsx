import { TodoApi } from "apis/todoApi";
import { FC, useEffect, useState } from "react";
import { Todo } from "types/api/todo.types";
import TodoInput from "./components/Input/Input";
import TodoList from "./components/List/List";

type TodopageProps = {
  isative?: boolean;
};

const TodosPage: FC<TodopageProps> = ({ isative }): JSX.Element => {
  const [todos, setTodos] = useState<Todo[]>([]);

  return (
    <>
      <TodoList todos={todos} setTodos={setTodos} />
      <TodoInput />
    </>
  );
};
export default TodosPage;
