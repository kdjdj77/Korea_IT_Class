import express from "express";
const router = express.Router();

router.get("/", function(req, res) {
   res.send("회원 조회 완료");
});
router.post("/", function(req, res) {
   res.send("회원 가입 완료");
});
router.delete("/", function(req, res) {
   res.send("회원 탈퇴 완료");
});
router.patch("/", function(req, res) {
   res.send("회원 정보 수정 완료");
});