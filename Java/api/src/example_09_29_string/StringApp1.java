package example_09_29_string;

public class StringApp1 {
	public static void main(String[] args) {
		
		String str = "CLI Artisti Italiani E Stranieri Negli Stati Estensi";
			
		// String int length()�� ���ڿ��� ���̸� ��ȯ�Ѵ�.
		int len = str.length();
		System.out.println("���ڿ��� �� ����: " + len);
		
		int len2 = "E Stranieri Negli Stati Estensi".length();
		System.out.println("���ڿ��� �� ����: " + len2);
		
		// String�� boolean equals(Object o)�� String��ü�� ������ �ִ� ���ڿ��� ������ ���ؼ� ������ ������ true�� ��ȯ�Ѵ�.
		// String�� equals(Object o)�� ObjectŬ������ equals(Object o)�� �������� ���̴�.
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		String str4 = new String("ȫ�浿");
		
		System.out.println("String ��ü�� ���ϼ��� Ȯ���غ���");
		System.out.println(str1 == str2); // ��ü�� ���ϼ��� Ȯ���ϴ� �ڵ��.			true
		System.out.println(str3 == str4); // ��ü�� ���ϼ��� Ȯ���ϴ� �ڵ��.			false
		
		System.out.println("String ��ü�� ����� Ȯ���غ���");
		System.out.println(str1.equals(str2));	// ��ü�� ����� Ȯ���ϴ� �ڵ��.	true
		System.out.println(str3.equals(str4));	// ��ü�� ����� Ȯ���ϴ� �ڵ��.	true
		System.out.println(str1.equals(str3));	// ��ü�� ����� Ȯ���ϴ� �ڵ��.	true
		System.out.println(str2.equals(str4));	// ��ü�� ����� Ȯ���ϴ� �ڵ��.	true
	
		// String�� boolean isEmpty()�� String ��ü�� �� ���ڿ�(���̰� 0�� ���ڿ�)�� ��� true�� ��ȯ�Ѵ�.
		System.out.println("String��ü�� ���ڿ��� �� ���ڿ����� Ȯ���غ���");
		str1 = "";
		str2 = " ";	// ���鹮�� �ϳ��� ������ �ִ� ���ڿ��̴�.
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		
		// String�� boolean isBlank()�� String ��ü�� �� ���ڿ��̰ų� ���鸸 �����ϰ� �ִ� ���ڿ��� ��� true�� ��ȯ�Ѵ�.
		// java 11 ���� �����Ǵ� API
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		
		// String boolean contains(CharSequence str)�� String��ü�� �����ϰ� �ִ�  ���ڿ��� ������ ���ڿ��� �����ϰ� �ִ��� ���θ� ��ȯ�Ѵ�.
		// if������ boolean���� ���� ���ȴ�.
		System.out.println("### String ��ü�� ���ڿ��� ������ ���ڿ��� �ִ°�?");
		str1 = "����, �λ�, ����, ���, ��õ";
		boolean result1 = str1.contains("�λ�");
		boolean result2 = str1.contains("���");
		System.out.println(result1);
		System.out.println(result2);
		
		// String substring(int beginIndex)�� String��ü�� �����ϰ� �ִ� ���ڿ�����
		// ������ ������ġ���� ���ڿ��� ���� �ش��ϴ� ���ڿ��� ������ ���ο� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		
		// String String substring(int beginIndex, int endIndex)�� String ��ü�� �����ϰ� �ִ� 
		// ���ڿ����� ������ �������� ���ڿ��� ������ ���ο� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		System.out.println("String��ü�� ���ڿ��� ���� �κ� ���ڿ� �����ϱ�");
		str1 = "abcdefghijklmn";
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 8));
		
		String �ֹε�Ϲ�ȣ = "010101-1234567";
		System.out.println("����: " + �ֹε�Ϲ�ȣ.substring(2, 6));//0101
		
		// String�� String toUpperCase()�� String toLowerCase()�� ���� String ��ü�� ����
		// �ϰ� �ִ� ���ڿ��� ���ؼ� �빮�ڿ� �ҹ��ڷ� ������ ���ο� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		System.out.println("### String��ü�� ���ڿ��� ���ؼ� �빮��/�ҹ��ڷθ� ������ ���ڿ��� ���");
		str1 = "Good Morning!";
		String result3 = str1.toUpperCase();
		String result4 = str1.toLowerCase();
		System.out.println("�������ڿ�: " + str1);
		System.out.println("�빮�ڷ� ������ �� ���ڿ�: " + result3);
		System.out.println("�ҹ��ڷ� ������ �� ���ڿ�: " + result4);
		
		// String�� replace(CharSequence target, CharSequence replacement)�� String��ü�� �����ϰ� �ִ� ���ڿ���
		//���ؼ� ù��° ǥ���Ŀ� �ش��ϴ� ���ڵ��� ã�Ƽ� �ι�° ���ڿ� �ش��ϴ� ���ڿ��� ��ü�� ���ο� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		System.out.println("### String��ü�� ���ڿ��� ���ؼ� ���ڸ� ã�Ƽ� �����ڷ� ������ ���ڿ��� ���");
		str1 = "���� �ڹ� �������Դϴ�. �ڹ� ���α׷��� ����ϴ�.";
		result3 = str1.replace("�ڹ�", "���̽�");
		System.out.println("���� ���ڿ�: " + str1);
		System.out.println("���ڿ��� ����� �� ���ڿ�: " + result3);
		
		// String�� boolean startsWith(String prefix)�� boolean endsWith(String suffix)�� ����
		// String ��ü�� �����ϰ� �ִ� ���ڿ��� Ư�� ���ڷ� ���۵Ǵ���, Ư�� ���ڷ� �������� ���θ� ��ȯ�Ѵ�.
		System.out.println("### String��ü�� ���ڿ��� ���ؼ� Ư�� ���ڷ� �����ϴ���, Ư�� ���ڷ� ���������� Ȯ���غ���");
		str1 = "http://www.daum.net";
		str2 = "www.naver.com";
		str3 = "google.com";
		System.out.println(str1.startsWith("http://"));	//true
		System.out.println(str2.startsWith("http://"));	//false
		System.out.println(str3.startsWith("http://")); //false
		System.out.println(str1.endsWith("com"));		//false
		System.out.println(str2.endsWith("com"));		//true
		System.out.println(str3.endsWith("com"));		//true
		
		// String�� int indexOf(String text)�� int lastIndexOf(String text)�� ���ڿ� ��ü�� �����ϰ� �ִ� ���ڿ�����
		// ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ���������� �����ϴ� ��ġ�� ��ȯ�Ѵ�.
		// ������ ���ڿ��� �������� ������ -1�� ��ȯ�Ѵ�.
		System.out.println("### String��ü�� ���ڿ��� ���ؼ� Ư�� ���ڿ��� ��� ��ġ�� �ִ��� Ȯ���ϱ�");
		String[] phones = {"02)123-4567", "051)345-907", "031)0980-2541"};
		//)�� ��ġ�� ���� ���� ó�� ���ڰ� ����� �ִ��� �� �� �ִ�.
		for (String phone: phones) {
			System.out.println(phone + "," + phone.indexOf(")"));
			System.out.println("����: " + phone.substring(0, phone.indexOf(")")));
		}
		
		// String�� String[] split(String delim)�� String��ü�� �����ϰ� �ִ� ���ڿ��� ���ؼ�
		// ������ ���й��ڷ� ���ڿ��� �ڸ���, �߸� ���ڵ��� �迭�� ��Ƽ� ��ȯ�Ѵ�.
		// String text = "������", ������, �̼���";
		// String[] names = text.split(",");		 names = {"������", "������", "�̼���"};
		
		// str1���� �̹� ���ǿ� ��û�� ������̴�.
		// ��û�ڼ��� ��û�� ����� �̸��� ȭ�鿡 ����ϱ�
		System.out.println("### String��ü�� ���ڿ��� ,�� ���е� �ؽ�Ʈ�� �� �� ����Ʈ�� �м��ؼ� ó���ϱ�");
		str1 = "������, ������, �̼���, ������, ���߱�";
		String[] names = str1.split(", ");
		int count = names.length;
		System.out.println("��ü �����ڼ�: " + count + "��");
		for (String name:names) {
			System.out.println("������ �̸�: " + name);
		}
		
		// String�� String trim()�� String ��ü�� �����ϰ� �ִ� ���ڿ��� ���ؼ�
		// ���ڿ��� ��/�쿡 ���Ե� ���ʿ��� ������ ���ŵ� ���ο� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		System.out.println("### String��ü�� ���ڿ����� �¿� ������ ���ŵ� ���ڿ��� ����");
		str1 = "				�ȳ��ϼ���					�ݰ����ϴ�.		";
		result3 = str1.trim();
		System.out.println("���� ���ڿ� [" + str1 + "]");
		System.out.println("�� ���ڿ� [" + result3 + "]");
		
		// String �� ���� �޼ҵ� String valueOf(int value), String valueOf(long value)
		// String valueOf(double value), String valueOf(boolean value), String valueOf(char value) ����
		// �Է°��� ���� ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		System.out.println("### String Ŭ������ valueOf(��)�� �Է����� ���޹��� ���� ���� ���ڿ��� �����Ѵ�.");
		String value1 = String.valueOf(100);
		String value2 = String.valueOf(1000000000000000000L);
		String value3 = String.valueOf(3.141592);
		String value4 = String.valueOf('A');
		String value5 = String.valueOf(true);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		/*
		 * �⺻�ڷ����� ���ڿ����� ������ ��ȯ
		 * 		�⺻�ڷ����� ���ڿ��� ��ȯ�ϱ�
		 * 			String ���ڿ� = String.valueOf(����);
		 * 			String ���ڿ� = String.valueOf(�Ǽ�);
		 * 			String ���ڿ� = String.valueOf(����);
		 * 			String ���ڿ� = String.valueOf(����);
		 * 		���ڿ��� �⺻�ڷ��������� ��ȯ�ϱ�
		 * 			int ���� = Integer.parseInt("1234");
		 * 			long ���� = Long.parseLong("100000000");
		 * 			double �Ǽ� = Double.parseDouble("3.141592");
		 * 			boolean ���� = Boolean.parseBoolean("true");
		 */
	}
}
