package example_09_08_method;

public class Sample3 {
	/*
	 * �޼ҵ� �ߺ�����
	 * �ϳ��� Ŭ������ ���� �̸��� �޼ҵ带 ������ �����ϴ� ��
	 * �޼ҵ� �ߺ����� ���� : �Ű������� ������ �ٸ� ��, �Ű������� Ÿ���� �ٸ� ��, �Ű������� Ÿ�Ժ� ������ �ٸ� ��
	 * ��� ���� : ������ ����� �ϰ��� �ϳ��� �̸����� ��������.
	 * 			 �Ű������� Ÿ���̳� ������ �ٸ���, ����� ����� �����ϴ� �͵� ���� �̸����� �����ؼ� �ϰ��� �ϳ��� �̸����� ��������.
	 * 			 ��ü�� ������ ����� ����� ����ϱ� ��������.
	 */
	
	double plus(int x, double y) {
		System.out.println("int + double");
		double value = x + y;
		return value;
	}
	
	double plus(double x, int y) {			//���� �ٲ�� �͵� ����
		System.out.println("double + int");
		double value = x + y;
		return value;
	}
	
	int plus(int x, int y) {
		System.out.println("int + int");
		int value = x + y;
		return value;
	}
	
	int plus(int x, int y, int z) {
		System.out.println("int + int + int");
		int value = x + y + z;
		return value;
	}
	
	long plus(long x, long y) {
		System.out.println("long + long");
		long value = x + y;
		return value;
	}
	
	long plus(long x, long y, int z) {
		System.out.println("long + long + long");
		long value = x + y + z;
		return value;
	}
	
	double plus (double x, double y) {
		System.out.println("double + double");
		double value = x + y;
		return value;
	}
	
	double plus (double x, double y, double z) {  //�� �ٽ� double plus (double a, double b, double c) �� ����°� �ȵ�
		System.out.println("double + double + double");
		double value = x + y + z;
		return value;
	}
	
}
