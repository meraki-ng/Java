
public class PlayerCharacter extends Character {

	String name;
	
	public PlayerCharacter(String name){
		this.name = name;
		
	}
	public PlayerCharacter(String name, int hp, int atk) {
		super(name, hp, atk);
		// �����ڿ� ����� ���. �θ𿡰Լ� ��ӹ��� ��
	}
	public void heal(){
		hp += 20;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(name + "HEAL!!!");
		System.out.println(name + " HP : "+hp);
		System.out.println("@��������������������������������������@");
	}
}
