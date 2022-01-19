package Level1;

public class Cannot_finish {

	public static void main(String[] args) {
		String[] participant = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R"};
		String[] completion = {"","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R"};
		
		Solution sol = new Solution();
		sol.solution(participant, completion);
		
		System.out.println("완주하지못한사람 : "+sol.result);
		
	}
}
