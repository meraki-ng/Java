package Interface_Exam;

public class Interface_implements implements Meter {

	@Override
	public void start() {
		System.out.println("START�Դϴ�.");

	}

	@Override
	public int stop(int distance) {
		
		return distance*2;

	}

}
