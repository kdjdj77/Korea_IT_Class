import Sequelize from "sequelize";
import user from "./user.js";
import config from "../config/config.js";

const env = process.env.NODE_ENV || "development";
const dbconfig = config[env];
const db = {};

const sequelize = new Sequelize(
   dbconfig.database,
   dbconfig.username,
   dbconfig.password,
   dbconfig
);

db.User = user;

Object.keys(db).forEach(function(modelName) {
   db[modelName].init(sequelize);
});

Object.keys(db).forEach(function(modelName) {
   if(db[modelName].associate) {
      db[modelName].associate(db);
   }
});

db.sequelize = sequelize;
db.Sequelize = Sequelize;

export default db;