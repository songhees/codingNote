package example_09_17_polymorphism;
/**
 * �������� ������ �Է�/����ϴ� Ŭ����
 * @author ������
 *
 */
public class Employee extends Person{
	
	private String dept;	// ��� �μ�
	private String job;		// ���� ����
	private int salary;		// ����
	
	public Employee() {}
	public Employee(String type, String name, String tel, String dept, String job, int salary) {
		super(type, name, tel);		// 
		this.dept = dept;
		this.job =job;
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getSalary() {
		return salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("�ҼӺμ�: " + dept);
		System.out.println("������: " + job);
		System.out.println("��   ��: " + salary);
	}
}
