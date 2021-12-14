package example_09_13_coding;

public class StudentApp2 {
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
//		Student student1 = new Student(10, 1, "������", new ScoreDetail(100, 90, 80));
//		Student student2 = new Student(20, 3, "������", new ScoreDetail(80, 70, 85));
//		Student student3 = new Student(30, 2, "�̼���", new ScoreDetail(70, 70, 60));
//		students[0] = student1;
//		students[1] = student2;
//		students[2] = student3;
		
		// �迭�� �� ĭ�� �л������� ������(�л������� ���輺�������� �����ϰ� ����)
		students[0] = new Student(10, 1, "������", new ScoreDetail(100, 90, 80));
		students[1] = new Student(20, 3, "������", null);
		students[2] = new Student(30, 2, "�̼���", new ScoreDetail(70, 70, 60));
//		
//		System.out.println("�迭�� 0��°�� ����� Student ��ü: " + students[0]);
//		System.out.println("�迭�� 1��°�� ����� Student ��ü: " + students[1]);
//		System.out.println("�迭�� 2��°�� ����� Student ��ü: " + students[2]);
		
		// ���� for���� ����ؼ� �迭�� �� ĭ�� ����� �л������� ����ϱ�
		for(Student student : students) {
//			System.out.println("student�� ������� �����ϴ� Student ��ü: " + student);
			System.out.println("��ȣ: " + student.getNo());
			System.out.println("�г�: " + student.getGrade());
			System.out.println("�̸�: " + student.getName());
			
//			System.out.println("����: " + student.getScore().getKor());
//			System.out.println("����: " + student.getScore().getEng());
//			System.out.println("����: " + student.getScore().getMath());
//			System.out.println("����: " + student.getScore().getTotal());
//			System.out.println("���: " + student.getScore().getAverage());
			
			ScoreDetail score = student.getScore();
			if ( score != null ) {
				System.out.println("����: " + score.getKor());
				System.out.println("����: " + score.getEng());
				System.out.println("����: " + score.getMath());
				System.out.println("����: " + score.getTotal());
				System.out.println("���: " + score.getAverage());
			} else {
				System.out.println("���輺�� ������ �������� �ʽ��ϴ�.");
			}
			
			System.out.println();			
		}
		
		
		
		
		
	}
}
