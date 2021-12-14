package example_09_09_constructor;

public class StudentApp {
	public static void main(String[] args) {
		/* Student ��ü �����ϱ�
		 * 
		 * 	1. new Ű���� ������ ������ �޼ҵ带 ���´�.
		 * 	2. new Ű����� ������ �޼ҵ��� �̸��� ������ �̸��� ��������(Student.class)�� �޸𸮿� �ε��Ѵ�.
		 *	3. �޸𸮿� �ε��� ��������(Student.class)�� ���赵 ��Ƽ� Student��ü�� �����Ѵ�.
		 *	4. Student��ü�� ������ �Ϸ�Ǹ�, ������ �޼ҵ带 �����ؼ� ��ü ���� ���Ŀ� ������ ������ �����Ų��.
		 *	5. Student��ü�� �ּҰ��� �������� student1�� ���Եȴ�.
		 */
		Student student1 = new Student();
		/* Student ��ü �����ϱ�
		 * 
		 * 	1. new Ű���� ������ ������ �޼ҵ带 ���´�. 2���� �ѹ� loading�����Ƿ� �� ���� �ʴ´�.
		 *	3. �޸𸮿� �ε��� ��������(Student.class)�� ���赵 ��Ƽ� Student��ü�� �����Ѵ�.
		 *	4. Student��ü�� ������ �Ϸ�Ǹ�, ������ �޼ҵ带 �����ؼ� ��ü ���� ���Ŀ� ������ ������ �����Ų��.
		 *	5. Student��ü�� �ּҰ��� �������� student2�� ���Եȴ�.
		 */
		Student student2 = new Student();
		
		// ������ ��ü�� �ּҰ��� ������ �ִ� ���������� ������ �޼ҵ带 ������ �� ����.
		// student1.Sample();		����
		
		// �����ڸ� �̿��ؼ� ������ ��ü�� ��������� �ʱ�ȭ �Ǿ���. �ʱ�ȭ�� ��������� �� ����ϱ�
		System.out.println(student1.name + ", " + student2.name);
		System.out.println(student1.dept + ", " + student2.dept);
		System.out.println(student1.grade + ", " + student2.grade);
		System.out.println(student1.email + ", " + student2.email);
		
		// �Ű������� �ִ� ������ �޼ҵ� �����Ű��
		Student student3 = new Student(100, "��ǻ�Ͱ��а�", 3, "������", "ruy@gmail.com", "010-1111-3333");
		
		Student student4 = new Student(200, "ȯ����а�", 2, "�̼���", "lee@gmail.com", "010-1111-4444");
		
		// �Ű������� �ִ� ������ �޼ҵ�� ��ü�� �ʱ�ȭ�� �� Student��ü�� �л����� ����ϱ�
		student3.printStudentInfo();
		student4.printStudentInfo();
		
		// �Ű������� �ִ� ������ �޼ҵ� �����Ű�� - Student��ü�� ������� �� �Ϻθ� �ʱ�ȭ�ϴ� ������ �޼ҵ带 �����.
		Student student5 = new Student("������а�", "������", "010-1234-5678");
		Student student6 = new Student("������а�", "������", "010-7895-6124");
		
		// �Ű������� �Ϻθ� �ʱ�ȭ ��Ű�� ������ �޼ҵ�� ��ü�� �ʱ�ȭ�� �� Student��ü�� �л����� ����ϱ�
		student5.printStudentInfo();
		student6.printStudentInfo();
		
		
	}
	
	
	
	
}
