package example_09_15_super;

public class Book extends Product {
	
	private String genre;
	private String title;
	private String writer;
	private String publisher;
	
	public Book() {
		// ��� ����Ŭ������ �����ڿ��� �θ��� �⺻ ������ �޼ҵ带 ȣ���ϴ� super();�� �ڵ����� �߰��ȴ�.
		// ��, super()���� �ٸ� super(��, ��, ...) �޼ҵ带 �߰��ϸ� super()�� �ڵ����� �߰����� �ʴ´�.
		super(); //�� �����Ǿ� �ִ�. �������� �ڵ����� �߰���
	}
	
	public Book(int no, String genre, String title, String writer, String publisher, int price) {
		super(no, price);
		this.title = title;
		this.genre = genre;
		this.writer = writer;
		this.publisher = publisher;
	}
	public Book(int no, String genre, String title, String writer, String publisher, int price, int discoutnPrice) {
		// Product ��ü�� Product(int, int, int)�����ڸ� ȣ���Ѵ�.
		// super() �޼ҵ�� ������ ������ �޼ҵ��� ù��° ���๮�̾�� �Ѵ�.
		// super() �޼ҵ尡 ù��° ���๮�̾�� �ϴ� ������ ������ ���� ��ü�� ���� �ʱ�ȭ�Ǿ�� �ϱ� �����̴�.
		// �� ������ �޼ҵ嵵 ������ super(); �ڵ����� �߰�������,
		// super(no, price, discoutnPrice);�� �߰��Ǿ��� ������ super();�� �߰����� �ʾҴ�.
		super(no, price, discoutnPrice);
		this.title = title;
		this.genre = genre;
		this.writer = writer;
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public void printInfo() {
//		System.out.println("��  ȣ: " + getNo());				// Product�� ������(��ӹ���) getNo()�� ��ȣ ��ȸ
		super.printInfo();
		System.out.println("��  ��: " + genre);
		System.out.println("��  ��: " + title);
		System.out.println("��  ��: " + writer);
		System.out.println("�� �� ��: " + publisher);
//		System.out.println("��  ��: " + getPrice());				// Product�� ������(��ӹ���) getPrice()�� ���� ��ȸ
//		System.out.println("���ΰ���: " + getDiscountPrice());	// Product�� ������(��ӹ���) getDiscountPrice()�� ���ΰ��� ��ȸ
		System.out.println();
	}
	
}
