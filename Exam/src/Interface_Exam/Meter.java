package Interface_Exam;

public interface Meter {
	
	public void start();
	public int stop(int distance);
	
	default int agrerMidnight(int i, int j){
		
		return i * j;
	}
}
