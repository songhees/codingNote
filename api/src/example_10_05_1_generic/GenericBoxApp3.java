package example_10_05_1_generic;

public class GenericBoxApp3 {
	public static void main(String[] args) {
		// ���׸� Ŭ������ ��ü�� ������ ��, Ÿ�� �Ķ���� �ڸ��� Ÿ���� �������� �ʾ���
		GenericBox box = new GenericBox();
		
		// Ÿ���Ķ���Ϳ� Ÿ���� �������� ������ Ÿ���Ķ�����ڸ��� ���� Object�� �ȴ�.
		// void addItem(T item) {...}��
		// void addItem(Object item) {...}���� ����ȴ�.
		box.addItems(new Food("�丶��", 5000));
		box.addItems(100); // ���� 100�� ����ڽ̵ȴ�. box.addItem(new Integer(100));
		box.addItems(new Contact("ȫ�浿", "010-1111-1111", "���"));
		box.addItems("������");
		
		
		// ����� ��ü�� ����� �� ����ȯ �����ڸ� ����ؾ� ��.
		// T getItem(int index){...}��
		// Object getItem(int index){...}���� ����ȴ�.
		Food savedItem1 = (Food)box.getItem(0);
		Integer savedItem2 = (Integer)box.getItem(1);
		Contact savedItem3 = (Contact)box.getItem(2);
		String savedItem4 = (String)box.getItem(3);
	}
}
