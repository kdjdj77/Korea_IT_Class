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

  const onAddTodo = async ({ content, setIsDone }: any) => {
    setIsDone(false);
    if (content.trim() === "") return;
    try {
      const response = await TodoApi.addTodo({ data: { content } });
      const { data } = response;
      if (!data.message) return;
      setTodos([...todos, data.data]);
      setIsDone(true);
    } catch (err) {
      console.error(err);
    }
  };

  return (
    <>
      <TodoList todos={todos} setTodos={setTodos} />
      <TodoInput onAddTodo={onAddTodo} />
    </>
  );
};
export default TodosPage;
