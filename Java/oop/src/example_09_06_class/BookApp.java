package example_09_06_class;

import java.util.Date;
public class BookApp {
	public static void main(String[] args) {
			
		/*
		 * Book Ŭ����(���赵)�� ��ü �����ϱ�
		 * 1. Book Ŭ������ ������ ��ü�� �ּҰ��� ��� ���������� �����Ѵ�.
		 * 2. Book Ŭ������ ��ü�� �����ؼ� ���������� �ּҰ��� �����Ѵ�.
		 * 3. �ּҰ��� ������ �ִ� ���������� �̿��ؼ� ������ ��ü�� �ʵ忡 �����Ѵ�.
		 */
		
		// Book Ŭ������ ������ ��ü�� �ּҰ��� �����ϴ� �������� ����
		Book book1;			//BookŬ������ ���� ������ Book��ü�� �������� �޴� �������� book1�� ����
		Book book2;
		Book book3;
		
		// new Ű���带 ����ؼ� Book��ü�� �����ϰ�, ������ ���������� ��ü�� �ּҰ��� �����ϱ�
		book1 = new Book();			// new�����ڷ� ���� Book��ü�� �����ǰ� ��ü�� �ּҰ��� book1�� ����
		book2 = new Book();
		book3 = new Book();
		
		// ������ ���������� ����Ǿ� �ִ� �ּҰ� Ȯ���ϱ�
		System.out.println("ù��° å" + book1);		//example_09_06_class.Book@396f6598 �� ��µ�
		System.out.println("�ι�° å" + book2);		//example_09_06_class.Book@394e1a0f �� ��µ�
		System.out.println("����° å" + book3);		//example_09_06_class.Book@27a5f880 �� ��µ�
		
		// ������ ���������� ��ü ����ϱ�
		book1.bookNumber = 100;					//�������� book1�� �ּҰ��� ����Ű�� ��ü Book�� �ִ� �������field bookNumber�� 100�� ����
		book1.genre = "��ǻ��";
		book1.title = "�ڹ��� ����";
		book1.author = "���ü�";
		book1.publisher = "�������ǻ�";
		book1.price = 35000;
		book1.stock = 5;
		book1.pubDate = new Date();				// �������� book1�� �ּҰ��� ����Ű�� ��ü Book�� �ִ� �������field pubDate�� Date��ü�� �ּҰ��� ����
		
		book2.bookNumber = 200;
		book2.genre = "�Ҽ�";
		book2.title = "������ ����";
		book2.author = "������";
		book2.publisher = "û��";
		book2.price = 15000;
		book2.stock = 2;
		book2.pubDate = new Date();
		
		book3.bookNumber = 300;
		book3.genre = "�ܱ���";
		book3.title = "���� ���⹮��";
		book3.author = "�û翵���";
		book3.publisher = "�û翵���";
		book3.price = 20000;
		book3.stock = 1000;
		book3.pubDate = new Date();
		
		// ���������� ��ü�� �ʵ忡 ����� ���� ��ȸ�ؼ� ����غ���
		System.out.println(book1.title);			// �������� book1�� �ּҰ��� ����Ű�� ��ü Book�� �ִ� ������� title�� ����ִ� ���� "�ڹ��� ����"�� ���
		System.out.println(book2.title);
		System.out.println(book3.title);
	}
}
