package getterSetterTest;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 세터 : private 변수에 값을 저장해주는 메소드, 보통 set변수명() 으로 이름을 짓는다
	// 게터 : private 변수에 저장되어있는 값을 return 해주는 메소드로 보통 get변수명() 으로 이름을 짓는다
	// 단축키 : alt + shift + s -> r -> alt + a -> alt + r
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;			
		}
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
















