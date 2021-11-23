package example_09_23_Interface;

public class Company{

	// Company��ü�� ����� Reporter ���� ��ü�� �����ϴ� ������� ����
	/*
	 * Company��ü�� Reporter �������̽��� ������ ����Ŭ������ ������� ��ü�� ����� ���̴�.
	 * Company��ü�� Reporter �������̽��� ������ �پ��� ��ü�� ����� ���̴�.
	 */
	private Reporter reporter;
	
	// Reporter �������̽��� ������ ��ü�� ���޹޴� setter �޼ҵ带 ����
	/*
	 * Reporter �������̽��� ������ ��ü�� ���޹޾Ƽ� ������� reporter�� �����ϴ� setter�޼ҵ��.
	 */
	public void setReporter(Reporter reporter) {
		this.reporter = reporter;
	}
	
	// �μ��� �Ѹ���װ� ���������� ����Ʈ�� ����ϴ� ���
	public void displayCompanyEarning() {
		reporter.printReport();
	}
	
}
