package example_09_28_inner_class_example;

import java.util.Date;

public class Employee {

	private int no;			// �����ȣ
	private String name; 	// ����̸�
	private String dept;	// �ҼӺμ���
	private String position;// ����
	private String email;	// �̸��� �ּ�
	private String tel;		// ��ȭ��ȣ
	private String job;		// ����
	private long salary;	// �޿�
	private long commission;// Ŀ�̼�
	private Date hireDate;	// �Ի���

	
	// ������ ������
	//Employee employee = new Employee(); ���๮�� �ٸ� Ŭ���������� ������ �� ����.
	// ���� ������ ������ �⺻ ������
	private Employee() {}
	
	// ���������� ������ �ߺ����ǵ� ������
	private Employee(int no, String name, String dept, String position, String email, String tel, String job,
			long salary, long commission, Date hireDate) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.email = email;
		this.tel = tel;
		this.job = job;
		this.salary = salary;
		this.commission = commission;
		this.hireDate = hireDate;
	}
	
//	public Employee(int no, String name, String dept, long salary, Date hireDate) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.dept = dept;
//		this.salary = salary;
//		this.hireDate = hireDate;
//	}
//	public Employee(int no, String name, String dept, String position, String job, long salary, long commission,
//			Date hireDate) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.dept = dept;
//		this.position = position;
//		this.job = job;
//		this.salary = salary;
//		this.commission = commission;
//		this.hireDate = hireDate;
//	}
//	// �ʵ尡 ���������� ������� �����ڰ� ������ �� �ִ�. �Ű������� ������ �ֱ⵵ �����.



	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getCommission() {
		return commission;
	}

	public void setCommission(long commission) {
		this.commission = commission;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	// static �޼ҵ��̹Ƿ� Employee��ü�� �������� �ʰ� Ŭ���������� ȣ���� �����ϴ�.
	/**
	 * EmployeeBuilder ��ü�� �����ϴ� ���� �޼ҵ��
	 * @return	EmployeeBuilder ��ü
	 */
	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}
	/**
	 * EmployeeBuilder�� Employee��ü�� ���������ִ� Ŭ������.
	 * @author ������
	 *
	 */
	// ���� ����Ŭ����
	static class EmployeeBuilder {
		private int no;			
		private String name; 	
		private String dept;	
		private String position;
		private String email;	
		private String tel;		
		private String job;		
		private long salary;	
		private long commission;
		private Date hireDate;
		
		public EmployeeBuilder() {}
		
		public EmployeeBuilder no(int no) {
			this.no = no;
			return this;
		}
		
		public EmployeeBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public EmployeeBuilder dept(String dept) {
			this.dept = dept;
			return this;
		}
		
		public EmployeeBuilder position(String position) {
			this.position = position;
			return this;
		}
		
		public EmployeeBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public EmployeeBuilder tel(String tel) {
			this.tel = tel;
			return this;
		}
		
		public EmployeeBuilder job(String job) {
			this.job = job;
			return this;
		}
		
		public EmployeeBuilder salary(long salary) {
			this.salary = salary;
			return this;
		}
				
		public EmployeeBuilder commission(long commission) {
			this.commission = commission;
			return this;
		}
		
		public EmployeeBuilder hireDate(Date hireDate) {
			this.hireDate = hireDate;
			return this;
		}
		/**
		 * Employee��ü�� �����ϰ� �Էµ� ���� ����ؼ� �ʱ�ȭ�� Employee��ü�� ��ȯ�Ѵ�.
		 * @return Employee ��ü
		 */
		public Employee build() {
			// EmployeBuilder��ü�� �ʱ�ȭ�� no, name������ �Ű������� �Ͽ��� Employee �����ڿ� �Էµȴ�.
			// �ʱ�ȭ �ȵ� ������ ��� �����̹Ƿ� �⺻���� ��� �ִ�.
			// Employee��ü�� �����ϰ� �����ڸ� �ʱ�ȭ�ϰ� �ּҰ��� ��ȯ
			Employee employee = new Employee(no, name, dept, position, email, tel, job, salary, commission, hireDate);
			return employee;
		}
	}
	
}
