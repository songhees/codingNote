package example_09_24_abstract_template;

public abstract class AbstractBankingJob {
	
	// ��ó�� �۾� ����
	private void before() {
		System.out.println("���� ������� �����Ѵ�.");
		System.out.println("��ȣȭ ��� ä���� ����.");
	}
	
	// ��ó�� �۾� ����
	private void after() {
		System.out.println("��ȣȭ ��� ä���� �ݴ´�.");
		System.out.println("���� ������� ������ ���´�.");
	}
	
	// ���۾��� �߻�ȭ�ϱ�
	public abstract void job();

	// ��ó�� -> ���۾� -> ��ó�� ������ �����ϱ�
	public void process() {
		before();
		job();
		after();
	}
	
	
}
