package throwTest;

import java.util.InputMismatchException;

public class Method {
	
	public void setNickName(String nick) throws BadWordException{
		if(nick.equals("�ٺ�")) {
			throw new BadWordException("�ٺ��δ� �����Ұ�");
		}
		System.out.println("����� nickname��" + nick + "���� �����Ǿ����ϴ�!");
	}
	
	
	public void f2() throws InterruptedException, ArrayIndexOutOfBoundsException, InputMismatchException{
		
		Thread.sleep(3000);
		
		System.out.println("����");
	}
	
	public void f(int num) {
		if(num == 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		System.out.println("�޼ҵ� ���� �����");
	}
}
