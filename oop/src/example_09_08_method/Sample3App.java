package example_09_08_method;

public class Sample3App {
	public static void main(String[] args) {
		/*
		 * �޼ҵ� �ߺ����ǵ� ��ü �����ϱ�
		 */
		Sample3 sample = new Sample3();
		
		// �޼ҵ� ����� �Ű������� ���� �ٸ� �޼ҵ� ������ ����
		
		int value1 = sample.plus(10, 20);
		System.out.println(value1);
		
		double value2 = sample.plus(10, 3.14);
		System.out.println(value2);
		
		int value3 = sample.plus(10, 20,30);
		System.out.println(value3);
		
		long value4 = sample.plus(1000000000L, 456394384023948239L);
		System.out.println(value4);
		
		/*
		 * ���
		 * �޼ҵ� ����� ������ ���� ������ �Ű�����(Ÿ��/����)�� ���� �ִ� �޼ҵ尡 �����
		 * �پ��� ���� ����� �ϳ��� �ϰ��� �̸����� ������.
		 * ����� ����� �ϳ��� �ϰ��� �̸����� ����ϱ� ������ �ڵ��� �������� ��뼺�� ��������.
		 */
	}
}
