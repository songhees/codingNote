package example_09_14_extends;

public class PersonApp {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		Employee employee = new Employee();

		// person���� �����Ǵ� Person�� ��ü�� name, tell, email�� getters/setters�� ������ �ִ�.
		person.setName("ȫ�浿");
		person.setTel("010-1111-1111");
		person.setEmail("hong@gmail.com");
		
		// student�� �����Ǵ� Student�� ��ü�� dept, grade�� getter/setter �޼ҵ带 �������ִ�.
		// student�� �����Ǵ� Student�� ��ü�� ���� Ŭ������ Person��ü�� ������ ���� Ȥ�� ����� ����� �� �ִ�.
		student.setName("������");				// Person��ü�� ������(��ӹ���) ���
		student.setTel("010-2222-2222");		// Person��ü�� ������(��ӹ���) ���
		student.setEmail("kim@gmail.com");		// Person��ü�� ������(��ӹ���) ���
		student.setDept("���ڰ��а�");				// Student��ü�� ���
		student.setGrade(3);					// Student��ü�� ���
		
		// employee�� �����Ǵ� Employee�� ��ü�� company, position, salary�� getter/setter �޼ҵ带 �������ִ�.
		// employee�� �����Ǵ� Student�� ��ü�� ���� Ŭ������ Person��ü�� ������ ���� Ȥ�� ����� ����� �� �ִ�.
		employee.setName("������");				// Person��ü�� ������(��ӹ���) ���
		employee.setTel("010-3333-3333");		// Person��ü�� ������(��ӹ���) ���
		employee.setEmail("gang@gmail.com");	// Person��ü�� ������(��ӹ���) ���
		employee.setCompany("�Ｚ����");			// Employee��ü�� ���
		employee.setPosition("����");			// Employee��ü�� ���
		employee.setSalary(10_000_000);			// Employee��ü�� ���
		
	}
}
