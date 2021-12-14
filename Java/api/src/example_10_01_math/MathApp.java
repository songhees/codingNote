package example_10_01_math;

public class MathApp {
	public static void main(String[] args) {
		
		// Math Ŭ������ ���а��� ���õ� ����� �����ϴ� Ŭ������.
		// Math Ŭ������ ��� �޼ҵ�� ���� �޼ҵ��.
		
		// ���� ��� double random()�� 0.0���� ũ�ų� ���� 1.0���� ���� ������ �Ǽ��� ��ȯ�Ѵ�.
		System.out.println("### ���� ���");
		double value1 = Math.random();
		System.out.println("����: " + value1);
		
		// 1 ~ 6 ������ ���� ������ ���
		int value2 = (int)(Math.random()*6) + 1;
		System.out.println("�ֻ���: " + value2);
		
		// �ݿø��� �� ��� : long round(double value)�� �ݿø��� ���� ��ȯ�Ѵ�.
		System.out.println("### �ݿø��� �� ���");
		long value3 = Math.round(123.4);
		long value4 = Math.round(123.6);
		System.out.println("123.4�� �ݿø��� ��: " + value3);
		System.out.println("123.6�� �ݿø��� ��: " + value4);
		
		// õ�尪 ��� : double ceil(double value)�� õ�尪�� ��ȯ�Ѵ�.
		// ��ȯ���� ������� �����ϸ� ���� �Ǽ����� �� �ڽź��� ū ���� �߿��� ���� ���� �������� ��ȯ�Ѵ�.
		System.out.println("### õ�尪 ���");
		double value5 = Math.ceil(3.0);
		int value6 = (int)Math.ceil(3.3);
		int value7 = (int)Math.ceil(3.6);
		double value8 = Math.ceil(3.9);
		double value9 = Math.ceil(4.0);
		
		System.out.println("3.0�� õ�尪: " + value5);	// 3.0
		System.out.println("3.3�� õ�尪: " + value6);	// 4.0
		System.out.println("3.6�� õ�尪: " + value7);	// 4.0
		System.out.println("3.9�� õ�尪: " + value8);	// 4.0
		System.out.println("4.0�� õ�尪: " + value9);	// 4.0
		// ������������ ���������� ��ȭ�鿡 20���� ��� �� �� �ִٸ� 25���� ����� ���� ��
		// double (25/20) �� 1.25�̹Ƿ� �������� 1.25�� �ȵǰ� 1�������� ����� �����Ƿ�
		//ceil�� ����ؼ� 2�� �� 2�������� �����Ѵ�.
		
		// �ٴڰ� ��� : double floor(double value)�� �ٴڰ��� ��ȯ�Ѵ�.
		// ��ȯ���� ������� �����ϸ� ���� �Ǽ����� �� �ڽź��� ���� ���� �߿��� ���� ū �������� ��ȯ�Ѵ�.
		System.out.println("### �ٴڰ� ���");
		double value10 = Math.floor(3.0);
		int value11 = (int)Math.floor(3.3);
		int value12 = (int)Math.floor(3.6);
		double value13 = Math.floor(3.9);
		double value14 = Math.floor(4.0);
		System.out.println("3.0�� õ�尪: " + value10);	// 3.0
		System.out.println("3.3�� õ�尪: " + value11);	// 3.0
		System.out.println("3.6�� õ�尪: " + value12);	// 3.0
		System.out.println("3.9�� õ�尪: " + value13);	// 3.0
		System.out.println("4.0�� õ�尪: " + value14);	// 4.0
	}
}
