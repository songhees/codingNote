package example_09_24_abstract;

public class Galaxy extends AbstractSmartPhone {

	private String gmail;
	
	public Galaxy() {}
	public Galaxy(String tel, String ip, String gmail) {
		super(tel, ip);
		this.gmail = gmail;
	}
	
	public String getGmail() {
		return gmail;
	}
	
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	@Override
	public void on() {
		System.out.println("ȫü �ν����� ȭ���� �մϴ�.");
	}
	
	@Override
	public void game() {
		System.out.println("������ �� ������ ������ �÷����Ѵ�.");
	}
}
