package ChildClass;

public class ChildMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "����";
		child.gender = "����";
		child.age = 29;
		
		child.setInfo("ȫ�浿","����",23);
		child.getInfo();
	}

}
