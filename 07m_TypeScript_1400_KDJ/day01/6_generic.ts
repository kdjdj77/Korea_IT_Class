// 내일 할 것
// ts todo 만들기
// react 만이 가지고 있는 타입
// typescript로 cra 만들기
// linter + prettier *** 문법, 코드 포멧팅
// husky
// jest testcode + [배포]

/*
   html, css, js
   reactjs, ts, redux [react-query, recoil, storyook...]
   nextjs
   nodejs, express, 백엔드와의 협업
   git을 통한 협업
   ---------------
   testcode
*/

// generic(any 대신 사용, 마법상자 같은 역할)
   /* (string밖에 검사하지 못한다)
      const checkNull = function(arg:string | null):string {
         if (arg = null) {
            throw new Error("값이 비어있습니다")
         } else return arg;
      };
   */
   const checkNull = function(arg:any | null):any {
      if (arg === null) {
         throw new Error("값이 비어있습니다")
      } else return arg;
   };

   // T, G, D (어떤 타입이 오든 T,G,D가 타입을 바꿔서 실행)
   function checkNullG<G>(arg:G | null):G {
      if (arg === null) {
         throw new Error("값이 비어있습니다");
      } else return arg;
   }