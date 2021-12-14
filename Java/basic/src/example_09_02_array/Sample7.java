package example_09_02_array;

public class Sample7 {
	public static void main(String[] args) {
		/*
		 * ������ �迭
		 * Ÿ��[] ������ = new Ÿ��[ũ��];					1���� �迭
		 * Ÿ��[][] ������ = new Ÿ��[ũ��][ũ��];			2���� �迭
		 * Ÿ��[][][] ������ = new Ÿ��[ũ��][ũ��][ũ��];		3���� �迭
		 * 
		 * ����ó ����(�̸�, ��ȭ��ȣ, �̸���)�� �����ϴ� 2���� �迭 �����ϱ�
		 */
		String[][] contacts = new String[2][3];
		
		// 2�����迭�� �� ��ҿ� ����ó ���� �����ϱ�
		contacts[0][0] = "ȫ�浿";
		contacts[0][1] = "010-1234-5678";
		contacts[0][2] = "gildon@naver.con";
		contacts[1][0] = "������";
		contacts[1][1] = "010-9857-7457";
		contacts[1][2] = "kim-sy@gmail.com";
		
		// ������ for���� ����ؼ� ������ �迭 �ٷ��
		for (int i = 0; i < 2; i++) {
			String[] row = contacts[i];
			for (int j = 0; j < 3; j++) {
				String value = row[j];
				System.out.print(value + "\t");		
			}
			System.out.println();
		}
		
		for (String[] contact : contacts ) {
			for (String value : contact) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}
