package example_09_13_modifier;

public class Exam {
	
	private int no;
	private String title;
	private String studentName;
	private	int socre;
	private boolean isPassed;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getSocre() {
		return socre;
	}
	public void setSocre(int socre) {
		this.socre = socre;
	}
	
	//booleanŸ���� ��������� �̸��� is�� �����ϴ� ��� getter �޼ҵ��� �̸��� is�� �����Ѵ�.
	public boolean isPassed() {
		return isPassed;
	}
	//booleanŸ���� ��������� �̸��� is�� �����ϴ� ��� setter �޼ҵ��� �̸��� is�� ���� set���� �����Ѵ�.
	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}
	
	
}
