package hundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base83 {
	public static void main(String[] args) throws IOException {
		
		// ���ڿ� 3, 6, 9�� �پ� ������ X�� ǥ��
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		for (int i=1; i<=num; i++) {
			String no = String.valueOf(i);
			if (no.contains("3")) {
				System.out.print("X ");
			} else if (no.contains("6")) {
				System.out.print("X ");
			} else if (no.contains("9")) {
				System.out.print("X ");
			} else {
				System.out.print(no + " ");
			}
		}
	}
}
