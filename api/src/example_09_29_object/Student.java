package example_09_29_object;

public class Student {
	private int no;			// �й�
	private String name;	// �̸�
	private String dept;	// �а�
	private int grade;		// �г�
	
	public Student() {}

	public Student(int no, String name, String dept, int grade) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// Student��ü�� ���� ��� �񱳰� �����ϵ��� hashCode()�� equals(Object o) �������ϱ�
	// Student��ü������ �й��� ������ ���� �л��̱� ������ �й��� ������ ���� ��ü�� �Ǵ��ϰ� �� ���̴�.
	
	// �й��� ������ �ؽ��ڵ尪�� ���� ���� ��ȯ�ϵ��� �������ϱ�
	@Override
	public int hashCode() {
		return no;
	}
	
	// �й��� ������ true���� ��ȯ�ϵ��� �������ϱ�
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		// ���� �ٸ� ��ü�� Student���赵�� ������� ��ü�� �ƴϸ� false�� ��ȯ
		if (!(obj instanceof Student)) {
			return false;
		}
		// ���� �ٸ� ��ü�� Student ���赵�� ������� ��ü�� �������� ������ StudentŸ������ ����ȯ�Ѵ�.
		// no�� ����ϱ����� ��������ȯ�Ѵ�. 
		Student otherStudent = (Student)obj;
		if (this.no != otherStudent.no) {
			return false;
		}
		// ���� ��� ������ ����ߴٸ� �� ��ü�� ���� �ٸ� ��ü�� ���� �й��� ���� ��ü��.
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [no=").append(no).append(", name=").append(name).append(", dept=").append(dept)
				.append(", grade=").append(grade).append("]");
		return builder.toString();
	}
	
	public Student copyStudent() throws CloneNotSupportedException{
		Student stu = (Student)this.clone();
		return stu;
	}
	
	
}