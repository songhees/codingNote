package example_10_14_copy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {
	public static void main(String[] args) throws IOException {
		
		// ���������� 1byte�� �о���� ��Ʈ�� ��ü ����
		FileInputStream in = new FileInputStream("c:/temp/doc/DdZiiuvUQAI2sJe.jfif");
		// ���纻������ �����ϰ� 1byte�� ����ϴ� ��Ʈ�� ��ü ����
		FileOutputStream out = new FileOutputStream("c:/temp/doc/DdZiiuvUQAI2sJe���纻.jfif");
		
		// 1byte�� ���� ���� �����ϴ� ����
		int value = 0;
		// 1byte�� �о value�� �����ϰ�, value�� ����� ���� -1�� ���� �� ���� ���๮ �ݺ�
		while((value = in.read()) != -1){
			// value�� ����� ���� ���纻���Ͽ� ����
			out.write(value);
		}
				
		in.close();
		out.close();
		
	}
}
