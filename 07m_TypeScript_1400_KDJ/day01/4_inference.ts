// 타입 추론
// 타입스크립트가 결과값을 예측하여 타입을 추론해서 부여하는 것
{
   function sum1(a:number, b:number) {
      return a + b;
      // 숫자와 숫자를 더했으니 타입스크립트가 리턴 값을 추론
   }

   sum1(1, 2);
   // 표현력을 위하여 가급적이면 추론되더라도 타입을 주는게 좋다
   // 회사의 컨벤션(규칙)에 따라 달라짐

   
}