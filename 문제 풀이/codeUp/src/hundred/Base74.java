package hundred;

import java.io.*;
/**
 * [����-�ݺ����౸��] ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�1
 * @author song
 *
 */
public class Base74 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		while(num != 0) {
			System.out.println(num);
			--num;
		}
	}
}
