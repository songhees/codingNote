package example_09_16_polymorphism;

public class MessengerApp {
	public static void main(String[] args) {
		System.out.println("### Messenger�� �޼��� ������");
		Messenger messenger = new Messenger();
		messenger.sendMessage("010-1111-1111", "010-2222-2222", "�̺�Ʈ�� ��÷�Ǿ����ϴ�.");
		
		System.out.println("### KakaoTalkMessenger�� �޼��� ������");
		KakaoTalkMessenger katalk = new KakaoTalkMessenger("ȫ�浿", "����̻���");
		katalk.sendMessage("ȫ�浿", "�̼���", "���� �б����� 11�ÿ� ����");
		
		System.out.println("### KakaoTalkMessenger�� �޼��� ������");
		Messenger kakao = new KakaoTalkMessenger("������", "����������");
		kakao.sendMessage("������", "������", "���� ���� �����־�??");
		
		
		
	}
}
