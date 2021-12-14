package example_09_23_Interface;
/**
 * ��Ʈ�� data ����� �ϴ� ���� Ŭ����
 * @author ������
 *
 */
public class ChartReporter implements Reporter {
	
	/**
	 * � data�� ����Ұ��� ����
	 */
	private String title;
	private String[] columnLables;
	private int[] values;
	
	/**
	 * �����ڷ� ���� �ʱ�ȭ�Ͽ� data�� �޴´�.
	 * @param title
	 * @param columnLables �� ��Ʈ �̸�
	 * @param values �� ��Ʈ ũ��
	 */
	public ChartReporter(String title, String[] columnLables,int[] values) {
		this.title = title;
		this.columnLables = columnLables;
		this.values = values;
	}
	
	/**
	 * ���� data�� ����ϴ� ������ �ϴ� �޼ҵ�
	 */
	@Override
	public void printReport() {
		System.out.println("[ " + title + " ]\n");
		
		for ( int index = 0; index < columnLables.length; index++) {
			System.out.print(columnLables[index] + "\t");
			
			int value = values[index];
			int startCount = value/10_000_000; // õ���� �������� *�� �ϳ��� ǥ��
			for(int i = 1; i <= startCount; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
