package example_09_02_for;

public class Sample3 {
	public static void main(String[] args) {
		/*
		 * ���� 1���� 500������ ���� ���ؼ� ȭ�鿡 ����ϱ�
		 */
		
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
		
		int sum = 0;
		for (int i = 0; i < 500; i++) {
			sum += (i+1);
		}
		
		System.out.println("�հ�: " + sum);
	}
}
