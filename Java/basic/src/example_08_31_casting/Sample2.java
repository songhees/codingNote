package example_08_31_casting;

public class Sample2 {
	public static void main(String[] args) {
		/*
		 * ��������ȯ
		 * �������� �ս��� �߻��ϴ� ���������� ����ȯ�� JVM�� �ڵ����� ����ȯ�� �������� �ʴ´�.
		 * �����ڰ� ������ �ս��� �߻��ϴ��� ����ȯ�ϰڴٴ� �ǻ�ǥ�ø� �ݵ�� �ؾ� �Ѵ�.
		 * 
		 * �Ǽ�Ÿ���� ���� ������ ������ �����ϴ� ���� �������� �ս��� �߻��ϴ� ���������� ����ȯ�̴�.
		 * ����ȯ ������ (int)�� ��ȯ�� ������Ÿ���� �����ؾ� �Ѵ�. 
		 */
		int average = (int) 81.5; //81
		System.out.println(average);
		
		// �Ʒ��� ���� int ������ �ʰ��ϴ� ���� int Ÿ������ ��������ȯ�ϴ� ���� �߸��� ����ȯ�̴�.
		int value1 = (int) 10_000_000_000L;
		System.out.println(value1);			// value1���� 1410065408�� �������. �ƹ� ������谡 ���� ���̴�.
		
		/*
		 * 
		 */
		int korScore = 100;
		int engScore = 80;
		int mathScore = 70;
		int subjectCount = 3;
		int totalScore = korScore + engScore + mathScore;
		double averageScore1 = totalScore/subjectCount;	//83			// 83.0 <-�ڵ�����ȯ- 83 <-250/3
		double averageScore2 = (double) (totalScore/subjectCount); 	// 83.0 <- (double)83 <- (250/3)
		double averageScore3 = (double) totalScore/subjectCount;	// 83.3333 <- 250.0/3.0 <- �ڵ�����ȯ <- 250.0/3 <- (double)250/3
		double averageScore4 = totalScore/ (double) subjectCount;	// 83.3333 <- 250.0/3.0 <- �ڵ�����ȯ <- 250/3.0 <- 250/(double)3
		
		System.out.println(averageScore1);
		System.out.println(averageScore2);
		System.out.println(averageScore3);
		System.out.println(averageScore4);
		
		
	}
}
