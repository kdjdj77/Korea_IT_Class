import express from "express";

const app = express();
app.set("port", 3000);

app.listen(app.get("port"), function(){
   console.log(`${app.get("port")} 번 포트에서 실행 중...`)
});