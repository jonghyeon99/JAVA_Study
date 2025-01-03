package chapter07.array;

public class C061_enhancedForLoop1 {

	public static void main(String[] args) {
		// 강화된 for문 = foreach문
		int[] score = { 88, 94, 72, 74, 23 };
		int sum = 0;
		//  (요소   : 반복대상)
		for (int s : score) {
			sum += s;
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (float) sum 
				/ score.length);
		
		
		System.out.println("===============");
		// foreach는 읽기 전용 반복문
		// 요소 s는 배열 요소의 사본일 뿐 원본에 영향X
		int[] score2 = { 88, 94, 72, 74, 23 };
		for (int s : score2) {
			s++;
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("score2[0]= " 
				+ score2[0]);

	}

}
