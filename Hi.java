
public class Hi {

	public static void main(String[] args) {
		//객체 생성
		
		PlayerCharacter player = new PlayerCharacter("play",70,12);
		EnemyCharacter enemy = new EnemyCharacter("enemy",80,5); 
		
		// 둘다 살아있을 동안만
		while(player.isLive() && enemy.isLive()){
			player.attack(enemy);
			//적이 공격을 하고나서, 체력을 채워버린다.
			if(!enemy.isLive() || !player.isLive()){
				//적이 죽었으면 끝난다.
				break;
			}
			enemy.attack(player);
		}
		if(player.isLive()){
			System.out.println("player win");
		}else{
			System.out.println("enemy win");
		}
	}
}
