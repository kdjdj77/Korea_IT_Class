import express from "express";
import jwt from "jsonwebtoken";
import cookieParser from "cookie-parser";
import dotenv from "dotenv";

const app = express();
app.set("port", 3000);
app.use(cookieParser("secret"));
app.use(express.json());
app.use(express.urlencoded({extended:false}));
dotenv.config();

/*기본 쿠키 설정*/
app.post("/setcookie", function(req, res) {
   try{
      res.cookie(
         "token", 
         {
            token: "token",
            expired: 5 * 60000
         },
         {
            maxAge:5 * 60000,
            httpOnly: true, //(웹 서버를 통해서만 사용이 가능) ☆☆중요
            //secure: true, //(https에서만 사용이 가능)
            //signed: true, //(암호화된 쿠키) + cookieParser()안에 암호화 키 등록
         }
      )
      res.send({message:"success"});
   } catch(err) {
      console.log(err);
      next(err); //에러 핸들링
      // next() 인 경우 다음 미들웨어 실행
   }
});

app.get("/showcookie", function(req, res) {
   console.log(req.cookies.token);
   res.send(req.cookies.token);
   //signed:true => res.send(res.signedCookies.token)
});

app.post("/clearcookie", function(req, res) {
   res.clearCookie("token");
   res.send({message:"success"});
})

/*jwt token*/
app.post("/jwtsetcookie", function(req, res, next) {
   try{
      const token = jwt.sign({email: req.body.email}, process.env.SECRET_JWT_TOKEN_KEY);
                              // ↑ 암호화하고싶은 객체           ↑ 암호화 키
      res.cookie("access_token", token, {httpOnly:true});
      res.header("authorize", token);
      res.send({message:"success"});
   } catch(err) {
      console.log(err);
      next(err);
   }
});

app.get("/jwtshowcookie", function(req, res) {
   const token = req.cookies.access_token;
   console.log(jwt.verify(token, process.env.SECRET_JWT_TOKEN_KEY));
   //jwt.verify(token, 복호화 키) 복호화키, 정상적인 토큰인지 검사
   //jwt.decode(token) 복호화 키 없이 해석
   res.send(req.cookies.access_token);
});

/* server */
app.listen(app.get("port"), function() {
   console.log(`${app.get("port")}번으로 서버 실행 중`);
});