package example_08_31_operator;

public class Sample4 {
	public static void main(String[] args) {
		// �л����� ������ Ȯ���ϰ�, ������ ����� ����ϱ�
		int score1 = 80;
		int score2 = 50;
		int score3 = 90;
		int score4 = 80;
		int score5 = 100;
		int score6 = 40;
		int score7 = 70;
		
		int totalScore = 0;
		double average = 0.0;
		
		/*
		 * ���� ���ϱ�
		 * totalScore = score1 + score2 + score3 .....;
		 */
		
		totalScore += score1;	// totalScore == 80;
		totalScore += score2;
		totalScore += score3;
		totalScore += score4;	// totalScore == 300;
		totalScore += score5;
		totalScore += score6;
		totalScore += score7;	// totalScore == 510;
		System.out.println("totalScore�� ��: " + totalScore);
		
		// ��� ���ϱ�
		average = totalScore/7.0;	// 510/7.0 -> 510.0/7.0 -> 72.8 
		System.out.println("average�� ��: " + average);	
		
		// ���� ������Ű�� ���� �� += �� ����.
		
		
	}
}
