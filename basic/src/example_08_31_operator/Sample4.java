package example_08_31_operator;

public class Sample4 {
	public static void main(String[] args) {
		// 학생들의 점수를 확인하고, 총점과 평균을 계산하기
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
		 * 총점 구하기
		 * totalScore = score1 + score2 + score3 .....;
		 */
		
		totalScore += score1;	// totalScore == 80;
		totalScore += score2;
		totalScore += score3;
		totalScore += score4;	// totalScore == 300;
		totalScore += score5;
		totalScore += score6;
		totalScore += score7;	// totalScore == 510;
		System.out.println("totalScore의 값: " + totalScore);
		
		// 평균 구하기
		average = totalScore/7.0;	// 510/7.0 -> 510.0/7.0 -> 72.8 
		System.out.println("average의 값: " + average);	
		
		// 값을 누적시키고 싶을 때 += 를 쓴다.
		
		
	}
}
