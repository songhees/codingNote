package example_09_13_modifier.sub;

import example_09_13_modifier.Sample1;

// Sampel4�� Sample1�� �ڽ� Ŭ������.
public class Sample4 extends Sample1{
	public void method() {
		
		a = 10;
		b = 10;
//		c = 10;		// ���Ұ� ���� ��Ű�������� ���� ����
//		d = 10;		// ���Ұ� s
		
		Sample1 s1 = new Sample1();				// ��밡��	- �ٸ� ��Ű�������� ���� ������ �͸� ��밡���ϴ�.
//		Sample1 s2 = new Sample1(10);			// ��밡��	// protected Sample1(int a){}					- ��Ű�� ���� + �ڽĿ��� ����
//		Sample1 s3 = new Sample1(10, 20);		// ���Ұ���	// Sample1(int a, int b){}						- ��Ű�� ����
//		Sample1 s4 = new Sample1(10, 20, 30);	// ���Ұ���	// private Sample1(int a, int b, int c){}		- ���� �����
//	
		
		
	}
	
	
	
}
