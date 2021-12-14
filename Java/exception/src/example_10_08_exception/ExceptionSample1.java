package example_10_08_exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionSample1 {
	public static void main(String[] args) {
		//������ ����ϴ� ��ü
		// ����� ���� IOException
		try {
			FileWriter writer = new FileWriter("c:/temp/java/test.txt");
			writer.write("�߾�HTA 2106�� ȭ����!!!");
			// ��ü�� �޸𸮾ȿ��� ���ܳ��� ������� �޸𸮿��� cpu�� ����ǹǷ� ����ӵ��� ������.
			//
			// ��ü���� ����� buffer�� �ִ� �͵��� �� ���Ϸ� ������.
			// 
			
			writer.flush();
			// 
			writer.close();
			System.out.println("### ���� ���� : ���Ͽ� ��ϵǾ����ϴ�.");
			// ���� �߻��� ���õ� ������ ���๮�� ��� �ִ� ���� ��ü�� ����
		} catch (IOException ex) {
			// ���� �ȳ���
			System.out.println("### ���� �߻� : ���� ���� �� ������ �߻��Ͽ����ϴ�.");
			// ���� ��ü�� �޼ҵ带 ����
			// ���� �߻��� ���� ������ ���� ����� ������ ȭ�鿡 ����Ѵ�.
			//��� ���� Ŭ������ ������ �ִ� �޼ҵ�
			ex.printStackTrace();
			
			// ���� Ŭ���� Ȯ�ΰ� �޼��� Ȯ��
			// ���ܴ� �� ������ �Ʒ��� ���� ���� class�� �̸��� ������
			// ��� ���๮���� ����. ���� ������ �� �ִ� �κ��̴�.
			// ���ܴ� 30�� �ȿ� �ذ��� �� ������ �����.
		}
		
		
	}
}
