package hundred;

import java.io.*;

public class Base33 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = bf.readLine();
		// Integer.parseInt( , ���(8������ 8, 16������ 16����); �ش� ������� �����ϸ� �� ������ ��ȯ �⺻���� 10����
		System.out.printf("%d", Integer.parseInt(num, 16));
	}
}
