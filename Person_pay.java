package Algorism_39;

import java.util.Scanner;

public class Person_pay {

	public static void main(String[] args) {
		System.out.println("반갑습니다.");
		
		int payRate; //사원번호
		int hours; //일한시간
		int a = 1; //0이면 종료
		double total = 0; //총 금액 출력
		double wages = 0; //개인별 총수입
		Scanner sc = new Scanner(System.in);
		
		while( a != 0){
		System.out.print("사원번호를 입력해주세요 : ");
		payRate = sc.nextInt();
		a = payRate;
		
		total = 0;
		if(a == 0){
			total = 0;
			System.out.println("총 수입 : "+total);
			System.out.print("payFile열려면, RUN해주세요!");
		}else{
		System.out.print("시간당 입금률을 입력해주세요 : ");
		payRate = sc.nextInt();
		System.out.print("일한 시간을 입력해주세요 : ");
		hours = sc.nextInt();
		a = payRate;
		if(hours > 40){
			wages = (40*payRate) + (hours-40)*payRate*1.5;
		}else{
			wages = hours * payRate;
		}
		total = total + wages;
		System.out.println("총 수입 : "+total);
			}
		}
		sc.close();
	}
}
