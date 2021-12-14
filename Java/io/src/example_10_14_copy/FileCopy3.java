package example_10_14_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy3 {
	public static void main(String[] args) throws IOException {
		
		long beginUnixTime = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("c:/temp/doc/����.pdf");
		FileOutputStream fos = new FileOutputStream("c:/temp/doc/���ú��纻1.pdf");
		
		// inputStream�� output��Ʈ���� �б� ���� �ӵ��� ����Ű�� ��Ʈ���̴�.
		BufferedInputStream in = new BufferedInputStream(fis);
		BufferedOutputStream out = new BufferedOutputStream(fos);
		
		int value = 0;
		while ((value = in.read()) != -1) {
			out.write(value);
		}
		
		in.close();
		out.close();
		
		long endUnixTime = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð� : " + (endUnixTime - beginUnixTime) + "�и���");
	}
}
