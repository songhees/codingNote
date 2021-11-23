package example_10_15_data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamSample {
	public static void main(String[] args) {
		
		/*
		 * DataInputStream
		 * 		-DataOutputStream�� ����ؼ� Ÿ�԰� �� �״�� ��½�Ų ���� �о ���� ������ ������Ű�� ��Ʈ��
		 * 		-������ Ÿ�� ���� �״�� ����ؾ��Ѵ�.
		 */
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("c:/temp/doc/data.sav"))) {
			
			int no = dis.readInt();
			String title = dis.readUTF();
			int price = dis.readInt();
			double discountRate = dis.readDouble();
			boolean soldOut = dis.readBoolean();
			
			System.out.println("��ȣ: " + no);
			System.out.println("����: " + title);
			System.out.println("����: " + price);
			System.out.println("���κ���: " + discountRate);
			System.out.println("��������: " + soldOut);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
	}
}
