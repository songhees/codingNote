package example_09_01_if;

public class Sample7 {
	public static void main(String[] args) {
		/*
		 * ����, ����, ���������� ����� 60�� �̻��̸� �հ��̴�. ��, ����� 90�� �̻��̸� ���б��� �����Ѵ�.
		 */
		int korScore = 60;
		int engScore = 80;
		int mathScore = 80;
		int totalScore = korScore +engScore +mathScore;
		int average = totalScore/3;
		
		 // ������ if���� ������� �ʴ� ���
		if (average >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		if (average >= 90) {
			System.out.println("���б� ���ݴ������ �����Ǿ����ϴ�.");
		}	//�� ��� ���հ� ��� ���б� ���θ� �Ǵ��ϴ� �ڵ带 ��ģ��.
		
		
		// ������ if���� ����ϴ� ���
		if (average >= 60) {
			System.out.println("�հ��Դϴ�.");
			if (average >= 90) {
				System.out.println("���б� ���޴������ �����Ǿ����ϴ�.");
			}	//�հݴ������ ���б� ���� Ȯ���ϴ� if���� ���� (�� �������̴�.)
		} else {
			System.out.println("���հ��Դϴ�.");
		}	
		
		
		if (average >= 90) {
			System.out.println("���б� ���޴������ �����Ǿ����ϴ�.");
		} else if (average >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
}
