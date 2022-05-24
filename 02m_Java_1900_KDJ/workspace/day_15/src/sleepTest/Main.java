package sleepTest;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Ω√¿€");
		System.out.print("Loading");
		for(int i = 0; i < 5; i++)
		{
			System.out.print(".");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("≥°");
	}
}
