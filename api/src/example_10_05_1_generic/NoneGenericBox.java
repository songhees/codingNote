package example_10_05_1_generic;

/**
 * ���׸��� ������� �ʴ� BoxŬ������.<br />
 * ��� ������ ��ü�� ������ �� �ִ�.<br />
 * Ÿ���� �������� ������� �ʴ´�.<br />
 * ����� ��ü�� ������ �� ����ȯ �ڵ尡 �ʿ��ϴ�.
 * @author ������
 *
 */
public class NoneGenericBox {
	
	private Object[] items = new Object[100];
	private int position = 0;
	
	/**
	 * ��ü�� ���޹޾Ƽ� �ڽ��� �迭�� �����Ѵ�.
	 * @param item ������ ��ü
	 */
	public void addItem(Object item) {
		items[position] = item;
		position++;
	}
	
	/**
	 * �迭���� ������ �ε����� ����� ��ü�� ��ȯ�Ѵ�.
	 * @param index �迭�� �ε���
	 * @return ����� ��ü
	 */
	public Object getItem(int index) {
		return items[index];
	}
}
