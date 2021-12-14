package example_10_14_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample1 {
	public static void main(String[] args) {
		/*
		 * BufferedReader
		 * 		- �ؽ�Ʈ�� �о���� ��ü��.
		 * 		- �ؽ�Ʈ�� �� �پ� �о���� String readLine() �޼ҵ带 �����Ѵ�.
		 * 		- readLine()�� �ٹٲ޹��� �ձ��� �о ��ȯ�Ѵ�.
		 * 		- readLine()�� ���̻� �о�� �����Ͱ� ������(��Ʈ���� ���� �����ϸ�) null�� ��ȯ�Ѵ�.  
		 */
		
		
		try {
			//������ ������ �о���� FileReader ��ü�� �����Ѵ�.
			//FileReader�� �б� �޼ҵ�� 1���ھ��� �о�´�.
			FileReader fileReader = new FileReader("c:/temp/doc/example2.txt");
			// ��Ʈ���� �ؽ�Ʈ�����͸� �� �پ� �о���� BufferedReader ��ü�� �����Ѵ�.
			// ������ �ؽ�Ʈ �����͸� �о���� FileReader�� BufferedReader���� �����Ѵ�.
			BufferedReader reader = new BufferedReader(fileReader);
			
			String text = null;
			// text = reader.readLine()				 : ��Ʈ������ �� �پ� �о text�� �����Ѵ�.
			// (text = reader.readLine() != null	 : text�� ���Ե� ���� null �ƴϸ� true��. ��, while�� ��ϳ��� ���๮�� ����ȴ�.
			while ((text = reader.readLine()) != null) {
				
				// �ؽ�Ʈ �м�
				String[] values = text.split(",");
				String name = values[0];
				int kor = Integer.parseInt(values[1].trim());
				int eng = Integer.parseInt(values[2]);
				int math = Integer.parseInt(values[3]);
				int total = kor + eng + math;
				int average = total/3;
				
				System.out.println("�л��̸�: " + name + ", �������: " + average);
			}
			
//			String text1 = reader.readLine();
//			String text2 = reader.readLine();
//			String text3 = reader.readLine();
//			String text4 = reader.readLine();
//			String text5 = reader.readLine();
//			String text6 = reader.readLine();
//			String text7 = reader.readLine();
//			String text8 = reader.readLine();
//			String text9 = reader.readLine();
//			String text10 = reader.readLine();
//			
//			System.out.println(text1);
//			System.out.println(text2);
//			System.out.println(text3);
//			System.out.println(text4);
//			System.out.println(text5);
//			System.out.println(text6);
//			System.out.println(text7);
//			System.out.println(text8);
//			System.out.println(text9);
//			System.out.println(text10);
//			
			reader.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
