package hundred;

import java.io.*;

/**
 * [����-����] ¦�� �� ���ϱ�
 * @author song
 *
 */
public class Base78 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int total = 0;
		
		while (num != 0) {
			total += num%2 ==0? num : 0;
			num--;
		}
		System.out.println(total);
	}
}
