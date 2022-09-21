import express from "express";
import { CommentService } from "../services/commentService.js";
const router = express.Router();

router.post("/", CommentService.create);
router.get("/", CommentService.read);
router.put("/:commentId", CommentService.update);
router.delete("/:commentId", CommentService.delete);

export default router;
