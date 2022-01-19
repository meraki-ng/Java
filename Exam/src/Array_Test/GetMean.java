package Array_Test;

public class GetMean {

	int result;
	int value = 0;
	public int genMean(int[] array){

		
		for(int i=0; i<array.length; i++){
		
			value = value + array[i];
			
			result = value/array.length;
			
		} 
		
		return result;
	}
}
