package example_10_14_writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample2 {
	public static void main(String[] args) {
		/*
		 * PrintWriter
		 * 		- �ؽ�Ʈ�� ����ϴ� ��ü��.
		 * 		- write(String text), println(String text) ���� �޼ҵ带 �������ִ�.
		 * 		- �ߺ����ǵ� println(��) �޼ҵ带 ������ �ִ�. println�޼ҵ带 �ٹٲ� ���ڸ� �ڵ����� �߰��Ѵ�.
		 * 		- csv �����͸� ����� �� �����ϴ�. ���پ� ����� �� 
		 */
		try {
			PrintWriter writer = new PrintWriter("c:/temp/doc/example2.txt");
			writer.println("ȫ�浿,100,80,100");
			writer.println("������,100,80,80");
			writer.println("������,100,80,60");
			writer.println("�̼���,100,80,90");
			writer.println("������,100,80,90");
			
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
