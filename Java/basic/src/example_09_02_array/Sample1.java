package example_09_02_array;

public class Sample1 {
	public static void main(String[] args) {
		/*
		 * �迭 �����ϱ�
		 * 
		 */
		//���� 5�� ���� �� �ִ� �迭�� ������
		//new int[5];
		
		//������ ������ ����� �迭�� ��� ����(�����) numbers�� ������
		// int[] numbers
		
		// ���� 5�� ���� �� �ִ� �迭�� �����ؼ�, ������ ���� �� ����� �迭�� ���� �� �ִ� ���� numbers�� �� �迭�� ������.
		// int[] numbers = new int[5];
		// ���׺��� ���۵�.
		
		int[] numbers = new int[5];
		double[] numbers2 =new double[5];
		String[] names = new String[5];

		
		System.out.println("���� �迭�� ����� ��");
		System.out.println("�����迭�� 0��° ��: " + numbers[0]);
		System.out.println("�����迭�� 1��° ��: " + numbers[1]);
		System.out.println("�����迭�� 2��° ��: " + numbers[2]);
		System.out.println("�����迭�� 3��° ��: " + numbers[3]);
		System.out.println("�����迭�� 4��° ��: " + numbers[4] + "\n");
		
		System.out.println("�Ǽ� �迭�� ����� ��");
		System.out.println("�Ǽ��迭�� 0��° ��: " + numbers2[0]);
		System.out.println("�Ǽ��迭�� 1��° ��: " + numbers2[1]);
		System.out.println("�Ǽ��迭�� 2��° ��: " + numbers2[2]);
		System.out.println("�Ǽ��迭�� 3��° ��: " + numbers2[3]);
		System.out.println("�Ǽ��迭�� 4��° ��: " + numbers2[4] + "\n");
		
		System.out.println("���ڿ� �迭�� ����� ��");
		System.out.println("���ڿ� �迭�� 0��° ��: " + names[0]);
		System.out.println("���ڿ� �迭�� 1��° ��: " + names[1]);
		System.out.println("���ڿ� �迭�� 2��° ��: " + names[2]);
		System.out.println("���ڿ� �迭�� 3��° ��: " + names[3]);
		System.out.println("���ڿ� �迭�� 4��° ��: " + names[4]);
	}
}
