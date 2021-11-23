package example_09_16_polymorphism;

public class EmailMessenger extends Messenger {
	
	private String email;
	private String password;
	
	public EmailMessenger() {
		
	}
	
	public EmailMessenger(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	@Override
	public void sendMessage(String from, String to, String text) {
		System.out.println("[" + email + "][" + password + "]�� ���ϰ����� �α�����");
		System.out.println("### �̸��Ϸ� �޼����� �߼���");
		System.out.println("������ �ּ�: " + from);
		System.out.println("�޴� �ּ�: " + to);
		System.out.println("����: " + text);
		System.out.println();
	}
}
