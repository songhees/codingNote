package example_09_15_override;

public class Galaxy extends Phone {
	
	@Override
	public void on() {
		System.out.println("������ ���ļ� ȭ���� �մϴ�.");
	}	// ����ü�� �޼ҵ带 ������ �Ͽ� ȭ�� ������ ����ϴ� ����� �ٸ��� ���

	@Override
	public void off() {
		System.out.println("������ ��� ȭ���� ���ϴ�.");
	}	// ����ü�� �޼ҵ带 ������ �Ͽ� ȭ�� ���Ḧ ����ϴ� ����� �ٸ��� ���
	
	
	
}
