package chapter02.operator;

import java.util.Scanner;

public class Oper_Example01 {

	public static void main(String[] args) {
/*		삼품가격과 받은 금액을 입력받아서 거스름돈을 출력
		출력 결과 :
			받은 금액 : 10000
			상품가격 : 1500
			거스름돈 : 8500
*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("받은 금액 : ");
		int money = scan.nextInt();
		
		System.out.print("상품가격 : ");
		int price = scan.nextInt();
		
		System.out.println("거스름돈 : " + (money - price));
		
		// --------------------------------------------
		String result = "받은 가격 : " + money +
						"\n상품가격 : " + price +
						"\n거스름돈 : " + (money - price);
		System.out.println(result);
	}

}
