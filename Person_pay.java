package Algorism_39;

import java.util.Scanner;

public class Person_pay {

	public static void main(String[] args) {
		System.out.println("�ݰ����ϴ�.");
		
		int payRate; //�����ȣ
		int hours; //���ѽð�
		int a = 1; //0�̸� ����
		double total = 0; //�� �ݾ� ���
		double wages = 0; //���κ� �Ѽ���
		Scanner sc = new Scanner(System.in);
		
		while( a != 0){
		System.out.print("�����ȣ�� �Է����ּ��� : ");
		payRate = sc.nextInt();
		a = payRate;
		
		total = 0;
		if(a == 0){
			total = 0;
			System.out.println("�� ���� : "+total);
			System.out.print("payFile������, RUN���ּ���!");
		}else{
		System.out.print("�ð��� �Աݷ��� �Է����ּ��� : ");
		payRate = sc.nextInt();
		System.out.print("���� �ð��� �Է����ּ��� : ");
		hours = sc.nextInt();
		a = payRate;
		if(hours > 40){
			wages = (40*payRate) + (hours-40)*payRate*1.5;
		}else{
			wages = hours * payRate;
		}
		total = total + wages;
		System.out.println("�� ���� : "+total);
			}
		}
		sc.close();
	}
}
