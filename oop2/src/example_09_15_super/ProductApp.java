package example_09_15_super;

public class ProductApp {
	public static void main(String[] args) {
		// ���ΰ����� �ִ� Book��ü ����
		Book book1 = new Book(100, "��ǻ��", "�̰��� �ڹٴ�", "�ſ��", "�Ѻ��̵��", 35000, 32000);
		// ���ΰ����� ���� Book��ü ����
		Book book2 = new Book(200, "��ǻ��", "�ڹ��� ����", "���ü�", "�������ǻ�", 30000);
		
		book1.printInfo();
		book2.printInfo();
		
	}
}
