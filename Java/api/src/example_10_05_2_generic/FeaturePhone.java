package example_10_05_2_generic;

public class FeaturePhone implements Phone {
	@Override
	public void call(String to) {
		System.out.println("���������� ��ȭ�ɱ�:" + to);
	}
	
	@Override
	public void sms(String to, String message) {
		System.out.println("���������� ���ں�����:" + to + ", " + message);
	}
}
