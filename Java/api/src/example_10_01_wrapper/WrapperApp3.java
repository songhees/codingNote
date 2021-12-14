package example_10_01_wrapper;

public class WrapperApp3 {
	public static void main(String[] args) {
		
		// 10������ ���� ������ ���ڷ� ǥ���� �� �ִ�.
		String value1 = Integer.toBinaryString(123456);
		String value2 = Integer.toOctalString(123456);
		String value3 = Integer.toHexString(123456);
		
		System.out.println("123456�� ���� 2������: " + value1);
		System.out.println("123456�� ���� 8������: " + value2);
		System.out.println("123456�� ���� 16������: " + value3);
		
		// ���� ������ ���ڸ� 10������ ��ȯ�ϱ�
		int number1 = Integer.parseInt("123456");
		int number2 = Integer.parseInt("11110001001000000", 2);
		int number3 = Integer.parseInt("361100", 8);
		int number4 = Integer.parseInt("1e240", 16);
		
		System.out.println("123456�� 10�������� ȯ���ؼ� ������ ����: " + number1);
		System.out.println("11110001001000000�� ���ڿ��� 2�������� ȯ���ؼ� ������ ����: " + number2);
		System.out.println("361100�� 8�������� ȯ���ؼ� ������ ����: " + number3);
		System.out.println("1e240�� 16�������� ȯ���ؼ� ������ ����: " + number4);
	}
}
