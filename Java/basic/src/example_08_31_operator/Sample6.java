package example_08_31_operator;

public class Sample6 {
	public static void main(String[] args) {
		/*
		 * �񱳿�����
		 * >	>=	<	<=	==	!=
		 * �񱳿������� ���� ����� ������ boolean Ÿ���� ���̴�. true false�� ����
		 * 
		 * ����Ÿ�
		 */
		int distance = 35000;
		
		// ����Ÿ��� ���� ������� ����
		int freeFixDistance = 30000;
		
		// ������� ���� �����ϱ�
		boolean result = distance >= freeFixDistance;
		System.out.println("������� ����: "+ result); // true
		
		System.out.println(1000 == 1000); // true
		System.out.println(1000 != 1000); // false
		System.out.println(2000 == 1000);	// false
		System.out.println(2000 != 1000);	// true
		
		
		
	}
}
