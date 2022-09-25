import { axiosApiInstance } from "./base";

export const TodoApi = {
  addTodo: async ({ data }: any) => {
    return await axiosApiInstance.post("/todo", data);
  },

  getListALL: async () => {
    return await axiosApiInstance.get("/todo");
  },

  getList: async ({ params }: any) => {
    return await axiosApiInstance.get("/todo", params);
    /* params : {
        page: 3 // lastId: 21
        sort: createdAt
        order: desc
    }

    ==> /todo?page=3&sort=createdAt&order=desc
    */
  },

  updateTodo: async ({ data, todoId }: any) => {
    return await axiosApiInstance.put(`/todo/${todoId}`, data);
  },

  deleteTodo: async ({ todoId }: any) => {
    return await axiosApiInstance.delete(`/todo/${todoId}`);
  },
};

// a라는 코드보다 b라는 코드가 더 짧다 x
// b라는 코드는 이래이래 해서 a코드 보다 더 좋기 때문에 b코드를 사용해야한다 o
