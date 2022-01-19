
public class InterfacePart1 {

	public static void main(String[] args) {
		
		//추상클래스는 객체로 만들수없다.
	    //그래서 각각 Animal을 상속받아, 오버라이드해서 쓴다
		
		Animal dog = new Dog("dogdogdog!!!");
		Animal cat = new Cat("catcat");
		Animal wolf = new Wolf("woooooolf~woooooolf");
		
		dog.Cry();
		cat.Cry();
		wolf.Cry();
		
		Gener gener = new Cat("nyoong");
		Gener gener2 = new Dog("dogdogdogdogdog");
		Gener gener3 = new Wolf("wooooolfffff~");
		
		gener.FoodCall();
		gener2.FoodCall();
		gener3.FoodCall();
		
		((Cat)gener).Cry(); //형변환하여, 사용
		((Dog)gener2).Cry();
		((Wolf)gener3).Cry();
	}

}
