package example_10_13_exception;

public class Customer {
	private String id;
	private String password;
	private String name;
	public Customer(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
		
}
