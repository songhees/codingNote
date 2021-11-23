package example_09_28_inner_class_example;


import example_09_28_inner_class_example.Employee.EmployeeBuilder;

public class EmployeeApp {
	public static void main(String[] args) {
		/*
		 * Employee��ü�� �����ڸ� �̿��ؼ� ������ �� ����.
		 * 
		 * public class Employee {
		 * 		private int no;
		 * 		private String name;
		 * 		...
		 * 		private Employee() {}
		 * 		private Employee(int no, String name,...){}
		 */
		// Employee employee = new Employee();
//		Employee employee = new Employee(100, "ȫ�浿", "������", "����", "hong@gmail.com", "010-1111-2222", "�ؿܿ���",
//						450000000L, 0L, new Date());
		
		// static method�̹Ƿ� Ŭ������ Employee�� �ּҰ��� ȣ��
		// Builder��ü�� �̿��ؼ� ��ü�� �����ϰ� �ʱ�ȭ�� ��ü�� ȹ���ϱ�
		EmployeeBuilder builder = Employee.builder();
		// �޼ҵ� ü�̴�   // builder�� �����
		Employee employee = builder.no(100).name("ȫ�浿").dept("����1��")
									.position("����")
									.salary(5_000_000)
									.job("�ؿܿ���")
									.build();
		
		// Builder��ü�� �̿��ؼ� ��ü�� �����ϰ� �ʱ�ȭ�� ��ü�� ȹ���ϱ�
		// builder()�� ���� �޼ҵ��̹Ƿ� Employee��ü�� �������� �ʰ� ��밡��
		Employee employee2 = Employee.builder()
								.no(200)
								.name("������")
								.dept("������")
								.salary(4_000_000)
								.build();
		
		// ��ü�� ���� ����
		Employee.EmployeeBuilder builder2 = new Employee.EmployeeBuilder();
		Employee employee3 = builder2.no(200)
								.name("������")
								.dept("������")
								.salary(4_000_000)
								.build();
	}
}
