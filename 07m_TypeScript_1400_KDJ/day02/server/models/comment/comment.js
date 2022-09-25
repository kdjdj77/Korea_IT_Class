import Sequelize, { Model } from "sequelize";

class Comment extends Model {
    static init(sequelize) {
        return super.init(
            {
                title: {
                    type: Sequelize.STRING(300),
                    allowNull: false,
                    comment: "내용",
                },
                content: {
                    type: Sequelize.TEXT,
                    allowNull: false,
                    comment: "내용",
                },
            },
            {
                modelName: "Comment",
                tableName: "comments",
                charset: "utf8mb4",
                collate: "utf8mb4_general_ci",
                timestamps: true,
                createdAt: true,
                updatedAt: true,
                paranoid: false,
                sequelize,
            }
        );
    }
}
export default Comment;
