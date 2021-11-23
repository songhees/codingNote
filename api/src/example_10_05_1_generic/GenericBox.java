package example_10_05_1_generic;

/**
 * ���׸��� ����� Ŭ������. <br />
 * T�� Ÿ���Ķ���ʹ�.<br />
 * ����޼ҵ忡�� ��ü���� Ÿ���� �������� �ʰ�, ��� ��Ī(Ÿ���Ķ����)�� ����ߴ�. <br />
 * @author ������
 *
 * @param <T>
 */
public class GenericBox<T> {
	
	private Object[] items = new Object[100];
	private int position = 0;
	
	/** 
	 * ��ü�� ���޹޾Ƽ� �迭�� �����Ѵ�.
	 * @param item ��ü������ �� ������ Ÿ���� ��ü�� ���޹޴´�.
	 */
	public void addItems(T item) {
		items[position] = item;
		position++;
	}
	
	/**
	 * �迭���� ������ �ε����� ����� ��ü�� ��ȯ�Ѵ�.
	 * @param index ��ȸ�� �ε���
	 * @return ����� ��ü 
	 */
	@SuppressWarnings("unchecked")
	public T getItem(int index) {
		Object obj = items[index];
		return (T)obj;
	}
}
