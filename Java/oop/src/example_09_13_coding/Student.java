package example_09_13_coding;

public class Student {
	
	private int no;
	private int grade;
	private String name;
	private ScoreDetail score;
	//ScoreDetail�� �ּҰ��� �����ϴ� ���������̹Ƿ� null���� ����ִ�. ��ü�� �����Ǳ� ��
	
	public Student() {}	//�⺻ ������
	public Student(int no, int grade, String name, ScoreDetail score) {
		this.no = no;
		this.grade = grade;
		this.name = name;
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ScoreDetail getScore() {
		return score;	// ScoreDetail�� �ּҰ��� ��ȯ�ϴ� �޼ҵ�
	}
	public void setScore(ScoreDetail score) {
		this.score = score;	// ScoreDetail�� �ּҰ��� ���� �޾Ƽ� �����ϴ� �޼ҵ�
	}
}
