import express from "express";
const router = express.Router();

router.get("/", function(req, res) {
   res.send("댓글 조회 완료");
});
router.post("/", function(req, res) {
   res.send("댓글 등록 완료");
});
router.delete("/", function(req, res) {
   res.send("댓글 삭제 완료");
});
router.patch("/", function(req, res) {
   res.send("댓글 수정 완료");
});