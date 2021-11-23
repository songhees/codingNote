package example_09_24_abstract;

public class PhoneApp2 {
	// ��ȭ�ɱ� ����� �� �����ϴ��� �׽�Ʈ�ϴ� �޼ҵ�
	public static void testCall(Phone phone) {
		phone.call("010-2222-2222");
	}
	
//	public static void testInternet(Phone phone) {
//		if(phone instanceof SmartPhone) {
//			System.out.println("���޹��� ��ü�� SmartPhone Ÿ���̴�.");
//			((SmartPhone)phone).internet("http://wwww.daum.net");
//		} else {
//			System.out.println("���޹��� ��ü�� SmartPhone Ÿ���� �ƴϴ�.");
//		} 
//	}
	// ���ͳ��ϱ� ����� �� �����ϴ��� �׽�Ʈ�ϴ� �޼ҵ�
	// �Ű������� Ÿ���� SmartPhoneŸ������ �����ϸ�, SmartPhone �������̽��� �����Ѱ�ü�� ���޹��� �� �ִ�.
	// ��, ���ͳ� ����� �������� �ʴ� �Ϲ������� �� �޼ҵ带 ������ ���� ����.
	// ����, ���� �ּ�ó���� �ڵ�ó�� instanceof �����ڸ� ����ϰų�, SmartPhoneŸ������ ��������ȯ�ϴ� �ڵ嵵 �ʿ����.
	public static void testInternet(SmartPhone smartPhone) {
		smartPhone.internet("http://wwww.daum.net");
	}
	

	public static void main(String[] args) {
		System.out.println("### ���������� �׽�Ʈ�ϱ�");
		Iphone iphone = new Iphone("010-1111-1111", "192.168.0.1", "hong");
		
		PhoneApp2.testCall(iphone);
		PhoneApp2.testInternet(iphone);
		
		System.out.println();
		
		System.out.println("### �Ϲ������� �׽�Ʈ�ϱ�");
		NormalPhone normal = new NormalPhone("010-3333-3333");
		
		PhoneApp2.testCall(normal);
		//PhoneApp2.testInternet(normal);
	}

}
