
public class InterfacePart1 {

	public static void main(String[] args) {
		
		//�߻�Ŭ������ ��ü�� ���������.
	    //�׷��� ���� Animal�� ��ӹ޾�, �������̵��ؼ� ����
		
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
		
		((Cat)gener).Cry(); //����ȯ�Ͽ�, ���
		((Dog)gener2).Cry();
		((Wolf)gener3).Cry();
	}

}
