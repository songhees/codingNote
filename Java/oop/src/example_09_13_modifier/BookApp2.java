package example_09_13_modifier;

public class BookApp2 {
	public static void main(String[] args) {
		// Book��ü�� �ּҰ��� 3�� ������ �� �ִ� �迭�� �����Ѵ�.
		Book[] books = new Book[3];
		
		// �Ʒ��� �ڵ� 3ȸ �ݺ�, for�� ������� ���� �׳� 3�� �ڵ��ϼ���
		// Book��ü�� �����ϰ�, setter �޼ҵ带 ����ؼ� ��������� å������ �����Ѵ�.
		
		Book b1 = new Book();
		b1.setTitle("�̰��� �ڹٴ�");
		b1.setWriter("���ü�");
		b1.setPublisher("�������ǻ�");
		b1.setPrice(30000);
		b1.setDiscountPrice(27000);
		
		Book b2 = new Book();
		b2.setTitle("�̰��� �ڹٴ�");
		b2.setWriter("�ſ��");
		b2.setPublisher("�Ѻ��̵��");
		b2.setPrice(35000);
		b2.setDiscountPrice(32000);

		Book b3 = new Book();
		b3.setTitle("�ʸ��ེ ����������");
		b3.setWriter("���ε� ���̳�");
		b3.setPublisher("�Ѻ��̵��");
		b3.setPrice(28000);
		b3.setDiscountPrice(25600);
		
		// ������ Book��ü�� �ּҰ��� �迭�� n��°�� �����Ѵ�.
		books[0] = b1;		// b1�� ����Ǿ� �ִ� ��ü Book�� �ּҰ��� books[0]�� �����Ѵ�.
		books[1] = b2;
		books[2] = b3;
		
		// ���� for���� ����ؼ� �迭�� ����� å������ �ֿܼ� ����Ѵ�.
		// ����, ����, ���ǻ�, ����, ���������� ����Ѵ�.
		for (Book book : books) {			//book ���������� books�� �����ϴ� �迭��ü�� �ִ� ������ Book��ü�� �ּҰ��� ������Թ޴´´�.
			System.out.println(book.getTitle());	//�ּҰ��� �ִ� Book��ü�� getTitle�޼ҵ��� ��ȯ���� title�� �ִ� ���� ����Ѵ�.
			System.out.println(book.getWriter());
			System.out.println(book.getPublisher());
			System.out.println(book.getPrice());
			System.out.println(book.getDiscountPrice());
			System.out.println();
		}	
	// �迭�� 0��°ĭ�� �����ϰ� �ִ� Book��ü�� å ������ �����ϱ�
		b1.setTitle("�ڹ��� ���� 2��");
		books[0].setTitle("�ڹ��� ����2��");
		
		Book book = books[0];
		book.setTitle("�ڹ��� ���� 2��");
	// �迭�� 0��°ĭ�� �����ϰ� �ִ� Book��ü�� ���ΰ����� �����ϱ�
		b1.setDiscountPrice(25000);
		books[0].setDiscountPrice(25000);
		book.setDiscountPrice(25000);
		
		// �迭�� 0��°ĭ�� �����ϰ� �ִ� Book��ü�� ����� �� ����ϱ�
		System.out.println("### �迭�� 0��°ĭ�� �����ϰ� �ִ� Book��ü�� ����� �� ����ϱ�");
		System.out.println(b1.getTitle());
		System.out.println(books[0].getTitle());
		System.out.println(book.getTitle());
		
		// ��� b1, books[0], book�� ���� �ּҰ��� ������ �ִ�.
		System.out.println(b1);
		System.out.println(books[0]);
		System.out.println(book);
		// �Ϸù�ȣ ���� (�ּҰ��� �ƴ�)
		
	}
}
