import Sequelize from "sequelize";
import db from ".";

export default class Post extends Sequelize.Model {
   static init(sequelize) {
      return super.init(
         {
            content: {
               type:Sequelize.TEXT,
               allowNull:false,
            },            
         },
         {
            sequelize,
            timestamps: true,
            modelName: "Post",
            tableName: "posts",
            charset: "utf8mb4", // 이모티콘, 이모지
            collage: "utf8mb4_general_ci" // 이모티콘, 이모지
         }
      )
   }
   static associate(db) {
      db.User.hasMany(db.Post, {foreignKey: "userIdx"});
   }
}