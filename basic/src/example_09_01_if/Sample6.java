package example_09_01_if;

public class Sample6 {
	public static void main(String[] args) {
		/*
		 * ���űݾ׿� ���� ����Ʈ ���� �� ����� �����ϱ�
		 * 
		 * ���űݾ��� 100���� �̻��̸� ���űݾ��� 5%�� ����Ʈ�� �����Ѵ�.
		 * ���űݾ��� 50���� �̻��̸� ���űݾ��� 2%�� ����Ʈ�� �����Ѵ�.
		 * ���űݾ��� 30���� �̻��̸� ���űݾ��� 1%�� ����Ʈ�� �����Ѵ�.
		 * ���űݾ��� 30���� �̸��̸� ���űݾ��� 0.3%�� ����Ʈ�� �����Ѵ�.
		 * 
		 * �� ������ ����Ʈ�� 100���� �̻��̸� ���� ����� "���̾Ƹ��"�� �����Ѵ�.
		 * �� ������ ����Ʈ�� 50���� �̻��̸� ���� ����� "���"�� �����Ѵ�.
		 * �� ������ ����Ʈ�� 20���� �̻��̸� ���� ����� "�ǹ�"�� �����Ѵ�.
		 * �� ������ ����Ʈ�� 10���� �̻��̸� ���� ����� "�����"�� �����Ѵ�.
		 * �� ������ ����Ʈ�� 10���� �̸��̸� ���� ����� "�̸�"�� �����Ѵ�.
		 * ��޿� ���� ������ ��ǰ�� ������ ������ ���� ����Ʈ�� �������� �����Ѵ�.
		 *
		 *��¿���)
		 *		����: ȫ�浿
		 *		���� �����: �ǹ�
		 *		���� ����Ʈ: 250_010
		 *		
		 *		���� �ݾ�: 400_000
		 *		������������Ʈ: 4000
		 *		���� �� ���� ����Ʈ : 254_010
		 *		���� �� �� ���: �ǹ�
		 */
		String name = "ȫ�浿";
		String grade = "�ǹ�";
		int currentPoint = 250_010;
		int orderPrice = 40_000_000;
		
		int point = 0;
		if (orderPrice >= 1_000_000) {
			point = (int)(orderPrice*0.05);
		} else if (orderPrice >= 500_000) {
			point = (int)(orderPrice*0.02);
		} else if (orderPrice >= 300_000) {
			point = (int)(orderPrice*0.01);
		} else {
			point = (int)(orderPrice*0.003);
		}
		int afterOrderedPoint = currentPoint + point;
		
		String afterOrderedGrade = "";
		if (afterOrderedPoint >= 1_000_000) {
			afterOrderedGrade = "���̾Ƹ��";
		} else if (afterOrderedPoint >= 500_000) {
			afterOrderedGrade = "���";
		} else if (afterOrderedPoint >= 200_000) {
			afterOrderedGrade = "�ǹ�";
		} else if (afterOrderedPoint >= 100_000) {
			afterOrderedGrade = "�����";
		} else {
			afterOrderedGrade = "�Ϲ�";
		}
		
		System.out.println("����: " + name);
		System.out.println("���� �����: " + grade);
		System.out.println("���� ����Ʈ: " + currentPoint + "\n");
		System.out.println("���� �ݾ�: " + orderPrice);
		System.out.println("������������Ʈ: " + point);
		System.out.println("���� �� ���� ����Ʈ: " + afterOrderedPoint);
		System.out.println("���� �� �� ���: " + afterOrderedGrade);
	}
}
