package example_09_13_modifier;

public class Sample2 {
	public static void main(String[] args) {
		// ���� ��Ű��
		
		Sample1 s1 = new Sample1();				// ��밡��	// public Sample1() {}							- ���� ����
		Sample1 s2 = new Sample1(10);			// ��밡��	// protected Sample1(int a){}					- ��Ű�� ���� + �ڽĿ��� ����
		Sample1 s3 = new Sample1(10, 20);		// ��밡��	// Sample1(int a, int b){}						- ��Ű�� ����
//		Sample1 s4 = new Sample1(10, 20, 30);	// ���Ұ�	// private Sample1(int a, int b, int c){}		- ���� �����
		
		s1.a = 10;	// ��밡��		public int a
		s1.b = 10;	// ��밡��		protected int b
		s1.c = 10;	// ��밡��		int c
//		s1.d = 10;	// ���Ұ���		private int d
	
		s1.method1();	// ��밡��	public method1() {...} 
		s1.method2();	// ��밡��	protected method2() {...}
		s1.method3();	// ��밡��	method3() {...}
//		s1.method4();	// ���Ұ���	private method4() {...}
		
	}
}
