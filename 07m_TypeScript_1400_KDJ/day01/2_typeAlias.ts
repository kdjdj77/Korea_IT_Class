// typeAlias
// 어떠한 것에도 타입을 줄 수 있다
{
   type Text = string;
   const name:Text = "daejin";

   // 값이나 value도 type화 시킬 수 있다
   type TextString = "안녕하세요";
   const nameString:TextString = "안녕하세요";

   // type, interface
   type UserInfo = {
      id?:number;
      name?:string;
      hobby?:string;
   } // ?:를 통해 있으면 값 할당, 없으면 할당X
   const User:UserInfo[] = [
      {
         id:3,
         name:"daejin",
         hobby:"농구",
      },
      {},{},{},
   ];

   // data?.data (data가 있다면 .data 가져옴)
   // data!.data (data가 있다고 확신할 때 사용)

// union type(or), interserction type
   type store = "옷가게" | "신발가게" | "와인가게";
   type year = string | number;

   let storeKind: store = "와인가게";
   let year:year = "2022.02.02";
   year = 2022;
   // year = true;
   // ex) button type = "submit" | "default"
   // ex) string | undefined

   type Student = {
      name:string;
      score:number;
   };
   type WebUser = {
      nickname:string;
      posting?:() => void;
   };
   const internet = function(person:Student & WebUser) {
      console.log(person.name, person.score);
   };
   internet({
      name:"김대진",
      score:32,
      nickname:"daejin",
      // posting:function() {console.log("글을 작성하였습니다");},
   })
};