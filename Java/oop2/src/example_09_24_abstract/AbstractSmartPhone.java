package example_09_24_abstract;
/**
 * �� �߻�Ŭ������ ��ӹ޾� �⺻ ���� ����� ��ӹް�
 * SmartPhone�������̽��� ��üȭ�Ͽ� ����Ʈ���� ����� �����Ѵ�.
 * @author ������
 *
 */
public abstract class AbstractSmartPhone extends AbstractPhone implements SmartPhone{
	
	private String ip;					// ����Ʈ������ �����ϴ� ���� ip
	public AbstractSmartPhone() {}
	public AbstractSmartPhone(String tel, String ip) {	// ��ӹ��� Ŭ������ �����ڿ� �� Ŭ������ �⺻���� �ʱ�ȭ�ϴ� ������
		super(tel);
		this.ip = ip;
	}
	
	public String getIp() {		// ip�� ��ȯ�ϴ� �޼ҵ�
		return ip;
	}
	
	public void setIp(String ip) {	// ip�� �޾� ���� �ִ� �޼ҵ�
		this.ip = ip;
	}
	
	@Override
	public void sendEmail(String from, String to, String title, String content) {
		System.out.println("[" + from + "]�� [" + to + "]���� [" + title +"][" + content + "]�� ���Ϸ� �����ϴ�.");
	}
	
	@Override
	public void internet(String url) {
		System.out.println("[" + url + "]�� �ش��ϴ� �� �������� ǥ���մϴ�.");
		
	}
}
