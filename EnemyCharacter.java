
public class EnemyCharacter extends Character{

	String enemy;
	
	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk);
		// �����ڿ� ����� ���. �θ𿡰Լ� ��ӹ��� ��
	}
	public void attack(Character enemy){
		
		if(hp <= 20 ){
			System.out.println("Orc is ANGRY !!!!!!!!! ....>0<!!!!");
			this.atk +=15;
		}
		//�߰��� ���ݷ��� ��
		super.attack(enemy);
		
		//�̷��� ����, ��ȯ�� �����ϴ� ����
		//PlayerCharacter player = (PlayerCharacter)enemy;
		
		//���� ������ �ϰ���
		if(enemy.hp <= 30){
			//��ӹ������ ����Ҽ��ְԲ������ ��ü���������ʰ� �ٷ� Ŭ������.�޼ҵ������ ����
			//player.Heal();
			PlayerCharacter player = new PlayerCharacter("enemy");
			player.heal();
		}
	}
}