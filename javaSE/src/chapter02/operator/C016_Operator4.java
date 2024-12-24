package chapter02.operator;

public class C016_Operator4 {

	public static void main(String[] args) {
		// 논리 연산자
		int num1 = 10;
		int num2 = 20;
		
		// and &&
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		// or ||
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		// not (부정)
		System.out.println( !flag );
		System.out.println( !true );
		System.out.println("===========");
		
		// 논리 연산자의 함정
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10) < 10) && ((i = i + 2) < 10);	// 앞에 실행문이 false면 뒤에는 확인 안 해도 됨으로 실행이 안 됨
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		num = 10;
		i = 2;
		value = (num += 10) > 10 || (i = i + 2) < 10; // 앞쪽이 true 이므로 뒤에는 실행을 안 함
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}

}
