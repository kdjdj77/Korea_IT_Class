import express from "express";
import post from "./routers/post/post.js";
import comment from "./routers/post/comment.js";
import user from "./routers/user.js";

const app = express();
app.set("port", 3000);

// app.get("/post", (req, res) => {
//     // 게시글 조회
// });
// app.post("/post", (req, res) => {
//     // 게시글 작성
// });
// app.delete("/post", (req, res) => {
//     // 게시글 삭제
// });
// app.put("/post", (req, res) => {
//     // 게시글 수정
// });

// app.get("/comment", (req, res) => {
//     // 댓글 조회
// });
// app.post("/comment", (req, res) => {
//     // 댓글 작성
// });
// app.delete("/comment", (req, res) => {
//     // 댓글 삭제
// });
// app.put("/comment", (req, res) => {
//     // 댓글 수정
// });

// app.get("/user", (req, res) => {
//     // 회원 조회
// });
// app.post("/user", (req, res) => {
//     // 회원 가입
// });
// app.delete("/user", (req, res) => {
//     // 회원 탈퇴
// });
// app.put("/user", (req, res) => {
//     // 회원 정보 수정
// });

/* 기본경로명, router "/" === "/post" */
app.use("/post", post);
app.use("/comment", comment);
app.use("/user", user);

app.listen(app.get("port"), () => {
    console.log(`${app.get("port")}번 포트에서 실행 중`);
});
