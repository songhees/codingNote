package example_09_08_method;

public class Movie {
	public static void main(String[] args) {
		
		Sample1 sample = new Sample1();
		//Sample1Ŭ������ ���� Sample1��ü�� ������ ���� sample���������� �ּҰ��� �ִ´�.
		
		sample.displayCurrentDate();
		//�������� sample�� ���� ��ü Sample1�� �ִ� ��� displayCurrentDate�� �����Ų��.
		
		int value =  sample.getNumber();
		//��������sample�� ���� ��ü Sample1�� �ִ� ��� getNumber();�� ��ȯ�� 100�� int Ÿ�� ���� value�� �����Ѵ�.
		System.out.println("��ȯ���� ��: " + value);
		
		
		for (int i=0; i < 6; i++) {
			int value1 = sample.getRandomNumber();	//�������� sample�� ���� ��ü Sample1�� �ִ� ��� getRandomNumber()�� ���� �ֻ��� ��ȯ���� intŸ�� ����value1�� �����Ѵ�.
			System.out.println(value1); //�ݺ������� ���Ͽ� 6���� ���� �ֻ��� ���ڰ� ������ �ȴ�.
		}
		
		int total = sample.getTotalScore(100, 90, 80); //�������� sampel�� ���� ��ü Sample1�� �ִ� ��� getTotalsore()�� ���� ���� ���� ���� �Ű������� �־� ������ ������ ���� total�� �����Ѵ�.
		System.out.println("����: " + total);
		
		double average = sample.getAverage(100, 90, 80); //�������� sample�� ���� ��ü Sample1�� �ִ� getAverage()�� ���� ���� ���� ���� �Ű������� �־� ��հ��� ��ȯ���� double�� ���� average�� �����Ѵ�.
		
		
	}

}
