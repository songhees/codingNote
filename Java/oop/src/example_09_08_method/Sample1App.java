package example_09_08_method;

public class Sample1App {
	public static void main(String[] args) {
		/*
		 * Sample1 ���赵�� ��ü �����ϱ�
		 */
		Sample1 sample1 = new Sample1();
		//Sample1Ŭ������ ���� Sample1��ü�� ������ ���� sample���������� �ּҰ��� �ִ´�.
		
		
		// ��ȯ��X, �Ű�����X �޼ҵ� ����
		//��������.�޼ҵ��();
		// ��ȯ��O, �Ű�����X �޼ҵ� ����
		// ��ȯŸ�� ���� = ��������.�޼ҵ�();
		// ��ȯ��O, �Ű�����O �޼ҵ� ����
		// ��ȯŸ�� ���� = ��������.�޼ҵ�(�Է°�
		
		
		// ������ ��ü�� ��� �����ϱ�
		sample1.displayCurrentDate();
		//�������� sample�� ���� ��ü Sample1�� �ִ� ��� displayCurrentDate�� �����Ų��.

		int value = sample1.getNumber();
		//��������sample�� ���� ��ü Sample1�� �ִ� ��� getNumber()�� ��ȯ�� 100�� int Ÿ�� ���� value�� �����Ѵ�.
		System.out.println("��ȯ���� ��: " + value);
		
		
		
		// �ֻ����� �����ϰ� ��ȯ�ϴ� ��� �����ϱ�
		for (int i = 0; i < 10; i++) {
			int value1 = sample1.getRandomNumber();
			//�������� sample�� ���� ��ü Sample1�� �ִ� ��� getRandomNumber()�� ���� �ֻ��� ��ȯ���� intŸ�� ����value1�� �����Ѵ�.
			System.out.println("�ֻ��� ����: " + value1); //�ݺ������� ���Ͽ� 6���� ���� �ֻ��� ���ڰ� ������ �ȴ�.
		}
		// ����/����/���������� �Է����� �޾Ƽ� ������ ��ȯ�ϴ� ��� �����ϱ�
		int totalScore = sample1.getTotalScore(100, 80, 70);
		//�������� sample�� ���� ��ü Sample1�� �ִ� ��� getTotalsore()�� ���� ���� ���� ���� �Ű������� �־� ������ ������ int���� total�� �����Ѵ�.
		System.out.println("����: " + totalScore);
		
		totalScore = sample1.getTotalScore(100, 90, 75);
		System.out.println("����: " + totalScore);
		
		totalScore = sample1.getTotalScore(70, 60, 55);
		System.out.println("����: " + totalScore);
		
		totalScore = sample1.getTotalScore(40, 70, 95);
		System.out.println("����: " + totalScore);
		
		totalScore = sample1.getTotalScore(60, 70, 45);
		System.out.println("����: " + totalScore);
		
		// ����/����/���������� �Է����� �����ؼ� ��������� ��ȯ�ϴ� ��� �����ϱ�
		double average = sample1.getAverage(80, 70, 45);
		//�������� sample�� ���� ��ü Sample1�� �ִ� getAverage()�� ���� ���� ���� ���� �Ű������� �־� ��հ��� ��ȯ���� double�� ���� average�� �����Ѵ�.
		System.out.printf("�������: %.2f", average);
	}
}
