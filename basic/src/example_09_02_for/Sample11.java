package example_09_02_for;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		/*
		 * ����
		 */
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int average = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println((i + 1) + "��° ���� �Է�: ");
			int number = scan.nextInt();
			sum += number;
		}
		
		average = sum/2;
		System.out.println("��� ���� ����: " + sum);
		System.out.println("��� ���� ���: " + average);	
		
		scan.close();
	}
}
