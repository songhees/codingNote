package example_10_08_exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionSample2 {
	
	//throws�� ���๮���� �߻��� ���ܸ� ���� ó������ �ʰ�, �� �޼ҵ带 ȣ���� ������ ����ó���� ���ѱ�� Ű�����.
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("test.txt");
		writer.write("�߾�HTA 2106�� ȭ����!!!");
		writer.flush();
		writer.close();
		System.out.println("### ���� ���� : ���Ͽ� ��ϵǾ����ϴ�.");
		
	}
}
