package example_10_01_wrapper;

public class WrapperApp2 {
	public static void main(String[] args) {
		// ����ڽ�, �����ڽ� (�ڹ� 5�������� �����ϴ� ���)
		// �⺻�ڷ��� -> Wrapper Ŭ������Ÿ���� ��ü��
		// Wrapper Ŭ����Ÿ���� ��ü -> �⺻�ڷ��������� ������ �ڵ����� ó���ϴ� ��
		
		// ����ڽ�	// �ڽ��� ���� ��´�.
		// ������ Ÿ���� Wrapper Ŭ���� Ÿ���̰� ������ ���� Ÿ���� �⺻�ڷ����� ��
		// �ڵ����� ������ Ÿ�԰� ��ġ�ϴ� Wrapper ��ü�� �����ؼ� �⺻�ڷ������� ������ ����
		// �� ��ü�� ���������� �����ϴ� ��
		Integer a1 = 10; 			// = new Integer(10); ����10�� �����ϴ� Integer��ü�� �ּҰ�	������ ����Ǵ� �ڵ�
		Long a2 = 100000000000L; 	// = new Long(100000000000L);	������ ����Ǵ� �ڵ�
		Double a3 = 3.14;			// = new Double(3.14);			������ ����Ǵ� �ڵ�
		
		Object b1 = 10;				// = new Integer(10); b1���������� Integer��ü�� ���ο� �ִ� Object�� �������̴�.
		Object b2 = 100000000000L;	// = new Long(100000000000L);
		Object b3 = 3.14;			// = new Double(3.14);
		// Object or �����Ͱ�ü or Number��ü ����
		String str = "�ȳ�";			//
	
		// �����ڽ� // �ڽ��� �����ؼ� ���� ����
		// Wrapper Ŭ���� Ÿ���� ��ü�� ����� ����
		// �⺻ �ڷ��� Ÿ���� ������ �����ϸ� �ڵ����� �ش� Wrapper��ü�� ������ �ִ� �⺻�ڷ��� ���� ���Եȴ�.
		Integer c1 = 1000;			// Integer c1 = new Integer(1000);
		int c2 = c1;				// int c2 = c1.intValue(); <= Intger��ü�� intValue()�� �����ؼ� �������� ������ ���� c2�� �����Ѵ�. �ڵ����� �Ͼ
		
		
		// ����ڽ̰� �����ڽ��� �����Ǳ� ������ Wrapper���ÿ� �⺻�ڷ��� ���� ��Ģ���굵 �����ϴ�.
		Integer d1 = 20;
		Integer d2 = 30;
		int d3 = 40;
		
		// �⺻����Ÿ�� ���� = ��ü + ��ü + ����
		int sum = d1 + d2 + d3;	// int sum = d1.inValue() + d2.inValue() + d3;
		System.out.println("�հ�:" + sum);
	}
}
