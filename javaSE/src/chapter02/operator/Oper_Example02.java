package chapter02.operator;

import java.util.Scanner;

public class Oper_Example02 {

	public static void main(String[] args) {
/*	
		과목 3개를 입력받아 점수에 따른 합격여부를 출력한다.
		합격조건 1. 세 과목의 평균 점수가 60점 이상일 것.
			  2. 한 과목이라도 40점 미만일 경우 과락으로 불합격
			  
		출력 결과 : 
			국어 : 80
			영어 : 80
			수학 : 35
			합격여부 : 불합격입니다.
*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korScore = scan.nextInt();
		System.out.print("영어 : ");
		int engScore = scan.nextInt();
		System.out.print("수학 : ");
		int mathScore = scan.nextInt();
		
		double avg = (korScore + engScore + mathScore) / 3.0;
		
		String result = (korScore >= 40) && (engScore >= 40) && (mathScore >= 40) && (avg >= 60) ? "합격입니다." : "불합격입니다.";
	    System.out.println("합격여부 : " + result);
	    
	    // =================================================
	    String result2 = "국어 : " + korScore +
	    				 "\n영어 : " + engScore +
	    				 "\n수학 : " + mathScore +
	    				 "\n합격어부 : " + result;
	    System.out.println(result2);
	}

}
