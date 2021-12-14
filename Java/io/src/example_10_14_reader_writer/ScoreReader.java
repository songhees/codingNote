package example_10_14_reader_writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScoreReader {
	public static void main(String[] args) {
		
		// �� �ϳ��� ��ü �ϳ��� �ش��ϴ�.
		// score.sav ���Ͽ��� �о�� ���������� �����ϴ� ArrayList��ü
		List<Score> scores = new ArrayList<Score>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("c:/temp/doc/score.sav"));){
			String text = null;
			while ((text = reader.readLine()) != null) {
				// text -> "ȫ�浿,100,100,100"
				// values -> ["ȫ�浿", "100", "100", "100"]
				String[] values = text.split(",");
				// �迭�� �� �м��ϱ�
				String name = values[0];
				int kor = Integer.parseInt(values[1]);
				int eng = Integer.parseInt(values[2]);
				int math = Integer.parseInt(values[3]);
				
				// Score��ü�� �����ؼ� �м��� ���������� �����ϱ�
				scores.add(new Score(name, kor, eng, math));
				
				System.out.println(scores);
			}
			
			// ������ ����/�м��ϱ�
			// �л����� ��ü ������� ����ϱ�
			int totalAverage = 0;
			for (Score score : scores) {
				totalAverage += score.getAverage();
			}
			System.out.println("��ü �������: " + totalAverage/scores.size()+ "��");
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
