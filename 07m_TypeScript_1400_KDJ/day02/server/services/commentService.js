import { Op } from "sequelize";
import Comment from "../models/comment/comment.js";
import { HandlerError } from "../util/handleError.js";
import { FailureData, SuccessData } from "../util/resultData.js";

export class CommentService {
    static async create(req, res, next) {
        try {
            const todo = await Comment.create({
                title: req.body.title,
                content: req.body.content,
            });
            res.status(200).json(SuccessData(todo));
        } catch (err) {
            HandlerError(err, next);
        }
    }

    static async read(req, res, next) {
        try {
            const where = {};
            if (parseInt(req.query.lastId, 10)) {
                where.id = {
                    [Op.lt]: parseInt(req.query.lastId, 10),
                };
            }

            let order = [[req.query.sort, req.query.orderby]];
            let limit = parseInt(req.query.limt, 10);

            const comments = await Comment.findAll({ where, order, limit });
            if (comments.length <= 0) {
                res.status(400).json(FailureData("일치하는 조건의 댓글이 없습니다"));
            }
            res.status(400).json(SuccessData(comments));
        } catch (err) {
            HandlerError(err, next);
        }
    }

    static async update(req, res, next) {
        try {
            const comment = await Comment.findOne({
                where: { id: parseInt(req.params.commentId, 10) },
            });

            if (!comment) {
                res.status(400).json(FailureData("존재하지 않는 댓글입니다"));
            }

            await Comment.update(
                {
                    title: req.body.title,
                    content: req.body.content,
                },
                {
                    where: { id: parseInt(req.params.commentId, 10) },
                }
            );

            const fullComment = {
                id: parseInt(req.params.commentId, 10),
                title: req.body.title,
                content: req.body.content,
            };

            res.status(200).json(SuccessData(fullComment));
        } catch (err) {
            HandlerError(err, next);
        }
    }

    static async delete(req, res, next) {
        try {
            const comment = await Comment.findOne({
                where: { id: parseInt(req.params.commentId, 10) },
            });

            if (!comment) {
                res.status(400).json(FailureData("존재하지 않는 댓글입니다"));
            }

            await Comment.destroy({
                where: { id: parseInt(req.params.commentId, 10) },
            });

            res.status(400).json(SuccessData(parseInt(req.params.commentId, 10)));
        } catch (err) {
            HandlerError(err, next);
        }
    }
}
