package hundred;

import java.io.*;

public class Base59 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		// 2 = 0010 -> ~2 = 1101 �� �� -3�ϱ�??  1�� ����??
		System.out.print(~num);
	}
}
