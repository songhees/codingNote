package example_08_31_operator;

public class Sample9 {
	public static void main(String[] args) {
		/*
		 * ���� ������(3�� ������)
		 * ���ǽ� ? ��1 : ��2
		 * ���ǽ� ? �����1 : �����2
		 * 
		 * ���ǽ��� �������� boolean ���̾�� �Ѵ�.
		 * ��1�� ��2�� Ÿ���� �����ؾ� �Ѵ�.
		 * ���ǽ��� �������� true�� ���ǿ������� ���� �������� ��1�̴�.
		 * ���ǽ��� �������� false�� ���ǿ������� ���� �������� ��2��.
		 * 
		 * ������ 60�� �̻��̸� "�հ�"��, 60�� �̸��̸� "���հ�" ������ ������.
		 */
		int score = 75;
		
		String result = score >= 60 ? "�հ�" : "���հ�";
		System.out.println("������: " + result);			//�հ�
		
		//���űݾ��� 100������ �ʰ��ϸ� ���űݾ��� 5%�� �����ϰ�, 100���� ���ϸ� 2%�� �����Ѵ�.
		int orderPrice = 700_000;
		int point = orderPrice > 1_000_000 ? (int)(orderPrice*0.05) : (int)(orderPrice*0.02);
		System.out.println("��������Ʈ: " + point);			//14000
		
	}
}
