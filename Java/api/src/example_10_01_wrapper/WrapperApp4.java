package example_10_01_wrapper;

public class WrapperApp4 {
	public static void main(String[] args) {
		
		// Wrapper Ŭ������ parseXXX(���ڿ�) �޼ҵ�
		/*
		 * ���ڿ��� �⺻�ڷ��� Ÿ���� ������ ��ȯ�ϴ� ���� �޼ҵ�
		 * 		int 		Integer.parseInt(String text)
		 * 		long		Long.parseLong(String text)
		 * 		double		Double.parseLong(String text)
		 * 		boolean		 Boolean.parseBoolean(String text)
		 */
		System.out.println("### ���ڿ��� ���������� ��ȯ�ϱ�");
		int value1 = Integer.parseInt("12345");
		//int value2 = Integer.parseInt("12_345");		// "12_345"		���� �߻�, �ڸ����� ��Ÿ���� _���ڸ� ������� ����
		//int value3 = Integer.parseInt("12345.6");		// "12345.6"	���� �߻�, ������ȯ�ϱ� ������ �Ҽ������� ������� ����
		//int value4 = Integer.parseInt(" 12345");		// " 12345"		���� �߻�, ���鹮�ڸ� ������� ����
		//int value5 = Integer.parseInt("12,345");		// "12,345"		���� �߻�, �ڸ����� ��Ÿ���� ,���ڸ� ������� ����
		
		System.out.println(value1);						// 1��° ��츸 ���ڷ� ��ȯ������ ��ȿ�� ���ڿ��̴�.

		
		System.out.println("### ���ڿ��� double Ÿ���� �Ǽ������� ��ȯ�ϱ�");
		double value6 = Double.parseDouble("123.45");	// �Ǽ��� ��ȯ�ϱ� ������ �Ҽ������� ����Ѵ�.
		double value7 = Double.parseDouble("123.");		// �Ҽ����� ǥ���ϰ�, �Ҽ������� ���� ��� �������.
		double value8 = Double.parseDouble("123");		// �������� ���ڿ��� �������.
		
		System.out.println(value6);						
		System.out.println(value7);				
		System.out.println(value8);		
		/*
		 * java.lang.NumberFormatExcetion
		 * 		���������� ���ڿ��� �ƴ� ���� ���ڷ� ��ȯ�� �� �߻��ϴ� ������.
		 */
		
		
	}
}
