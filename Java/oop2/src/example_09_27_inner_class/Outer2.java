package example_09_27_inner_class;

public class Outer2 {
	
	private int x;
	private static int y;
	public void m1() {
		System.out.println("��� �޼ҵ�");
	}
	public static void m2() {
		System.out.println("���� �޼ҵ�");
	}
	
	// ���� ���� Ŭ����
	static class Inner1{
		private int a; 
		private static int b;
		public void m3() {
			System.out.println("���� ����Ŭ������ ����޼ҵ�");
			
			/*
			 * �ܺ�Ŭ������ ��������� ����� �� ����.
			System.out.println(x);
			 */
			System.out.println(Outer2.y);
			/*
			 * �ܺ�Ŭ������ ����޼ҵ带 ����� �� ����.
			m1();
			 */
			Outer2.m2();
			System.out.println(a);
			System.out.println(Inner1.b);
			Inner1.m4();
		}
		public static void m4() {
			System.out.println("���� ����Ŭ������ �����޼ҵ�");
			
		}
	}
}
