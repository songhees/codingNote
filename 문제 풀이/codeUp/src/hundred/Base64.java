package hundred;

import java.util.*;

public class Base64 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		// 3�� ������ �������� ����ϱ�!
		System.out.print((num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3)));
	}
}
