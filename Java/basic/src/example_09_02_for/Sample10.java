package example_09_02_for;

import java.util.Scanner;

public class Sample10 {
	public static void main(String[] args) {
		/*
		 * ����
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ϴ� �����Է�: ");
		int n = scan.nextInt();
		
		int max = Integer.MIN_VALUE;	// max�� intŸ���� �ּҰ��� �����Ѵ�.
		for (int i = 0; i < n; i++) {		
			System.out.print((i + 1) + "��° ���� �Է�: ");	
			int num = scan.nextInt();
	
			if (num > max) {
				max = num;
			}
		}		
		System.out.println("���� ū ����: " + max);
		
		scan.close();
	}
}
