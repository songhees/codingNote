package example_10_06_01_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample2 {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(100, "�̼���", "������", false));
		employeeList.add(new Employee(101, "������", "������", false));
		employeeList.add(new Employee(102, "������", "�ѹ���", true));
		employeeList.add(new Employee(103, "�̼���", "�ѹ���", false));
		employeeList.add(new Employee(104, "��������", "�ѹ���", true));
		employeeList.add(new Employee(105, "�Ƿ�", "ȫ����", false));
		employeeList.add(new Employee(106, "�Ӱ��", "ȫ����", true));
		
		System.out.println("### ���Ⱓ�� ����� �������� �����ϱ�");
		Iterator<Employee> iter = employeeList.iterator();
		
		while(iter.hasNext()) {
			Employee emp = iter.next();
			if (emp.isExpried()) {
				iter.remove(); // Iterator�� ����ϸ� �ڷᱸ������ ����� ��ü�� ������ �� �ִ�.
			}
		}
		
//		Iterator<E>�� 1ȸ�� ��ü��.
//		������ �ݺ��۾��� ����ߴ� Iterator�� ������ �� ����.
//		�� �ڵ忡�� iter.hasNext() ������ false��. <= �Ʊ� �ݺ��� ������ �߱� ������
//		iter = employeeList.iterator();
//		System.out.println("### ���Ⱓ�� �����ִ� �������� ����ϱ�");
//		while(iter.hasNext()) {
//			Employee emp = iter.next();
//			System.out.println(emp.getName());
//		}
		
		System.out.println("### ���Ⱓ�� �����ִ� �������� ����ϱ�");
		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + ", " + emp.getId() + ", " + emp.getDept());
		}
	}
	
	public static class Employee{
		private int id;
		private String name;
		private String dept;
		private boolean isExpried;
		
		public Employee(int id, String name, String dept, boolean isExpried) {
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.isExpried = isExpried;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getDept() {
			return dept;
		}

		public boolean isExpried() {
			return isExpried;
		}
		
		
		
	}
}
