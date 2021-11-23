package example_09_16_polymorphism;

import java.util.Date;

/**
 * �̺�Ʈ ���, �̺�Ʈ �˸�, �̺�Ʈ ��÷�� ���� ���� ����� ������ Ŭ����
 * @author ������
 *
 */
public class EventService {
	/**
	 * Messenger ��ü �� Messenger ���� ��ü���� �����ϴ� ����
	 */
	private Messenger messenger = new EmailMessenger("admin","zxcv1234"); //has a ����
	/**
	 * ���ο� �̺�Ʈ�� ����Ѵ�. 
	 * @param title	�̺�Ʈ ����
	 * @param text	�̺�Ʈ ����
	 * @param startDate �̺�Ʈ ������
	 * @param endDate	�̺�Ʈ ������
	 */
	public void addEvent(String title, String text, Date startDate, Date endDate) {
		
	}	
	/**
	 * �ֽ��̺�Ʈ �ҽ��� ��������� ���鿡�� �����ϴ�.
	 * @param from	������ ��
	 * @param to	�޴� ��
	 * @param text	�̺�Ʈ ����
	 */
	public void noticeEvent(String from, String to, String text) {
		System.out.println("## �ֽ� �̺�Ʈ �ҽ��� �߼��մϴ�.");
		messenger.sendMessage(from, to, text);
		
		
	}
}
