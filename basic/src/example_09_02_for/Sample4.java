package example_09_02_for;

public class Sample4 {
	public static void main(String[] args) {
		/*
		 * for�� �ȿ��� ���ǹ�(if��) ����ϱ�
		 *
		 * 1~10������ ������ �հ踦 ����ϱ�
		 */
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("�հ�: " + sum);
		
		//1~10������ ���� �߿��� ¦��/Ȧ���� �հ踦 ����ϱ�
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("¦���� �հ�: " + evenSum);
		System.out.println("Ȧ���� �հ�: " + oddSum);
	}
}
