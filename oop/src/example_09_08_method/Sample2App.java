package example_09_08_method;

public class Sample2App {
	public static void main(String[] args) {
		
		// ���� ��ü�� �����ϰ� �ּҰ��� ���������� ���� 
		Sample2 s1 = new Sample2();
		Sample2 s2 = new Sample2();
		Sample2 s3 = new Sample2();
		
		// �� ��ü�� ��� ������ �ʱ�ȭ
		s1.balance = 10000;
		s1.password = 1111;
		
		s2.balance = 1_000_000;
		s2.password = 1234;
		
		s3.balance = 250_000;
		s3.password = 1212;
		
		// �� ��ü�� �ܾ��� ��ȸ�ؼ� ȭ�鿡 ����б�
		long value1 = s1.getCurrentBalance();
		// s1���������� ���� ��ü Sample2�� ����� getCurrentBalance���� balance���� ��ȯ�Ͽ� longŸ���� ���� value1�� �����Ѵ�.
		long value2 = s2.getCurrentBalance();
		long value3 = s3.getCurrentBalance();
		
		System.out.println("ù��° ��â�� ���� �ܾ�: " + value1);
		System.out.println("�ι�° ��â�� ���� �ܾ�: " + value2);
		System.out.println("����° ��â�� ���� �ܾ�: " + value3);
		
		// �� ��ü�� �ܾ��� ���� ��ģ �� �ڻ��� ����ؼ� ȭ�鿡 ����ϱ�
		long totalBalance = value1 + value2 + value3;
		System.out.println("�� �ڻ�: " + totalBalance);
		
		// �� ��ü�� �ܾ��� �����ϱ�
		s1.updateBalance(300_000);
		s2.updateBalance(500_000);
		s3.updateBalance(700_000);
		
		// �� ��ü�� �ܾ��� ����� �� �ܾ��� ��ȸ�ؼ� ȭ�鿡 ����ϱ�
		value1 = s1.getCurrentBalance();
		value2 = s2.getCurrentBalance();
		value3 = s3.getCurrentBalance();
		
		System.out.println("�ܾ׺��� �� ù��° ��â�� ���� �ܾ�: " + value1);
		System.out.println("�ܾ׺��� �� �ι�° ��â�� ���� �ܾ�: " + value2);
		System.out.println("�ܾ׺��� �� ����° ��â�� ���� �ܾ�: " + value3);
		
		
	}
}
