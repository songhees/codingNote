package example_09_16_polymorphism;

public class EventServiceApp {
	public static void main(String[] args) {
		// �ֽ� �̺�Ʈ ���, �̺�Ʈ �˸�, �̺�Ʈ ��÷�� ���� ����� ������ EventService��ü�� �����Ѵ�.
		EventService service = new EventService();
		
		// �ֽ� �̺�Ʈ �ҽ��� ������ �˸���.
		service.noticeEvent("hong@gmail.com", "kim@gmail.com", "�߼� ������Ʈ�� ���� ���Խ��ϴ�.");
		
	}
}
