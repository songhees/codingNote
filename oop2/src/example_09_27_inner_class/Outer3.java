package example_09_27_inner_class;

public class Outer3 {
	
	private int x;
	private static int y;
	public void m1() {
		System.out.println("��� �޼ҵ�");
	}
	public static void m2() {
		System.out.println("���� �޼ҵ�");
	}
	
	public void m3() {
		int a = 10;
		int b = 10;
		
		// ���ó���Ŭ����
		class Inner2 {
			int m;
			
			/*
			 * ���ó��� Ŭ���������� ���������� ������ �� ����.
			static int n;
			 */
			
			void m3() {
				System.out.println("���� ����Ŭ������ ����޼ҵ�");
				System.out.println(x);			// �ܺ� Ŭ������ �������
				System.out.println(Outer3.y);	// �ܺ� Ŭ������ ��������
				m1();							// �ܺ� Ŭ������ ����޼ҵ�
				Outer2.m2();					// �ܺ� Ŭ������ �����޼ҵ�	
				
				System.out.println(a);			// ����Ŭ������ ���ǵ� �޼ҵ忡�� ����� ����
				/*
				 * ���ó���Ŭ������ ���� ���ϴ� ������ ���� ����� �� ����.
				System.out.println(b);			// ����Ŭ������ ���ǵ� �޼ҵ忡�� ����� ���� - ���� �����
				 */
				System.out.println(m);			// ����Ŭ������ ���ǵ� �޼ҵ忡�� �������
			}
			
			/*
			 * ���ó��� Ŭ���������� �����޼ҵ带 ������ �� ����.
			static void m4() {
				System.out.println("���� ����Ŭ������ �����޼ҵ�");
			}
			 */
		}
		
		b = 30;
	}
	
}
