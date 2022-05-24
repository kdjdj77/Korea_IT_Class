package interTest;

public interface Soldier 
{
	//인터페이스에는 static final 변수만 넣을 수 있다
	//모든 객체 공유 + 값이 바뀌지 않음
	int num = 10;
	
	public abstract void eat();
	
	//어짜피 인터페이스에는 추상메소드만 넣을 수 있기에
	//abstract 생략 가능
	public void work();
}
