package example_08_31_var;

public class Sample4 {
	public static void main(String[] args) {
		// �ؽ�Ʈ�� �����ϴ� ����
		
		// �� ���ڸ� �����ϴ� ����
		// char�� �� ���ڸ� �����ϴ� ������ �ڷ����̴�.
		// �����ý��ۿ� ���ø����̼ǿ��� �� ���ڷε� ���� ���� �������� �ʱ� ������, char�� ���� ������ �ʴ´�.
		char value1 = 'A';		// ���� 'A'�� ������ ����ȴ�.
		char value2 = 65;		// �ƽ�Ű�ڵ�ǥ���� 65��° ���ڰ� ������ ����ȴ�.
		char value3 = '\u0041';	// �����ڵ幮��ǥ���� 0x0041��° ���ڰ� ������ ����ȴ�.
		//char value4 = 'AA';		// ����, �� ���� �̻��� ������ �� ����.
		//char value5 = '';			// ����, �� ���ڸ� ������ �� ����. ������ �ƴϴ�.
		char value6 = ' ';			// ���� �� ���� ������ �� �ִ�. ���鵵 ���ڱ� ������ ���� 2���� ������ �� ����.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		/*
		 *  ���ڿ�(���� ����)�� �����ϴ� ����
		 *  �ڹٴ� ���ڿ�(���� ����)�� �����ϴ� ������Ÿ���� �������� �ʴ´�.
		 *  ���ڿ�(���� ����)�� �����ϴ� String�� �����ȴ�
		 */
		String value7 = "";							// �� ���ڵ� ������ �� �ִ�.
		String value8 = "A";						// �� ���ڵ� ������ �� �ִ�.
		String value9 = "�ȳ��ϼ���";					// ���� ���ڵ� ������ �� �ִ�.
		String value10 = "              ";			// �Ѱ� �̻��� ���鵵 ������ �� �ִ�.
		String value11 = "�ȳ��ϼ��� �ݰ����ϴ�.";		// ������ �����ϴ� ���� ���ڸ� ������ �� �ִ�.
		//String value12 = 'A';						// ����, 'A'�� char Ÿ���� �������� ������ �� �ִ�.
		//char value = "A";							// ����, "A"�� String Ÿ���� �������� ������ �� �ִ�.
		
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value11);
		System.out.println(value11.replace("�ȳ�", "**"));
		System.out.println(value11.length());
	}
}
