package hundred;

import java.util.Scanner;

public class Base48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println(n1 << n2);
		// ��Ʈ ������ n1�� 2^n2��ŭ ���� �ø���.
		// 3, 1 �϶� 0011 << 1 �̸� 0110 => 3*2=6
		// 3, 2 �϶� 0011 << 2 �̸� 1100 => 3*4=12
		scan.close();
	}
}
