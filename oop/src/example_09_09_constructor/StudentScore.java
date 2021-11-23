package example_09_09_constructor;

public class StudentScore {
	/*
	 * �л� �������� ��ü�� Ŭ����
	 * 		1. �������
	 * 			�й�
	 * 			�̸�
	 * 			��������
	 * 			��������
	 * 			��������
	 * 			����
	 * 			���
	 * 		2. ������ �޼ҵ�
	 * 			�⺻ ������ �޼ҵ�
	 * 			�й�, �̸��� �ʱ�ȭ�ϴ� ������ �޼ҵ�
	 * 			�й�, �̸�, ��������, ��������, ���������� ���޹޾Ƽ� ������ ��ձ��� �ʱ�ȭ�ϴ� ������ �޼ҵ�
	 * 		3. ����޼ҵ�
	 * 			�л��� �������� ����ϴ� �޼ҵ�
	 * 				�й�, �̸�, ����/����/����/����/����� ����ϴ� �޼ҵ�
	 * 				
	 */
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int totalScore;
	double average;

	public StudentScore(){
		
	}
		
	//source -> generate using fields �� �����ڸ� �ڵ�����
	
	public StudentScore(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	

	public StudentScore(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		totalScore = kor + eng + math;
		average = totalScore/3.0;
	}

	public void printScore() {
		System.out.println("�̸�: " + no);
		System.out.println("�й�: " + name);
		System.out.println("��������: " + kor);
		System.out.println("��������: " + eng);
		System.out.println("��������: " + math);
		System.out.println("������: " + totalScore);
		System.out.println("�������: " + average);
		System.out.println();
	}
	

}
