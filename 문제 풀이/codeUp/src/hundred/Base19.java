package hundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base19 {
	public static void main(String[] args) throws IOException {
		// ��Ÿ���ڴ� ����ǥ���Ŀ��� ������ �ǹ̸� ������ ���� Ư�����ڸ� ��Ÿ���ڶ�� �θ���.
		// split() �Լ� ��� �� ��Ÿ���ڷ� ���� Ư�����ڸ� �����ڷ� ����� ���� ��Ÿ���� �տ� \(��������) 2�� ���δ�.
		// https://codevang.tistory.com/114
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] array = bf.readLine().split("\\.");
		// %04d 4�ڸ��� d���� ����µ� ���ڸ��� �տ� 0�� ���δ�.
		System.out.printf("%04d.%02d.%02d", Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]));
	}
}
