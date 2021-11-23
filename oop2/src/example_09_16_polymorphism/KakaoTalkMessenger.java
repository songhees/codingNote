package example_09_16_polymorphism;

public class KakaoTalkMessenger extends Messenger {
	
	private String nickName;
	private String profile;
	
	public KakaoTalkMessenger(String nickName, String profile) {
		this.nickName = nickName;
		this.profile = profile;
	}
	public void displayMyProfile() {
		System.out.println("����: " + nickName);
		System.out.println("����: " + profile);
	}
	
	// ����Ŭ����(Messenger)�� sendMessenge(from, to, text)�� ������ �Ѵ�.
	@Override
	public void sendMessage(String from, String to, String text) {
		System.out.println("### ī������ �޼����� �߼���");
		System.out.println("������ ��� ���̵�: " + from);
		System.out.println("�޴� ��� ���̵�: " + to);
		System.out.println("����: " + text);
		System.out.println();
	
	}

}
