package example_09_24_abstract;

/*
 * Iphone
 * 		����Ŭ������.
 * 		�߻�Ŭ������ AbstractPhone Ŭ������ ��ӹ޾Ҵ�.
 * 		Iphone�� Phone�������̽� ��� AbstractPhone �߻�Ŭ������ ��ӹ޾ұ� ������
 * 		�߻�Ŭ�������� �������� ���� on()�޼ҵ常 �����ϸ� �ȴ�.
 */
public class Iphone extends AbstractSmartPhone{

	private String userId;
	
	public Iphone() {
		
	}
	
	public Iphone(String tel, String ip, String userId) {
		// AbstractPhone�� �Ű������� �ִ� �����ڸ� ȣ���ϴ� ���๮
		super(tel, ip);
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public void on() {
		System.out.println("�� �ν����� ȭ���� �մϴ�.");
	}
	
	@Override
	public void game() {
		System.out.println("���� �����̵� ������ �÷����Ѵ�.");
		
	}
}
