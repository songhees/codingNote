package example_09_15_override;

public class Phone {
	
	private String tel;		// ��ȣ�� �����ϴ� ����
	public void setTel(String tel) {
		this.tel = tel;		// ��ȣ�� �޾Ƽ� �����ϴ� �޼ҵ�
	}
	
	public void call(String to) {
		System.out.println("["+ tel +"]��" + to + "���� ��ȭ�� �̴ϴ�.");
	}	// ���� ��ȭ��ȣ�� �Ű������� �޾� ��ȭ�� ���
	
	public void off() {
		System.out.println("������ư�� ������ ȭ���� ���ϴ�.");
	}	// ȭ�� ���Ḧ ����ϴ� �޼ҵ�
	
	public void on() {
		System.out.println("������ư�� ������ ȭ���� �մϴ�.");
	}	// ȭ�� ������ ����ϴ� �޼ҵ�
}
