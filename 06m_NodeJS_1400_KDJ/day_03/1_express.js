// npm i morgan
// npm i express -> express 서버설정

import express from "express"; // import
import morgan from "morgan";
import path from "path";

const app = express();
app.set("port", 3000); // 변수 설정

//미들웨어

/* 
morgan (log)
로그를 찍어줌
모드로는 dev, combined, common, short, tiny
보통 개발용은 dev, 배포용은 combined를 사용
*/
app.use(morgan("combined"));

/*
body-parser
express 4.16.0부터 기본 내장
데이터 형식 허용 여부와, req message로 전달받은 body의 데이터의 해석 
*/
app.use(express.json()); // json 데이터를 읽는 것을 허용
app.use(express.urlencoded({ extended: false }));
// url에 있는 정보를 express 내에 있는 해석툴로 읽을 것이냐
// extended => false (nodeJS에 내장된 qureystring 모듈)
// extended => true (추가로 설치하여 외부 해석툴 qs로 해석)

/* 
static
express 탑재, 정적인 파일을 제공
*/
const __dirname = path.resolve();
app.use("/", express.static(path.join(__dirname, "public")));

// 웹서버에 있는 정적인 파일에 접근하기 위해 사용
// 사용자가 https://www.백엔드주소.com/ ---> public 폴더로 접근이 가능
// https://www.백엔드주소.com/_body.html ---> public 폴더의 _body.html로 접근

app.listen(app.get("port"), () => {
    // 서버 구동
    console.log(`${app.get("port")}번으로 서버 실행 중`);
});

app.get("/", (req, res) => {
    res.send("Hello express");
});

app.get("/body", (req, res) => {
    res.sendFile("./public/_body.html");
});
