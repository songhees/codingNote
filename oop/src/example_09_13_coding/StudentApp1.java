package example_09_13_coding;

public class StudentApp1 {
	public static void main(String[] args) {
		
		Student student1 = new Student();	// ������ �� �л� //��ü �����ϰ� �ּҰ��� ���������� ����
		Student student2 = new Student();	// ������ �� �л�
		Student student3 = new Student();	// ������ �Ⱥ� �л�
		
		student1.setNo(10);				// ���������� �����ϴ� ��ü�� �޼ҵ忡 ���� �����ϸ� �޼ҵ带 ����
		student1.setGrade(2);
		student1.setName("�̼���");
		
		ScoreDetail scoreDetail1 = new ScoreDetail();	// ScoreDetail��ü�� ������ ���������� �ּҰ� ����
		scoreDetail1.setKor(80);	// ���������� �����ϴ� ��üScoreDetail�� setKor�� �Ű����� 80�� �����Ͽ� ����
		scoreDetail1.setEng(70);
		scoreDetail1.setMath(85);
		student1.setScore(scoreDetail1);
		// student1���������� �����ϴ� ��üStudent�� �Ű����� scoreDetail�� ������ ScoreDetail��ü�� �ּҰ���
		// �Ű������� �Ͽ��� setScore�� �����Ͽ� �ּҰ��� ����/����
		
		student2.setNo(12);
		student2.setGrade(2);
		student2.setName("������");
		
		ScoreDetail scoreDetail2 = new ScoreDetail();
		scoreDetail2.setKor(60);
		scoreDetail2.setEng(55);
		scoreDetail2.setMath(40);
		student2.setScore(scoreDetail2);

		student3.setNo(1);
		student3.setGrade(1);
		student3.setName("������");
		
		//�̼����� ��ȣ, �г�, �̸�, ����, ����, ����, ����, ����� ����ϱ�
		System.out.println("### �̼����� ���� �� �������� ����ϱ�");
		System.out.println("��ȣ: " + student1.getNo());
		System.out.println("�̸�: " + student1.getName());
		System.out.println("�г�: " + student1.getGrade());
		
		System.out.println(student1.getScore());
		// main�޼ҵ尡 println�޼ҵ带 �����Ű�� �״���
		//student1������ �����ϴ� Student��ü�� �޼ҵ带 �����Ͽ� ��ü�� score������ �������ִ� �ּҰ��� ��ȯ
		// ������ �ڹٴ� �ּҰ��� ������� �ʰ�  �ؽ�?�� ��ȯ�Ͽ� �޼ҵ带 ������ println�޼ҵ尡 �̸� ���
		// �Ѵ��� �޼ҵ带 ������ main�޼ҵ带 ���� �����Ų��.
		
		System.out.println("����: " + student1.getScore().getKor());
		// student1������ �����ϴ� Student��ü�� getScore()������ ��ȯ�Ǵ� ������ �����ϴ�
		// ScoreDetail��ü�� getKor�޼ҵ带 ������� kor������ ���� ���� ��ȯ��Ų��.
		
		System.out.println("����: " + student1.getScore().getEng());
		System.out.println("����: " + student1.getScore().getMath());
		System.out.println("����: " + student1.getScore().getTotal());
		System.out.println("���: " + student1.getScore().getAverage());
		System.out.println();
		
		
		System.out.println("### �������� ���� �� �������� ����ϱ�");
		System.out.println("��ȣ: " + student2.getNo());
		System.out.println("�̸�: " + student2.getName());
		System.out.println("�г�: " + student2.getGrade());

		System.out.println(student2.getScore());
		System.out.println("����: " + student2.getScore().getKor());
		System.out.println("����: " + student2.getScore().getEng());
		System.out.println("����: " + student2.getScore().getMath());
		System.out.println("����: " + student2.getScore().getTotal());
		System.out.println("����: " + student2.getScore().getAverage());
		System.out.println();
		
		
		System.out.println("### �������� ���� �� �������� ����ϱ�");
		System.out.println("��ȣ: " + student3.getNo());
		System.out.println("�̸�: " + student3.getName());
		System.out.println("�г�: " + student3.getGrade());
		
		System.out.println(student3.getScore()); //student3������ �����ϴ� ��ü�� �����Ƿ� null���� ���´�.
		System.out.println("����: " + student3.getScore().getKor());
		System.out.println("����: " + student3.getScore().getEng());
		System.out.println("����: " + student3.getScore().getMath());
		System.out.println("����: " + student3.getScore().getTotal());
		System.out.println("����: " + student3.getScore().getAverage());
		System.out.println();
	}
}
