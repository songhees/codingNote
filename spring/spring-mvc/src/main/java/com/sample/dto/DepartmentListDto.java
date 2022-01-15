package com.sample.dto;

public class DepartmentListDto {

	private int id;
	private String name;
	private String managerName;
	private String city;
	private String streetAddress;
	
	public DepartmentListDto() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	@Override
	public String toString() {
		return "DepartmentListDto [id=" + id + ", name=" + name + ", managerName=" + managerName + ", city=" + city
				+ ", streetAddress=" + streetAddress + "]";
	}
	
}
