package day02;

public class ClassTest {
	
	public static void printStudent(Student s) {
		System.out.println("---학생정보---");
		System.out.println("이름 : " + s.name);
		System.out.println("국어점수 : " + s.kor);
		System.out.println("영어점수 : " + s.eng);
		System.out.println("수학점수 : " + s.math);
	}
	
	public static void main(String[] args) {
//		String name = "김철수";
//		int kor = 100;
//		int eng = 70;
//		int math = 50;
//		
//		String name1 = "홍길동";
//		int kor1 = 50;
//		int eng1 = 30;
//		int math1 = 40;
		
		// kim : 객체 혹은 인스턴스
		// new : 메모리에 할당시켜주는 연산자
		// Student() : 생성자
		Student kim = new Student("김철수", 100, 70, 50); // 객체화
		Student hong = new Student("홍길동", 50, 30, 40);

		
//		kim.setVariables("김철수", 100, 70, 50);
//		kim.name = "김철수";
//		kim.kor = 100;
//		kim.eng = 70;
//		kim.math = 50;
//		
//		hong.setVariables("홍길동", 50, 30, 40);
//		hong.name = "홍길동";
//		hong.kor = 50;
//		hong.eng = 30;
//		hong.math = 40;
	
		kim.show();
		hong.show();
		
		ClassTest.printStudent(kim);
//		System.out.println("---학생정보---");
//		System.out.println("이름 : " + kim.name);
//		System.out.println("국어점수 : " + kim.kor);
//		System.out.println("영어점수 : " + kim.eng);
//		System.out.println("수학점수 : " + kim.math);
//		
		ClassTest.printStudent(hong);
//		System.out.println("---학생정보---");
//		System.out.println("이름 : " + hong.name);
//		System.out.println("국어점수 : " + hong.kor);
//		System.out.println("영어점수 : " + hong.eng);
//		System.out.println("수학점수 : " + hong.math);
//		
		
		
		Student s1 = new Student("박영희", 100, 100, 100);
		s1.show();
		
		Student s2 = new Student();
		
	}
}

class Student{ // 필드
	
	String name; // 멤버, 멤버변수, 인스턴스변수
	int kor;// 멤버, 멤버변수, 인스턴스변수
	int eng;// 멤버, 멤버변수, 인스턴스변수
	int math;// 멤버, 멤버변수, 인스턴스변수
	
	public Student() { // 기본생성자
		
	}
	
	// 초기화 생성자
	public Student(String name, int kor, int eng, int num3) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		math = num3;
	}
	
	// 멤버, 멤버 함수 == 메소드
	public void setVariables(String s, int num1, int num2, int num3) {
		name = s;
		kor = num1;
		eng = num2;
		math = num3;
	}
	
	// 멤버, 멤버 함수 == 메소드
	public void show() {
		System.out.println("show() 메소드 실행됨");
		System.out.println("---학생정보---");
		System.out.println("이름 : " + this.name);
		System.out.println("국어점수 : " + this.kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
	}
}

















