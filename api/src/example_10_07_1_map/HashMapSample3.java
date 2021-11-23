package example_10_07_1_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample3 {
	public static void main(String[] args) {
		// Map�� ������� ���� ���
		System.out.println("### EventService1���� Map�� ������� ���� ���");
		EventService1 service1 = new EventService1();
		service1.sendEventMessage("���� �Ż�ǰ ���� ��� ����!!", "SMS");
		service1.sendEventMessage("ī�� ä�ΰ��Խ� �������� ����!!", "KAKAOTALK");
		
		// Map�� ����ϴ� ���
		System.out.println("### EventService2���� Map�� ����ϴ� ���");
		EventService2 service2 = new EventService2();
		service2.sendEventMessage("���� �Ż�ǰ ���� ��� ����!!", "SMS");
		service2.sendEventMessage("ī�� ä�ΰ��Խ� �������� ����!!", "KAKAOTALK");
	}
	
	static class EventService1 {
		// ������ �ΰ� �� ��ߵǹǷ� interface�� ���� �ʴ´�.
		SmsSender sms = new SmsSender();
		KakaoTalkSender kakao = new KakaoTalkSender();
		
		// senderType�� ���� �޼����� �����ϴ� Sender�� ���� if ~ else if ���� �ʿ��ϴ�.
		public void sendEventMessage(String message, String senderType) {
			// ������� ���� �� �����.equals(��ü)�� �Ѵ�. ��ü�� null�� ��츦 ���ϱ� ���ؼ�
			if ("SMS".equals(senderType)) {
				sms.sendMessage(message);
			} else if ("KAKAOTALK".equals(senderType)) {
				kakao.sendMessage(message);
			}
		}
	}
	
	static class EventService2 {
		Map<String, Sender> senderMap = new HashMap<>();
		
		public EventService2() {
			senderMap.put("SMS", new SmsSender());
			senderMap.put("KAKOTALK", new KakaoTalkSender());
		}
		
		// ���� Sender������ü�� ���� SMS�� KAKAOTALK�� Ű�� SmsSender�� KakaoTalkSender�� Map�� �����Ѵ�.
		// key������ ����� Sender�� �� �� �ִ�.
		public void sendEventMessage(String message, String senderType) {
			Sender sender = senderMap.get(senderType);
			sender.sendMessage(message);
		}
		
	}
	
	static interface Sender {
		void sendMessage(String message);
		
	}
	
	static class SmsSender implements Sender {
		@Override
		public void sendMessage(String message) {
			System.out.println("[SMS �޼��� �߼�]" + message);
		}
	}
	
	static class KakaoTalkSender implements Sender {
		@Override
		public void sendMessage(String message) {
			System.out.println("[īī���� �޼��� �߼�]" + message);
		}
	}
}
