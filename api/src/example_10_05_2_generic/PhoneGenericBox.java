package example_10_05_2_generic;

/**
 * ���׸� Ŭ������.<br />
 * T�� �ڸ��� ������ �� �ִ� Ÿ���� Phone�� ����Ÿ�Ը� �����ϴ�.<br />
 * Ÿ���Ķ������ Ÿ���� Ư�� Ÿ������ �����Ѵ�.
 * @author ������
 *
 * @param <T>
 */
public class PhoneGenericBox<T extends Phone> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
