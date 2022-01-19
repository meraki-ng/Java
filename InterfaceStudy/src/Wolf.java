
public class Wolf extends Animal implements Gener {

	public Wolf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Cry() {
		System.out.println(name + "~~~~~~~~~~~~~~");
		
	}

	@Override
	public void FoodCall() {
		System.out.println("~.~,~");
		
	}

}
