import './App.css';
import Todo from "./page/todo";

// 내가 만들게 된 컴포넌트들의 상위 파일
// url 명시 -- react-router-dom
// 화면에 App.js가 보여지는 것 (정확히 말하면 index.html이 보여지는데, 
// index.js가 index.html의 root라는 <div>dp app.js의 return을 보여주는 것)

function App() {
  return(
    <> {/* == div */}
      <Todo/>
      <div></div>
    </>
  );
}

export default App;
