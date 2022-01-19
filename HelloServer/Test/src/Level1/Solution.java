package Level1;

public class Solution {
	
	String result; //i의 string값을 담을 변수
	public String solution(String[] participant, String[] completion){
		
		for(int i=0; i<participant.length; i++){ 
			if(participant[i].equals(completion[i])){
			}else{
				result = participant[i];
			}    
		}
		return result;
	}
}
