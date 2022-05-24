package getterSetterTest;

public class Main {
	public static void main(String[] args) {
//		Student kim = new Student();
//		Student park = new Student("박영희", 100, 100, 100);
//		Student hong = new Student("홍길동", 70, 70, 70);
//		
////		kim.name = "김철수";
//		kim.setName("김철수");
//		// 김철수의 국어 점수는 100 점, 영어점수 70, 수학점수 50 점이다
//		// 해당 값들을 kim 이라는 객체 속 인스턴스 변수에 저장하고,
////		kim.kor = 100;
//		kim.setKor(100);
////		kim.kor = -500;
////		kim.eng = 70;
//		kim.setEng(70);
////		kim.math = 50;
//		kim.setMath(50);
//		
////		System.out.println(kim.name);
////		System.out.println(kim.getName());
//		// ---김철수 성적정보---
//		// 국어 : 100점
//		// 영어 : 70점
//		// 수학 : 50점
//		// 평균점수 : 00.00점
//		System.out.println("---" + kim.getName() + "성적정보---");
//		System.out.println("국어 : " + kim.getKor());
//		System.out.println("영어 : " + kim.getEng());
//		System.out.println("수학 : " + kim.getMath());
//		System.out.println("평균점수 : " + (kim.getKor() + kim.getEng()+ kim.getMath()) / 3.0);
//		
		//------------------------------------------------------
		//객체타입 배열 kim, park, hong이 요소로 들어있는 배열
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int[] ar = {100, 200, 300};
		
		Student[] students = {
				new Student("김철수", 50,50,50), 
				new Student("박영희", 100,100,100), 
				new Student("홍길동",50,50,50)
				};
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
	}
}

























