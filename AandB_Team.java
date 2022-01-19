package Algorithm;

import java.util.Random;

public class AandB_Team {
	
	public static void main(String[] args) {
			
		Bwin();
	}

	public static int Bwin(){
		int[] ATeam = new int[100000];
		int[] BTeam = new int[100000];
		int i;
		
		for(i=0; i<BTeam.length; i++){
			Random r = new Random();
			int ateam = r.nextInt(1000000);
			ATeam[i] = ateam;
			int bteam = r.nextInt(1000000);
			for(i=0; i<ATeam.length; i++){		
					if(ateam < bteam){
						BTeam[i] = bteam;
					}
					System.out.println("ATeam의 패 : "+ ATeam[i]);
					System.out.println("BTeam의 패 : "+ BTeam[i]);
			}
			
		}
		return BTeam[i];
	}
}
