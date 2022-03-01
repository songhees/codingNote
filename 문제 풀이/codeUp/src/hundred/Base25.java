package hundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base25 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int len = String.valueOf(n).length();
		for (int i=1; i<=len; i++) {
			// /�� ���� ���� �� %�� ���� ���� ������ ��
			System.out.printf("[%d] \n", (n/(int)(Math.pow(10.0, len-i))%10)*(int)(Math.pow(10.0, len-i)));
		}
	}
}
