package Interface_Exam;

public class Interface_implements implements Meter {

	@Override
	public void start() {
		System.out.println("START¿‘¥œ¥Ÿ.");

	}

	@Override
	public int stop(int distance) {
		
		return distance*2;

	}

}
