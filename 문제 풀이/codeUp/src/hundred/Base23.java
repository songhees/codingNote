package hundred;

import java.io.*;

public class Base23 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String number = bf.readLine();
		// .�� ���ԽĿ��� ��� ���ڸ� �ǹ��ϹǷ� \\.�� ����ؾ� �ȴ�.
		String[] num = number.split("\\.");
		System.out.println(num[0]);
		System.out.println(num[1]);
	}
}
