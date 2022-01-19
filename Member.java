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
		System.out.println(name + "의 번호는 " + tel + "입니다.");
	}

	public String getname() {
		return name;
	}
	
	public String allPrint() {
		return "이름:"+name+", 전화번호:"+tel;
	}

	public boolean findhuman(String a) {
		if (getname().equals(a)) {
			return true;
		}
		return false;
	}
}
