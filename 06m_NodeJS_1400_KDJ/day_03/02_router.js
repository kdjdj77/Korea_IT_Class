import express from "express";
import post from "./routers/post/post";
import comment from "./routers/post/comment";
import user from "./routers/user";

const app = express();
app.set("port", 3000);
/*
app.get("/post", function(req, res) {});     //게시글 조회
app.post("/post", function(req, res) {});    //게시글 작성
app.delete("/post", function(req, res) {});  //게시글 삭제
app.put("/post", function(req, res) {});     //게시글 수정

app.get("/comment", function(req, res) {});     //댓글 조회
app.post("/comment", function(req, res) {});    //댓글 작성
app.delete("/comment", function(req, res) {});  //댓글 삭제
app.put("/comment", function(req, res) {});     //댓글 수정

app.get("/user", function(req, res) {});     //회원정보 조회
app.post("/user", function(req, res) {});    //회원가입
app.delete("/user", function(req, res) {});  //회원탈퇴
app.put("/user", function(req, res) {});     //회원정보 수정
*/
app.use("/port", post);
app.use("/comment", comment);
app.use("/user", user);

app.listen(app.get("port"), function() {
   console.log(`${app.get("port")}번 포트에서 실행 중`);
});