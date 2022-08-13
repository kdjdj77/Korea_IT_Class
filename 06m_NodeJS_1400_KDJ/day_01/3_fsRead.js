import fs from "fs";
let text = null;

const fsPromise = fs.promises;

//동기///////////////////////////////////////////////
try {
   text = fs.readFileSync("./text1.txt", "utf-8");
   console.log(text);
} catch(err) {
   console.log("파일 읽기 실패");
} finally {
   console.log("결과 값과 상관없이 실행");
}

//비동기//////////////////////////////////////////////
fs.readFile("./text2.txt", "utf-8", function(err, data) {
   if(data) console.log(data);
   else console.log(err);
})

//비동기//////////////////////////////////////////////
fsPromise
   .readFile("./day_01.txt", "utf-8")
   .then(function(result) {
      console.log(result); // 성공 후 실행할 내용
   })
   .catch(function(err) {
      console.log(err);    // 실패 시 실행 할 내용
   })