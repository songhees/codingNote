package example_09_02_array;

public class Sample3 {
	public static void main(String[] args) {
		/*
		 * ������ ���� �����ϰ� �ִ� �迭��ü �����ϱ�
		 * 
		 * ������Ÿ��[] ���������� = {��, ��, ��, ��, ��, ...}
		 * 
		 */
		int[] scores = {60, 70, 55, 80, 100, 50, 95};
		
		for (int score : scores) {
			System.out.println(score);
		}
		
		// �л��̸��� �����ϰ� �ִ� �迭��ü �����ϱ�
		
		String[] names = {"ȫ�浿", "������", "������", "�̼���", "������"};
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
