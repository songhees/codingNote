package example_08_31_operator;

public class Sample8 {
	public static void main(String[] args) {
		/*
		 * �񱳿����ڿ� �������ڷ� ������ �����ϱ�
		 * �������ڴ� �ٸ������� ���� �켱������ ����
		 * �ڵ��� ����������� �����ϱ�
		 * �������� : ����Ÿ��� 50000km�̻��� ��� �������, ����Ⱓ�� 3�� �̻��� ��� ���������.
		 * or
		 */
		int standardDistance = 50000;
		int standardPeriod = 3;
		int distance = 35000;
		int period = 2;
		
		boolean �������������� = (distance >= standardDistance) || (period >= standardPeriod);
		System.out.println("������� ����: " + ��������������);   //false
				
		 /* �� ����ǰ ���޿��� �����ϱ�
		 * �������� : ��������Ʈ�� 1�鸸�� �̻��̰�, ���� ���űݾ��� 50���� �̻��� ��� ����ǰ�� �����Ѵ�.
		 * and
		 */
		int standardPoint = 1_000_000;
		int standardPrice = 500_000;
		int point = 1_500_000;
		int price = 750_000;
		
		boolean ����ǰ���޿���������� = (point >= standardPoint) && (price >= standardPrice);
		System.out.println("����ǰ ���޿���: " + ����ǰ���޿����������);  //true
		
		 /* ��ȸ�� �������
		 * �������� : �湮ȹ���� 50ȸ �̻��̰�, ����ۼ� ������ 10�� �̻��� ��� Ȥ�� 10���� �Ŀ��� ��� ��ȸ������ ����Ѵ�.
		 * and !
		 */
		int standardVisit = 50;
		int standardComment = 10;
		int standardDonation = 100_00;
		int totalVisit = 60;
		int totalComment = 15;
		int donation = 200_000;
		
		boolean result = ((totalVisit >= standardVisit) && (totalComment >= standardComment)) || (donation >= standardDonation);
		System.out.println("��ȸ�� ��� ����: " + result); 			//true
	}
}
