package example_09_01_if;

public class Sample4 {
	public static void main(String[] args) {
		/* else�� �ʿ䰡 ���� ���
		 * ���űݾ׿� ���� ��������Ʈ ����ϱ�
		 * 100���� �̻� ���Ž� ���űݾ��� 5%�� ����Ʈ�� �����Ѵ�.
		 * 50���� �̻� ���Ž� ���űݾ��� 2%�� ����Ʈ�� �����Ѵ�.
		 * 30���� �̻� ���Ž� ���űݾ��� 1%�� ����Ʈ�� �����Ѵ�.	
		 * ��¿�) "��������Ʈ : 100��"
		 */
		int orderPrice = 1_800_000;
		int point = 0;
		
		if (orderPrice >= 1_000_000) {
			point = (int)(orderPrice*0.05);
		} else if (orderPrice >= 500_000) {
			point = (int)(orderPrice*0.02);
		} else if (orderPrice >= 300_000) {
			point = (int)(orderPrice*0.01);
		}
		System.out.println("��������Ʈ: " + point);
	}	
}
