// interface
// 설계도 : 이 안에 있는 것은 반드시 구현되어야만 하는 것

type User = {
   id:number;
   name:string;
};

type reply = {
   User:User;
   content:string;
};

interface Post {
   id:number,
   content:string;
   User:User;
};

interface Post {
   Comments:reply[];
}
// type alias와 다르게 interface는 중복 선언이 가능
// 다음에 선언한 interface와 이전에 선언한 interface 합쳐짐
// interface는 class 적용이 가능

// * type alias와 interface의 타입

// 일반적으로 인터페이스와 클래스를 최종 타입으로 많이 사용하는 편
// union이나 tuple을 정의할 때 type alias를 사용

const Post:Post = {
   id:3,
   content:"안녕하세요",
   User: {
      id:2,
      name:"김대진",
   },
   Comments: [
      {
         User:{
            id:2,
            name:"김대진",
         },
         content:"안녕하세요1",
      },
      {
         User:{
            id:3,
            name:"홍길동",
         },
         content:"안녕하세요2",
      },
      {
         User:{
            id:4,
            name:"강백호",
         },
         content:"안녕하세요3",
      },
   ],
}
