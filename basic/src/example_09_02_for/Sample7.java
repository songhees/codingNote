package example_09_02_for;

public class Sample7 {
	public static void main(String[] args) {
		/*
		 * continue�� �����ִ� ���๮�� ������ ����ϰ� ���� �� �ݺ��� ���ؼ� ���������� �̵���Ű��
		 * 
		 */
		
		for (int i = 1; i <= 10; i++) {
			// i�� ���� 3, 6, 9�� ��� continue�� �����
			// continue�� �����ִ� ���๮�� �������� �ʰ�, ��� �ݺ����� ���������� �̵���
			if (i%3 ==0) {
				continue;
			}
			System.out.println("i��:" + i);		//continue�� ������ �������� ����
		}
	}
}
