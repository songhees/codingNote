package example_09_02_switch;

public class Sample1 {
	public static void main(String[] args) {
		/*
		 * switch ��
		 * 
		 * switch (�˻���) {
		 * 		case ��1:
		 * 			���๮;
		 * 			break;
		 * 		case ��2:
		 * 			���๮;
		 * 			break;
		 * 		default
		 * 			���๮;
		 * }
		 * case���� { } �ʿ����
		 * 
		 * 
		 * ���� ��޿� ���� ��������Ʈ�� ����ؼ� ����ϱ�
		 * ����� - 5% ����
		 * �ǹ���� - 2% ����
		 * ������� - 1% ����
		 */
		String customerName = "ȫ�浿";
		String customerGrade = "�ǹ�";
		int orderPrice = 450_000;
		
		int point = 0;
		switch (customerGrade) {
			case "���" :
				System.out.println("��� ����� ȸ���� ���� ��������Ʈ�� ����մϴ�.");
				point = (int)(orderPrice*0.05);
				break;
			case "�ǹ�" :
				System.out.println("�ǹ� ����� ȸ���� ���� ��������Ʈ�� ����մϴ�.");
				point = (int)(orderPrice*0.02);
				break;
			case "�����" :
				System.out.println("����� ����� ȸ���� ���� ��������Ʈ�� ����մϴ�.");
				point = (int)(orderPrice*0.01);
				break;
		}
		
		System.out.println(customerName + "����");
		System.out.println("��������Ʈ: " + point);
		System.out.println("�ֹ��ݾ�: " + orderPrice);
		
		//break�� ���ٶ� 	System.out.println("����� ����� ȸ���� ���� ��������Ʈ�� ����մϴ�.");
		//point = (int)(orderPrice*0.01); �� ����Ǿ� ���� �޶�����.
	
	
	}
}
