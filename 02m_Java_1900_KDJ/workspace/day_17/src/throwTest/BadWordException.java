package throwTest;

public class BadWordException extends RuntimeException{
	public BadWordException() {
		
	}
	
	public BadWordException(String s) {
		super(s);
	}
}
