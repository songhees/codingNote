package example_09_02_for;

import java.util.Scanner;

public class Sample9 {
	public static void main(String[] args) {
		//���� 3���� �Է¹޾Ƽ� ���� ū ���� ����ϴ� ���α׷�
		//����
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "��° ���� �Է�: ");
			int num = scan.nextInt();
	
			if (num > max) {
				max = num;
			}
		}		
		System.out.println("���� ū ��: " + max);
		scan.close();
	}
}

