package Interface_Exam;

public class Interface_Run {

	public static void main(String[] args) {
		
		Meter meter = new Interface_implements(); //상속받지않아도사용이가능하다
		
		meter.start();
		System.out.println(meter.stop(30));
		
		int i = meter.agrerMidnight(10, 30);
		System.out.println(i);
		
	}

}
