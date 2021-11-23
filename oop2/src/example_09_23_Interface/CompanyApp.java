package example_09_23_Interface;

public class CompanyApp {
	public static void main(String[] args) {
		
		// �������� Data
		String title = "����1�� �������� ��Ȳ";
		String[] columns = {"�μ���", "�Ѹ����", "��������"};
		String[] data = {"����1��", "100���", "20���"};
		
		// Reporter �������̽� ������ü �����ϱ�
		// ������ü�� ���� data�� �����Ѵ�.
		ExcelReporter excel = new ExcelReporter(title, columns, data);

		// Company��ü �����ϱ�
		Company company = new Company();
		
		// Company��ü���� Reporter �������̽� ������ü�� �����ϱ�
		company.setReporter(excel);
		
		// ���������� ����Ʈ�� ����ϱ�
		company.displayCompanyEarning();
	}
}
