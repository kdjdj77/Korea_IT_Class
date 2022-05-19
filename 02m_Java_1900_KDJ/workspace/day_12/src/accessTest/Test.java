package accessTest;

public class Test {
	public int a;
	protected int b;
	int c; // default
	private int d;
	
	public void f() {
		this.a = 10;
		this.b = 10;
		this.c = 10;
		this.d = 10;
		this.f1();
		this.f2();
		this.f3();
		this.f4();
	}
	
	public void f1() {
		System.out.println("public");
	}
	protected void f2() {
		System.out.println("protected");
	}
	void f3() {
		System.out.println("default");
	}
	private void f4() {
		System.out.println("private");
	}
}
