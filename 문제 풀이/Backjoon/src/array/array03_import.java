package array;

import java.util.Scanner;

public class array03_import {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[3];
		int result = 1;
		int [] counts = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
			result *= numbers[i];
		}

//		while (true) {
//			int value = result%10;
//			result /= 10;
//			for (int i = 0; i < counts.length; i++) {
//				if (value == i) {
//					counts[i] += 1;
//				}
//			}
//			if (result == 0) {
//				break;
//			}
//		}
		
        while(result != 0){				//while�� ���ǽ� ǥ�� �ڡڡ�
            counts[result%10]++;		//�迭�� �ε��� ǥ�� ��� �ڡڡڡڡ�
            result /= 10;
        }
		
		for (int count : counts) {
			System.out.println(count);
		}
		scan.close();
	}
}
