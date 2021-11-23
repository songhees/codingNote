package example_10_15_object;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 5237789446930593812L;
	// transient Ű����� �ش� ��������� ����ȭ ��󿡼� ���ܽ�Ų��.
	private String id;
	private transient String password;
	private String name;
	private int point;
	private Car myCar;
	private Date createdDate;
	
	User() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Car getCar() {
		return myCar;
	}

	public void setCar(Car myCar) {
		this.myCar = myCar;
	}
	
	
	
}
