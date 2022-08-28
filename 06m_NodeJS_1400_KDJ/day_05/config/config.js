import dotenv from "dotenv";
// const dotenv = require('dotenv');

dotenv.config();
// dotenv 사용 선언문

export default {
    development: {
        username: "root",
        password: process.env.DB_PASSWORD,
        database: "testdb",
        host: "127.0.0.1",
        port: "3306",
        dialect: "mysql",
    },
    test: {
        username: "root",
        password: process.env.DB_PASSWORD,
        database: "testdb",
        host: "127.0.0.1",
        port: "3306",
        dialect: "mysql",
    },
    production: {
        username: "root",
        password: process.env.DB_PASSWORD,
        database: "testdb",
        host: "127.0.0.1",
        port: "3306",
        dialect: "mysql",
    },
};
