package example_09_16_polymorphism;
/**
 * �޼��� ���۱���� ������ Ŭ����
 * @author ������
 *
 */
public class Messenger {
	/**
	 * �޼����� �����Ѵ�.
	 * @param from	�޼��� ������ ���
	 * @param to	�޼��� �޴� ���
	 * @param text	�޼��� ����
	 */
	public void sendMessage(String from, String to, String text) {
		System.out.println("### ���ڸ޼����� �߼���");
		System.out.println("�۽��� ��ȭ��ȣ: " + from);
		System.out.println("������ ��ȭ��ȣ: " + to);
		System.out.println("����: " + text);
		System.out.println();
	}
	
	
	
	
	
	
}
