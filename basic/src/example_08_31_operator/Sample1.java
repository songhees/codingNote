package example_08_31_operator;

public class Sample1 {
	public static void main(String[] args) {
		/*
		 * ���������
		 * + -  (* / %)�� ���� ���� �ʰ� ���ڶ� �ٿ��� ����. ����
		 * 
		 * ������ �����ڸ� �̿��ؼ� ���ڸ� ������ �� �ڸ����� �� ���ϱ�
		 */
		int number = 234;
		
		// ���� �ڸ��� ���ϱ�
		int value1 = number%10;				// 234%10 = 4 ------------- ���� �ڸ���
		System.out.println(value1);
		
		// ���� �ڸ��� ���ϱ�
		number = (number - value1)/10;		// (234 - 4)/10 = 23
		int value2 = number%10;				// 23%10 = 3 ------------- ���� �ڸ���
		System.out.println(value2);
		
		// ���� �ڸ��� ���ϱ�
		int value3 = (number - value2)/10;	// (23 - 3)/10 = 2 ------------- ���� �ڸ���
		System.out.println(value3);
		
		
		
		// ���ڸ� ���ڵ��� �� ����ϱ�
		System.out.println(value1 + value2 + value3);
	}
}
