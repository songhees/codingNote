package example_09_10_coding;

public class Sample {
	
	// �л��������� ��ü�� ���޹޾Ƽ� ȭ�鿡 ����ϴ� ���
	void printScore(Score score) {
		System.out.println("��   ȣ: " + score.no);
		System.out.println("��   ��: " + score.name);
		System.out.println("��������: " + score.kor);
		System.out.println("��������: " + score.eng);
		System.out.println("��������: " + score.math);
		System.out.println("��   ��: " + score.total);
		System.out.println("�������: " + score.average);
		System.out.println();
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ȭ�鿡 ����ϴ� ���
	void printAllScores(Score[] scores) {
		for (Score score: scores) {
			printScore(score);
			System.out.println();
		}
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� �ְ� ������ ���� ���������� ����ϴ� ���
	void printTop1(Score[] scores) {
		Score topScore = scores[0];
		for (Score score : scores) {
			if(score.total > topScore.total) {
				topScore = score;
			}
		}
		printScore(topScore);
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ��������� ����ϴ� ���
	void printAverage(Score[] scores) {
		int average = getAllScoresAverage(scores);
		System.out.println("��ü �л��� �������: " + average);
		System.out.println();
	}

	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ����������� ���� ������ ���� ���������� ����ϴ� ���
	void printLowerScore(Score[] scores) {
		int average = getAllScoresAverage(scores);
		for (Score score : scores) {
			if (score.average < average) {
				printScore(score);
			}
		}
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ���հ��� �л����� ���������� ����ϴ� ���(��� 60�� �̸� ���հ�)
	void printUnPassedScores(Score[] scores) {
		for (Score score : scores) {
			if (score.average < 60) {
				printScore(score);
			}
		}
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ���հ��� �л����� ���������� ����ϴ� ���(��� 60�� �̸�, �������(��������� 40�� �̸�)�� ���հ�)
	void printUnPasswordScores2(Score[] scores) {
		for (Score score : scores) {
			if (score.average < 60 || isFailedSubject(score)) {
				printScore(score);
			}
		}
	}
	// ������ ���θ� �Ǵ��Ѵ�.
	boolean isFailedSubject(Score score) {
		boolean isFailed = false;
		if (score.kor < 40 || score.eng < 40 || score.math < 40) {
			isFailed = true;
		}
		return isFailed;
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ��������� ���� ����� ������ ���� �л��� ���������� ����ϴ� ���
	void printClosestAverageScore(Score[] scores) {
		Score closestScore = scores[0];
		int average = getAllScoresAverage(scores);
		for(Score score : scores) {
			if (Math.abs(score.average-average) < Math.abs(closestScore.average-average)) {
				closestScore = score;
			}
		}
		printScore(closestScore);
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ��������� �л����� ����ϴ� ���(10������ 0��, 20������ 0��, 30������ 1��, 40������ 2��, ...)
	void printCountByAverage(Score[] scores) {
		int[] numberStudents = new int[10];
		for(Score score: scores) {
			if(score.average>90) {
				numberStudents[9]++;
			} else if (score.average > 80) {
				numberStudents[8]++;
			} else if (score.average > 70) {
				numberStudents[7]++;
			} else if (score.average > 60) {
				numberStudents[6]++;
			} else if (score.average > 50) {
				numberStudents[5]++;
			} else if (score.average > 40) {
				numberStudents[4]++;
			} else if (score.average > 30) {
				numberStudents[3]++;
			} else if (score.average > 20) {
				numberStudents[2]++;
			} else if (score.average > 10) {
				numberStudents[1]++;
			} else {
				numberStudents[0]++;
			}
		for(int numberStudent : numberStudents) {
			System.out.println(numberStudent);
		}
			
			
			
			
		}
	}
	
	// �л����������� ���Ե� �迭�� ���޹޾Ƽ� ��������� ����ϰ� ��ȯ�ϴ� ���
	private int getAllScoresAverage(Score[] scores) {
		int total = 0;
		for(Score score : scores) {
			total += score.average;
		}
		int average = total/scores.length;
		return average;
	}


	
	
}
