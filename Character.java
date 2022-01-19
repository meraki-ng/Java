
public class Character {
		//°´Ã¼ »ı¼º
		
		String name;
		int hp;
		int atk;
		
		public Character(){
			
		}
		public Character(String name, int hp, int atk){
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		public void attack(Character enemy){ //ÀûÀÌ¿©¼­ 
			System.out.println(this.name + "Attack!");
			enemy.hp -= this.atk; //Èû¿¡¼­ ¾îÅÃ ±ô
			System.out.println(enemy.name + " HP : "+enemy.hp);
			
		}
		public boolean isLive(){
			if(hp <= 0 ){
				return false;
			}else{
				return true;
			}
		}
}
