package 선택제어문.자가진단03;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 20) 
			System.out.println("adult");
		else 
			System.out.println((20 - age) +" years later");	
		sc.close();
	}
}
