import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App'; //App도 컴포넌트이다
/*
컴포넌트 -> page -> 각 url에 맞게 App.js 해당 컴포넌트들 보여줄 수 있도록 설계
-> 해당 App.js를 index.js가 가지고 와서 public 폴더의 index.html의 root에 render

return() --> render()
*/
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode> 
    {/* 엄격 검사 */}
    <App />
  </React.StrictMode>
);
