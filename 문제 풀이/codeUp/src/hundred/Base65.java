package hundred;

import java.util.*;

public class Base65 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		
		// yes or no�� ��� ��쿡 ���ð��� ������ �ִ� ��� ���
		System.out.println(num1%2 == 0? "even" : "odd");
		System.out.println(num2%2 == 0? "even" : "odd");
		System.out.println(num3%2 == 0? "even" : "odd");
	}
}
