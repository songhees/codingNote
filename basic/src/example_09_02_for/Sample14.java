package example_09_02_for;

import java.util.Scanner;

public class Sample14 {
	public static void main(String[] args) {
		/*
		 * ���ڸ� �Է¹޾Ƽ� �ش� ���ڿ� ���� �������� ����ϴ� ���α׷�
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int number = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", number, i, number*i);
			
			System.out.println(number + " * " + i + " = " + (number*i));
		}
		scan.close();
	}
}
