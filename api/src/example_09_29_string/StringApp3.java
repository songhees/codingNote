package example_09_29_string;

import java.util.Arrays;

public class StringApp3 {
	public static void main(String[] args) {
		// ��õ�������
		
		//				   0	 1	  2	    3	 4	  5		6	  7	   8
		String[] words = {"��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
		String[] units = {"õ", "��", "��", ""};
		int balance = 2346;
		// �ѱۼ��ڸ� ���� String Ÿ���� ������ �����Ѵ�. String text = "";
		// 2346 -> "2346" -> ["2", "3", "4", "6"]
		// for���� �̿��ؼ� �迭���� ���ڿ��� �ϳ��� ��ȸ�Ѵ�.
		// ��ȸ�� ���ڿ��� ���ڷ� ��ȯ�Ѵ�. Integer.parseInt(���ڿ�)
		// word �迭���� ���ڿ� ���� ���ڸ� �����´�.(������ ��ġ�� ���� ���ں��� �ϳ� ���� ��ġ��.)
		// units �迭���� �ش� �ڸ����� �´� ������ �����´�.
		// ������ ������ text�� �� ���ڸ� �߰��Ѵ�.
		// �ؽ�Ʈ�� ������ ����Ѵ�.
		String[] x = "2346".split("");
		
		// �ѱ� ���ڸ� ���� ������ �����Ѵ�.
		String text = "";
		// String.valueOf(balance)�� ���ڸ� String���� �ٲ۴�.
		// String.valueOf(balance)�� String�̱� ������ .split("")�� �ٷ� ���
		// String.valueOf(balance).split("")�� ���ڸ� ���ڿ��� �ٲٰ�, ���ڿ��� �� ���ڿ��� �������� ["2", "3", "4", "6"]�� ȹ��
		String[] numberWords = String.valueOf(balance).split("");
		
		// numberWords.length�� 4��. ���� �ݺ����� i�� 0,1,2,3 ���� ����ȴ�.
		for (int i = 0; i < numberWords.length; i++) {
			// numberWords[i]�� ��ϳ��� ���๮�� ����� ������ ��ȸ�ǰ�
			// Integer.pareInt(numberWords[i])�� ��ϳ��� ���๮�� ����� ������ 2, 3, 4, 6�� ȹ��ȴ�.
			// Integer.pareInt(numberWords[i]) -1�� ��ϳ��� ���๮�� ����� ������ ��ȸ�� ���� 1, 2, 3, 5�� ���
			// ȹ��� ���� ��ȸ�� ���ڿ� ���� �ѱۼ��ڰ� ��ġ�ϰ� �ִ� �迭�� �ε����� Ȱ���� �� �ִ�.
			int wordIndex = Integer.parseInt(numberWords[i]) - 1;
			// ������ ���� �ε��������� words�迭���� �ѱۼ��ڸ� ��ȸ�Ѵ�.
			String word = words[wordIndex];
			// ��ϳ��� �ݺ����� ����� ������ i�� 0, 1, 2, 3���� ���� ���Ѵ�.
			// i�� ���� �ѱۼ��ڿ� ���� ������ ����ִ� �迭�� �ε����� Ȱ���� �� �ִ�.
			// i��°�� ������ ��ȸ�Ѵ�. 
			String unit = units[i];
			
			// ������ ��ȸ�� �ѱۼ��ڿ� ������ text�� ���Ѵ�.
			text += word + unit;
		}
		// �ؽ�Ʈ�� ������ ����Ѵ�.
		System.out.println(text);
		
	}
}
