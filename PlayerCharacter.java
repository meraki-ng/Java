
public class PlayerCharacter extends Character {

	String name;
	
	public PlayerCharacter(String name){
		this.name = name;
		
	}
	public PlayerCharacter(String name, int hp, int atk) {
		super(name, hp, atk);
		// 생성자와 비슷한 기능. 부모에게서 상속받은 것
	}
	public void heal(){
		hp += 20;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(name + "HEAL!!!");
		System.out.println(name + " HP : "+hp);
		System.out.println("@ㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳㄳ@");
	}
}
