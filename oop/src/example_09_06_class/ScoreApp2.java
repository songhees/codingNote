package example_09_06_class;

public class ScoreApp2 {
	public static void main(String[] args) {
		/*
		 * �迭�� �̿��ؼ� ���� ���� ������ �����ϱ�
		 * 
		 * Score ��ġ�� �ּҰ� 3���� ������ �� �ִ� �迭��ü�� �����ϰ�, �迭��ü�� �ּҰ��� �������� scores�� ������
		 */
		Score[] scores = new Score[3];		// ��ü Score�� �ּҰ��� ������ �� �ִ� �迭�� �������� scores�� ����
											// ��ü Score�� �ּҰ� 3���� ������ �� �ִ� �迭��ü�� �����ϰ� �ּҰ��� ���������� ������
		// Score ��ü�� �����ؼ� �������� score1�� �ּҰ� ����
		Score score1 = new Score();
		// �������� score1���� ������ Score��ü�� ��������� �������� ����
		score1.studentName = "������";
		score1.kor = 100;
		score1.eng = 80;
		score1.math = 40;
		score1.total = score1.kor + score1.eng + score1.math;
		score1.average = score1.total/3;
		// �������� score1�� ����� �ּҰ��� (�迭��ü�� �����ϴ� scores ���������� �̿��ؼ�) �迭��ü�� 0��° ĭ�� ����
		// �迭��ü�� 0��°ĭ�� �������� score1�� �����ϴ� ��ü�� ���� �����ϱ� ������
		// ����, score1�� �����ϴ� ��ü�� �迭��ü�� 0��° ĭ�� �����(����)
		scores[0] = score1;
		
		Score score2 = new Score();
		score2.studentName = "�̼���";
		score2.kor = 80;
		score2.eng = 75;
		score2.math = 70;
		score2.total = score2.kor + score2.eng + score2.math;
		score2.average = score2.total/3;		
		// �������� score2�� ����� �ּҰ��� (�迭��ü�� �����ϴ� scores ���������� �̿��ؼ�) �迭��ü�� 1��° ĭ�� ����
		scores[1] = score2;
		
		Score score3 = new Score();
		score3.studentName = "������";
		score3.kor = 100;
		score3.eng = 100;
		score3.math = 80;
		score3.total = score3.kor + score3.eng + score3.math;
		score3.average = score3.total/3;
		// �������� score3�� ����� �ּҰ��� (�迭��ü�� �����ϴ� scores ���������� �̿��ؼ�) �迭��ü�� 2��° ĭ�� ����
		scores[2] = score3;
		
		/*
		 *  �������� scores�� �����ϴ� �迭�� 0,1,2��° ĭ�� ���� Score��ü ����(����)�� �Ϸ��
		 *  ��ħ��, �������� scores�� ����ؼ� ��� ���������� ������ �� �ִ�.
		 */
		System.out.println("�̹� ���迡 ������ �л����� �̸��� ������� ����ϱ�");
		System.out.println(scores[0].studentName + ", " + scores[0].average);
		System.out.println(scores[1].studentName + ", " + scores[1].average);
		System.out.println(scores[2].studentName + ", " + scores[2].average);
		
		// �迭�� ������� ����Ǿ� �ֱ� ������ �ݺ����� ����ؼ� �л����� ���������� ó���� �� ����
		System.out.println("�ݺ����� ����ؼ� �̹� ���迡 ������ �л����� �̸��� ������� ����ϱ�");
		for (int i = 0; i <scores.length; i++) {
			System.out.println(scores[i].studentName + ", " + scores[i].average);
		}
		
		// �迭�� ������� ����Ǿ� �ֱ� ������ ����-for���� ����ؼ� �л����� ���������� ó���� �� ����
		System.out.println("����-for���� ����ؼ� �̹� ���迡 ������ �л����� �̸��� ������� ����ϱ�");
		for (Score score : scores) {
			System.out.println(score.studentName  + ", " + score.average);
		}
		
	}
}
