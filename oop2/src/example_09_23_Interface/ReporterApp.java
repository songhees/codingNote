package example_09_23_Interface;

public class ReporterApp {
	public static void main(String[] args) {
		String title = "ȭ�����";
		String[] columns = {"����", "�̸�", "����ó"};
		String[] data = {"100", "ȫ�浿", "010-1111-1111"};
		
		Reporter excel = new ExcelReporter(title, columns, data);
		excel.printReport();
		
		System.out.println();
		
		title = "������Ȳ";
		columns = new String[]{"�μ���", "�Ѹ����", "��������"};
		data = new String[] {"����1��", "100���", "15���"};
		excel = new ExcelReporter(title, columns, data);
		excel.printReport();
	}
}
