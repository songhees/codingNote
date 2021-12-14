package example_09_24_abstract;

public class PhoneApp {
	public static void main(String[] args) {
		
		// Iphone��ü�� IphoneŸ���� ���������� �����Ѵ�.
		// Iphone�� ����Ŭ������.
		// Iphone�� AbstractPhone�� ������ ���, AbstractSmartPhone�� ������ ����� ��� �޾Ҵ�.
		// Iphone�� Phone �������̽��� ��� �� AbstractPhone���� �������� ���� on����� �����ߴ�.
		// Iphone�� SmartPhone �������̽��� ��� �� AbstractSmartPhone���� �������� ���� game����� �����ߴ�.
		System.out.println("### Iphone��ü�� IphoneŸ���� ���������� �����ϱ�");
		Iphone p1 = new Iphone("010-1111-1111", "192.168.0.1", "hong");
		p1.on();
		p1.call("010-2222-2222");
		p1.sms("010-2222-2222", "�� ������ �Ͷ�");
		p1.off();
		p1.sendEmail("hong@gmail.com", "kim@gmail.com", "����", "������û ���� �Դϴ�.");
		p1.internet("https://google.com");
		p1.game();
		
		// Iphone��ü�� SmartPhoneŸ���� ���������� �����Ѵ�.
		// SmartPhone�� �������̽� Ÿ���̴�.
		// SmartPhone �������̽����� sendEmail, internet, game����� ����Ǿ� �ִ�.
		System.out.println("### Iphone��ü�� SmartPhoneŸ���� ���������� �����ϱ�");
		SmartPhone p2 = new Iphone("010-1111-1111", "192.168.0.1", "hong");
		p2.sendEmail("hong@gmail.com", "kim@gmail.com", "����", "������û ���� �Դϴ�.");
		p2.internet("https://google.com");
		p2.game();
		
		// Iphone��ü�� PhoneŸ���� ���������� �����Ѵ�.
		// Phone�� �������̽� Ÿ�Դϴ�.
		// Phone �������̽����� on, off, call, sms ����� ����Ǿ� �ִ�.
		System.out.println("### Iphone��ü�� PhoneŸ���� ���������� �����ϱ�");
		Phone p3 = new Iphone("010-1111-1111", "192.168.0.1", "hong");
		p3.on();
		p3.call("010-2222-2222");
		p3.sms("010-2222-2222", "�� ������ �Ͷ�");
		p3.off();
		
		
		
		
		
		
		
	}
}
