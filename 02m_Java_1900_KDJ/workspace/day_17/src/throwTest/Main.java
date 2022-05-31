package throwTest;

import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Method m = new Method();
		
	
		m.setNickName("¹Ùº¸");
		
		
		try {
			m.f2();
		} catch (ArrayIndexOutOfBoundsException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InputMismatchException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			m.f(1);
		}catch(Exception e) {
			
		}
		
		
	}
}

