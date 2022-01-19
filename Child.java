package ChildClass;

public class Child {

	public String name;
	public String gender;
	public int age;
	
	public Child() {
	System.out.println("ChildClass");
	}
	public void getInfo(){
		System.out.println("---getInfo()---");
		System.out.println("---name---"+name);
		System.out.println("---gender---"+gender);
		System.out.println("---age---"+age);
	}
	public void setInfo(String n, String g, int a){
	//학생의 정보를 넣는 메서드
		System.out.println("---setInfo()---");
		name = n;
		gender = g;
		age = a;
	}
}
