package Interface_Exam;

public class Interface_Run {

	public static void main(String[] args) {
		
		Meter meter = new Interface_implements(); //��ӹ����ʾƵ�����̰����ϴ�
		
		meter.start();
		System.out.println(meter.stop(30));
		
		int i = meter.agrerMidnight(10, 30);
		System.out.println(i);
		
	}

}
