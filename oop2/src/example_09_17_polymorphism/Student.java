package example_09_17_polymorphism;
/**
 * �л������� �Է��ϰ� ����ϴ� Ŭ����
 * @author ������
 *
 */
public class Student extends Person{
	
	private int grade;		// �г�
	private String dept;	// �а�
	
	public Student() {}		// �⺻������
	public Student(String type, String name, String tel, int grade, String dept) {	// �л������� �Է��ϴ� ������
		super(type, name, tel);		// ���� Ŭ������ �����ڸ� ������ �⺻ ������ �Է��ϵ��� �Ѵ�.
		this.grade =grade;
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public String getDept() {
		return dept;
	}
	//Person�� print() ��� ������ // �⺻ ������ ����ϴ� �θ� Ŭ������ �޼ҵ带 ������ ���� �߰����� �л������� ����Ѵ�.
	@Override
	public void print() {
		super.print();
		System.out.println("��   ��:" + grade);
		System.out.println("�Ҽ��а�:" + dept);
	}
}
