package hundred;

import java.util.Scanner;

public class Base71MultiScan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �Էµ� ���� ���������� ó���ϱ�
		int num = scan.nextInt();
		while (num != 0) {
			System.out.println(num);
			num = scan.nextInt();
		}
		scan.close();
	}
}
