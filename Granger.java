package TestProject;

public class Granger {
	
	public String color;
	public String gear;
	public int price;
	
	public Granger() {
		System.out.println("Granger »ý¼ºÀÚ");
	}
	
	public void run(){
		System.out.println("--run()--");
	}
	
	public void stop(){
		System.out.println("--stop()--");
	}
	
	public void info(){
		System.out.println("--info()--"+color+gear+price);
	}
}
