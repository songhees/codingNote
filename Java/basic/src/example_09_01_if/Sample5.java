package example_09_01_if;

public class Sample5 {
	public static void main(String[] args) {
		/*
		 * ����, ����, ���������� �Է¹޾Ƽ� ������ ����� ����ؼ� ����Ѵ�.
		 * ����� 60�� �̻��� ��� "�հ��Դϴ�."�� ����ϰ�, 60�� �̸��� "���հ��Դϴ�."�� ����Ѵ�.
		 * ����� ������ŭ ������ �����.
		 * 
		 * ��¿���
		 * 		�������� : 100
		 * 		�������� : 80
		 * 		�������� : 90
		 * 		���� : 290
		 * 		��� : 90
		 * 		�հݿ��� : �հ��Դϴ�. 
		 */
		int korScore = 100;
		int engScore = 80;
		int mathScore = 90;									//���� �Է�
		
		/*int totalScore = 0;
		 * totalScore += korScore
		 * totalScore += engScore
		 * totalScore += mathScore
		 */
		int totalScore = korScore + engScore + mathScore; 	//�������
	
		int average = totalScore/3;							//���
		
		String passResult = "";
		if (average >= 60) {
			passResult = "�հ��Դϴ�.";
		} else {
			passResult = "���հ��Դϴ�.";
		}													//�հݿ���
		
		System.out.println("�������� : "+ korScore);
		System.out.println("�������� : "+ engScore);
		System.out.println("�������� : "+ mathScore);
		System.out.println("��   �� : "+ totalScore);
		System.out.println("��   �� : "+ average);
		System.out.println("�հݿ��� : " + passResult); 		//��� ���
	}
}
