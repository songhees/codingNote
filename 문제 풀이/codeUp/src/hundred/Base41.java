package hundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base41 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char str = bf.readLine().charAt(0);
		// int ���� char���� ��ȯ�ϴ� ������ ���
		char s = (char)(str+1);
		System.out.println(s);
	}
}
