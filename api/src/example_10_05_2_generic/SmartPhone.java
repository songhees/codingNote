package example_10_05_2_generic;

public class SmartPhone implements Phone {
	@Override
	public void call(String to) {
		System.out.println("����Ʈ������ ��ȭ�ɱ�: " + to);
	}
	
	@Override
	public void sms(String to, String message) {
		System.out.println("����Ʈ������ ���ں�����: " + to + ", " + message);
	}
	
	public void internet() {
		System.out.println("����Ʈ������ ���ͳ��ϱ�");
	}
}
