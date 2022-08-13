import fs from "fs";
const fsPromise = fs.promises;
//const fs = require("fs");  // nodeJS 기본 지원 라이브러리(모듈), 설치 필요 X
//const fsPromise = require("fs").promises;

//비동기/////////////////////////////////////////////////////////
const data = "오늘 저녁은 닭갈비입니다. Hello NodeJS!"
fs.writeFile("./text1.txt", data, "utf-8", function(err) {
   if(err) console.log(err);
   else console.log("파일이 정상적으로 저장되었습니다");
})
//비동기/////////////////////////////////////////////////////////
fsPromise.writeFile("./text2.txt", data, "utf-8")
   .then(function() {
      return console.log("파일이 정상적으로 저장되었습니다");
   })
   .catch(function(err) {
      console.log(err);
   });
//동기//////////////////////////////////////////////////////////
try {
   fs.writeFileSync("./text3.txt", data, "utf-8");
} catch(err) {
   console.log(err);
}