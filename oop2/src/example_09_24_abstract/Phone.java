package example_09_24_abstract;
/**
 * ���� �⺻������ �������� ����� interface�� ����
 * @author ������
 *
 */
public interface Phone {
	
	void on();
	void off();
	void call(String tel);					// ��ȭ��ȣ�� �޾� ��ȭ�ϴ� �߻�ȭ�޼ҵ�
	void sms(String tel, String message);	// ��ȭ��ȣ�� �޾� �޼����� ����ϴ� �߻�ȭ�޼ҵ�
	
}
