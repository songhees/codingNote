package example_09_27_inner_class_example;

import example_09_27_inner_class_example.StudentScoreRepository.ScoreStats;

public class ScoreApp {
	public static void main(String[] args) {
		// ���������� ���� ������� ������ ����Ŭ������ �����ϴ� Ŭ����.
		StudentScoreRepository repo = new StudentScoreRepository();
		
		// ���������� ���� ��������� �����ϴ� ��ü�� ��ȸ
		ScoreStats stats = repo.getStats();
		
		System.out.println("��ü���: " + stats.average());
		System.out.println("����������: " + stats.korAverage());
		System.out.println("����������: " + stats.engAverage());
		System.out.println("���а������: " + stats.mathAverage());
	}
}
