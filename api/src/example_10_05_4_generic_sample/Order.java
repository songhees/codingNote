package example_10_05_4_generic_sample;

import java.util.Date;

public class Order {
	
	private int no;				// �ֹ���ȣ
	private String userId;		// �ֹ��� ���̵�
	private String productType;	// �ֹ� ��ǰ ����("����", "Ƽ��")
	private int productNo;		// �ֹ� ��ǰ��ȣ(å��ȣ, Ȥ�� Ƽ�Ϲ�ȣ)
	private int amount;			// �ֹ� ����
	private String status;		// �ֹ� ����(����Ϸ�, ���)
	private Date orderDate; 	// �ֹ� ��¥
	private Date cancelDate; 	// ��� ��¥
	
	public Order() {}

	public Order(int no, String userId, String productType, int productNo, int amount, String status) {
		super();
		this.no = no;
		this.userId = userId;
		this.productType = productType;
		this.productNo = productNo;
		this.amount = amount;
		this.status = status;
		this.orderDate = new Date();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	
}
