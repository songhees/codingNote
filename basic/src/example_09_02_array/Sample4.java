package example_09_02_array;

public class Sample4 {
	public static void main(String[] args) {
		/* �л����� ������ �����ϰ� �ִ� �迭�� �����ϰ�,
		 * ��ü �л����� ����� ����ؼ� ����ϱ�
		 */
		int[] scores = {60, 70, 40, 70, 85, 90, 40, 100, 75, 50, 35, 90, 100, 60, 70};
		
		// ����, �л���, ����� ������ ���� ����, �ʱ�ȭ
		int studentCount = scores.length;
		int totalScore = 0;
		int average = 0;
		
		for (int score : scores) {
			totalScore += score;
		}
		average = totalScore/studentCount;
		
		System.out.println("����: " + totalScore);
		System.out.println("�л���: " + studentCount);
		System.out.println("���: " + average);
	}
}
