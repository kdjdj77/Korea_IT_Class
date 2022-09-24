//String
   let hello: string = "hello";
   console.log(hello);

   /*const sum = function(num1, num2) {
      return: num1 + num2
   }*/
   const sum = function(num1:number, num2:number):number {
      return num1 + num2;
   };

   // sum("5", 5); -> err
   console.log(sum(5, 5));

// boolean
   let lool:boolean = true;

   /* 타입스크립트만이 가지고 있는 타입
      1. unknown, any 🤎
         unknown  => 알 수 없는 (타입스크립트에서 쓸 이유가 없음)
         any      => 아무나 (라이브러리와 같이 내가 타입을 알 수 없는 경우 사용) 
   */
   let peer:number[] = [];

// never, void
   // never(무한루프, 에러처리에 사용) : 반환값이 절대 없다는 의미
   const error = function(err:string):never {
      throw new Error(err);
   };
   // void : 반환값이 없는 경우
   const printMessage = function(message:string):void {
      console.log(message);
   };
   // selectUser:() => void // props로 함수 전달할 때 유용

// object 💩
   /* object 범위 (객체, 배열, ...)
      object의 범위가 크기 때문에 어떤 배열인지, 어떤 객체인지 타입을 정해주는 게 낫다
   */
   const obj = function(obj:object):object {
      return obj;
   };
   obj({name:"김대진"});
   obj([1, 2]);

// array
   // Array<type>, type[]
   const numberArray:Array<number> = [1, 2, 3];
   const stringArray:string[] = ["1", "2", "3"];
   // 이중배열 string[string[]]
   // Array<string[]> ==> Array<Array<string>>

// tuple
   // 배열인데 값과 길이가 정해져 있는 배열
   let student:[string, number, string]; // 길이 3
   student = ["daejin", 20, "농구"];
   const [studentName, age, hobby] = student;