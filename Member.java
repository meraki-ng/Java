package submit_test2;

public class Member {
	private String name, tel;

	public Member() {
	}

	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public void printNameAndTel() {
		System.out.println(name + "�� ��ȣ�� " + tel + "�Դϴ�.");
	}

	public String getname() {
		return name;
	}
	
	public String allPrint() {
		return "�̸�:"+name+", ��ȭ��ȣ:"+tel;
	}

	public boolean findhuman(String a) {
		if (getname().equals(a)) {
			return true;
		}
		return false;
	}
}
