package classTest;

public class Student {
	// 스태틱변수(정적변수), 멤버, 멤버변수, 클래스변수
	// 모든 instance들이 값을 공유한다. 따라서 사용할때 인스턴스명.변수명 이 아니라
	// 클래스명.변수명으로 사용하는것이 바람직하다
	static String school = "고등학교";
	
	String name;
	int kor;
	int eng;
	int math;
	
	
	// alt + shift + s --> o --> enter
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	public static void f() {
		// 모든 instance 에 대해 동작이 같게 된다
		System.out.println("스태틱메소드 f() 호출됨");
//		System.out.println(name); 인스턴스에 따라 다른 값을 저장하고 있는
		// 인스턴스변수는 스태틱 변수에서 사용할 수 없다
		System.out.println(school);
	}


	public void show() {
		System.out.println("---학생정보---");
		System.out.println("이름 : " + this.name);
		System.out.println("국어점수 : " + this.kor);
		System.out.println("영어점수 : " + this.eng);
		System.out.println("수학점수 : " + this.math);
	}
}










