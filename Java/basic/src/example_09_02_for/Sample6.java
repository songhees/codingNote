package example_09_02_for;

import java.util.Scanner;

public class Sample6 {
	public static void main(String[] args) {
		/*
		 * �ݺ��� �ߴܽ�Ű��, ���� �� �ݺ����� �Ѿ��
		 * break continue - �ݺ��������� ����� �� �ִ�. (��, break�� switch�������� ��밡��) 
		 * 
		 * ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� ���� ����Ѵ�. - �ݺ�, Ƚ���� �������� ����
		 * 0�� �Է��ϸ� �Է��� �ߴ��ϰ�, �հ踦 ����Ѵ�. - ����
		 */
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		while (true) {
			System.out.println("���� �Է�(0�� �Է��ϸ� ����˴ϴ�.): ");
			
			int number = scan.nextInt();
			if (number == 0) {
				break;					//while�� Ż��
			}
			sum += number;
		}
		
		System.out.println("�հ�:" + sum);
		
		scan.close();
	}
}
