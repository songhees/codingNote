package example_09_27_inner_class_example;

public class StudentScoreRepository {

	private StudentScore[] database;
	
	public StudentScoreRepository() {
		database = new StudentScore[] {
			new StudentScore("ȫ�浿", 100, 80, 70),
			new StudentScore("������", 80, 90, 60),
			new StudentScore("������", 80, 40, 40),
			new StudentScore("�̼���", 50, 80, 60),
			new StudentScore("������", 70, 60, 90),
			new StudentScore("���߱�", 90, 70, 70),
			new StudentScore("������", 30, 60, 50),
			new StudentScore("�̺�â", 60, 40, 30),
			new StudentScore("�ο�ȯ", 90, 60, 50),
			new StudentScore("�����", 60, 90, 70),
			new StudentScore("�豸", 40, 30, 90),
			new StudentScore("����", 90, 70, 70),
			new StudentScore("�ѿ��", 60, 50, 50),
			new StudentScore("�̼���", 70, 40, 30),
			new StudentScore("�̹��", 40, 90, 40),
			new StudentScore("������", 70, 90, 50),
			new StudentScore("�踸��", 100, 90, 80),
		};
	}
	
	/**
	 * �� ���� �߰����
	 * @param score
	 */
	public void addNewStudentScore(StudentScore score) {
		
	}
	
	/**
	 * ������ �̸����� ���������� ã�Ƽ� ��ȯ�ϴ� ���
	 * @param name	�л��̸�
	 * @return	��������
	 */
	public StudentScore getStudentScore(String name) {
		return null;
	}
	
	/**
	 * �հ��� �̻��� ��������� ���� �л����� ���������� ��ȯ�ϴ� ���
	 * @return ����������
	 */
	public StudentScore[] getPassedStudentScores() {
		return null;
	}
	
	/**
	 * �հ��� �̸��� ��������� ���� �л����� ���������� ��ȯ�ϴ� ���
	 * @return	����������
	 */
	public StudentScore[] getUnPassedStudentScores() {
		return null;
	}
	
	/**
	 * ������������� �����ϴ� ��ü�� ��ȯ�ϴ� ���
	 * @return	������������� �����ϴ� ��ü
	 */
	public ScoreStats getStats() {
		return new ScoreStats();
	}
	
	// �л����������� ���� ��� ������ �����ϴ� �������Ŭ���� �����ϱ�
	/**
	 * �л������� ���� ��������� �����ϴ� Ŭ����
	 * @author ������
	 *
	 */
	class ScoreStats {
		/**
		 * �� ���� ���� ��������� ��ȯ�Ѵ�.
		 * @return	�� ���� �������
		 */
		public int average() {
			int allTotal = 0;
			for (StudentScore score : database) {
				allTotal += score.getTotal();
			}
			return allTotal/(database.length*3);
		}
		/**
		 * ������� ���� ��������� ��ȯ�Ѵ�.
		 * @return	������� �������
		 */
		public int korAverage() {
			int korTotal = 0;
			for (StudentScore score : database) {
				korTotal += score.getKor();
			}
			return korTotal/database.length;
		}
		/**
		 * ������� ���� ��������� ��ȯ�Ѵ�.
		 * @return	������� �������
		 */
		public int engAverage() {
			int engTotal = 0;
			for (StudentScore score : database) {
				engTotal += score.getEng();
			}
			return engTotal/database.length;
		}
		/**
		 * ���а��� ���� ��������� ��ȯ�Ѵ�.
		 * @return	���а��� �������
		 */
		public int mathAverage() {
			int mathTotal = 0;
			for (StudentScore score : database) {
				mathTotal += score.getMath();
			}
			return mathTotal/database.length;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
