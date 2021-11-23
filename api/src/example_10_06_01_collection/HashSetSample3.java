package example_10_06_01_collection;

import java.util.HashSet;
import java.util.Objects;

public class HashSetSample3 {
	public static void main(String[] args) {
		// Employee��ü�� ������ �����ϴ� HashSet��ü �����ϱ�
		HashSet<Employee> employees = new HashSet<>();
		employees.add(new Employee(100, "������", "ȫ����"));
		employees.add(new Employee(101, "������", "�渮��"));
		employees.add(new Employee(102, "�̼���", "������"));
		employees.add(new Employee(103, "������", "�ѹ���"));
		employees.add(new Employee(104, "���߱�", "ȫ����"));
		employees.add(new Employee(105, "��âȣ", "������"));
		
		System.out.println("### HashSet��ü�� ����� ��ü�� ������ ������ ���캸��");
		System.out.println(employees);
		
		
		System.out.println("HashSet��ü�� ����� Employee��ü�� ������? " + employees.size());
	}
	
	// ���� ���� Ŭ����
	public static class Employee{
		private int id;
		private String name;
		private String dept;
		
		public Employee(int id, String name, String dept) {
			this.id = id;
			this.name = name;
			this.dept = dept;
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

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return id == other.id;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Employee [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(name);
			builder.append(", dept=");
			builder.append(dept);
			builder.append("]");
			return builder.toString();
		}
		
		
	}
}
