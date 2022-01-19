
public class Dog extends Animal implements Gener {

	
	
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Cry() {
		System.out.println(name + "~ ~ ~");
		
	}

	@Override
	public void FoodCall() {
		System.out.println(name + "!!!");
		
	}

}
