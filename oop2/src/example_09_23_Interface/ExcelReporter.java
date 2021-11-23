package example_09_23_Interface;
/**
 * Reporter�� �����ϴ� ��ü
 * ������ data�� ����ϴ� ��ü
 * @author ������
 *
 */
public class ExcelReporter implements Reporter {
	/**
	 * ����� ������ �����Ѵ�.
	 */
	private String title;
	private String[] columns;
	private String[] data;
	/**
	 * ����� ������ �����ڷ� ���� �ʱ�ȭ�Ѵ�.
	 * @param title
	 * @param columns
	 * @param data
	 */
	public ExcelReporter(String title, String[] columns, String[] data) {
		this.title = title;
		this.columns = columns;
		this.data = data;
	}
	/**
	 * �����ڷ� ���� �ʱ�ȭ�� data�� ����ϴ� �����ǵ� �޼ҵ�
	 */
	@Override
	public void printReport() {
		// ���� ǥ��
		System.out.println("[ " + title + " ]");
		
		// Į���� ǥ��
		for(String column : columns) {
			System.out.print(column + "\t");
		}
		System.out.println();
		
		// ������ ǥ��
		for(String value : data) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}
