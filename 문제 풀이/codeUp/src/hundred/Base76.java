package hundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  [����-�ݺ����౸��] ���� 1�� �Է¹޾� ���ĺ� ����ϱ�
 * @author song
 *
 */
public class Base76 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char al = bf.readLine().charAt(0);
		char a = 'a'-1;
		
		// ����Ű�� ���� ������ ��½�
		// ����� ���� ����ϰ� ���� �� %�� ����Ѵ�.
		do {
			System.out.printf("%c ", ++a);
		} while (a != al);
	}
}
