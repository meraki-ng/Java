
public class Hi {

	public static void main(String[] args) {
		//��ü ����
		
		PlayerCharacter player = new PlayerCharacter("play",70,12);
		EnemyCharacter enemy = new EnemyCharacter("enemy",80,5); 
		
		// �Ѵ� ������� ���ȸ�
		while(player.isLive() && enemy.isLive()){
			player.attack(enemy);
			//���� ������ �ϰ���, ü���� ä��������.
			if(!enemy.isLive() || !player.isLive()){
				//���� �׾����� ������.
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
