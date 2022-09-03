import express from "express";
import { isLoggedin } from "../middleware/auth.js";
import PostService from "../service/post.js";

const router = express.Router();
router.post("/", isLoggedin, PostService.create);
router.put("/", isLoggedin, PostService.update);
router.get("/all", PostService.readAll);
router.get("/:postId", PostService.read);
router.delete("/:postId", isLoggedin, PostService.delete);

export default router;