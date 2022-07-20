/*
    앞글자만 대문자로 만들기

입력예]
i am a PROGRAMMER

출력예]
I Am A Programmer

*/

const letterCapitalize = function(text) {
   // *배열 메소드를 사용하지 않은 버젼
   text = text.toLowerCase(); // 일단 죄다 소문자로.
   const arr = text.trim().split(/\s+/); // 공백으로 단어 쪼개기

   let result = ""; // 결과 문장
   for(let i = 0; i < arr.length; i++){  // 각 단어별로.
       let first = arr[i].charAt(0); // 첫글자 분리
       let rest = arr[i].slice(1);  // 두번째 글자부터 끝까지
       first = first.toUpperCase(); // 첫글자만 대문자로

       result = result.concat(first, rest); // 단어 다시 합치기

       // 문장 조립하기
       if (i < arr.length - 1) {
           result = result.concat(" ");   // 맨 끝이 아니면 공백 추가
       }
   }

  return result;
}
   
let value = "i am a PROGRAMMER";
console.log(letterCapitalize(value));