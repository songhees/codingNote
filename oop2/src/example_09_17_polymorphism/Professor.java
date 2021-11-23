package example_09_17_polymorphism;
/**
 * ������ ������ ��/����ϴ� Ŭ����
 * @author ������
 *
 */
public class Professor extends Person{
	private String dept;				// ����а� �Է�
	private String position;			// ����
	private String researchProject;		// �����ϴ� ����
	
	public Professor() {}
	public Professor(String type, String name, String tel, String dept, String position, String researchProject) {
		super(type, name, tel);			// �⺻ ������ ���� ��ü�� �޼ҵ忡 ����
		this.dept = dept;
		this.position = position;
		this.researchProject = researchProject;
		
	}
	
	public String getDept() {
		return dept;
	}
	public String getPosition() {
		return position;
	}
	
	public String getResearchProject() {
		return researchProject;
	}
	/**
	 * �޼ҵ� ������ ���� ��ü�� ���� �⺻ ������ ����ϰ� �����ǵ� �޼ҵ�� ���
	 */
	@Override
	public void print() {
		super.print();
		System.out.println("����а�: " + dept);
		System.out.println("��   ��: " + position);
		System.out.println("��������: " + researchProject);
	}
	
	
	
	
	
}
