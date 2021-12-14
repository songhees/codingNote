package example_09_10_static;

public class Sample {
	
	static int x;			// ��������, Ŭ��������
	int y;					// �������, �ν��Ͻ�����
	
	// ���� �޼ҵ�� ��������/�޼ҵ�� ��밡���ϴ�.
	static void staticMethod() {		// ���� �޼ҵ�, Ŭ���� �޼ҵ�
		System.out.println(Sample.x);	// �������� ��밡��
		//System.out.println(y);			// ����, ������� ���Ұ�
	}

	void instanceMethod() {				// ��� �޼ҵ�, �ν��Ͻ� �޼ҵ�
		System.out.println(Sample.x);	// �������� ��밡��
		System.out.println(y);			// ������� ��밡��
		
	}
	
	static void staticMethod2() {		// ���� �޼ҵ�, Ŭ���� �޼ҵ�
		Sample.staticMethod();			// �ٸ� ���� �޼ҵ� ��밡��	���� Ŭ�����̹Ƿ� Sample.�� ��������
		//instanceMethod();				// ����, ��� �޼ҵ� ���Ұ�
	}
	
	void instanceMethod2() {			// ��� �޼ҵ�, �ν��Ͻ� �޼ҵ�
		Sample.staticMethod();			// ���� �޼ҵ� ��밡��
		instanceMethod();				// �ٸ� ��� �޼ҵ� ��밡��
		
	}
	
	
	

}
