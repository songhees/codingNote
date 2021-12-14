package example_09_30_stringbuilder;

public class StringBuilderApp {
	public static void main(String[] args) {
		
		Score score = new Score("ȫ�浿", 100, 70, 60);
		
		// + �����ڷ� ���ڿ��� �ٸ� ������ �����Ű�� �����ų�� ���� ���ο� String��ü�� �����ȴ�.(String��ü�� �Һ���ü�̱� �����ƴ�)
		// "ȫ�浿"			�� String��ü ������
		// "ȫ�浿100"		�� String��ü ������ * ������ ������ "String"�� 100�� �߰��� ���� �ƴ϶� ������ ���ο� ��ü�� ������ ����
		// "ȫ�浿10070"		�� String��ü ������ 
		// "ȫ�浿1007060"	�� String��ü ������ 
		// ���� ���ڿ� "ȫ�浿1007060"�� ����� ���ؼ� String��ü 3���� �߰��� �����Ǿ���
		// ����, + �����ڸ� ����ϴ� ���� ���ʿ��� String ��ü�� �����ϰ� �ǰ�, 	�޸� ������ ������ �ȴ�.
		String text = score.getName() + score.getKor() + score.getEng() + score.getMath();
		System.out.println(text);
		
		// StringBuffer�� StringBuilder�� ����ؼ� ���ڿ��� �ٸ� ������ ��������
		StringBuilder builder = new StringBuilder();
		// StringBuilder��ü�� ���� ���ۿ� ���� �߰���, �߰����� ��ü������ �߻����� ����
		builder.append(score.getName());
		builder.append(score.getKor());
		builder.append(score.getEng());
		builder.append(score.getMath());
		
		// StringBuilder��ü�� toString()�� ���ۿ� ����� ���� ���ڿ��� ��ȯ�Ѵ�.
		String text2 = builder.toString();
		System.out.println(text2);
	}
	
	static class Score {
		String name;
		int kor;
		int eng;
		int math;
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
		
		
	}
}
