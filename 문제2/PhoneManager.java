package submit_test2;
import java.util.Scanner;
public class PhoneManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pernum;
		String fu;
		System.out.print("�ο��� >>");
		pernum = scanner.nextInt();
		Member[] memberArr = new Member[pernum];
		for (int i = 0; i < memberArr.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			String name = scanner.next();
			String numb = scanner.next();
			memberArr[i] = new Member(name, numb);
		}
		System.out.println("����Ǿ����ϴ�.");
		System.out.println();
		do {
			System.out.print("�˻��� �̸�(����:exit)>>");
			fu = scanner.next();
			if (fu.equals("exit")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			for (int i = 0; i < memberArr.length; i++) {
				if (memberArr[i].findhuman(fu)) {
					memberArr[i].printNameAndTel();
					break;
				} else {
					if (i == memberArr.length - 1)
						System.out.println(fu + "��(��) �����ϴ�.");
				}
			}
		} while (!fu.equals("exit"));
		for(Member mb : memberArr){
			System.out.println(mb.allPrint());
		}System.out.println();
		scanner.close();
	}
}
