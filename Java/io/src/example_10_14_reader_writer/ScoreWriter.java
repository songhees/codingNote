package example_10_14_reader_writer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ScoreWriter {
	public static void main(String[] args) {
		List<Score> scoreList = new ArrayList<Score>();
		scoreList.add(new Score("ȫ�浿", 100, 100, 100));
		scoreList.add(new Score("������", 90, 70, 80));
		scoreList.add(new Score("�̼���", 60, 70, 70));
		scoreList.add(new Score("������", 80, 70, 70));
		scoreList.add(new Score("������", 100, 90, 90));
		
		
		
		// List��ü�� ����� ������� ������ score.save ���Ϸ� �����ϱ�
		// ��ȣ�ȿ� ������ auto�� close�� �ȴ�.
		// �޸� ������ �ڵ����� ������ �ش�.
		try (PrintWriter writer = new PrintWriter("c:/temp/doc/score.sav");){
			StringBuilder sb  = new StringBuilder();
			for (Score score : scoreList) {
				sb.append(score.getName() + ",");
				sb.append(score.getKor() + ",");
				sb.append(score.getEng() + ",");
				sb.append(score.getMath());
				
				writer.println(sb.toString());
				// StringBuilder�� �ִ� �����͸� 0�� ���̷� ����� ����������.
				sb.setLength(0);
				
				
			}
			
			
			// �ڿ���������
//			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
