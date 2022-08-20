import express from "express";
import morgan from "morgan";
import path from "path";

//npm i morgan
//npm i express -> express 서버 설정

const app = express();
app.set("port", 3000);  //변수 설정

/*
   morgan (log)
   로그를 찍어줌
   모드로는 dev, combined, common, short, tiny
   보통 개발용은 dev, 배포용은 combined를 사용
*/
app.use(morgan("combined"));

//----------------------------------------------------------------------
/*
   body-parser
   express 4.16.0부터 기본 내장
   데이터 허용 여부와, req message로 전달받은 body의 데이터 해석
*/
app.use(express.json());   //json 허용
app.use(express.urlencoded({extended:false}));
//url에 있는 정보를 express 내장 해석툴로 읽을 것이냐
/*
   extended => false인 경우
      nodeJS에 내장된 querystring모듈
   extended => true인 경우
      추가로 설치하여 외부 해석툴 qs로 해석
*/

//---------------------------------------------------------------
/*
   static
   express 탑재, 정적인 파일을 제공
*/
const __dirname = path.resolve();
app.use("/public", express.static(path.join(__dirname, "public")));
// 원래는 localhost:3000/public/style/style.css 처럼 접근하지만
// public/style/style.css처럼 경로를 바꿀 수 있음


//--------------------------------------------------------------
app.listen(app.get("port"), function() {
   //서버 구동
   console.log(`${app.get("port")}번으로 서버 실행 중`);
});

app.get("/", function(req, res) {
   res.send("Hello express");
});
app.get("/body", function(req, res) {
   res.sendFile(__dirname + "/_body.html");
});