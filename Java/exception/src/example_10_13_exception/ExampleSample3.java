package example_10_13_exception;

import java.util.ArrayList;
import java.util.List;

public class ExampleSample3 {
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		
		// ������ȣ�� ��ȸ���� ��, �������� Ȥ�� null�� ��ȯ�Ǵ� ���
		Employee emp1 = manager.getEmployee1(101);
		if (emp1 != null) {
			System.out.println(emp1.getNo() + ", " + emp1.getName());
		} else {
			System.out.println("### ���������� �������� �ʽ��ϴ�.");
		}
		
		Employee emp2 = manager.getEmployee2(300);
		if (emp2 != null) {
			System.out.println(emp2.getNo() + ", " + emp2.getName());
		} else {
			System.out.println("### ���������� �������� �ʽ��ϴ�.");
		}
		
		// ������ȣ�� ��ȸ���� ��, ���������� ��ȯ�ǰų� ���ܰ� �߻��ϴ� ���
		// ����ó�����θ� üũ�ϴ� ���ܰ� �߻��ϴ� ���
		try {
			Employee emp3 = manager.getEmployee3(102);
			System.out.println(emp3.getNo() + ", " + emp3.getName());
		} catch (Exception ex) {
			System.out.println("### ���������� �������� �ʽ��ϴ�.");
		}
		
		// ����ó�����θ� üũ���� �ʴ� ���ܰ� �߻��ϴ� ���
		Employee emp4 = manager.getEmployee4(300);
		System.out.println(emp4.getNo() + ", " + emp4.getName());
	}
	
	static class EmployeeManager {
		private List<Employee> employeeList = new ArrayList<>();
		
		public EmployeeManager() {
			employeeList.add(new Employee(101, "hong", "ȫ�浿", "������"));
			employeeList.add(new Employee(102, "kim", "������", "������"));
			employeeList.add(new Employee(103, "kang", "������", "�����"));
			employeeList.add(new Employee(104, "lee", "�̼���", "�����"));
			employeeList.add(new Employee(105, "ryu", "������", "�����"));
			employeeList.add(new Employee(106, "ahn", "���߱�", "������"));
			employeeList.add(new Employee(107, "han", "�ѿ��", "������"));
			employeeList.add(new Employee(108, "han", "������", "������"));
			employeeList.add(new Employee(109, "yoon", "ȫ�浿", "������"));
		}
		
		/**
		 * ������ȣ�� ���޹޾Ƽ� ���������� ��ȯ�Ѵ�.
		 * @param empNo ������ȣ
		 * @return ��������, ������ȣ�� �ش��ϴ� ����� �������� ������ null�� ��ȯ�ȴ�.
		 */
		public Employee getEmployee1(int empNo) {
			Employee foundEmployee = null;
			// ��ȣ�� �ش��ϴ� �������� �˻�;
			for (Employee employee : employeeList) {
				if (employee.getNo() == empNo) {
					foundEmployee = employee;
					break;
				}
			}
			return foundEmployee;
		}
		
		/**
		 * ������ȣ�� ���޹޾Ƽ� ���������� ��ȯ�Ѵ�.
		 * @param empNo ������ȣ
		 * @return ��������, ������ȣ�� �ش��ϴ� ����� �������� ������ null�� ��ȯ�ȴ�.
		 */
		public Employee getEmployee2(int empNo) {
			for (Employee employee : employeeList) {
				if (employee.getNo() == empNo) {
					return employee;
				}
			}
			return null;
		}
		
		
		/**
		 * ������ȣ�� ���޹޾Ƽ� ���������� ��ȯ�Ѵ�.
		 * @param empNo ������ȣ
		 * @return ��������, ������ȣ�� �ش��ϴ� ����� �������� ������ Exception�� �߻��Ѵ�.
		 */
		public Employee getEmployee3(int empNo) throws Exception{
			for (Employee employee : employeeList) {
				if (employee.getNo() == empNo) {
					return employee;
				}
			}
			// ���ܰ� �߻��Ǹ� ��ȯ���� ��� �ȴ�.
			// for���ȿ� ������ if���� ���ǽ��� true�� �����Ǵ� ��찡 �ѹ��� ������ ������ȣ�� �ش��ϴ� ���������� ���� ����, ���������� ��ȯ���� �ʴ´�.
			// ������ȣ�� �ش��ϴ� ���������� �������� ���� ���� �Ʒ� ���๮�� ����ǰ�, ���ܰ�ü�� ���� �߻��ȴ�.
			throw new Exception();			//�����Ϸ��� ����ó�����θ� üũ�ϴ� ���ܰ� �����߻���.
											//throws Ű���带 ����ؼ� �����߻���Ų ���ܸ� �� �޼ҵ带 ȣ���� ������ �����Ѵ�.
		}
		
		/**
		 * ������ȣ�� ���޹޾Ƽ� ���������� ��ȯ�Ѵ�.
		 * @param empNo ������ȣ
		 * @return ��������, ������ȣ�� �ش��ϴ� ����� �������� ������ RunTimeException�� �߻��Ѵ�.
		 */
		public Employee getEmployee4(int empNo) {
			for (Employee employee : employeeList) {
				if (employee.getNo() == empNo) {
					return employee;
				}
			}
			throw new RuntimeException("�̸�");	//�����Ϸ��� ����ó�����θ� üũ���� �ʴ� ���ܰ� �����߻���.
											//throws Ű���带 ����ؼ� �����߻���Ų ���ܸ� �� �޼ҵ带 ȣ���� ������ �����ص� �ǰ�, ���� �ʾƵ� �ȴ�.
		}
	}
	
	
	static class Employee {
		private int no;
		private String id;
		private String name;
		private String dept;
		public Employee(int no, String id, String name, String dept) {
			super();
			this.no = no;
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		public int getNo() {
			return no;
		}
		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getDept() {
			return dept;
		}
		
	}
	
}
