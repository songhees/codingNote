package example_10_07_2_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSample2 {
	public static void main(String[] args) {
		List<Score> scoreList = Arrays.asList(new Score("������", 80, 80, 80),
				new Score("������", 100, 100, 100),
				new Score("�̼���", 70, 70, 70),
				new Score("������", 90, 90, 90),
				new Score("���߱�", 85, 85, 85));
		// Comparable<T>�� �����Ѱ͸� ������ �� �ִ�.
		// List��ü�� ����� Score��ü�� ������������ �����ϱ�(���ı����� compareTo(Score o)���� �������� ������ �����̴�.)
		Collections.sort(scoreList);
		
		// ������ ���� ���� �л����� ��µȴ�.
		for(Score score :  scoreList) {
			System.out.println(score.getName() + " : " + score.getTotal());
		}
				 
	}
	// comparaTo(T t) T<= �񱳴���� �Ǵ� �ٸ� ��ü(type) Score�������� ���ϱ� ������ Score�� �ִ´�.
	static class Score implements Comparable<Score> {
		private String name;
		private int kor;
		private int eng;
		private int math;
		
		public Score(String name, int kor, int eng, int math) {
			super();
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
		
		/*
		 * �� ��ü�� ������ �ٸ� ��ü�� ������ ������ ��
		 * 0���� ū ���� ������ ���		�� ��ü�� ������ ����.
		 * 0���� ���� ���� ������ ���	�� ��ü�� ������ ����.
		 * 0�� ������ ���				������ ����.
		 */
		@Override
		public int compareTo(Score other) {
			return this.getTotal() - other.getTotal();
		}
	}
	
	
	
}
