package example_08_31_var;

public class Sample2 {
	public static void main(String[] args) {
		/*
		 * ��ǰ���� ���ż��� ��������Ʈ�� ����ؼ� ����ϱ�
		 * ��ǰ������ 35000���̴�.
		 * ���ż����� 3�̴�.
		 * ����Ʈ�������� �ѱ��� �ݾ��� 3%��.
		 * 
		 * ȭ�鿡 ��ǰ����, ���ż���, �ѱ��űݾ�, ��������Ʈ�� ����ϱ�
		 */
		
		int price = 35000;
		int amount = 3;
		int totalPrice = price * amount;
		double point = 0.03;
		double totalPoint = totalPrice * point;
		
		System.out.println("��ǰ����, ���ż���");
		System.out.println(price);
		System.out.println(amount);
		
		System.out.println("�ѱ��� �ݾ�, ��������Ʈ");
		System.out.println(totalPrice);
		System.out.println(totalPoint);
		
		
	}
}
