package hundred;

import java.io.*;

/**
 * [����-�ݺ����౸��] ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�2
 * @author song
 *
 */
public class Base75 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		do {
			--num;
			System.out.println(num);
		} while (num != 0);
	}
}
