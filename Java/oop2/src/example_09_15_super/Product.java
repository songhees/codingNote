package example_09_15_super;

public class Product {
	// �Ӽ�, �������, �ν��Ͻ�����, �ʵ�, ������Ƽ
	private int no;
	private int price;
	private int discountPrice;
	public Product() {}	// �⺻������

	public Product(int no, int price) {	// ������ ���� ���� ��ǰ
		this(no, price, price);
	}
	
	public Product(int no, int price, int discountPrice) {	// �����ϴ� ��ǰ
		this.no = no;
		this.price = price;
		this.discountPrice = discountPrice;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	public void printInfo() {	// ��ǰ���� ��� �޼ҵ�
		System.out.println("��ǰ��ȣ: " + no);
		System.out.println("��ǰ����: " + price);
		System.out.println("���ΰ���: " + discountPrice);
	}
	
	
}
