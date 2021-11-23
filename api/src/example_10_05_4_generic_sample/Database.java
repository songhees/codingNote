package example_10_05_4_generic_sample;

import java.lang.reflect.Array;

public class Database<T> {

	private T[] items;
	private int position = 0;
	
	public Database(Class<T[]> clazz) {
		items = clazz.cast(Array.newInstance(clazz.getComponentType(), 100));  
	}
	
	/**
	 * ������(å, Ƽ��, �����, �ֹ�����) ����Ѵ�.
	 * @param item å, Ƽ��, �����, �ֹ�����
	 */
	public void addItem(T item) {
		items[position] = item;
		position++;
	}
	
	/**
	 * ��� ������������ ��ȯ�Ѵ�.
	 * @return �� �����ͺ��̽� ��ü�� ��ϵ� ��� ����������
	 */
	public T[] getAllItems() {
		return (T[])items;
	}
	
	/**
	 * ������ ��ȣ�� �������� ã�Ƽ� ��ȯ�Ѵ�.
	 * @param no ��ǰ��ȣ
	 * @return å, Ƽ��, �����, �ֹ�����
	 */
	@SuppressWarnings("unchecked")
	public T getItem(int no) {
		Product product = null;
		for (Object obj : items) {
			if (obj == null) {
				break;
			}
			Product item = (Product)obj;
			if (item.getNo() == no) {
				product = item;
			}
		}
		return (T)product;
	}
	
	/**
	 * ����� ������������ ���޹޾Ƽ� �����ͺ��̽��� �ݿ��Ѵ�.
	 * @param item ����� ����������
	 */
	public void updateItem(T item) {
		
	}
	
	/**
	 * ������ ��ȣ�� �������� �����ͺ��̽����� �����Ѵ�.
	 * @param no
	 */
	public void deleteItem(int no) {
		
	}
}

