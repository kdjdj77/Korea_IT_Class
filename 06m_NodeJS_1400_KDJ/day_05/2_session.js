import express from "express";
import session from "express-session";

const app = express();
app.set("port", 3000);
app.use(express.json());
app.use(express.urlencoded({extended:false}));
app.use(session({
   secret: "node-secret",     // 암호키 이름
   resave: false,             // 세션이 값이 똑같으면 다시 저장X
   saveUninitialized: false, 
   // req 메시지가 들어왔을 때, session에 아무런 작업이 이루어지지 않을 때
   // 보통은 false 만약 true시 아무 내용이 없는 session이 계속 저장될 수 있음
   cookie: {
      httpOnly: true,
      maxAge: 5 * 60000,
   },
}));

app.post("/login", function(req, res) {
   const {email, password} = req.body;
   if (email === '1234' && password ==='1234') {
      req.session.member = {
         email,
         password,
      };
      res.status(201).send({message: "success"});
   } else {
      res.status(403).send({
         message: "failure", 
         error: "아이디 혹은 비밀번호가 틀렸습니다",
      });
   }
})

app.post("/logout", function(req, res) {
   console.log(req.session.member);
   req.session.destroy(function() {
      console.log("로그아웃이 실행되었습니다");
   });
   res.status(200).send({message:"success"});
});

app.listen(app.get("port"), function() {
   console.log(`${app.get("port")}번으로 서버 실행 중`);
});