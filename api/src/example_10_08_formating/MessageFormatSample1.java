package example_10_08_formating;

import java.text.MessageFormat;

public class MessageFormatSample1 {
	public static void main(String[] args) {
		
		// MessageFormat.format(String pattern, Object ... arguments)�� �Ʒ��� ���� ����ص� �ȴ�.
		// MessageFormat.format(String pattern, Object[] arguments)
		Score score = new Score("ȫ�浿", 100, 90, 80);
		
		String pattern = "{0} �л��� ������ ����:{1}��, ����:{2}��, ����:{3}��, �������:{4}�� �Դϴ�.";
		String text = MessageFormat.format(pattern, score.getName(), score.getKor(), score.getEng(), score.getMath() ,score.getAverage());
		// �������� �Ű����� format(Object ... arguments) ���� ������ �������ų� �������� ���� ��
		System.out.println(text);
		
		Object[] names = {"�̼���", "������", "������"};
		MessageFormat mf = new MessageFormat("������ ���: {0}�����, {1}�����, {2}�����");
		String text2 = mf.format(names);
		System.out.println(text2);
		
		String text3 = MessageFormat.format("������ ���: {0}�����, {1}�����, {2}�����", names);
		System.out.println(text3);
	}
	
	static class Score {
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
			return kor+eng+math;
		}
		
		public int getAverage() {
			return getTotal()/3;
		}
		
	}
	
}
