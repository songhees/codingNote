package example_09_27_inner_class;

public class Outer1 {

	private int x;				// ������� �ν��Ͻ����� ������Ƽ
	private static int y;		// �������� Ŭ��������
	
	public void m1() {			// ��� �޼ҵ� �ν��Ͻ� �޼ҵ�
		System.out.println("��� �޼ҵ�");
	}
	public static void m2() {	// ���� �޼ҵ� Ŭ���� �޼ҵ�
		System.out.println("���� �޼ҵ�");
	}
	
	// ��� ����Ŭ���� �ν��Ͻ� ����Ŭ����
	class Inner1 {
		private int a;			// ��� ����Ŭ������ ������� �ν��Ͻ����� ������Ƽ
		/*
		 * ��� ����Ŭ�������� ���������� ������ �� ����.
		private static int b;	// ����, ��� ����Ŭ������ �������� Ŭ��������
		 */
		public void m3() {
			System.out.println(x);			// �ܺ�Ŭ������ ������� ��밡��
			System.out.println(Outer1.y);	// �ܺ�Ŭ������ �������� ��밡��
			m1();							// �ܺ�Ŭ������ ����޼ҵ� ��밡��
			Outer1.m2();					// �ܺ�Ŭ������ �����޼ҵ� ��밡��
			System.out.println(a);			// �ڽ��� ������� ��밡��
		}
		
		/*
		 * ��� ����Ŭ���������� ���� �޼ҵ带 ������ �� ����.
		public static void m4() {
	
		}
		 */
			
	}
	
}
