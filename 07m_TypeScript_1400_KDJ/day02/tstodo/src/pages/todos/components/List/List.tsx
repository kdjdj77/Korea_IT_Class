import { TodoApi } from "apis/todoApi";
import { Dispatch, FC, SetStateAction, useEffect } from "react";
import { Todo } from "types/api/todo.types";
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

    /* 
        try{
        }catch(err){       
        }     
      */
  }, []);

  return <Styled.Wrapper>:)</Styled.Wrapper>;
};
export default TodoList;
