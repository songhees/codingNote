package example_09_09_constructor;

public class Student {
	
	int no;
	String dept;		//������� ���� ��������� �ʱⰪ�� �ڵ�����
	int grade;
	String name;
	String email;
	String phone;
	
	/*
	 * �����ڰ� �ϳ��� ���ǵǾ� ���� ������ �ҽ�(Student.java)�� �������ؼ� ���������� ���� ��
	 * ��������(Student.class)�� �⺻������ �޼ҵ尡 �ڵ����� �߰��ȴ�.
	 * 
	 * �����Ϸ��� �ڵ����� �߰��� �⺻ ������ �޼ҵ�
	 * public Student(){
	 * 
	 * }
	 */
	
	// ���� �⺻ ������ �޼ҵ带 ������.
	public Student() {
		System.out.println("�⺻ ������ �޼ҵ尡 �����.");
		//������� �ʱ�ȭ�ϱ�
		no = 0;
		dept = "��ǻ�Ͱ��а�";
		grade = 1;
		name = "ȫ�浿";
		email = "hong@gmail.com";
		phone = "010-1111-2222";
	}
	
	// ���Ի��� ��� �а�, �̸�, ��ȭ��ȣ�� ���޹޾Ƽ�Student��ü�� �ʱ�ȭ�ϴ� ������ �޼ҵ带 ������
	public Student(String dept, String name, String phone) {
		this.no = 0;
		this.dept = dept;
		this.grade = 1;
		this.name = name;
		this.email = "����";
		this.phone = phone;
	}
	

	// �Ű������� �ִ� �����ڸ� ������.
	public Student(int stuNo, String studDept, int studGrade, String studName, String studEmail, String studPhone) {
		no = stuNo;
		dept = studDept;
		grade = studGrade;
		name = studName;
		email = studEmail;
		phone = studPhone;
	}
	
	// �л������� ȭ�鿡 ������� ����޼ҵ� �����ϱ�
	void printStudentInfo() {
		System.out.println("��	��: " + no);
		System.out.println("�Ҽ��а�: " + dept);
		System.out.println("��	��: " + grade);
		System.out.println("��	��: " + name);
		System.out.println("��	��: " + email);
		System.out.println("��ȭ��ȣ: " + phone);
		System.out.println();
		
		
	}
	
	
	
	
}
