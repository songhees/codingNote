package example_09_01_if;

public class Sample8 {
	public static void main(String[] args) {
		/*
		 * ����, ����, ���������� ���� ��������� 60�� �̻��̸� �հ��̴�. 90�� �̻��̸� ���б� ���޴���̴�.
		 * ��, �� �����̶� 40�� �̸��̸� �������� ���� ���հ��̴�.
		 */
		int korScore = 35;
		int engScore = 90;
		int mathScore = 100;
		int totalScore = korScore + engScore + mathScore;
		int average = totalScore/3;
		
		/*
		 * 1. �� �����̶� ������ �ִ��� ���� Ȯ���Ѵ�.
		 * 2. ������ ������ ���հ� ó���Ѵ�.
		 * 3. ���� ������ �ƴ� ���, ������ ����� ����Ѵ�.
		 * 4. ����� 60�� �̻��̸� �հ����� �����ϰ�, �߿��� 90�� �̻��̸� ���б� ���޴������ �����Ѵ�.
		 * 5. 60�� �̸��� ��� ���հ����� �����Ѵ�.
		 */
		if (average >= 90 ) {
			System.out.println("���б� ���޴���Դϴ�.");
		} else if (korScore < 40 || engScore < 40 || mathScore < 40 ) {
			System.out.println("���հ��Դϴ�.");
		} else if (average > 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		
		if (average >= 60) {
			if ( korScore < 40 || engScore < 40 || mathScore < 40) {
				System.out.println("���հ��Դϴ�.");
			} else if (average >= 90) {
				System.out.println("���б� ���޴���Դϴ�.");
			} else {
				System.out.println("�հ��Դϴ�.");
			}
		} else {
			System.out.println("���հ��Դϴ�.");
		}	
		
		if ( korScore < 40 || engScore < 40 || mathScore < 40) {
			System.out.println("�������� ���� ���հ��Դϴ�.");
		} else {
			if (average >= 60) {
				System.out.println("�հ��Դϴ�.");
				if (average >= 90) {
					System.out.println("���б� ���޴���Դϴ�");
				}
			} else {
				System.out.println("������� �̴޷� ���հ��Դϴ�.");
			}
		}
		
		if ( korScore < 40 || engScore < 40 || mathScore < 40) {
			System.out.println("�������� ���� ���հ��Դϴ�.");
		} else if (average >= 90) {
			System.out.println("���б� ���޴���Դϴ�.");
		} else if (average >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("��չ̴޷� ���� ���հ��Դϴ�.");
		}
	}
}
