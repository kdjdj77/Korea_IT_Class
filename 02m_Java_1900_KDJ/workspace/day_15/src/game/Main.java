package game;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Animal avatar = null;
		
		System.out.println("---모여라 동물 친구들---");
		while (true)
		{
			System.out.println("---캐릭터 선택---");
			System.out.println("1. 강아지");
			System.out.println("2. 고양이");
			System.out.println("3. 도마뱀");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if (choice != 1 && choice != 2 && choice != 3)
			{
				System.out.println("알맞은 캐릭터를 선택하시오");
				continue;
			}
			System.out.print("캐릭터 이름 설정 >> ");
			String name = sc.nextLine();
			
			if (choice == 1)
			{
				//업캐스팅
				avatar = new Dog(name, 50, 50);
				break;
			}
			else if (choice == 2)
			{
				//업캐스팅
				avatar = new Cat(name, 100, 15);
				break;
			}
			else if (choice == 3)
			{
				//업캐스팅
				avatar = new Lizard(name, 20, 10);
				break;
			}
			break;
		}
		
		while(true)
		{
			System.out.println("1. 먹이주기");
			System.out.println("2. 산책하기");
			System.out.println("3. 놀아주기");
			System.out.println("4. 종료하기");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) avatar.eat();
			else if (choice == 2) avatar.walk();
			else if (choice == 3) avatar.play();
			else if (choice == 4) 
			{
				System.out.println("게임을 종료합니다");
				if (avatar instanceof Cat)
					((Cat)avatar).onlyCat();
				break;
			}
			else System.out.println("잘못 입력했습니다");
		}
		sc.close();
	}
}