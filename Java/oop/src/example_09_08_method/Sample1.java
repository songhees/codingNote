package example_09_08_method;

import java.util.Date;
import java.util.Random;

public class Sample1 {
	/*
	 * ��ȯŸ��X, �Ű�����X �޼ҵ� �����ϱ�
	 * 
	 * �ý����� ���� ��¥/�ð��� ȭ�鿡 ǥ���ϴ� �޼ҵ�
	 */
	void displayCurrentDate() {
		Date now = new Date();
		System.out.println(now);
	}
	
	/*
	 * ��ȯŸ��O, �Ű�����X �޼ҵ� �����ϱ�
	 * �������� ��ȯ�ϴ� �޼ҵ�
	 */
	int getNumber() {
		return 100;
	}
	// 1~6������ ���� �� ������ ���ڸ� ��ȯ�ϴ� �޼ҵ�
	int getRandomNumber() {
		Random random = new Random();
		int number = random.nextInt(6) + 1;
		return number;
	}
	
	// ��ȯŸ��O, �Ű�����O �޼ҵ� �����ϱ�
	// ����/����/���������� ���޹޾Ƽ� ������ ��ȯ�ϴ� �޼ҵ�
	int getTotalScore(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	// ���(�Ǽ���)�� ��ȯ�ϴ� �޼ҵ�
	double getAverage(int kor, int eng, int math) {
		double average = this.getTotalScore(kor, eng, math)/3.0;
		return average;
	}
}
