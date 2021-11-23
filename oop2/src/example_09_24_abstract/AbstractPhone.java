package example_09_24_abstract;
/*
 * �߻�Ŭ����
 * 		�߻�Ŭ������ �����ΰ� ���� �޼ҵ带 ���� �� �ִ� Ŭ������.
 * 		�߻�Ŭ������ �����ΰ� �ִ� �޼ҵ带 ���� �� �ִ�.
 * 		�������, ������, ����޼ҵ�, ��������, �����޼ҵ� ���� ���� �� �ִ�.
 * 		�����ΰ� ���� �޼ҵ带 ���� �� �ֱ� ������ new Ű����� ��ü ������ �� ����.
 * 
 */
/**
 * Phone �������̽��� ��üȭ �Ͽ� ���� �߻� Ŭ����
 * @author ������
 *
 */
public abstract class AbstractPhone implements Phone{
	
	private String tel;
	
	/*
	 * - �߻�Ŭ������ new Ű���带 �̿��ؼ� ���� ��ü ������ �� �� ������,
	 *   ��������� ������ �ְ�, �� ��������� �ʱ�ȭ�ϱ� ���� ������ �޼ҵ带 ������ �� �ִ�.
	 * - �߻�Ŭ������ ������ �޼ҵ�� �� Ŭ������ ��ӹ��� ����Ŭ������ ��ü�� ������ �� ����Ŭ������ �����ڸ޼ҵ忡��
	 *   super() �޼ҵ嵵 ����ȴ�.
	 */
	public AbstractPhone() {}		
	public AbstractPhone(String tel) {		// ��ȭ��ȣ�� �ʱ�ȭ�ϴ� ������
		this.tel = tel;
	}
	
	public String getTel() {	// tel�� ��ȯ�ϴ� getter�޼ҵ�
		return tel;
	}
	
	public void setTel(String tel) {	// tel�� �����ϴ� setter�޼ҵ�
		this.tel = tel;
	}
	
	// Phone �������̽��� ���ǵ� �߻�޼ҵ� ������
	@Override
	public void call(String tel) {		// ��ȭ��ȣ�� �޾� ��ȭ�� �Ŵ� �޼ҵ�
		System.out.println("[" + tel + "]�� ��ȭ�� �̴ϴ�.");		
	}
	
	// Phone �������̽��� ���ǵ� �߻�޼ҵ� ������
	@Override
	public void sms(String tel, String message) {	// ��ȭ��ȣ�� �޼����� �޾� ���ڸ� ����ϴ� �޼ҵ�
		System.out.println("[" + tel + "]�� [" + message + "]�� �����ϴ�." );
	}
	
	// Phone �������̽��� ���ǵ� �߻�޼ҵ� ������
	@Override
	public void off() {		// �ڵ��� ȭ���� ���� �޼ҵ�
		System.out.println("ȭ���� ���ϴ�.");
	}
}
