package example_09_13_modifier;

import java.util.Date;

public class BookApp {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		// book1���������� �����ϴ� ��ü�� no, title, writer, publisher, price, discountPrice, stock, pubDate�����ϱ�
//		book1.no = 100;						// ������� ���� ����� -  ���� �Ұ�
//		book1.title = "�ڹ��� ����";
		
		// book1���������� �����ϴ� ��ü�� setter �޼ҵ带 ����ؼ� ��ü�� ������� �� �����ϱ�
		book1.setNo(100);
		book1.setTitle("�ڹ�");
		book1.setWriter("���ü�");
		book1.setPublisher("����");
		book1.setPrice(30000);
		book1.setDiscountPrice(28000);
		book1.setStock(10);
	
		Date date = new Date();
		book1.setPubDate(date);
		
		
		System.out.println(book1.getNo());
		System.out.println(book1.getTitle());
		System.out.println(book1.getWriter());
		System.out.println(book1.getPublisher());
		System.out.println(book1.getPrice());
		System.out.println(book1.getDiscountPrice());
		System.out.println(book1.getStock());
		System.out.println(book1.getPubDate());
		
		
	
	
	}
}
