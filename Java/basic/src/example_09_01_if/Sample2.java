package example_09_01_if;

public class Sample2 {
	public static void main(String[] args) {
		/*
		 * if ~ else ��
		 * 
		 * if (���ǽ�) {
		 * 		���๮;		// ���ǽ��� true�� �����Ǹ� ����ȴ�.
		 * 		���๮;
		 * } else {
		 * 		���๮;		// ���ǽ��� false�� �����Ǹ� ����ȴ�.
		 * 		���๮;
		 * }
		 * 
		 * 
		 * ������ 60�� �̻��̸� "�հ��Դϴ�."�� ����ϰ� �ƴϸ� "���հ��Դϴ�."�� ����ϱ�
		 */
		int score = 56;
		
		if (score>=60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		// ����Ÿ��� 50000km �̻��̰ų� ����Ⱓ�� 3�� �̻��� ���� "������ û���մϴ�."�� ����ϰ�, �ƴϸ� "��������մϴ�."
		
		int distance = 47_000;
		int year = 4;
		
		if ((distance >= 50000) || (year >= 3)) {
			System.out.println("������ û���մϴ�.");
		} else {
			System.out.println("��������մϴ�.");
		}
		
		if (distance >= 50000) {
			System.out.println("������ û���մϴ�.");
		} else if (year >= 3) {
			System.out.println("������ û���մϴ�.");
		} else {
			System.out.println("��������մϴ�.");
		}
		
		// ���ݾ��� 1��� �̻��̰�, �ŷ��Ⱓ�� 5���̻��̰�, �޿������� �츮 �����̸� "������Դϴ�."�� ���, �ƴϸ� "�Ϲݰ��Դϴ�."
		
		long balance = 100_000_000;
		int tradeYear = 7;
		boolean hasSalaryAccount = false;
		
		if (hasSalaryAccount && balance >= 100_000_000 && tradeYear >=5) {
			System.out.println("������ ������Դϴ�.");
		} else {
			System.out.println("������ �Ϲݰ��Դϴ�.");
		}
		
		boolean bank = "����"=="�츮";
		
		if (balance>=100_000_000 && tradeYear >=5) {
			System.out.println("������Դϴ�.");
		} else if (bank) {
			System.out.println("������Դϴ�.");
		} else {
			System.out.println("�Ϲݰ��Դϴ�.");
		}
		
		
	}
}
