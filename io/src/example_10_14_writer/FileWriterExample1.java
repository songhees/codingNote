package example_10_14_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
	public static void main(String[] args) {
		
		/*
		 * FileWriter
		 * 		���Ͽ� �ؽ�Ʈ�� ���(���)�Ѵ�.
		 */
		try {
			// example.txt ���Ͽ� �ؽ�Ʈ�� ����ϴ� FileWriter��ü�� ������
			// example.txt ������ �������� ������ example.txt ������ ������ ���� �ؽ�Ʈ�� ����Ѵ�.
			// example.txt ������ �����ϸ� ���� example.txt ������ �������� �ʰ�, ���� �����Ϳ� �����.
			FileWriter writer = new FileWriter("c:/temp/doc/example1.txt");
			
			writer.write("�ƿ��̿���\n");
			writer.write("�ƿ��̿���\n");
			writer.write("�ƿ��̿���\n");
			writer.write("�ƿ��̿���\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
