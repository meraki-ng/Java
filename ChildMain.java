package ChildClass;

public class ChildMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "운주";
		child.gender = "여자";
		child.age = 29;
		
		child.setInfo("홍길동","남자",23);
		child.getInfo();
	}

}
