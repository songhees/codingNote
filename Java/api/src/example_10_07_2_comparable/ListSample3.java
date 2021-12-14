package example_10_07_2_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSample3 {
	public static void main(String[] args) {
		List<Score> scoreList = Arrays.asList(new Score("������", 80, 80, 80),
				new Score("������", 100, 90, 100),
				new Score("�̼���", 70, 40, 90),
				new Score("������", 90, 80, 40),
				new Score("�ѿ��", 40, 50, 40),
				new Score("��âȣ", 60, 70, 60),
				new Score("�̺�â", 30, 50, 60),
				new Score("������", 80, 70, 70),
				new Score("���߱�", 85, 65, 55));
		
		// ������ ���ؼ� ������������ ���Ľ�Ű�� Comparator ������ü
		System.out.println("### ������ ���� ������������ �����ؼ� ����ϱ�");
		Comparator<Score> totalComparator = new Comparator<>() {
			public int compare(Score score, Score score2) {
				return score.getTotal() - score2.getTotal();
			}
		};
		Collections.sort(scoreList, totalComparator);
		
		for(Score score : scoreList) {
			System.out.println(score.getName() + " : " + score.getTotal());
		}
		
		// �л��̸��� ���ؼ� �̸��� ������������ ���Ľ�Ű�� Comparator ������ü
		System.out.println("### �̸��� ���� ������������ �����ؼ� ����ϱ�");
		Comparator<Score> nameComparator = new Comparator<>() {
			public int compare(Score score1, Score score2) {
				return score1.getName().compareTo(score2.getName());
			}
		};
		Collections.sort(scoreList, nameComparator);
		
		for(Score score : scoreList) {
			System.out.println(score.getName() + " : " + score.getTotal());
		}
		
		// ���������� ���ؼ� ���������� ������������ ���Ľ�Ű��
		System.out.println("### ���������� ���� ������������ �����ؼ� ����ϱ�");
		Collections.sort(scoreList, new Comparator<Score>() {
			@Override
			public int compare(Score score1, Score score2) {
				return score1.getKor() - score2.getKor();
			}
		});
		
		for(Score score : scoreList) {
			System.out.println(score.getName() + " : " + score.getKor());
		}
		// ���������� ���ؼ� ���������� ������������ ���Ľ�Ű��
		System.out.println("### ���������� ���� ������������ �����ؼ� ����ϱ�");
		Collections.sort(scoreList, (s1, s2) -> s1.getEng() - s2.getEng());
		for(Score score : scoreList) {
			System.out.println(score.getName() + " : " + score.getEng());
		}
	}
	static class Score {
		
		private String name;
		private int kor;
		private int eng;
		private int math;
		
		public Score(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public String getName() {
			return name;
		}
		
		public int getKor() {
			return kor;
		}
		
		public int getEng() {
			return eng;
		}
		
		public int getMath() {
			return math;
		}
		
		public int getTotal() {
			return kor + eng + math; 
		}
		
		public int getAverage() {
			return getTotal()/3;
		}
	}
	
	
}
