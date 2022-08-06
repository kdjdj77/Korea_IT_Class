import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { useEffect } from 'react';
import MainPage from './pages/mainPage';
import BlogPage from './pages/blogPage';
import ChatPage from './pages/chatPage';
import LoginPage from './pages/loginPage';
import SignPage from './pages/signPage';
import MyBlogLayOut from "./_layout/myBlogLayOut"
import GlobalStyle from './style/global';

function App() {
  useEffect(function() {
    console.log(`기본지원 모드 : ${process.env.NODE_ENV}`);
    //개발용 / 배포용 구분
    //리액트에서 자체지원
    //npm start => development
    //npm build => production
  }, []);
  return (
    <BrowserRouter>
    <GlobalStyle/>
      <MyBlogLayOut>
        <Routes>
          <Route path={"/"} element={<MainPage/>}/>
          <Route path={"/login"} element={<LoginPage/>}/>
          <Route path={"/sign"} element={<SignPage/>}/>
          <Route path={"/blog/:id"} element={<BlogPage/>}/>
          <Route path={"/chat"} element={<ChatPage/>}/>
        </Routes>
      </MyBlogLayOut>
    </BrowserRouter>
  );
}

export default App;
