package example_09_24_abstract;
/**
 * �߻� Ŭ������ ��ӹ޾� �Ϲ����� ����� �����ϴ� Ŭ����
 * @author ������
 *
 */
public class NormalPhone extends AbstractPhone{
	
	public NormalPhone() {}
	public NormalPhone(String tel) {	// �θ� Ŭ������ �����ڿ� tel�� �޾� �ʱ�ȭ��
		super(tel);
	}
	
	@Override
	public void on() {					// �Ϲ����� ȭ���� ������ �޼ҵ� ������
		System.out.println("������ư�� ������ ȭ���� �����ϴ�.");
	}
}
