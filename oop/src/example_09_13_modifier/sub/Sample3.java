package example_09_13_modifier.sub;

import example_09_13_modifier.Sample1;

public class Sample3 {
	public static void main(String[] args) {
		
		// �ٸ� ��Ű�� (���� ���� ��Ű�� ������ ���� �׳� �ٸ���)
		
		Sample1 s1 = new Sample1();				// ��밡��	- �ٸ� ��Ű�������� ���� ������ �͸� ��밡���ϴ�.
//		Sample1 s2 = new Sample1(10);			// ���Ұ���	// protected Sample1(int a){}					- ��Ű�� ���� + �ڽĿ��� ����
//		Sample1 s3 = new Sample1(10, 20);		// ���Ұ���	// Sample1(int a, int b){}						- ��Ű�� ����
//		Sample1 s4 = new Sample1(10, 20, 30);	// ���Ұ���	// private Sample1(int a, int b, int c){}		- ���� �����
		
		s1.a = 10;	// ��밡��		public int a
//		s1.b = 10;	// ���Ұ���		protected int b
//		s1.c = 10;	// ���Ұ���		int c
//		s1.d = 10;	// ���Ұ���		private int d
	
		s1.method1();	// ��밡��	public method1() {...} 
//		s1.method2();	// ���Ұ���	protected method2() {...}
//		s1.method3();	// ���Ұ���	method3() {...}
//		s1.method4();	// ���Ұ���	private method4() {...}
		
		
	
	}
}
