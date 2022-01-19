package TestProject;

public class MainClass {

	public static void main(String[] args) {
		
		//클래스로부터 객체 생성 -> new라는 키워드 이용하여 객체 생성함
		Granger granger = new Granger();
		//생성자 호출 - 메모리 업로드
		//메모리에 올라간 객체는, granger 가르키게 된다(레퍼런스)
		granger.color="red";
		granger.gear="auto";
		granger.price=300000000;
		
		granger.run();
		granger.stop();
		granger.info();
		
		//객체2개
		Granger granger1 = new Granger();
		granger1.color="blue";
		granger1.gear="auto";
		granger1.price=500000000;
		granger1.run();
		granger1.stop();
		granger1.info();
		
		ByCycle bycle = new ByCycle("yello", 100);
		
		bycle.info();
		
	}

}
