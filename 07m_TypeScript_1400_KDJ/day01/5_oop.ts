interface CarDriving {
   drivingStart:() => void;
   drivingStop:() => void;
}

/* 접근제어자
private     : 외부 접근이 불가능
static      : new 클래스명()으로 선언하지 않아도 사용 가능(생성자를 만들지 않아도 된다)
protected   : 외부 접근이 불가능, 단 상속받은 자식 클리스는 접근이 가능
public      : 공공, 외부에서 접근 가능
*/
class Car {
   private driver = "김대진";
   name:string;

   constructor(name:string) {
      this.name = name
   }

   drivingStart() {}
   static drivingStop() {}

   public Driver() {
      console.log(`${this.driver}`)
   }
   public printerName() {
      console.log(`동승자는 ${this.name} 입니다`)
   }
}

// let car = new Car(); //=> 생성자를 만든다 (클래스를 활용하여 새로운 객체를 만든다)
// car.Driver();

// Car.drivingStop();

let car = new Car("홍길동");  // 생성자의 매개변수로 설정 => 의존성 부여
car.printerName();
let car2 = new Car("강백호");
car2.printerName();
let car3 = new Car("정대만");
car3.printerName();

const CarService = {
   drivingStart:function(name:string) {console.log(`동승자는 ${name} 입니다`)},
   drivingStop:function() {}
};

CarService.drivingStart("홍길동");

/* 
   // todoservice.ts
   const TodoService = {
      create:function({content, id}:any) {
         axios.post("/todo", {content, id})
      },
      delete,
      update,
      read,
      ...
   };
   // components/todo.ts
   const onTodoCreate = function() {
      TodoService.create({content:"안녕하세요", id:5});
   };
*/

// oop
// 추상화 캡슐화 은닉화... 프로그래밍에서 떼놓을 수 없는 CS 지식