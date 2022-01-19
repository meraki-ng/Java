package Array_Test;

public class Array_Run {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		
		GetMean gm = new GetMean();
		int r = gm.genMean(ar);
		System.out.println(r);
	}

}
