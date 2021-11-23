package example_10_08_formating;

import java.text.DecimalFormat;

public class DecimalFormatSample1 {
	public static void main(String[] args) {
		// ������ �Ǽ��� ������ ������ ���ڿ��� ��ȯ�ϱ�
		
		long amount = 100000000000L;
		
		DecimalFormat df = new DecimalFormat("##,###");
		//������ ���� �о� ���ߵ�
		String text1 = df.format(amount);
		System.out.println(text1);
		
		double number = 12345.67;
		df.applyPattern("##,###.#"); // �Ҽ����� ���ڸ��� ������
		String text2 = df.format(number);
		System.out.println(text2);
		
		double number2 = 1.0/3.0;
		df.applyPattern("##,###.##"); // �Ҽ����� ���ڸ��� ������
		String text3 = df.format(number2);
		System.out.println(text3);
		
		double number3 = 123.2400;
		df.applyPattern("##,###.####");
		String text4 = df.format(number3);
		System.out.println(text4);
		// 0�� #�� �Ҽ������� ���϶� ǥ������ �ʴ´�.
		
		df.applyPattern("##,###.0000");
		String text5 = df.format(number3);
		System.out.println(text5);
		// #�� 0�̰ų� ��������� ǥ������ �ʴ´�. 0�� ����ְų� 0�̾ ǥ���Ѵ�.(���е��� �� ����)
	}
}
