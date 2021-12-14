package example_10_07_3_Random;

import java.util.Random;

public class RandomSample1 {
	public static void main(String[] args) {
		
		System.out.println("### Math.random() ����غ���");
		// Math.random()			 0.0 <= ���� ���� < 1.0 
		for (int i = 1; i <= 5; i++) {
			double randomNumber = Math.random();
			System.out.println(randomNumber);
		}
		
		Random random = new Random();
		System.out.println("### Random��ü�� nextDouble() ����غ���");
		// Random��ü�� nextDouble()		0.0 <= ���� ���� < 1.0 
		for (int i = 1; i <= 5; i++) {
			double randomNumber = random.nextDouble();
			System.out.println(randomNumber);
		}
		
		System.out.println("### Random��ü�� nextInt() ����غ���");
		// Random��ü�� nextInt()		int�� �ּҰ� <= ���� ���� <= int�� �ִ밪
		for (int i = 1; i <= 5; i++) {
			int randomNumber = random.nextInt();
			System.out.println(randomNumber);
		}
		
		System.out.println("### Random��ü�� nextInt(int bound) ����غ���");
		// Random��ü�� nextInt(int bound)		0 <= ���� ���� < bound			bound = 6  0,1,2,3,4,5
		// Random��ü�� nextInt(int bound)		0 + 1 <= ���� ���� < bound + 1	bound = 6  1,2,3,4,5,6
		for (int i = 1; i <= 20; i++) {
			int randomNumber = random.nextInt(10) + 1;
			System.out.println(randomNumber);
		}
		
	}
}
