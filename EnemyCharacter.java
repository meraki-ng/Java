
public class EnemyCharacter extends Character{

	String enemy;
	
	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk);
		// 생성자와 비슷한 기능. 부모에게서 상속받은 것
	}
	public void attack(Character enemy){
		
		if(hp <= 20 ){
			System.out.println("Orc is ANGRY !!!!!!!!! ....>0<!!!!");
			this.atk +=15;
		}
		//추가된 공격력이 됨
		super.attack(enemy);
		
		//이렇게 말고, 변환도 가능하다 ㅎㅎ
		//PlayerCharacter player = (PlayerCharacter)enemy;
		
		//적이 공격을 하고나서
		if(enemy.hp <= 30){
			//상속받은대로 사용할수있게끔만든다 객체생성하지않고 바로 클래스명.메소드명으로 접근
			//player.Heal();
			PlayerCharacter player = new PlayerCharacter("enemy");
			player.heal();
		}
	}
}