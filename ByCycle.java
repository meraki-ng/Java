package TestProject;

public class ByCycle {

	public String color;
	public int price;
	
	public ByCycle() {
		System.out.println("ByCycle 생성자");
	}
	
	//2개이상의 생성자
	public ByCycle(String c, int p){ // 객체가 생성될때, 생성자호출된 곳에서 값을 받는다
		this.color = c;
		this.price = p;
	}
	
	
	
	public void info(){
		System.out.println("---info()---");
		System.out.println("---color---"+color);
		System.out.println("---price---"+price);
	}
	
}
