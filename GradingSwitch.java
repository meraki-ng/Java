import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {

		char grade;
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();

		switch (score / 10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		scanner.close();
		System.out.println("학점은 " + grade + "입니다");
	}
}
