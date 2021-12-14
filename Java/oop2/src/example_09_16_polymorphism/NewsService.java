package example_09_16_polymorphism;
/**
 * ���� ������ ��û�� ����ڿ��� �ֽ� ������ �߼��ϴ� ����Ŭ������.
 * @author ������
 *
 */
public class NewsService {
	
	/**
	 * �ֽ� ������ ����ڿ��� ������ �� ����ϴ� Messenger�� ��ü�� �����ϴ� ��������
	 */
	private Messenger messenger;
	
	/**
	 * �⺻ ������ �޼ҵ�
	 */
	public NewsService() {}
	
	/**
	 * Messenger�� ��ü�� �ּҰ��� ���޹޾Ƽ� ��������� �����ϴ� ������ �޼ҵ��.
	 * @param messenger
	 */
	public NewsService(Messenger messenger) {
		this.messenger = messenger;
	}
	
	/**
	 * Messenger�� ��ü�� �ּҰ��� ���޹޾Ƽ� ��������� �����ϴ� setter �޼ҵ��. 
	 * @param messenger
	 */
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	/**
	 * �ֽŴ����� �����ڿ��� �߼��Ѵ�.
	 * @param from	������ ������ ��
	 * @param to	������ �����ϴ� ��
	 * @param news	������ ����
	 */
	public void boadcastNews(String from, String to, String news) {
		messenger.sendMessage(from, to, news);
	}
}
