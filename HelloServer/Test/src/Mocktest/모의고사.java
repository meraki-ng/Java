package Mocktest;

import java.util.Random;

public class 모의고사 {

	public static void main(String[] args) {
		int[] one= new int[100];  //1번학생의 번호 패턴
		int[] two= new int[100]; //2번학생의 번호 패턴
		int[] three= new int[100];
		
		Random r = new Random();
		
		int[] answers = new int[100];
		
		for(int onea=1; onea<=5; onea++)
			one[onea] = onea;
		
		for(int i=1; i<answers.length; i++){
			answers[i]=r.nextInt((5)+1);
			if(answers[i] == one[i]){
				System.out.println("첫번째 학생이 맞춘 정답의 번호 : "+i+"번째 문제");		
			}if(two[i] == 2){
				if(answers[i] == 2){
					System.out.println("두번째 학생이 맞춘 정답의 번호 : "+i+"번째 문제");
			}}
		}
	}
}
