package example_10_08_exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionSample3 {
	
	// ����ó���� �����ϱ�
	// 1. new FileWriter(), write(), flush(), close() �޼ҵ尡 IOException�� ó���� writeText()���� ������
	// 2. writeText()�޼ҵ�� IOException�� ó���� main() ���� ������
	// 3. main() �޼ҵ�� IOException�� ó���� JVM���� ������ 
	// * JVM���� ����ó���� �����ϴ� ���� ����ó���� ���� ���� �Ͱ� �����ϴ�. -> ���α׷��� ����
	public static void main(String[] args) throws IOException  {
		// ���Ѱ���
		FileUtils.writeText("c:/temp/java/abc.text", "���� ���ѱ�� �����Դϴ�.");
		
	}
	
	static class FileUtils{
		
		// �� �޼ҵ忡�� ���ܸ� ó���� å���� ��������.
		// writeText() �޼ҵ带 ȣ���ϴ� �������� IOException ���ܸ� ó���ؾ� �Ѵ�.
		public static void writeText(String path, String text) throws IOException {
			FileWriter writer = new FileWriter(path);
			writer.write(text);
			writer.flush();
			writer.close();
			System.out.println("### ���� ���� : ���Ͽ� ��ϵǾ����ϴ�.");
		}
	}
}
