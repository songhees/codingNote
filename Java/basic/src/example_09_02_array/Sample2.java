package example_09_02_array;

public class Sample2 {
	public static void main(String[] args) {
		/*
		 * �� �迭�� �����ϱ�
		 */
		int[] scores;			// �������� ���� �� �����ϴ� �迭��ü�� �ּҰ��� �����ϴ� ���� �����ϱ�
		scores = new int[5]; 	// ������ 5�� �����ϴ� �迭��ü�� �����ϰ�, �� ��ü�� �ּҰ��� scores�� ����
		
		// �迭�� �� ��ҿ� �ε����� ����ؼ� ���� �����ϱ�
		scores[0] = 70;			// socres ������ �����ϴ� �迭��ü�� 0��° ��ҿ� 70�� ����
		scores[1] = 65;
		scores[2] = 90;
		scores[3] = 60;
		scores[4] = 80;
		
		// �迭�� �� ��ҿ� ����� ���� �ε����� ����ؼ� ��ȸ�ϱ�
		System.out.println("0��° ����� ��: " + scores[0]);
		System.out.println("1��° ����� ��: " + scores[1]);
		System.out.println("2��° ����� ��: " + scores[2]);
		System.out.println("3��° ����� ��: " + scores[3]);
		System.out.println("4��° ����� ��: " + scores[4]);
		
		// �迭�� ũ�⸦ ��ȸ�ϱ�
		int size = scores.length;
		System.out.println("�迭�� ũ��: " + size);
		
		// �迭�� �� ��ҿ� ����� ���� �ݺ����� ����ؼ� ��ȸ�ϱ�
		for (int i = 0; i < size; i++) {		// 
			System.out.println(i + "��° ����� ��: " + scores[i]);
		}
		
		// �迭�� �� ��ҿ� ����� ���� ����-for���� ����ؼ� ��ȸ�ϱ�
		/*
		 * ������Ÿ��[] �迭 = new ������Ÿ��[3];
		 * int[] �迭 = new int[3];
		 * �迭[0] = 10;
		 * �迭[1] = 30;
		 * �迭[2] = 70;
		 * 
		 * �迭�̳� collection������ ��밡��
		 * �׻� �迭�� ó������ ������ �˾Ƽ� �ݺ��� �����Ѵ�.
		 * enhanced-for��(����-for��) ������ ��ȸ�� ���� ����.
		 * for (�迭���� ���� ���� ���� ���� : �迭(�ϳ��� ������ �迭�� ��������))
		 * for (������Ÿ�� ������ : �迭)
		 */
		for (int score  : scores) {
			System.out.println("����: " + score);
		}
	
		
		
		
	}
}
