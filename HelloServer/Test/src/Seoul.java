
public class Seoul {

	public static void main(String[] args) {
	
		String[] seoul = new String[1000];
		seoul[0] = "Jane";
		seoul[1] = "Soon";
		seoul[2] = "Kim";
		seoul[3] = "Jeam";
		seoul[4] = "Lee";
		String answers;
		
		for(int i=0; i<seoul.length; i++){
			if(seoul[i]=="Kim"){
				answers="김서방은"+i+"번째에있다";			
				System.out.println(answers);
				break;
			}
		}
	}
}
