package example_09_10_coding;

public class SampleApp {
	public static void main(String[] args) {
		// 10���� ���������� �����ϴ� �迭��ü �����ϱ�
		Score[] scores = new Score[10];
		// �迭��ü�� ���������� �����ϱ�
		scores[0] = new Score(101, "ȫ�浿", 100, 70, 80);
		scores[1] = new Score(102, "������", 30, 50, 90);
		scores[2] = new Score(103, "������", 40, 30, 100);
		scores[3] = new Score(104, "�̼���", 50, 10, 90);
		scores[4] = new Score(105, "������", 60, 30, 80);
		scores[5] = new Score(106, "������", 70, 50, 70);
		scores[6] = new Score(107, "��âȣ", 80, 70, 60);
		scores[7] = new Score(108, "���߱�", 90, 90, 35);
		scores[8] = new Score(109, "�̺�â", 100, 10, 40);
		scores[9] = new Score(110, "������", 80, 20, 30);
		
		Sample sample = new Sample();
		
		// �л��������� ��ü�� ���޹޾Ƽ� ȭ�鿡 ����ϴ� ���
		System.out.println("### �л��������� ��ü�� ���޹޾Ƽ� ȭ�鿡 ����ϴ� ���");
		sample.printScore(scores[0]);
		sample.printScore(scores[5]);
		
		// ��� �迭�� �����ؼ� ��� �л��������� ȭ�鿡 ����ϴ� ���
		System.out.println("### ��� �л��������� ����ϱ�");
		sample.printAllScores(scores);
		
		// ������ ���� ���� �л��� �������� ����ϱ�
		System.out.println("### 1���� �л��� �������� ����ϱ�");
		sample.printTop1(scores);
		
		// ��ü �л��� ������� ����ϱ�
		System.out.println("### ��ü �л��� ������� ����ϱ�");
		sample.printAverage(scores);
		
		// ��ü ����������� ���� ������ ���� �л����������� ����ϱ�
		System.out.println("### ��ü ����������� ���� ������ ���� �л����������� ����ϱ�");
		sample.printLowerScore(scores);
		
		// ��ü ����������� ���� ������ ���� �л��������� ����ϱ�
		System.out.println("### ���հ��� ����ϱ�");
		sample.printUnPassedScores(scores);
		
		
		// ��ü ����������� ���� ������ ���� �л��������� ����ϱ�
		System.out.println("### ���հ��� ����ϱ�");
		sample.printUnPasswordScores2(scores);
		
		// ��հ� ���� ����� ������ ���� �л��� ���������� ����ϱ�
		System.out.println("### ��հ� ���� ����� ������ ���� �л��� ���������� ����ϱ�");
		sample.printClosestAverageScore(scores);
		
	}
}
