package TestProject;

public class ByCycle {

	public String color;
	public int price;
	
	public ByCycle() {
		System.out.println("ByCycle ������");
	}
	
	//2���̻��� ������
	public ByCycle(String c, int p){ // ��ü�� �����ɶ�, ������ȣ��� ������ ���� �޴´�
		this.color = c;
		this.price = p;
	}
	
	
	
	public void info(){
		System.out.println("---info()---");
		System.out.println("---color---"+color);
		System.out.println("---price---"+price);
	}
	
}
