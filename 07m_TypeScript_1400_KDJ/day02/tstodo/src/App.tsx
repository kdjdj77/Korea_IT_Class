import { Suspense } from "react";
import { useRoutes } from "react-router-dom";
import { Path } from "./router/Path";

function App() {
  const routes = useRoutes([...Path]); //[...Path, ...privatPath]
  // const isauth = TokenSevier.getToekn()....
  // const useRoutes(Route(isauth))
  return <Suspense fallback={<div>...Loading</div>}>{routes}</Suspense>;
}
export default App;
