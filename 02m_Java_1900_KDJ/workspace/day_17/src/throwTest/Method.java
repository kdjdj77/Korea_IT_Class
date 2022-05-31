package throwTest;

import java.util.InputMismatchException;

public class Method {
	
	public void setNickName(String nick) throws BadWordException{
		if(nick.equals("바보")) {
			throw new BadWordException("바보로는 설정불가");
		}
		System.out.println("당신의 nickname은" + nick + "으로 설정되었습니다!");
	}
	
	
	public void f2() throws InterruptedException, ArrayIndexOutOfBoundsException, InputMismatchException{
		
		Thread.sleep(3000);
		
		System.out.println("동작");
	}
	
	public void f(int num) {
		if(num == 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		System.out.println("메소드 정상 종료됨");
	}
}
