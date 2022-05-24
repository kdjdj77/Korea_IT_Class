package game;

public class Animal 
{
	String name;	//캐릭터 이름
	int hp;			//캐릭터 현재 체력
	int feed;		//캐릭터 현재 먹이 개수
	
	public Animal(String name, int hp, int feed)
	{
		super();
		this.name = name;
		this.hp = hp;
		this.feed = feed;
	}
	
	private void show()
	{
		System.out.println(this.name + "의 현재체력 : " + this.hp);
		System.out.println("남은먹이 : " + this.feed);
	}
//먹이주기
	public void eat()
	{
		this.hp++;
		this.feed--;
		this.show();
	}
//산책하기
	public void walk()
	{
		this.hp--;
		this.feed++;
		this.show();
	}
//놀아주기
	public void play()
	{
		this.hp += 20;
		this.feed += 20;
		this.show();
	}
}
