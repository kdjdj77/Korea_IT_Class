import { TodoApi } from "apis/todoApi";
import { Dispatch, FC, SetStateAction, useEffect, useState } from "react";
import { Todo } from "types/api/todo.types";
import TodoItem from "../item/Item";
import * as Styled from "./Style";

type TodoListProps = {
  todos: Todo[];
  setTodos: Dispatch<SetStateAction<Todo[]>>;
};

const TodoList: FC<TodoListProps> = ({ todos, setTodos }): JSX.Element => {
  useEffect(() => {
    TodoApi.getListALL()
      .then((res: any) => {
        setTodos(res.data.data);
      })
      .catch((err: any) => {
        console.error(err);
      });
  }, []);

  // edit handler
  const onEditFlag = ({ id, flag, content }: any) => {
    TodoApi.updateTodo({
      todoId: id,
      data: {
        flag: flag,
        content,
      },
    }).then((res) => {
      const result = res.data;
      if (result.message === true) {
        const newTodos = [...todos];
        const todo = newTodos.find((todo) => todo.id === result.data.id);
        if (!todo) return;
        todo.flag = parseInt(result.data.flag);
        setTodos(newTodos);
      }
    });
  };

  const onEditContent = ({ id, content, flag, setEdit }: any) => {
    TodoApi.updateTodo({
      todoId: id,
      data: {
        flag: flag,
        content,
      },
    }).then((res) => {
      const result = res.data;
      if (result.message === true) {
        const newTodos = [...todos];
        const todo = newTodos.find((todo) => todo.id === result.data.id);
        if (!todo) return;
        todo.content = result.data.content;
        setTodos(newTodos);
        setEdit(false);
      }
    });
  };
  // delete handler
  const onDeleteTodo = async ({ id }: any) => {
    try {
      const response = await TodoApi.deleteTodo({ todoId: id });
      const { data } = response;
      if (!data.message) return alert(data.reason);
      const newTodos = todos.filter((todo) => todo.id !== data.data);
      setTodos(newTodos);
    } catch (err) {
      console.error(err);
    }
  };

  return (
    <Styled.Wrapper>
      <Styled.List>
        {todos.map((todo) => {
          return (
            <TodoItem
              todo={todo}
              key={todo.id}
              onEditFlag={onEditFlag}
              onEditContent={onEditContent}
              onDeleteTodo={onDeleteTodo}
            />
          );
        })}
      </Styled.List>
    </Styled.Wrapper>
  );
};
export default TodoList;
