package game;

public class Animal 
{
	String name;	//ĳ���� �̸�
	int hp;			//ĳ���� ���� ü��
	int feed;		//ĳ���� ���� ���� ����
	
	public Animal(String name, int hp, int feed)
	{
		super();
		this.name = name;
		this.hp = hp;
		this.feed = feed;
	}
	
	private void show()
	{
		System.out.println(this.name + "�� ����ü�� : " + this.hp);
		System.out.println("�������� : " + this.feed);
	}
//�����ֱ�
	public void eat()
	{
		this.hp++;
		this.feed--;
		this.show();
	}
//��å�ϱ�
	public void walk()
	{
		this.hp--;
		this.feed++;
		this.show();
	}
//����ֱ�
	public void play()
	{
		this.hp += 20;
		this.feed += 20;
		this.show();
	}
}
