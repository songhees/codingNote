package example_09_06_class;

public class ScoreApp1 {
	public static void main(String[] args) {
		/*
		 * Score Ŭ������ �̿��ؼ� ���������� �����ϱ�
		 * 
		 * ���� ��(3��)�� ���������� �����ϴ� ���ø����̼� ����
		 */
		Score score1 = new Score();
		score1.studentName = "������";
		score1.kor = 100;
		score1.eng = 80;
		score1.math = 80;
		score1.total = score1.kor + score1.eng + score1.math;
		score1.average = score1.total/3;
		
		Score score2 = new Score();
		score2.studentName = "ȫ�浿";
		score2.kor = 70;
		score2.eng = 100;
		score2.math = 100;
		score2.total = score2.kor + score2.eng + score2.math;
		score2.average = score2.total/3;
		
		Score score3 = new Score();
		score3.studentName = "������";
		score3.kor = 80;
		score3.eng = 80;
		score3.math = 80;
		score3.total = score3.kor + score3.eng + score3.math;
		score3.average = score3.total/3;
		
		/*
		 * �̹� ���迡 ������ �л��� �̸��� ����ϱ�
		 */
		System.out.println("���迡 ������ �л����� �̸�");
		System.out.println(score1.studentName);
		System.out.println(score2.studentName);
		System.out.println(score3.studentName);
		
		System.out.println("���迡 ������ �л����� �������");
		System.out.println(score1.average);
		System.out.println(score2.average);
		System.out.println(score3.average);
		System.out.println();
		
		System.out.println("���迡 ������ �л����� ���� ����");
		System.out.println(score1.kor + "," + score1.eng + "," + score1.math);
		System.out.println(score2.kor + "," + score2.eng + "," + score2.math);
		System.out.println(score3.kor + "," + score3.eng + "," + score3.math);
		
	}
}
