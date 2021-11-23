package example_09_13_coding;

public class ScoreDetail {
	
	private int kor;	//�ν��Ͻ� ����
	private int eng;	
	private int math;	
	

	public ScoreDetail() {}
	public ScoreDetail(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {	// �ν��Ͻ� �޼ҵ�
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getTotal() {			// ������� ������ ���� �ǵ��� ������ ���� ����� ���� �ʴ´�.
		return kor + eng + math;
	}
	public int getAverage() {
		return getTotal()/3;
	}
}
