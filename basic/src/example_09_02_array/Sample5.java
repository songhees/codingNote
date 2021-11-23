package example_09_02_array;

import java.util.Scanner;

public class Sample5 {
	public static void main(String[] args) {
		/*
		 * 10���� �л� ������ �����ϴ� �迭�� �����Ѵ�. int[] scores = new int[10];
		 * Scanner�� �̿��ؼ� ������ 10�� �Է¹޾Ƽ� �迭�� ������� �����Ѵ�.
		 * ���: �Էµ� ������ ������� ����Ѵ�.
		 * 		����, ����� ����ؼ� ����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[10];
		int studentCount = scores.length;
		
		// �ݺ����� ����ؼ� �л� ������ 10�� �Է¹޾Ƽ� �迭�� �����Ѵ�.
		
		for (int i=0;i<studentCount;i++ ) {
			System.out.print("�����Է�: ");
			scores[i] = scan.nextInt();
			
		}
			
		for (int i=0;i<studentCount;i++ ) {
			System.out.print("�����Է�: ");
			scores[i] = scan.nextInt();
			
		}
			
		// ���� for���� ����ؼ� �л����� ������ ����Ѵ�.
		// ����ؼ� ����, ����� ����ϰ� ����Ѵ�.
		
		int totalScore = 0;
		int average = 0;
		for (int score : scores) {
			System.out.println("����: " + score);
			totalScore += score;
		}
		average = totalScore/studentCount;
		
		System.out.println("����: " + totalScore);
		System.out.println("���: " + average);
		
		scan.close();
	}
}
