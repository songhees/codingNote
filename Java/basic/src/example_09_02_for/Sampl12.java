package example_09_02_for;

import java.util.Scanner;

public class Sampl12 {
	public static void main(String[] args) {
		/*
		 * ����
		 * ���� n���� �Է¹޾Ƽ� ��� ���� ���հ� ����� ����ϴ� ���α׷�
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է��� ������ ���� �Է�: ");
		int n = scan.nextInt();
		
		int sum = 0;
		int average = 0;
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "��° ���� �Է�: ");
			int number = scan.nextInt();
			sum += number;
		}
		
		average = sum/n;
		System.out.println("��� ���� ����: " + sum);
		System.out.println("��� ���� ���: " + average);
		
		scan.close();
	}
}
