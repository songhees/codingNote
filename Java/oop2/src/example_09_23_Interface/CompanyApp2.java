package example_09_23_Interface;

public class CompanyApp2 {
	public static void main(String[] args) {
		
		String title = "����1�� �������� ��Ȳ";
		String[] columnLabels = {"�Ѹ����", "��������"};
		int[] values = {350_000_000, 120_000_000};
		
		ChartReporter chart = new ChartReporter(title, columnLabels, values);
		
		Company company = new Company();
		company.setReporter(chart);
		
		company.displayCompanyEarning();
	}
}
