import { lazy } from "react";
const TodosPage = lazy(() => import("pages/todos"));

// react 18버전에서 업그레이드 된 suspense
// 비동기 통신동안 컴포넌트 불러오는 기간을 lazy
// 비동기 통신동안 원하는 로딩 페이지나, 로딩바, 스피너

export const Path = [
  {
    // element: <FullLayout />,
    // children: [
    //     {
    //         path: "/",
    //         element: <TodosPage/>
    //     }
    // ]
    path: "/",
    element: <TodosPage />,
  },
];
