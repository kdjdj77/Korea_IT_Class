/* 
파일명.부가설명.확장자
ex) todos.types.ts
ex) redux.utils.ts
// 투두의 타입을 담은 ts문서입니다
*/

export type Todo = {
  id: number;
  createdAt: string;
  updatedAt: string;
  content: string;
  flag: number;
};
