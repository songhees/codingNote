package example_09_02_for;

import java.util.Scanner;

public class Sample13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1��° ���� �Է�: ");
		int num1 = scan.nextInt();
		
		System.out.print("2��° ���� �Է�: ");
		int num2 = scan.nextInt();
		int numbersCount = (num2 - num1) + 1;	
		
//		if (num1 > num2) {
//			numbersCount = (num1 - num2) + 1;
//		} else if (num2 > num1) {
//			numbersCount = (num2 - num1) + 1;
//		}
		// ù��° ���ڰ� �� ū ���.
		if (num1 > num2) {				//�� ���� ��ġ�� ��ȯ�� ��
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int median1 = (num1 + num2)/2;
		int median2 = median1 + 1;
		
		if( numbersCount%2 == 0 ) {
			System.out.println("�߰���: " + median1 + "\t" + median2);
		} else {
			System.out.println("�߰���: " + median1);
		}
		scan.close();
	}
}
