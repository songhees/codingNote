package hundred;

import java.io.*;

/**
 * [����-�ݺ����౸��] ���� 1�� �Է¹޾� �� ������ ����ϱ�
 * @author song
 *
 */
public class Base77 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int base = -1;
		
		do {
			System.out.println(++base);
		} while (num != base);
	}
}
