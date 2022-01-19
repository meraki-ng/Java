package submit_test2;
import java.util.Scanner;
public class PhoneManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pernum;
		String fu;
		System.out.print("인원수 >>");
		pernum = scanner.nextInt();
		Member[] memberArr = new Member[pernum];
		for (int i = 0; i < memberArr.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			String name = scanner.next();
			String numb = scanner.next();
			memberArr[i] = new Member(name, numb);
		}
		System.out.println("저장되었습니다.");
		System.out.println();
		do {
			System.out.print("검색할 이름(종료:exit)>>");
			fu = scanner.next();
			if (fu.equals("exit")) {
				System.out.println("종료되었습니다.");
				break;
			}
			for (int i = 0; i < memberArr.length; i++) {
				if (memberArr[i].findhuman(fu)) {
					memberArr[i].printNameAndTel();
					break;
				} else {
					if (i == memberArr.length - 1)
						System.out.println(fu + "이(가) 없습니다.");
				}
			}
		} while (!fu.equals("exit"));
		for(Member mb : memberArr){
			System.out.println(mb.allPrint());
		}System.out.println();
		scanner.close();
	}
}
